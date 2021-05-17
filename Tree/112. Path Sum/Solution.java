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
    public boolean traversal(TreeNode node, int pathSum, int targetSum){
        if (node.left == null & node.right == null) {
            if (pathSum == targetSum) return true;
            else return false;
        }
        
        if (node.left != null)
            if (traversal(node.left, pathSum + node.left.val, targetSum)) 
                return true;
        if (node.right != null)
            if (traversal(node.right, pathSum + node.right.val, targetSum)) 
                return true;
        return false;
    }
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) return false;
        int pathSum = 0;
        return traversal(root, pathSum + root.val, targetSum);
        
    }
}
