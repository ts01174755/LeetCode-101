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
// 圖論解法
class Solution {
    public void PreOrderTraversal(TreeNode root, List<Integer> ans) {
		if (root == null) return;
		ans.add(root.val);
		PreOrderTraversal(root.left, ans);
		PreOrderTraversal(root.right, ans);
	}
    
	public List<Integer> preorderTraversal(TreeNode root) {
		List<Integer> ans = new ArrayList<Integer>();
		PreOrderTraversal(root, ans);
		return ans;
    }
}
