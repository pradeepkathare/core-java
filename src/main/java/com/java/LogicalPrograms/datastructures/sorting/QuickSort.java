package com.java.LogicalPrograms.datastructures.sorting;

import java.util.Arrays;

/*
 * https://www.geeksforgeeks.org/quick-sort/
 * Always pick first element as pivot.
Always pick last element as pivot (implemented below)
Pick a random element as pivot.
Pick median as pivot.

 * Quick sort ,
 * 1 : consider last element as pivot
 * 2 : (partition algo:)consider index from -1 i,e i=-1 for reference in recursive it becomes i=low-1
 * 3 : consider low and high as 2 variables where low=0;and high=input.length
 * 4 : iterate array and compare each element with pivot 
 * 5 : if traversed/iterated element is less than  pivot then swap element with index th element 
 * i,e if a[j]<pivot then swap(a[i],a[j]); 
 * 6 : iterate this for all elements and swap pivot with ith index to bring pivot to correct order
 */
public class QuickSort {

	public static void main(String[] args) {

		int []input = {10,80,30,90,40,50,70};
		int low = 0;
		int high = input.length-1;
		quicksort(input, low, high);
		System.out.println("sorted array using quicksort="+Arrays.toString(input));
	}

	static void quicksort(int[] input,int low,int high) {
		
		
		int partiation = 0;
		if(low<high) {
			
			partiation = partiton(input,low,high);
			quicksort(input, low, partiation-1);
			quicksort(input, partiation+1, high);
		}
		
		
		
	}

	private static int partiton(int[] input, int low, int high) {
		int i = low - 1;
		int pivot = input[high];
		for(int j=low;j<=high-1;j++) {
			if(input[j]<pivot) {
				i++;//increment i and swap
				swap(input,i,j);
			}
		}
		swap(input, i+1, high);
		return i + 1;
	}

	private static void swap(int[] input, int i, int j) {
		int temp = input[i];
		input[i]=input[j];
		input[j]=temp;
	}
	
}
