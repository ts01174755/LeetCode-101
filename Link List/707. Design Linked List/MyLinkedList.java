class MyLinkedList {
	
	class Node{
		int val;
		Node next;
		public Node(int val) {
			this.val = val;
		}
	}
	
	private Node dummy_head = new Node(0);
	private int size = 0;
	
    /** Initialize your data structure here. */
    public MyLinkedList() {
    	System.out.println(dummy_head.next);
    	
    }
    	
    /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
    public int get(int index) {
        if(index < 0 || index >= size) return -1;
        Node curr = dummy_head;
        for(int i = 0; i < index + 1; i++){
            curr = curr.next;
        }
        return curr.val;
    }
    
    public void addAtHead(int val) {
        addAtIndex(0, val);
    }
    
    /** Append a node of value val to the last element of the linked list. */
    public void addAtTail(int val) {
        addAtIndex(size, val);
    }
    
    /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
    public void addAtIndex(int index, int val) {
        if(index > size) return;
        if (size ==0 ) {
        	Node curr = new Node(val);
        	dummy_head.next = curr;
            size++;
        } else if(index <= 0) {
        	Node curr = new Node(val);
        	curr.next = dummy_head.next;
        	dummy_head.next = curr;
            size++;
        } else {
            size++;
            Node curr = dummy_head;
            for(int i = 0; i < index; i++){
                curr = curr.next;
            }
            Node node = new Node(val);
            node.next = curr.next;
            curr.next = node;
        }
    }
    
    /** Delete the index-th node in the linked list, if the index is valid. */
    public void deleteAtIndex(int index) {
        if (index < 0 || index >= size) return;
        size--;
        
        if (index == 0) {
        	dummy_head = dummy_head.next;
            return;
        }
        
        Node curr = dummy_head;
        for(int i = 0; i < index; i++){
            curr = curr.next;
        }
        curr.next = curr.next.next;
    }
}
