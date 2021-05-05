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
// 這個最快
class Solution {
    public int minDepth(TreeNode root) {
		Deque<TreeNode> dq = new LinkedList<>();
		int depth = 0;
		if (root != null) {
            dq.add(root);
            while (!dq.isEmpty()) {
                int size = dq.size();
                depth++;
                for (int i = 0; i < size; i++) {
                    TreeNode node = dq.pop();
                    if (node.left == null && node.right == null) return depth;
                    if (node.left != null) dq.add(node.left);
                    if (node.right != null) dq.add(node.right);
                }
            }
        }
		return depth;
    }
}

class Solution {
    public int getDepth(TreeNode node) {
		if (node == null) return 0;
		int leftDepth = getDepth(node.left);
		int rightDepth = getDepth(node.right);
		if (node.left != null & node.right == null) return 1 + leftDepth;
		else if (node.left == null & node.right != null) return 1 + rightDepth;
		
		return 1 + Math.min(leftDepth, rightDepth);
    }
	int minDepth(TreeNode root) {
        return getDepth(root);
    }
}
