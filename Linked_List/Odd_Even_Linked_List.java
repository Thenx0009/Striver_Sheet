package Linked_List;

public class Odd_Even_Linked_List {

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
		public ListNode oddEvenList(ListNode head) {
			if(head==null) {
				return head;
			}
			ListNode odd = head;
			ListNode even = head.next;
			
			//maintain the even head;
			ListNode evenHead = head.next;
			
			while(even!=null && even.next!=null) {
				//change pointers for odd list
				odd.next = odd.next.next;
				odd= odd.next;
				//change pointers for even list
				even.next = even.next.next;
				even =  even.next;
			}
			odd.next = evenHead;
			return head;
		}
	}
}
