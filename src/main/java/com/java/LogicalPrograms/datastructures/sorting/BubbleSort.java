package com.java.LogicalPrograms.datastructures.sorting;

import java.util.Arrays;

/*
 * Bubble sort means we should compare with adjacent elements every time,swap if they are in wrong order
 * this sorts in asc order,
 * 
Bubble Sort is the simplest sorting algorithm that works by repeatedly swapping the adjacent elements 
if they are in wrong order.
https://www.geeksforgeeks.org/bubble-sort/
 */
public class BubbleSort {

	public static void main(String[] args) {
		int temp=0;
		int input[] = {1,4,5,2,8};
		for(int i=0;i<input.length;i++) {
			for(int j=0;j<input.length-1;j++) {
				if(input[j]>input[j+1]) {
					temp = input[j];
					input[j]=input[j+1];
					input[j+1]=temp;
				}
			}
		}
		//Arrays.stream(input).forEach(System.out::println);
		System.out.println(Arrays.toString(input));
	}

}
