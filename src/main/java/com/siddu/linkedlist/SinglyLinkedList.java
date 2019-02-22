package com.siddu.linkedlist;

public class SinglyLinkedList {
	// Initial head should be null
	Node head = null;

	public boolean isEmpty() {
		if (head == null) {
			return true;
		} else {
			return false;
		}
	}

	public void insertFirst(int element) {
		System.out.println("\ninsertFirst called");
		// Created new node
		Node newNode = new Node();
		
		//its data will be passed 
		newNode.data = element;
		
		//next node will the head
		newNode.next = head;
		
		head = newNode;
		System.out.println(head);

	}

	public void insertLast(int element) {
		System.out.println("\ninsertLast called");
		Node currentNode = head;
		while (currentNode.next != null) {
			currentNode = currentNode.next;
		}
		Node newNode = new Node();
		newNode.data = element;
		currentNode.next = newNode;
		System.out.println(head);

	}

	public void deleteFirstNode() {
		System.out.println("\ndeleteFirstNode called");
		Node nodeDelete = head;
		head = nodeDelete.next;
		System.out.println(head);
	}

	public void deleteNode(Node node) {
		System.out.println("\ndeleteNode called");
		Node temp = head;
		
		while (temp.data != node.data && temp.next.next != null) {
			temp = temp.next;
		}
		if (temp.data != node.data && temp.next.next == null) {
			temp.next = null;
			head = temp;
		} else {
			head = temp.next;
		}

		System.out.println(head);
	}

	public void deleteNodeAfter(Node node) {
		System.out.println("\ndeleteFirstNode called");
		Node temp = head;
		while (temp.next != null && temp.data != node.data) {
			temp = temp.next;
		}
		if (temp.next != null) {
			temp.next = temp.next.next;
		}
		System.out.println(head);
	}

	public static void main(String[] args) {
		SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
		singlyLinkedList.insertFirst(10);
		singlyLinkedList.insertFirst(20);
		singlyLinkedList.insertFirst(30);

		singlyLinkedList.insertLast(40);
		singlyLinkedList.deleteFirstNode();

		Node deleteNodeAfter = new Node();
		deleteNodeAfter.data = 10;

		singlyLinkedList.deleteNodeAfter(deleteNodeAfter);

		Node deleteNode = new Node();
		deleteNode.data = 20;
		singlyLinkedList.deleteNode(deleteNode);
		singlyLinkedList.printLinkedList();
	}

	public void printLinkedList() {
		System.out.println("\nPrinting LinkedList (head --> last) ");
		Node current = head;
		while (current != null) {
			current.displayNodeData();
			current = current.next;
		}
		System.out.println();
	}
}

class Node {
	int data;
	Node next;

	public void displayNodeData() {
		System.out.println(data);
	}

	@Override
	public String toString() {
		return "Node [data=" + data + ", next=" + next + "]";
	}
}
