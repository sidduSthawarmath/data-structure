package com.siddu.stack;

public class CustomStack {

	private final static int SIZE_FACTOR = 2;

	int index = 0;

	int current_size = 0;

	Object data[];

	// Stack initialization
	public CustomStack() {
		data = new Object[SIZE_FACTOR];
		current_size = SIZE_FACTOR;
	}

	// Push element to the stack
	public void push(Object element) {
		// Check the size of the stack and increase it if needed
		if (index >= data.length) {
			increaseSizeAndReallowcate();
		}
		// Pushed element to the stack
		data[index] = element;
		index++;

		System.out.println(element + " added successfully");

	}

	// Pop the element from stack
	public Object pop() {
		Object popObject = null;
		// Current index element(we decreased index because we increased index
		// after the push of the stack. So we decreased it to get the current
		// element)
		index = index - 1;
		if (index < 0) {
			try {
				throw new Exception("Stack underflow");
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else {
			// fetch current element(recently pushed element)
			popObject = data[index];

			// assigning recently added element location to null
			data[index] = null;

			System.out.println(popObject + " removed successfully");
		}
		return popObject;
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

	public static void main(String[] args) {

		CustomStack customStack = new CustomStack();
		customStack.push(10);
		customStack.push(20);

		customStack.pop();
		customStack.pop();

	}
}
