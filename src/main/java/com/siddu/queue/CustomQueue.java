package com.siddu.queue;

public class CustomQueue {

	private static int current_size = 0;

	private static final int SIZE_FACTOR = 2;

	static Object data[];

	int index = 0;

	public CustomQueue() {
		data = new Object[SIZE_FACTOR];
		current_size = SIZE_FACTOR;
	}

	public void enqueue(Object element) {

		/*
		 * If the index of the array is equal to the current size of the array
		 * the we need to increase the size of the array
		 */
		if (index == data.length - 1) {

			// increase the size of the array
			increaseSizeAndReallowcate();
		}
		// Storing the current index value array to element
		data[index] = element;

		// Increasing the size of the indez
		index++;

		System.out.println(element + " added successfully");
	}

	private void increaseSizeAndReallowcate() {

		/* Increased current size of the array */
		current_size = current_size + SIZE_FACTOR;

		/* Created new array */
		Object newdata[] = new Object[current_size];

		/* transfered all the element of the array to new array */
		for (int i = 0; i <= data.length - 1; i++) {
			newdata[i] = data[i];
		}

		/* again allowacating new array to old array */
		data = newdata;
	}

	public Object dequeue() {
		index=index-1;
		Object temp = null;
		if (index < 0) {
			try {
				throw new Exception("Queue Underflow");
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else {
			temp = data[0];
			for (int i = 0; i <index; i++) {
				data[i] = data[i + 1];
			}
			data[index] = null;
			
			System.out.println(temp + " element removed from the queue successfully");
		}
		return temp;
	}

	public static void main(String[] args) {

		CustomQueue customQueue = new CustomQueue();
		customQueue.enqueue(10);
		customQueue.enqueue(20);
		customQueue.enqueue(30);

		customQueue.dequeue();
		customQueue.dequeue();
		customQueue.dequeue();
		customQueue.dequeue();

	}

}
