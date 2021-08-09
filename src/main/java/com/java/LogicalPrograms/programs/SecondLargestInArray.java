package com.java.LogicalPrograms.programs;

/*
 * Assuming input in asc order
 */

public class SecondLargestInArray {
    public static void main(String args[]) {
    
    int []input ={15,3,6,9};
    	//{1,3,6,9};
    	//{1,2,3,4,5};
    //{10,2,3,1}
    int largest =0;
    int secondlargest = 0;
       for(int i =0 ;i<input.length;i++){
           
           if(input[i]>largest){
        	   secondlargest = largest;
                largest=input[i];
               
                      
           }else if(input[i]>secondlargest && input[i]<largest) {
        	   secondlargest = input[i];
        	  
           }
          
       }
       System.out.println("largest="+largest);
       System.out.println("secondlargest="+secondlargest);
    }
}