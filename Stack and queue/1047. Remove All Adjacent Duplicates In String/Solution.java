// 一般堆疊解法
class Solution {
    public String removeDuplicates(String S) {
		Stack<Character> st = new Stack<Character>();
		String ans = "";
		for(char c_: S.toCharArray()) {
			if(st.isEmpty() || c_ != st.peek()) st.push(c_);
			else st.pop();
		}
		while(st.isEmpty() == false) ans += st.pop();
		
		StringBuilder input1 = new StringBuilder();
		input1.append(ans);
		input1.reverse();
		return input1.toString();
    }
}

// 用 array 實現堆疊
class Solution {
    public String removeDuplicates(String S) {
        char[] arr = S.toCharArray();
        int l = 0;
        int r = 1;
        while (r < arr.length) {
            if(l >= 0 && arr[l] == arr[r]) {
                l--;
            } else {
                arr[++l] = arr[r];
            }
            r++;
        }
        return new String(arr, 0, l+1);
    }
}
