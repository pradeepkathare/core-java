package com.java.LogicalPrograms.datastructures.sorting;

import java.util.Arrays;

public class SampleSort {

	public static void main(String[] args) {
		
		int input[] = {10,8,2,15};
		int temp =0;
		for(int i =0;i<input.length;i++) {
			for(int j=i+1;j<input.length-1;j++) {
				
				if(input[i]>input[j]) {
					temp = input[i];
					input[i]=input[j];
					input[j]=temp;
				}
			}
		}
		
		Arrays.stream(input).forEach(System.out::println);

	}

}
