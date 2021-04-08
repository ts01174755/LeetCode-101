public class Solution {
	
	public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode ft = head;
		ListNode sl = head;
		for (int i = 0; i < n; i++) {
			ft = ft.next;
		}
        if (ft == null){return head.next;}
		while(ft.next != null) {
			ft = ft.next;
			sl = sl.next;
		}
		sl.next = sl.next.next;
		return head;
    }
}
