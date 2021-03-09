package com.java.LogicalPrograms.programs;

/*
 * Program on diamond
 * Pradeep kathare
 *    * 
     * * 
    * * * 
   * * * * 
    * * * 
     * * 
      * 
 */
public class TestDiamond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int midlength = 7/2;
		int noOfStars = 1;
		
		int  length = 7;
		int noOfSpaces = length-1;
		
		System.out.println("length : "+midlength);
		
		for (int i = 1; i <= length; i++) {

			for(int j =noOfSpaces;j>0;j--){
				System.out.print(" ");
			}
			
			for(int k = noOfStars;k>0;k--){
				System.out.print("* ");
				//System.out.println(" ");
				
			}
			if(i<=midlength){
				noOfStars++;
				noOfSpaces--;
				System.out.println("");
			}else{
				noOfStars--;
				noOfSpaces++;
				System.out.println("");
			}
			
		}
	}
}
