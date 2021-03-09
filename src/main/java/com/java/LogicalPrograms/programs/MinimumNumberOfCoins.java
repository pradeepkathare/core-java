package com.java.LogicalPrograms.programs;

/*
 * Pradeep.kathare
 * A class for minimum number of coins
 * Input: coins[] = {25, 10, 5}, V = 30
Output: Minimum 2 coins required
We can use one coin of 25 cents and one of 5 cents 

Input: coins[] = {9, 6, 5, 1}, V = 11
Output: Minimum 2 coins required
We can use one coin of 6 cents and 1 coin of 5 cents
 */

public class MinimumNumberOfCoins {

	public static void main(String[] args) {
		

		int input[] = {25, 10, 5};//{9, 6, 5, 1};//{2,5,7,8,10};
		int value = 30;//7;
		int sum = 0;
		int minCoin = input.length;
		int temp = 0;
		int count = 0;
		
		System.out.println("Find minimum number of coins required to get the value");
		for(int i = 0;i<input.length;i++){
			count =1;
			sum = 0;
			for(int j = i ;j<input.length;j++){
				temp = (sum+input[j]);
				
				if (temp <= value) {
					sum = sum + input[j];
					count++;
				}
				
			}
			if(count<minCoin){
				minCoin = count;
			}
			
		}
		
			System.out.println("minimum number of coins required are : " + minCoin);

		
	}

}
