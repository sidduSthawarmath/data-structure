package com.siddu.singly.linkedlist;

//Delete node by positions
public class DeleteNodeByPosition {

	static Node head = null;

	// Load initial data
	private void loadDataIntoLinkedList() {
		for (int i = 1; i <= 10; i++) {
			Node newNode = new Node(i * 10, null);
			if (head == null) {
				head = newNode;
			} else {
				Node temp = head;
				while (temp.next != null) {
					temp = temp.next;
				}
				temp.next = newNode;
			}
		}
		System.out.println("Initial node : " + head);
	}

	// Delete node by positions
	private void deleteNodeAtPosition(int position) {
		Node temp = head;
		// If position is 0th then skip first node
		if (position == 0) {
			head = head.next;
		} else {
			// Loop until the position before elements
			for (int i = 0; i < position - 1; i++) {
				temp = temp.next;
			}
			// Then delete the next node
			temp.next = temp.next.next;
		}
		System.out.println("Delete " + position + " position node : " + head);
	}

	public static void main(String[] args) {
		DeleteNodeByPosition deleteNodeByPosition = new DeleteNodeByPosition();
		deleteNodeByPosition.loadDataIntoLinkedList();

		// delete at by position
		deleteNodeByPosition.deleteNodeAtPosition(2);
	}
}
