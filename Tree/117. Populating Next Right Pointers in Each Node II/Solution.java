/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/
//神速
class Solution {
    
    Node prev, leftmost;
    
    private void processChild(Node childNode) {
        if (childNode != null) {
            if (this.prev == null) {
                this.prev = childNode;
                leftmost = childNode;
            } else {
                this.prev.next = childNode; 
                this.prev = childNode;
            }
        }
    }
        
    public Node connect(Node root) {   
        if (root == null) {
            return root;
        }
        this.leftmost = root;
        Node curr = leftmost;

        while (this.leftmost != null) {
            this.prev = null;
            curr = this.leftmost;
            leftmost = null;
            while (curr != null) {
                this.processChild(curr.left);
                this.processChild(curr.right);
                
                // Move onto the next node.
                curr = curr.next;
            }
        }
                
        return root ;
    }
}
// 一般解法
class Solution {
    public Node connect(Node root) {
        if (root == null) return null;
        
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        
        while(queue.size() != 0){
            int sz = queue.size();
            Node current = queue.poll();
            if (current.left != null) queue.add(current.left);
            if (current.right != null) queue.add(current.right);
            for (int i = 0; i < sz - 1; i++){
                current.next = queue.poll();
                current = current.next;
                if (current.left != null) queue.add(current.left);
                if (current.right != null) queue.add(current.right);
            }
        }
            
        return root;
    }
}
