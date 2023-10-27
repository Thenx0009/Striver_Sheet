package Linked_List;

public class remove_cycle_in_Linked_List {
	
	public class Node{
		int data;
		Node next;
		
		public Node(int data) {
			this.data = data;
		}
	}
	
	private Node head;
	private int size;
	private Node tail;
	
	//AddFirst
	public void addFirst(int item) {
		
		Node nn = new Node(item);
		if(this.size==0) {
			this.head = nn;
			this.tail = nn;
			this.size++;
		}
		else {
			nn.next = this.head;
			this.head = nn;
			this.size++;
		}
	}
	//Display
	public void Display() {
		Node temp = this.head;
		while(temp!=null) {
			System.out.print(temp.data+"-->");
			temp=temp.next;
		}
		System.out.println();
	}
	
	//addLast
	public void addLast(int item) {
		if(this.size==0) {
			addFirst(item);
		}
		else {
			Node nn = new Node(item);
			this.tail.next = nn;
			this.tail = nn;
			this.size++;
		}
	}
	
	public void createCycle() {
		//this.tail.next = this.head; //Circular Linked List
		this.tail.next = this.head.next.next; //Cycle in a Linked List
	}
	//This is the main logic to submit on the leetcode
	public Node hasCycle() {
		Node slow = this.head;
		Node fast = this.head;
		
		while(fast!=null && fast.next!=null) {
			slow = slow.next;
			fast = fast.next.next;
			if(slow==fast) {
				return slow;
			}
		}
		return null;
	}
	public void removeCycle() {
		
		Node meetup = hasCycle();
		if(meetup==null) {
			return;
		}
		Node start = head;
		while(start!=null) {
			Node temp = meetup;
			while(temp.next != meetup) {
				if(temp.next==start) {
					temp.next=null;
				}
				temp=temp.next;
			}
			start= start.next;
		}
		
	}
	  
}
