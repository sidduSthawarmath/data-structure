package com.siddu.queue;

public class CustomQueue {

	// Tracking count of the elements used for size, isEmpty and isFull check of
	// the queue
	int count = 0;

	// Queue element is removed from the front. It will get incremented when
	// element got removed
	int front = 0;

	// When queue element is added then rear will get incremented.
	int rear = 0;

	// Initial capacity of the queue
	final int CAPACITY = 3;

	// Empty array of object
	Object[] data = null;

	public CustomQueue() {
		data = new Object[CAPACITY];
	}

	public void enQueue(Object element) {
		// Before adding check the queue is full
		if (isFull()) {
			System.out.println("Queue is full");
			System.exit(1);
		}

		// rear mod capacity will returns index where elements need to store in
		// queue.
		rear = rear % CAPACITY;
		// store elements
		data[rear] = element;

		// Increase rear
		rear++;

		// Increase count
		count++;

		System.out.println(element + " added to queue successfully");
	}

	public Object deQueue() {
		// Before remove the elements from the queue we need to check whether
		// queue is Empty.
		if (isEmpty()) {
			System.out.println("Queue is empty");
			System.exit(1);
		}

		// Current front element will be removed by getting its index
		front = front % CAPACITY;

		// get elements need to remove
		Object temp = data[front];

		// assign null to removed element index
		data[front] = null;
		// front will get increase
		front++;

		// count will get descrease
		count--;

		System.out.println(temp + " removed from queue successfully");
		return temp;
	}

	private boolean isEmpty() {
		if (count == 0) {
			return true;
		} else {
			return false;
		}
	}

	public boolean isFull() {
		// if the capacity of the array and current count of the queue is equals
		// then queue is full
		if (count == CAPACITY) {
			return true;
		} else {
			return false;
		}
	}

	// Count of the elements in the array is size of the queue
	public int size() {
		return count;
	}

	public static void main(String[] args) {
		CustomQueue queueTest = new CustomQueue();
		queueTest.enQueue(10);
		queueTest.enQueue(20);
		queueTest.enQueue(30);
		System.out.println("Size of the queue:" + queueTest.size());
		System.out.println("Is queue is full : " + queueTest.isFull());

		queueTest.deQueue();
		queueTest.deQueue();
		queueTest.deQueue();
		System.out.println("Size of the queue:" + queueTest.size());
		System.out.println("Is queue is empty : " + queueTest.isEmpty());

	}

}
