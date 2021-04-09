class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> set1 = new HashSet<Integer>();
        set1.contains(n);
        while (true) {
	        int cnt = 0, rem = 0, Dig_n = getDigitsNumber(n);
	        for (int i = 0; i < Dig_n; i++) {
	        	rem = n%10;
	        	n /=10;
	        	cnt += Math.pow(rem, 2);
	        }
	        if (set1.contains(cnt)) {
	        	return false;
	        } else if (cnt == 1){
	        	return true;
	        }
	        set1.add(cnt);
	        n = cnt;
        }
    }
    public int getDigitsNumber(int n) {return (int) Math.log10(n) + 1;}
}
