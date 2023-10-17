package Linked_List;

import Linked_List.Middle_of_the_Linked_List.ListNode;

public class Sort_List {

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
		public ListNode sortList(ListNode head) {
			if(head==null || head.next==null) {
				return head;
			}
			ListNode mid = middleNode(head);
			ListNode headB = mid.next;
			mid.next = null;
			
			ListNode A = sortList(head);
			ListNode B = sortList(headB);
			return mergeTwoLists(A,B);
			
		}

		public ListNode middleNode(ListNode head) {
			ListNode fast = head;
			ListNode slow = head;
			while (fast.next != null && fast.next.next != null) {
				slow = slow.next;
				fast = fast.next.next;
			}
			return slow;
		}

		public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
			ListNode dummy = new ListNode(0);
			ListNode temp = dummy;

			while (list1 != null && list2 != null) {
				if (list1.val < list2.val) {
					temp.next = list1;
					temp = temp.next;// increment temp
					list1 = list1.next;// increment list1
				} else {
					temp.next = list2;
					temp = temp.next;// increment temp
					list2 = list2.next;// increment list1
				}
			}
			if (list1 == null) {
				temp.next = list2;
			}
			if (list2 == null) {
				temp.next = list1;
			}
			return dummy.next;
		}
	}
}
