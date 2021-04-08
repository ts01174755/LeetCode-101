class Solution {
    public ListNode removeElements(ListNode head, int val) {
    	if (head == null) {
          return null;
        }

        ListNode dummy_head = new ListNode(val+1,head);
    	ListNode ft = dummy_head;
    	while(ft.next != null && ft != null) {
    		if(ft.next.val != val) {
			ft = ft.next;
    		} else {
	                ft.next = ft.next.next;
            	}
    	}
        
        return dummy_head.next;
    }
}
