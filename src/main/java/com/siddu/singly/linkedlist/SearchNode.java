package com.siddu.singly.linkedlist;

//Search node is present or not and print its position if exists
public class SearchNode {

	static Node head = null;

	private int findNode(int data) {
		Node temp = head;
		int position = 0;
		// Checking current node data is matches search node
		while (temp != null && temp.data != data) {
			temp = temp.next;
			position++;
		}
		if (temp != null && temp.data == data) {
			System.out.println("Node |" + data + "| present at position " + position);
		} else {
			System.out.println("Node |" + data + "| not exist");
		}
		return position;
	}

	public static void main(String[] args) {
		SearchNode searchNode = new SearchNode();
		head = Node.loadDataIntoLinkedList(10);
		searchNode.findNode(10);
		searchNode.findNode(100);
		searchNode.findNode(50);
		searchNode.findNode(51);
	}
}
