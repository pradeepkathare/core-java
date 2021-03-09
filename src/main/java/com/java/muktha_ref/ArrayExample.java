package com.java.muktha_ref;
/*
 * Arrays creation and initalization
 */
public class ArrayExample {

	public static void main(String[] args) {

	 //array is an object ,it is small storage where it will store elements in sequence.
	//it contains only same datatype objects
	//Example : if u create int array,then only integers can be stored,if char then only chars elements ,if string datatype
	 //then only string elements
		
		//In array ,sequence of index starts from zero 
		//In below statements memory is not allocated yet,because it doesnt knew how much space to be provided
		int a[];//declaration of int array
		String []s;//both are correct way
		
		//creation
		int array1[]=new int[6]; //memory of 6 blocks will be allocated
		//by default values will be initalized as zeros when it  created
		
		//below are ways to initalize arrays
		int []array2= {1,2,3,4}; //predict how much memory is allocated
		
		//other way is:array1 has 6 block contigious  memory so u can store 6 elements example:
		//Attention : in index starts from 0 and last value is 5
		//if u give array1[6]=7; //throws arrayIndexOutOfBoundException
		array1[0]=1;
		array1[1]=2;
		array1[2]=3;
		array1[3]=4;
		array1[4]=5;
		array1[5]=6;
		//Array is Object,in java whenever u print refernce its will not print values
		//when u print array1 ,it is just reference of memory so no values 
		System.out.println("array1="+array1);
		
		//Iterate array elements
		for(int i=0;i<array1.length;i++) {
			System.out.println("array1["+i+"]="+array1[i]);
		}
			
		
	}

}

//NOTE : try below programs
/*
 * 1 : print array elements
 * 2 : sort array elements in asceding order 
 * solve: compare one element with rest of the elements 
 * 	do this with all elemts  using 2 for loops or 2 while loops
 * 3 : sort array elements in descending order
 * 4 : sort array elemnts for strings
 * 5 : print duplicate elemnts in array
 * 6 : check 2 arrays are equal
 * 7 : given number,print all elements to make sum of given number
 *   example sum=10,array=[1,2,5,6]//print no elements rray=[1,4,4,1,6] print 1,4,1,4
 *   
 */



