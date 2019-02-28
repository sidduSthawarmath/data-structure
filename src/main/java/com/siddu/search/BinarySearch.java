package com.siddu.search;

import java.util.Scanner;

class BinarySearch {
	public static void main(String args[]) {

		// search element
		int searchElement = 20;

		int array[] = { 10, 20, 23, 40, 45 };

		// Initially first val 0
		int first = 0;

		// last val is array length-1
		int last = array.length - 1;

		//find middle index
		int middle = (first + last) / 2;

		//looping all the elements
		while (first <= last) {
			//element found at mid location then print msg and break the loop
			if (array[middle] == searchElement) {
				System.out.println(searchElement + " found at index of " + middle);
				break;
			}
			//search element is greater than mid element then is confirm that element present at right side of the array
			if (searchElement > array[middle]) {
				//first index should be start with mid+1
				first = middle + 1;
			}
			//search element is less than mid element then is confirm that element present at left side of the array
			if (searchElement < array[middle]) {
				//last index should be mid-1 
				last = middle - 1;
			}

			//based on above changed first and last index we should calculate mid
			middle = (first + last) / 2;

		}
		
		
		if (first > last)
			System.out.println(searchElement + " isn't present in the list.\n");
	}
}