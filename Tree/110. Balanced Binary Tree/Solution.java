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
    public int getBalanceTreeDepth(TreeNode node) {
		if (node == null) return 0;
		
        int leftDepth = getBalanceTreeDepth(node.left);
		if (leftDepth == -1) return -1;
        
        int rightDepth = getBalanceTreeDepth(node.right);
		if (rightDepth == -1) return -1;
        
        return Math.abs(leftDepth - rightDepth) > 1 ? -1: 1 + Math.max(leftDepth, rightDepth);
	}
	public boolean isBalanced(TreeNode root) {
        return getBalanceTreeDepth(root) == -1? false : true;
    }
	
}
