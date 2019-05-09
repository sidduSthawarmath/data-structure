package com.siddu.singly.linkedlist;

//Linked list insert operations implementations
public class LinkedListInsertImpl {

	Node head = null;

	// Insert Node at the front
	public void insertAtFrontNode(int data) {
		// Creating new node with data
		Node newNode = new Node(data, null);

		// if head null then assign new node to head
		if (head == null) {
			head = newNode;
		} else {
			// Already existing node(i.e head) storing into newNode next
			newNode.next = head;
			// Then assign new node to head(Now head has the new node also)
			head = newNode;
		}
		System.out.println("Insert |" + data + "| at front node : " + head);
	}

	// Insert node at the end
	public void insertAtEndNode(int data) {
		Node newNode = new Node(data, null);
		if (head == null) {
			head = newNode;
		} else {
			// Assign the head node to temp node
			Node temp = head;
			// trace temp node until the end
			while (temp.next != null) {
				temp = temp.next;

			}
			// At the end store next value to new node
			// Head node will get change based on the call by ref
			temp.next = newNode;
		}
		System.out.println("Insert |" + data + "| at end node  : " + head);
	}

	// Store the value after the given node
	public void insertAfterNode(Node prevNode, int data) {
		// store head in temp node
		Node temp = head;

		// If firstTime
		if (head == null) {
			head = prevNode;
		} else {
			// Now trace node until the end or data should equal to the previous
			// node
			while (temp.next != null && temp.data != prevNode.data) {
				// End of the loop will get node which data match the prev node
				// data
				temp = temp.next;
			}

			Node newNode = new Node(data, null);
			// if prevNode exist then
			if (temp.data == prevNode.data) {
				// store previous node next value in new node of the next value
				newNode.next = temp.next;
				// store new node to previous node vlaue
				temp.next = newNode;
			} else {
				System.out.println("Previous node |" + prevNode.data + "| does not exist..");
				return;
			}
		}
		System.out.println("Insert |" + data + "| after the |" + prevNode.data + "| node : " + head);
	}

	public static void main(String[] args) {
		LinkedListInsertImpl linkedListImpl = new LinkedListInsertImpl();

		linkedListImpl.insertAtEndNode(20);

		linkedListImpl.insertAtFrontNode(10);

		linkedListImpl.insertAtEndNode(30);
		linkedListImpl.insertAtEndNode(40);

		Node prevNode = null;
		prevNode = new Node(20, null);
		linkedListImpl.insertAfterNode(prevNode, 100);

		prevNode = new Node(34, null);
		linkedListImpl.insertAfterNode(prevNode, 100);
	}

}

class Node {
	int data;
	Node next;

	public Node(int data, Node next) {
		this.data = data;
		this.next = next;
	}

	// Load Initial data
	public static Node loadDataIntoLinkedList(int numOfNode) {
		Node head = null;
		for (int i = 1; i <= numOfNode; i++) {
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
		return head;
	}

	// Insert array of node at the end
	public static Node insertArrayOfAtEndNode(int[] data) {
		Node head = null;
		for (int i = 0; i < data.length; i++) {
			Node newNode = new Node(data[i], null);
			if (head == null) {
				head = newNode;
			} else {
				// Assign the head node to temp node
				Node temp = head;
				// trace temp node until the end
				while (temp.next != null) {
					temp = temp.next;
				}
				// At the end store next value to new node
				// Head node will get change based on the call by ref
				temp.next = newNode;
			}
		}
		return head;
	}

	@Override
	public String toString() {
		return "|" + data + "|  " + (next != null ? next + " " : "") + "";
	}

}
