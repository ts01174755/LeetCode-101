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
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> ans = new ArrayList<>();
		Deque<TreeNode> dq = new LinkedList<TreeNode>();
		Double val = Double.valueOf(0);
		
		if (root != null) dq.add(root);
		while (!dq.isEmpty()) {
            val = Double.valueOf(0);;
			int size = dq.size();
			for (int i = 0; i < size; i++) {
				TreeNode node = dq.pop();
				val += Double.valueOf(node.val);
				if (node.left != null) dq.add(node.left);				
				if (node.right != null) dq.add(node.right); 
			}
			val = val / Double.valueOf(size);
			ans.add(val);
        }
		return ans;
    }
}
