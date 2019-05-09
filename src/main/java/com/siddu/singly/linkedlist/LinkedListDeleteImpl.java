package com.siddu.singly.linkedlist;

//Linked list delete operations implementations
public class LinkedListDeleteImpl {

	static Node head = null;

	// Deleting first node
	private void deleteFirstNode() {
		if (head != null) {
			// Current head value changed to next node value
			head = head.next;
		}
		System.out.println("Delete first node : " + head);
	}

	// Deleting end of the node
	public void deleteEndNode() {
		if (head != null) {
			Node temp = head;
			// if next node val is null then make head as null
			if (temp.next == null) {
				head = null;
			} else {
				// looping until one element after the next node will be null
				while (temp.next.next != null) {
					temp = temp.next;
				}
				// store temp.next val as next to next(it will be always null)
				temp.next = temp.next.next;
			}
		}
		System.out.println("Delete end node : " + head);
	}

	private void deleteGivenNode(int data) {
		Node temp = head;
		// first node need to delete
		if (temp.data == data) {
			// Assign current node to its next node
			temp = temp.next;
			head = temp;
		} else {
			// loop unitl next node data is equal to given node data
			while (temp.next != null && temp.next.data != data) {
				temp = temp.next;
			}
			// if equals find
			if (temp.next.data == data) {
				// assign next node by its next to the next node
				temp.next = temp.next.next;
			}
		}
		System.out.println("Delete |" + data + "|  Node : " + head);
	}

	public static void main(String[] args) {
		LinkedListDeleteImpl linkedListImpl = new LinkedListDeleteImpl();
		head = Node.loadDataIntoLinkedList(10);

		linkedListImpl.deleteFirstNode();
		linkedListImpl.deleteFirstNode();

		linkedListImpl.deleteEndNode();
		linkedListImpl.deleteEndNode();

		linkedListImpl.deleteGivenNode(40);

	}

}
