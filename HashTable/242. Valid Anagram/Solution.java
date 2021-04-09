class Solution {
    public boolean isAnagram(String s, String t) {
		if(s.length() != t.length()) return false;

		int[] chs_arr = new int[26];

		for (char c_: s.toCharArray()) {
			chs_arr[c_ - 'a']++;
		}
        
		for(char c_ : t.toCharArray()){
            if(--chs_arr[c_ - 'a'] < 0)
                return false;
        }
        return true;
    }
}
