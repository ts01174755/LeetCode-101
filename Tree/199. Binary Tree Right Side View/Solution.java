/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
		Deque<TreeNode> dq = new LinkedList<TreeNode>();
		Integer val = null;

		if (root != null) dq.add(root);
		while (!dq.isEmpty()) {
			int size = dq.size();
			for (int i = 0; i < size; i++) {
				TreeNode node = dq.pop();
				val = node.val;
				if (node.left != null) dq.add(node.left);				
				if (node.right != null) dq.add(node.right); 
			}
			ans.add(val);
        }
		return ans;
    }
}
