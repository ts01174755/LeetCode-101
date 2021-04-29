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
// 神速
class Solution {
    public Node connect(Node root) {
        
        if(root == null) return null;
        
        Node pointer = root;
        Node firstInALine = pointer.left;
        
        while(firstInALine != null) {
  
            while(pointer != null) {
                pointer.left.next = pointer.right;
            
                if(pointer.next != null) {
                    pointer.right.next = pointer.next.left;
                }
            
                pointer = pointer.next;
            }
            
            pointer = firstInALine;
            firstInALine = pointer.left;
        }
        
        return root;
        
    }
}

// 一般解法
class Solution {
    public Node connect(Node root) {
		if (root == null) return root; 
		Deque<Node> dq = new LinkedList<>();		
		dq.add(root);
		while (!dq.isEmpty()) {
			int size = dq.size();
			Node node_sl = null;
			for (int i = 0; i < size; i++) {
				Node node = dq.pop();
				node.next = node_sl;
				node_sl = node;
				if (node.right != null) dq.add(node.right); 
				if (node.left != null) dq.add(node.left);				
			}
        }
		return root;
    }
}
