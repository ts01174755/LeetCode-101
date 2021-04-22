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
    public List<Integer> inorderTraversal(TreeNode root) {
		List<Integer> ans = new ArrayList<Integer>();
		Stack<TreeNode> st = new Stack<TreeNode>();
		if(root == null) return ans;
		
		TreeNode node = root;
		while (node != null || !st.empty()) {
            if (node != null) {
                st.add(node);
                node = node.left; 
            } else {
            	node = st.pop(); 
                ans.add(node.val);
                node = node.right;
            }
        }
		return ans;
    }
}
//圖論解法
class Solution {
    public void InOrderTraversal(TreeNode root, List<Integer> ans) {
		if (root == null) return;
		InOrderTraversal(root.left, ans);
		ans.add(root.val);
		InOrderTraversal(root.right, ans);
	}
	
	public List<Integer> inorderTraversal(TreeNode root) {
		List<Integer> ans = new ArrayList<Integer>();
		InOrderTraversal(root, ans);
		return ans;
    }
}
