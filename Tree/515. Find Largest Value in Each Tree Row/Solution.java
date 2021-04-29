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
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
		Deque<TreeNode> dq = new LinkedList<>();
		
		if (root == null) return ans; 
		dq.add(root);
		while (!dq.isEmpty()) {
			long maxVal = Long.MIN_VALUE;
			int size = dq.size();
			for (int i = 0; i < size; i++) {
				TreeNode node = dq.pop();
				if (maxVal < node.val) {
					maxVal = node.val;
				}
				if (node.left != null) dq.add(node.left);				
				if (node.right != null) dq.add(node.right); 
			}
			ans.add((int) maxVal);
        }
		return ans;
    }
}
