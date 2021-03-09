package com.java.LogicalPrograms.programs;

/*https://www.geeksforgeeks.org/array-rotation/
 * Shift Array without new array
 * [1,2,3,4,5]
 * n = 2
 * o/p : [3,4,5,1,2]
 */

/*
 *
 */

public class ArrayShift {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int input[] = {1,2,3,4,5,6};

		//n means number of rotation
		int n = 3;

		//always keep first elemet of array in temp variable
		int temp = 0;

		//just for one more count variable
		int j = 0;

		System.out.println("Elements in array : "+input);
		/*
		//Step 1 : outer loop for number of shift
		//Step 2 : take first value(arr[0]) in temp
		//3 : move all arr[1] to arr[length-1] to oneshift
		4 : put back temp to length-1 in array
		*/
		for(int i =0 ;i<n ;i++){
			temp = input[0];

			for( j =0 ;j<input.length-1;j++){

				input[j] = input[j+1];
			}
			input[j] = temp;
		}

		for(int i = 0;i<input.length;i++){
			System.out.println("shift array : "+input[i]);
		}

	}

}
