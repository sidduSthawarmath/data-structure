package com.siddu.circular.linkedlist;

//Insert operation circular linked list 
public class CircularLinkedListInsertImpl {

	public static Node head = null;

	public static void push(int data) {

		// Create new node
		Node ptr = new Node();
		ptr.data = data;

		// new node data will be head
		ptr.next = head;

		Node temp = head;

		// head is null store ptr node next ref is itself
		if (head == null) {
			ptr.next = ptr;
		} else {
			// else loop until next data will not be same as head
			do {
				temp = temp.next;
			} while (temp.next != head);
			// Store temp next node as ptr
			temp.next = ptr;
		}
		head = ptr;
	}

	static void printList() {
		Node temp = head;
		if (head != null) {
			do {
				System.out.print("|"+temp.data + "| ");
				temp = temp.next;
			} while (temp != head); //loop until head and temp should not be same
		}
	}

	public static void main(String[] args) {
		CircularLinkedListInsertImpl.push(10);
		CircularLinkedListInsertImpl.push(20);
		CircularLinkedListInsertImpl.push(30);
		CircularLinkedListInsertImpl.push(40);
		CircularLinkedListInsertImpl.push(50);
		CircularLinkedListInsertImpl.push(60);
		System.out.println("Print all nodes");
		CircularLinkedListInsertImpl.printList();
	}
}
