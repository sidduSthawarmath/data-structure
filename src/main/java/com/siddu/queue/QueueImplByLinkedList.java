package com.siddu.queue;

public class QueueImplByLinkedList {

	QNode front, rear;

	// Initially front and rear are null
	public QueueImplByLinkedList() {
		this.front = this.rear = null;
	}

	public void enQueue(int element) {
		// Create a node
		QNode temp = new QNode(element);
		// check rear is null
		if (rear == null) {
			// front and rear referencing same address
			front = rear = temp;
			System.out.println("enQueue : " + front);
			return;
		}

		rear.next = temp;
		rear = temp;
		System.out.println("enQueue : " + front);
	}

	public int deQueue() {

		if (front == null) {
			System.out.println("Queue is underflow");
			return -1;
		}

		QNode temp = front;
		// current front will be assigned to next node
		front = front.next;

		// front becomes null then assign rear also null
		if (front == null) {
			front = rear = null;
		}
		System.out.println("deQueue : " + front);
		return temp.element;
	}

	public static void main(String[] args) {
		QueueImplByLinkedList queueByLinkedList = new QueueImplByLinkedList();
		queueByLinkedList.enQueue(10);
		queueByLinkedList.enQueue(20);
		queueByLinkedList.enQueue(30);

		queueByLinkedList.deQueue();
		queueByLinkedList.deQueue();
		queueByLinkedList.deQueue();
		queueByLinkedList.deQueue();
	}

}

class QNode {

	int element;
	QNode next;

	public QNode(int element) {
		this.element = element;
	}

	@Override
	public String toString() {
		return "[element=" + element + ", next=" + next + "]";
	}
}