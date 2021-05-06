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
// 更快的解法
class Solution {
    public int countNodes(TreeNode root) {
        if (root == null) return 0;
		TreeNode left = root.left;
		TreeNode right = root.right;
		int leftHeight = 0, rightHeight = 0; // 这里初始为0是有目的的，为了下面求指数方便
        while (left != null) {  // 求左子树深度
            left = left.left;
            leftHeight++;
        }
        while (right != null) { // 求右子树深度
            right = right.right;
            rightHeight++;
        }
        if (leftHeight == rightHeight) {
            return (2 << leftHeight) - 1;
        }
        return countNodes(root.left) + countNodes(root.right) + 1;
    }
}
// 一般解法
class Solution {
    public int countNodes(TreeNode root) {
		if (root == null) return 0;
		return 1 + countNodes(root.left) + countNodes(root.right);
    }
}
