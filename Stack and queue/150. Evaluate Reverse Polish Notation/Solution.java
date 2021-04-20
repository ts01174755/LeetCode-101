class Solution {
    public int evalRPN(String[] tokens) {
		Stack<String> st = new Stack<String>();
		Integer res = null;
		for (String s_: tokens) {
            if (s_.equals("+") || s_.equals("-") || s_.equals("*") || s_.equals("/")) {
                Integer num1 = Integer.parseInt(st.pop());
                Integer num2 = Integer.parseInt(st.pop());
                if (s_.equals("+")) res = num2 + num1;
                else if (s_.equals("-")) res = num2 - num1;
                else if (s_.equals("*")) res = num2 * num1;
                else if (s_.equals("/")) res = num2 / num1;
                st.push(res.toString());
            } else {
                st.push(s_);
            }
        }
		int ans = Integer.parseInt(st.pop());
        return ans;
    }
}
