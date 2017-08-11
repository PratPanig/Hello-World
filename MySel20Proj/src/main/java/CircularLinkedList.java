class Node {
	Node next;
	int info;

	Node(int data) {
		info = data;
		next = null;
	}

	Node createList() {
		Node a1 = new Node(1);
		Node a2 = new Node(2);
		Node a3 = new Node(3);
		Node a4 = new Node(4);
		Node a5 = new Node(5);
		Node a6 = new Node(6);
		Node a7 = new Node(7);
		Node a8 = new Node(8);
		Node a9 = new Node(9);
		Node a10 = new Node(10);
		a10.next = a3;
		a9.next = a10;
		a8.next = a9;
		a7.next = a8;
		a6.next = a7;
		a5.next = a6;
		a4.next = a5;
		a3.next = a4;
		a2.next = a3;
		a1.next = a2;
		return a1;
	}

	void CheckForCircularLL(Node CircularLL) {
		Node slowPtr = CircularLL;
		Node fastPtr = CircularLL;
		while (slowPtr != null && fastPtr != null && fastPtr.next != null) {
			slowPtr = slowPtr.next;
			fastPtr = fastPtr.next.next;
			if (slowPtr == fastPtr) {
				System.out.println("Link List is Circular");
				System.exit(0);
			}
		}
		System.out.println("Link List is NOT Circular");
	}
}

public class CircularLinkedList {
	public static void main(String[] args) {
		Node ap = new Node(0);
		System.out.println("Create Circular Linked List");
		Node circularList = ap.createList();
		System.out.println("Check whether Linked List is Circular : ");
		System.out.println();
		ap.CheckForCircularLL(circularList);

	}
}