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
//迭代法
class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
		List<Integer> ans = new ArrayList<Integer>();
		Stack<TreeNode> st = new Stack<TreeNode>();
		if(root == null) return ans;
		
		st.add(root);
		while(!st.isEmpty()) {
			TreeNode node = st.pop();
			
			ans.add(node.val);
			if (node.right != null) st.add(node.right);
			if (node.left != null)st.add(node.left);
		}
		return ans;
    }
}
