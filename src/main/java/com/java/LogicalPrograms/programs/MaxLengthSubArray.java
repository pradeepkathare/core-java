package com.java.LogicalPrograms.programs;

import java.lang.reflect.Array;
import java.util.Arrays;

/*
 * Program : Length of the largest subarray with contiguous elements | Set 1
 */
public class MaxLengthSubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int []input = {1, 56, 58, 57, 90, 92, 94, 93, 91, 45};//{14, 12, 11, 20};//{10, 12, 11};
		
		
		int count;
		int maxlength = 0;
		
		//sort array : 
		Arrays.sort(input);
		for(int j =0 ;j<input.length;j++){
			System.out.print("Array Elements : "+input[j]);
		}
		System.out.println(input);
		
		
		for(int i=0;i<input.length-1;i++){
			System.out.println("for loop :");
			count = 1;
			while(i<input.length-1 && input[i+1] == input[i]+1){
				System.out.println("Within while loop :");
				count++;
				i++;
			}
			if(maxlength < count){
				maxlength = count;
			}
		}
		
		System.out.println("maxlength : " +maxlength);
	}
	
	

}
