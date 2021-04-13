class Solution {
    public String reverseStr(String s, int k) {
        
        // test for length 1
        if (s.length() == 1)
            return s;
        
        char[] arr = s.toCharArray();
        
        int string_len = arr.length;
        int beg = 0;
        int end;
        
        while (beg < string_len) {
            end = Math.min(beg + (k - 1), string_len - 1); 
            swap(arr, beg, end);
            beg += (2 * k);
        }
        return new String(arr);
    }
        
    public static void swap(char[] char_string, int beg, int end) {
        while(beg < end) {
            char temp = char_string[beg];
            char_string[beg++] = char_string[end];
            char_string[end--] = temp;
        }
    }
}
