package Linked_List;

public class Middle_of_the_Linked_List {

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
		public ListNode middleNode(ListNode head) {
			ListNode fast = head;
			ListNode slow = head;
			while(fast.next!=null && fast!=null) {
				slow = slow.next;
				fast = fast.next.next;
			}
			return slow;
		}
	}
}
