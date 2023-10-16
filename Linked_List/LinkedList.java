package Linked_List;

public class LinkedList {

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
	//getFirst
	public int getFirst() throws Exception {
		if(this.size==0) {
			throw new Exception("Linked List is Empty");
		}
		return this.head.data;
	}
	//getLast
	public int getLast() throws Exception {
		if(this.size==0) {
			throw new Exception("Linked List is Empty");
		}
		return this.tail.data;
	}
	
	//getatIndex
	public int getatIndex(int k) throws Exception {
		return getNode(k).data;
	}
	//getNode
	private Node getNode(int k) throws Exception {
		if(k<0 || k>=size) {
			throw new Exception("index out of Bound");
		}
		Node temp = this.head; //This already storing the 0th index NODE so,we have to start the index from 1.
		for(int i=1;i<=k;i++) {
			temp = temp.next;
		}
		return temp;
	}
	//add at Index
	public void addatIndex(int k,int item) throws Exception {
		if(k<0 || k>size) {
			throw new Exception("Index out of Bound");
		}
		if(k==0) {
			addFirst(item);
		}
		else if(k==size) {
			addLast(item);
		}
		else {
			Node nn = new Node(item);
			Node k_1th = getNode(k-1);
			Node kth = getNode(k);
			k_1th.next = nn;
			nn.next = kth;
			this.size++;
		}
	}
	//removeFirst
	public int removeFirst() throws Exception {
		if(this.size==0) {
			throw new Exception("LinkedList is empty");
		}
		Node temp = this.head;
		this.head = this.head.next;
		temp.next=null;
		this.size--;
		return temp.data;
	}
	//removeLast
	public int removeLast() throws Exception {
		if(this.size==0) {
			throw new Exception("LinkedList is Empty");
		}
		if(this.size==1) {
			removeFirst();
		}
		Node temp = this.tail;
		this.tail = getNode(this.size-2);
		this.tail.next = null;
		this.size--;
		return temp.data;
		
	}
	//remove at index
	public int removeatIndex(int k) throws Exception {
		Node kth = getNode(k);
		Node k_1th = getNode(k-1);
		k_1th.next = kth.next;
		kth.next = null;
		this.size--;
		return kth.data;
	}

}
