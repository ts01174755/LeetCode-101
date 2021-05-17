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
//堆疊法
class Solution {
    public class Node {
        TreeNode root;
        int sum;
        public Node(TreeNode root, int sum) {
            this.root = root;
            this.sum = sum;
        }
        public String toString() {
            return root.val + ", sum = " + sum;
        }
    }
    
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) return false;
        Stack<Node> st = new Stack<>();
        
        st.push(new Node(root, root.val));
        while (!st.isEmpty()){
            Node node = st.pop();
            root = node.root;
            int sum = node.sum;
            if (root.left == null & root.right == null & sum == targetSum) 
                return true;
            
            if (root.right != null) 
                st.push(new Node(root.right, sum +  root.right.val));
            if (root.left != null) 
                st.push(new Node(root.left, sum +  root.left.val));
        }
        return false;
        
    }
}

class Solution {
    public boolean traversal(TreeNode node, int pathSum, int targetSum){
        if (node.left == null & node.right == null) {
            if (pathSum == targetSum) return true;
            else return false;
        }
        
        if (node.left != null)
            if (traversal(node.left, pathSum + node.left.val, targetSum)) 
                return true;
        if (node.right != null)
            if (traversal(node.right, pathSum + node.right.val, targetSum)) 
                return true;
        return false;
    }
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) return false;
        int pathSum = 0;
        return traversal(root, pathSum + root.val, targetSum);
        
    }
}
