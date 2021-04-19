class Solution {
    public int strStr(String haystack, String needle) {
      
		/*
		 * 字符匹配：當有字符s沒有匹配成功時，
		 * 透過尋找 oooo(s) 相等的最大長度前綴(st)oooo，
		 * 從該前綴末尾開始匹配。
		 * 				o o o o o o o o x
		 * hay: 		a a b a a b a a b a a c
		 * 		   		- - 5 - ->
		 * needle:	(st)a a b a a b a a c
		 * 					 <- - 5 - -(c)
		 */
      
		char[] hay = haystack.toCharArray();
		char[] need = needle.toCharArray();
		if (need.length == 0) return 0;
		
		int[] next = getNext(needle);
		
		for(int i = 0, j = 0; i < hay.length; i++) {
			while(j > 0 && need[j] != hay[i]) j = next[j-1];
			if(hay[i] == need[j]) j++;
			if(j == need.length) return i - need.length + 1;
		}
		
		return -1;
    }
	
	public int[] getNext(String needle) {
		char[] arr = needle.toCharArray();
		int[] next = new int[arr.length];
		
		/* 	i: 前綴末尾
		 *  j: 後綴末尾	*/
		int j = 0;
		next[j] = j;
		for(int i = 1; i < arr.length; i++) {
			while(j > 0 && arr[i] != arr[j]) j = next[j-1];
			if (arr[i] == arr[j]) j++;
			next[i] = j;
		}
		return next;
	}
}
