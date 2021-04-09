class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
		int[] record = new int[26];
		for (char ch: magazine.toCharArray()) {
            record[ch - 'a'] ++; 
        }
		for (char ch: ransomNote.toCharArray()) {
            record[ch - 'a']--;
            if(record[ch - 'a'] < 0) {
                return false;
            }
        }
        return true;
    }
}
