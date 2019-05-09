package com.siddu.singly.linkedlist;

//Find position of the node by starting to end and its reverse
public class SearchNodeByPosition {

	static Node head = null;

	public static void main(String[] args) {
		SearchNodeByPosition searchNodeByPosition = new SearchNodeByPosition();
		head = Node.loadDataIntoLinkedList(10);

		// find node by position stating front front node logic
		searchNodeByPosition.findNthNodeFromFrontNode(0);

		// find position from front node logic
		searchNodeByPosition.findNthNodeFromEndNode(3);

	}

	// find node by position stating front front node
	private void findNthNodeFromEndNode(int position) {
		Node temp = head;
		// find length
		int length = findNumOfNodes();

		if (position >= length) {
			System.out.println("Position is greater length of the linked list..");
		} else {
			// here position+1 did because position starts from 0
			for (int i = 0; i < length - (position + 1); i++) {
				temp = temp.next;
			}
			System.out.println(position + " position  node  starting from end is : |" + temp.data + "|");
		}

	}

	// find position from front node
	private void findNthNodeFromFrontNode(int position) {
		Node temp = head;
		// take length
		int length = findNumOfNodes();
		if (position >= length) {
			System.out.println("Position is greater length of the linked list..");
		} else {
			// Loop upto position
			for (int i = 0; i < position; i++) {
				temp = temp.next;
			}
			System.out.println(position + " position node starting from front is : |" + temp.data + "|");
		}
	}

	// find length
	private int findNumOfNodes() {
		int length = 0;
		Node temp = head;
		// Loop upto end of the linked list and increase length count
		while (temp != null) {
			temp = temp.next;
			length++;
		}
		return length;
	}

}
