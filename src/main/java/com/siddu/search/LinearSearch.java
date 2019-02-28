package com.siddu.search;

public class LinearSearch {

	static int data[] = { 10, 3, 15, 2, 7 };

	public static void main(String[] args) {

		// search element
		int searchElement = 2;

		// Initially found flag is false
		boolean isElementFound = false;

		// Looping each element
		for (int i = 0; i < data.length; i++) {

			// Each element comparing with searchElement
			if (searchElement == data[i]) {

				// If found print location and elementFound flag becomes true
				// and comes out of the loop
				System.out.println(searchElement + " found at the location " + i);
				isElementFound = true;
				break;
			}
		}
		// if flag is false then no element is found
		if (!isElementFound) {
			System.out.println(searchElement + " not found in the array");
		}

	}

}
