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
// 迭代解法
class Solution {
	public List<Integer> postorderTraversal(TreeNode root) {
		List<Integer> ans = new ArrayList<Integer>();
		Stack<TreeNode> st = new Stack<TreeNode>();
		if(root == null) return ans;
		
		st.add(root);
		while(!st.isEmpty()) {
			TreeNode node = st.pop();
			ans.add(node.val);
			if (node.left != null)st.add(node.left);
			if (node.right != null) st.add(node.right);
		}
        Collections.reverse(ans);
		return ans;
    }
}
// 圖論解法
class Solution {
    public void PostOrderTraversal(TreeNode root, List<Integer> ans) {
		if (root == null) return;
		PostOrderTraversal(root.left, ans);
		PostOrderTraversal(root.right, ans);
		ans.add(root.val);
	}
	
	public List<Integer> postorderTraversal(TreeNode root) {
		List<Integer> ans = new ArrayList<Integer>();
		PostOrderTraversal(root, ans);
		return ans;
    }
}
