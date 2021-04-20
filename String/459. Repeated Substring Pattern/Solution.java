class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int[] next = getNext(s);
        
        if(s.length() == 0) return false;
        if(next[s.length()-1] != 0 && 
            s.length() % (s.length() - (next[s.length()-1])) == 0) return true;
		return false;
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
