package Linked_List;

public class LinkedList_Client {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		LinkedList ll = new LinkedList();
		ll.addLast(10);
		ll.addLast(20);
		ll.addLast(30);
		ll.addLast(40);
		ll.addLast(50);
		ll.Display();
//		System.out.println(ll.getFirst());
//		System.out.println(ll.getLast());
//		System.out.println(ll.getatIndex(0));
//		//System.out.println(ll.removeFirst());
//		System.out.println(ll.removeatIndex(2));
//		//System.out.println(ll.removeLast());
//		ll.Display();
		ll.addatIndex(4, 70);
		ll.Display();
	}

}
