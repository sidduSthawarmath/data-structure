package com.siddu.arraylist;

public class CustomArrayList {

	private static int current_size = 0;

	private static final int SIZE_FACTOR = 2;

	static Object data[];

	int index = 0;

	public CustomArrayList() {
		data = new Object[SIZE_FACTOR];
		current_size = SIZE_FACTOR;
	}

	public void add(Object element) {

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

	public void remove(int searchIndex) {

		/*
		 * check the search index which should not -ve val and should not be
		 * greater than current index
		 */
		if (searchIndex < 0 || searchIndex > index - 1) {
			try {
				throw new Exception("Array index out of bound");
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else {
			/* Shifting the elements from search index */
			Object temp = data[searchIndex];
			for (int i = searchIndex; i < data.length - 1; i++) {
				data[i] = data[i + 1];
			}

			/* After removing element decreasing the size of the idex */
			index--;

			System.out.println(temp + " removed successfully from the list");
		}
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

		CustomArrayList customArrayList = new CustomArrayList();

		for (int k = 0; k < 5; k++) {
			customArrayList.add(k + 10);
		}

		customArrayList.remove(1);

	}
}
