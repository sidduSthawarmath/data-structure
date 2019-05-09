package com.siddu.stack;

import java.util.LinkedList;
import java.util.Queue;

// Java program to implement stack using a single queue 
public class StackImplAsSingleQueue {
	// Create empty Queue
	Queue<Integer> queue = new LinkedList<Integer>();

	public void push(Integer element) {
		// Add element
		queue.add(element);

		// Remove the previous elements and add next after the current
		// element(queue.size() - 1)
		for (int i = 0; i < queue.size() - 1; i++) {
			// this will add front element into rear of queue
			int x = queue.remove();
			queue.add(x);
		}
		System.out.println("Push :" + dispaly());
	}

	public int pop() {
		// Check underflow condtion
		if (queue.isEmpty()) {
			System.out.println("Stack is underflow");
			return -1;
		}
		// It removes the top element
		int element = queue.remove();
		System.out.println("pop : " + dispaly());
		return element;
	}

	public String dispaly() {
		StringBuilder stringBuilder = new StringBuilder();
		for (Integer num : queue) {
			stringBuilder.append(num + "\t");
		}
		return stringBuilder.toString();
	}

	int top() {
		if (queue.isEmpty())
			return -1;
		return queue.peek();
	}

	public static void main(String[] args) {
		StackImplAsSingleQueue stackImplAsSingleQueue = new StackImplAsSingleQueue();
		stackImplAsSingleQueue.push(10);
		stackImplAsSingleQueue.push(20);
		stackImplAsSingleQueue.push(30);

		int topElement = stackImplAsSingleQueue.top();
		System.out.println("Top Element: " + topElement);
		stackImplAsSingleQueue.pop();
		stackImplAsSingleQueue.pop();
		stackImplAsSingleQueue.pop();
		stackImplAsSingleQueue.pop();

	}

}
