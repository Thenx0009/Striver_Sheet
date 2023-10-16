package Linked_List;

public class Remove_Nth_Node_From_End_of_List {

	public class ListNode {
		int val;
		ListNode next;

		ListNode() {
		}

		ListNode(int val) {
			this.val = val;
		}

		ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}
	}

	class Solution {
		public ListNode removeNthFromEnd(ListNode head, int n) {
			ListNode slow = head;
			ListNode fast = head;
			while(n-->0) {
				fast = fast.next;
				if(fast==null) {
					head = head.next;
					return head;
				}
			}
			while(fast.next!=null) {
				slow = slow.next;
				fast = fast.next;
			}
			slow.next = slow.next.next;
			return head;
		}
	}

}
