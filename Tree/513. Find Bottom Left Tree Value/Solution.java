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
    int maxLen;
    int maxleftValue;
    public void traversal(TreeNode node, int leftLen){
        if (node == null) return;
        if (maxLen < leftLen) {
            maxLen = leftLen;
            maxleftValue = node.val;
        }
        
        traversal(node.left, leftLen+1);
        traversal(node.right, leftLen+1);
    }
    public int findBottomLeftValue(TreeNode root) {
        maxLen = (int) Integer.MIN_VALUE;
        maxleftValue = 0;
        traversal(root, 0);
        
        return maxleftValue;
    }
}
