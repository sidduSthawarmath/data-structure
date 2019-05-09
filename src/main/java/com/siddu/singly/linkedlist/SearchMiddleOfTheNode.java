package com.siddu.singly.linkedlist;

//Search middle of the node
public class SearchMiddleOfTheNode {

	static Node head = null;

	public static void main(String[] args) {

		SearchMiddleOfTheNode searchMiddleOfTheNode = new SearchMiddleOfTheNode();
		// Initial node of size 3
		head = Node.loadDataIntoLinkedList(10);
		searchMiddleOfTheNode.findMiddleNode();

		// Initial node of size 6
		/*
		 * System.out.println(""); head = Node.loadDataIntoLinkedList(6);
		 * searchMiddleOfTheNode.findMiddleNode();
		 */

	}

	// Middle of the node logic
	private void findMiddleNode() {
		// Copying head node to two temp var
		Node fastMovingNode = head;
		Node slowMovingNode = head;

		// Move each loop fastMovingNode to 2 nodes ahead
		// Move each loop slowMovingNode to 1 node ahead
		// it means when fastMovingNode reaches its end at that time
		// slowMovingNode is middle of the nodes
		while (fastMovingNode != null && fastMovingNode.next != null) {
			fastMovingNode = fastMovingNode.next.next;
			slowMovingNode = slowMovingNode.next;
		}
		System.out.println("Middle of the node is : |" + slowMovingNode.data + "|");

	}
}
