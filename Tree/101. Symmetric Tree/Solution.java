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
	public boolean isSymmetric(TreeNode root) {
		if (root == null) return true;
		Deque<TreeNode> dq = new LinkedList<>();
		dq.add(root.left);
		dq.add(root.right);
		while (!dq.isEmpty()) {
			TreeNode left = dq.pop();
			TreeNode right = dq.pop();
			if (left == null & right == null) continue;
			if (left == null | right == null) return false;
            else if (left.val != right.val) return false;
                
			dq.add(left.left);
			dq.add(right.right);
			dq.add(left.right);
			dq.add(right.left);
		}
		return true;
    }
}

class Solution {
	public boolean compare(TreeNode left, TreeNode right) {
		if (left == null & right != null) return false;
		else if (left != null & right == null) return false;
		else if (left == null & right == null) return true;
		else if (left.val != right.val) return false;
		else return compare(left.left, right.right) & compare(left.right, right.left);
    }
	public boolean isSymmetric(TreeNode root) {
        return compare(root.left, root.right);
    }
}
