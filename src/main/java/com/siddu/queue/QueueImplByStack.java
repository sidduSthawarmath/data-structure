package com.siddu.queue;

import java.util.Stack;

public class QueueImplByStack {

	Stack<Integer> stack1 = new Stack<Integer>();
	Stack<Integer> stack2 = new Stack<Integer>();

	private void enQueue(int element) {

		// Move all the elements to stack2 from stack1
		while (!stack1.isEmpty()) {
			stack2.push(stack1.pop());
		}

		// push current element to stack1
		stack1.push(element);

		// Move all the elements to stack1 from stack2
		while (!stack2.isEmpty()) {
			stack1.push(stack2.pop());
		}
		System.out.println("enQueue:  " + element);
	}

	private Integer deQueue() {
		// Check underflow condition
		if (stack1.isEmpty()) {
			System.out.println("Queue is underflow");
			return -1;
		}
		// take latest element
		Integer element = stack1.peek();

		// pop latest element
		stack1.pop();
		System.out.println("deQueue:  " + element);
		return element;
	}

	public static void main(String[] args) {
		QueueImplByStack queueImplByStack = new QueueImplByStack();
		queueImplByStack.enQueue(10);
		queueImplByStack.enQueue(20);
		queueImplByStack.enQueue(30);

		queueImplByStack.deQueue();
		queueImplByStack.deQueue();
		queueImplByStack.deQueue();
		queueImplByStack.deQueue();

	}

}
