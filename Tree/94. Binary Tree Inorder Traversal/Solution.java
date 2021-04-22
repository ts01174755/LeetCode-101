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
// 風格統一解法
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
		List<Integer> ans = new ArrayList<Integer>();
		Stack<TreeNode> st = new Stack<TreeNode>();
		
        if (root != null) st.add(root);
		while (!st.empty()) {
            TreeNode node = st.pop();
            if (node != null) {
            	// 添加右节点（空节点不入栈）
                if (node.right != null) st.push(node.right);  
                
                // 添加中节点，並加入空节点做为标记。
                st.push(node); 
                st.push(null);
                
                // 添加左节点（空节点不入栈）
                if (node.left != null) st.push(node.left);
                
            } else { // 只有遇到空节点的时候，才将下一个节点放进结果集
                node = st.pop();    // 重新取出栈中元素
                ans.add(node.val); // 加入到结果集
            }
        }
        return ans;
    }
}
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
