package com.siddu.queue;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

// Implementation of Circular Queue
public class CircularQueueImplementation {

	private int currentSize = 0;
	private Object[] data = new Object[5];
	private int rear = -1;
	private int front = -1;

	// Enqueue elements to rear.
	public void enqueue(Object item) throws Exception {
		if (isFull()) {
			System.out.println("Circular Queue is full. Element cannot be added");
			return;
		} else {
			rear = (rear + 1) % data.length;
			data[rear] = item;
			currentSize++;

			if (front == -1) {
				front = rear;
			}
		}
	}

	// Dequeue element from Front.
	public Object dequeue() throws Exception {
		if (isEmpty()) {
			System.out.println("Circular Queue is empty. Element cannot be retrieved");
			return null;
		} else {
			Object num = data[front];
			data[front] = null;
			front = (front + 1) % data.length;
			currentSize--;
			return num;
		}
	}

	// Check if queue is full.
	public boolean isFull() {
		return (currentSize == data.length);
	}

	// Check if Queue is empty.
	public boolean isEmpty() {
		return (currentSize == 0);
	}

	@Override
	public String toString() {
		return "CircularQueue [" + Arrays.toString(data) + "]";
	}

	public static void main(String[] args) throws Exception {

		CircularQueueImplementation circularQueue = new CircularQueueImplementation();
		circularQueue.enqueue(15);
		circularQueue.enqueue(16);
		circularQueue.enqueue(17);
		circularQueue.enqueue(18);
		circularQueue.enqueue(19);

		System.out.println("Full Circular Queue" + circularQueue);
		System.out.print("Dequeued following element from circular Queue ");
		System.out.println(circularQueue.dequeue() + " ");
		circularQueue.enqueue(23);
		System.out.println("After enqueueing circular queue with element having value 23");
		System.out.println(circularQueue);

	}

}
