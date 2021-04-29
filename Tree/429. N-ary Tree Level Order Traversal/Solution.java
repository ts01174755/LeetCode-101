/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<List<Integer>> levelOrder(Node root) {
		List<List<Integer>> ans = new ArrayList<List<Integer>>();
        Deque<Node> dq = new LinkedList<Node>();
        
        if (root == null) return ans;
		dq.add(root);
		while (dq.size() > 0) {
			int size = dq.size();
			List<Integer> subans = new ArrayList<>(size);
			for (int i = 0; i < size; i++) {
				Node node = dq.pop();
				for (int j = 0; j < node.children.size(); j++) {
					dq.add(node.children.get(j));
				}
				subans.add(node.val);
			}
			ans.add(subans);
		}
			
		return ans;
    }
}
