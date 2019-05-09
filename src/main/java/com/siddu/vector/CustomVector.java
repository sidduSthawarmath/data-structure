package com.siddu.vector;

/*
 * The vector is same as ArrayList but its add and remove methods are
 * synchronized
 */

public class CustomVector {

	// SIZE_FACTOR used for vector size increment
	private final int SIZE_FACTOR = 10;

	// Check the current size of the vector
	private int currentSize = 0;

	//
	private static int index = 0;

	// Array of values to be stored in data
	private static Object data[] = null;

	public CustomVector() {
		// While creation of vector initializing the vector with SIZE_FACTOR
		data = new Object[SIZE_FACTOR];

		// Now current size of the Vector becomes SIZE_FACTOR
		currentSize = SIZE_FACTOR;
	}

	public synchronized void add(Object element) {
		// While adding element to vector we will check the size of the vector.
		if (index == currentSize - 1) {

			// if index is equals to the size current size then we need to
			// increase size with size factor and reallocate the elements
			increaseSizeAndReallowcate();
		}

		// Add element at the current index
		data[index] = element;

		// increase the index
		index++;

		// System.out.println(element + " added successfully");
		System.out.println("After adding {" + element + "} element :" + printArray());
	}

	public static String printArray() {
		StringBuilder stringBuilder = new StringBuilder();
		for (int i = 0; i < index; i++) {
			stringBuilder.append(data[i] + "  ");
		}
		return stringBuilder.toString();
	}

	public synchronized void remove(int deleteIndex) {

		// Before deleting the element based on the index need to check with
		// current index
		if (deleteIndex < 0 || deleteIndex > index - 1) {
			try {
				throw new Exception("Array index out of bound");
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else {
			// Get the object
			Object temp = data[deleteIndex];

			// We are shifting the elements to delete index
			for (int i = deleteIndex; i < index - 1; i++) {
				data[i] = data[i + 1];
			}
			// set last index to null
			data[index - 1] = null;

			// decrease the index
			index--;
			System.out.println("After deleting {" + deleteIndex + "} loaction :" + printArray());
		}
	}

	private void increaseSizeAndReallowcate() {
		// Increase the current size with size factor
		currentSize = currentSize + SIZE_FACTOR;

		// Create new array and shift all elements
		Object[] newData = new Object[currentSize];
		for (int i = 0; i <= index - 1; i++) {
			newData[i] = data[i];
		}
		// Reassign new array to old array
		data = newData;
	}

	public static void main(String[] args) {
		CustomVector customVector = new CustomVector();
		customVector.add(134);
		customVector.add(3242);
		customVector.add(33242);
		customVector.remove(1);
	}
}