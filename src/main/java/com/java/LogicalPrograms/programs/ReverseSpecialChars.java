package com.java.LogicalPrograms.programs;

public class ReverseSpecialChars {

	public static void main(String[] args) {
		
		String input = "J@AV%A*SCRIP&T";
		
		char c[] = input.toCharArray();
		int i=0;
		int j=input.length()-1;
		char temp;
		while(i<j) {
		
			while(i<j &&Character.isAlphabetic(c[i])) {
				i++;
			}
			
			while(i<j && Character.isAlphabetic(c[j]) ) {
				j--;
			}
			
			//swap
			temp = c[i];
			c[i]=c[j];
			c[j]=temp;
			
			i++;
			j--;
		}
		
		System.out.println("input="+input);
		for(int k=0;k<input.length();k++) {
			System.out.print(c[k]);
		}
		
	}

}
