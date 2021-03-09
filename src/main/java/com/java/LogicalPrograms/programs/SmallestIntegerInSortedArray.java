package com.java.LogicalPrograms.programs;


/*
 * SmallestIntegerInSortedArray : means they will give sorted array we have to find which number cannot be 
 * bought by formed by an subset  value
 * For better understanding 
 * https://algorithms.tutorialhorizon.com/minimum-number-that-cannot-be-formed-by-any-subset-of-an-array/
 * 
 */

//Assuming sorted array
public class SmallestIntegerInSortedArray {

	 int sum = 1;
	public  int findSmallestNumberInSortedArray(int [] val){
		
		for(int i=0;i<val.length;i++){
			if(val[i]<=sum){
				sum = sum+val[i];
				System.out.println("sum : "+sum);
			}
		}
		
		
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SmallestIntegerInSortedArray obj = new SmallestIntegerInSortedArray();
		int [] arrA = {1,2,6,7,9};// {2,3,6,7};//{1,1,1,1,1};// { 1,1,3,4,6,7,9};
 		System.out.println("{1,1,3,4,6,7,9} -" + obj.findSmallestNumberInSortedArray(arrA));
	}

}
