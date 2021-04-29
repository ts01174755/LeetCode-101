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
    public List<List<Integer>> levelOrder(TreeNode root) {
	    List<List<Integer>> ans = new ArrayList<List<Integer>>();
		Deque<TreeNode> dq = new LinkedList<TreeNode>();
        
        if (root == null) return ans;
		dq.add(root);
		while (dq.size() > 0) {
			int size = dq.size();
            List<Integer> subans = new ArrayList<>(size);
      // List<Integer> subans = new ArrayList<Integer>; 較慢
			
			for (int i = 0; i < size; i++) {
				TreeNode node = dq.pop();
				subans.add(node.val);
                 
				if (node.left != null) dq.add(node.left);
				if (node.right != null) dq.add(node.right);
			}
			ans.add(subans);
        }
		return ans;
    }
}
