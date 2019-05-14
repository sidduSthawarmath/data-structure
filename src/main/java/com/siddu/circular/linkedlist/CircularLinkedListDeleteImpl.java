package com.siddu.circular.linkedlist;

//Delete operation circular linked list 
class CircularLinkedListDeleteImpl {

	static Node head = null;

	public void delete(int data) {
		Node temp = head;
		// For deleting first node
		if (head.data == data) {

			// if linked list contains single node
			if (head == head.next) {
				head = null; // make head to null
			} else {
				// loop until end node
				while (temp.next != head) {
					temp = temp.next;
				}
				// end node next is head node so skip that node ref
				temp.next = temp.next.next;
				// first node ref to its next node
				head = head.next;
			}

		} else {
			// loop until next node data is match
			while (temp.next.data != data && temp.next != head) {
				temp = temp.next;
			}
			// then skip next node to its next to next node
			if (temp.next.data == data) {
				temp.next = temp.next.next;
			}
		}
		System.out.println("After deleting  |" + data + "| node is :" + printList());

	}

	public void push(int data) {
		Node ptr = new Node();
		ptr.data = data;
		ptr.next = head;

		Node temp = head;
		if (head == null) {
			ptr.next = ptr;
		} else {
			do {
				temp = temp.next;
			} while (temp.next != head);
			temp.next = ptr;
		}
		head = ptr;
	}

	public static String printList() {
		Node temp = head;
		StringBuffer sbf = new StringBuffer();
		if (head != null) {
			do {
				sbf.append("\t" + temp.data);
				temp = temp.next;
			} while (temp != head);
		} else {
			sbf.append("  Linked list is empty..");
		}
		return sbf.toString();
	}

	public static void main(String[] args) {
		CircularLinkedListDeleteImpl deleteCLL = new CircularLinkedListDeleteImpl();
		deleteCLL.push(10);
		deleteCLL.push(20);
		deleteCLL.push(30);
		deleteCLL.push(40);
		deleteCLL.push(50);

		deleteCLL.delete(10);
		deleteCLL.delete(20);
		deleteCLL.delete(30);
		deleteCLL.delete(40);
		deleteCLL.delete(50);

	}
}

class Node {
	public int data;
	public Node next;
}