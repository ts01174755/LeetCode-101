public class Solution {
	public int[][] generateMatrix(int n) {
		int x = 0, y = 0, cnt = 1, st = 0, ed = (int) Math.sqrt(n);
		int[][] M = new int[ed][ed];
		
		ed--;
		while(ed - st >= 0) {
			System.out.println(st + " " + ed + " " + x + " " + y);
			for (int i = st; i < ed; i++, x++, cnt++) {M[y][i] = cnt;}
			for (int j = st; j < ed; j++, y++, cnt++) {M[j][x] = cnt;}
			for (int i = x; i > st; i--, x--, cnt++) {M[y][i] = cnt;}
			for (int j = y; j > st; j--, y--, cnt++) {M[j][x] = cnt;}
			st++;
			ed--;
			x++;
			y++;
		}
		if (ed - st == -2) {
			x--;
			y--;
			M[y][x] = cnt;
		}
		System.out.println(Arrays.deepToString(M));
		
        return M;
    }
}
