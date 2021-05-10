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
    public void preOrder(TreeNode root, String path, LinkedList<String> ans) {
		path += root.val;
		if (root.left == null && root.right == null) {
			ans.add(path);
			return ;
		}
		if (root.left != null) {
			preOrder(root.left, path + "->", ans);
		}
		if (root.right != null) {
			preOrder(root.right, path + "->", ans);
		}
	}
	public List<String> binaryTreePaths(TreeNode root) {
		LinkedList<String> ans = new LinkedList<>();
		String path = "";
		if (root == null) return ans;
		preOrder(root, path, ans);
        return ans;
    }
}
