package com.siddu.stack;

public class StackAsLinkedList {

	// Initially Head will be null
	StackNode head = null;

	public void push(int data) {
		// Node is created
		StackNode stackNode = new StackNode(data);
		// If head is null directly assign node to head
		if (head == null) {
			head = stackNode;
			System.out.println("\nPush :" + dispaly());
			return;
		} // otherwise

		StackNode temp = head; // Assign head to temp
		head = stackNode; // now head will be new node
		stackNode.next = temp;// this new node next will be temp node
		System.out.println("\nPush :" + dispaly());
	}

	public void pop() {
		if (head == null) { // Check head should not be empty
			System.out.println("Stack is underflow");
			return;
		}
		head = head.next; // Removes first node
		System.out.println("\nPop :" + dispaly());
	}

	public String dispaly() {
		StringBuilder stringBuilder = new StringBuilder();
		StackNode temp = head;
		while (temp != null) {
			stringBuilder.append(temp.data + "\t");
			temp = temp.next;
		}
		return stringBuilder.toString();
	}

	public static void main(String[] args) {
		StackAsLinkedList stackAsLinkedList = new StackAsLinkedList();
		stackAsLinkedList.push(10);
		stackAsLinkedList.push(20);
		stackAsLinkedList.push(30);
		stackAsLinkedList.push(40);

		stackAsLinkedList.pop();
		stackAsLinkedList.pop();
		stackAsLinkedList.pop();
		stackAsLinkedList.pop();
		stackAsLinkedList.pop();

	}
}

class StackNode {

	int data;
	StackNode next;

	public StackNode(int data) {
		this.data = data;
	}

	public void display() {
		System.out.println(data);
	}

}
