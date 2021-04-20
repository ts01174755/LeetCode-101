class Solution {
    public boolean isValid(String s) {
		Stack<Character> st = new Stack<>();
		for(char c_: s.toCharArray()) {
			if(c_ == '(') st.push(')');
			else if (c_ == '[') st.push(']');
			else if (c_ == '{') st.push('}');
			else if (st.empty() || st.peek() != c_) return false;
			else st.pop();
		}
        return st.empty();
    }
}
