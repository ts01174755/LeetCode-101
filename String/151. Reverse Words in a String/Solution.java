class Solution {
    public String reverseWords(String s) {
		char[] arr = s.toCharArray();
		int sl = 0, ft = 0, end = arr.length;
		
		while(ft < end && arr[ft] == ' ') ft++;
		while(ft < end){
			if(ft < end && arr[ft] == ' ') arr[sl++] = arr[ft++];
			while(ft < end) {
				if(arr[ft] != ' ') break;
				ft++;
			}
			if (ft == end) break;
			arr[sl++] = arr[ft++];
		}
		if (arr[sl-1] == ' ') sl --;
		
		end = sl;
		swap(arr, 0, end-1); //左閉右閉
		sl = 0; ft = 0;
		while(ft < end) {
			while(ft < end && arr[ft] != ' ') ft++;
			swap(arr, sl, ft-1);
			ft++;
			sl = ft;
		}
		return new String(Arrays.copyOfRange(arr, 0, end));
    }
    
    public static void swap(char[] char_string, int beg, int end) {
        while(beg < end) {
            char temp = char_string[beg];
            char_string[beg++] = char_string[end];
            char_string[end--] = temp;
        }
    }
}
