package Linked_List;

public class Merge_Two_Sorted_Lists {

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
		public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
			ListNode dummy = new ListNode(0);
			ListNode temp = dummy;
			
			while(list1!=null && list2!=null) {
				if(list1.val<list2.val) {
					temp.next = list1;
					temp = temp.next;//increment temp
					list1 = list1.next;//increment list1
				}
				else {
					temp.next=list2;
					temp = temp.next;//increment temp
					list2 = list2.next;//increment list1
				}
			}
			if(list1==null) {
				temp.next = list2;
			}
			if(list2==null) {
				temp.next = list1;
			}
			return dummy.next;
		}
	}
}
