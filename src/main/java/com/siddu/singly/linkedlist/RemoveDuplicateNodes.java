package com.siddu.singly.linkedlist;

public class RemoveDuplicateNodes {

	static Node head = null;

	public static void main(String[] args) {
		RemoveDuplicateNodes removeDuplicateNodes = new RemoveDuplicateNodes();

		// From sorted order remove duplicate nodes
		int sortedNodes[] = { 10, 10, 20, 30, 40, 40 };
		head = Node.insertArrayOfAtEndNode(sortedNodes);
		System.out.println("Initial node: " + head);
		removeDuplicateNodes.removeDuplNodeFromSortedNodesList();

		// From unsorted order remove duplicate nodes
		int unSortedNodes[] = { 20, 20, 10, 30, 40, 40, 30 };
		head = Node.insertArrayOfAtEndNode(unSortedNodes);
		System.out.println("\nInitial node: " + head);
		removeDuplicateNodes.removeDuplNodeFromUnSortedNodesList();
	}

	private void removeDuplNodeFromUnSortedNodesList() {
		Node ptrNode1 = head;
		Node ptrNode2 = head;

		while (ptrNode1 != null && ptrNode1.next != null) {
			// each loop skipping one node
			ptrNode2 = ptrNode1;
			// loop reference linked list
			while (ptrNode2.next != null) {
				// Compare each ptrNode1 node to all the nodes of ptrNode2
				if (ptrNode1.data == ptrNode2.next.data) {
					// if matches remove that node(It will effects ptrNode1
					// because of its reference)
					ptrNode2.next = ptrNode2.next.next;
				} else {
					// moving next node
					ptrNode2 = ptrNode2.next;
				}
			}
			ptrNode1 = ptrNode1.next;
		}
		System.out.println("After duplicate removal from unsorted linked list: " + head);
	}

	// Removal of duplicate nodes from sorted linked list
	private void removeDuplNodeFromSortedNodesList() {
		Node temp = head;
		// looping all the nodes
		while (temp.next != null) {
			// Checking the condition current node data is same as next node
			// data
			if (temp.data == temp.next.data) {
				// Overriding current into its next node
				temp.next = temp.next.next;
			} else {
				temp = temp.next;
			}
		}
		System.out.println("After duplicate removal from sorted linked list: " + head);
	}

}
