package com.siddu.stack;
//Stack implementation using array 
public class StackImpByArray {

	int top; // Top element index
	int MAX = 2; // Max num of elements can stack have
	Object data[] = new Object[MAX]; // array of data

	public StackImpByArray() {
		top = -1; // top initialized with -1
	}

	public void push(Object element) {
		// Before pushing element into stack need to check overflow condition
		if (top >= MAX - 1) {
			System.out.println("stack is overflow");
			return;
		}
		// add element at top position
		data[++top] = element;
		System.out.println(element + " pushed successfully");
	}

	public Object pop() {

		// Before remove recent added element need to check underflow condtion
		if (top < 0) {
			System.out.println("Stack is underflow");
			return false;
		}
		//Get recent added element with reducing top element index 
		Object popElement = data[top--];
		System.out.println(popElement + " pop successfully");
		return popElement;
	}

	public static void main(String[] args) {
		StackImpByArray stackImpByArray = new StackImpByArray();
		stackImpByArray.push(10); 
		stackImpByArray.push(20);
		stackImpByArray.push(30);

		stackImpByArray.pop();
		stackImpByArray.pop();
		stackImpByArray.pop();
	}
}
