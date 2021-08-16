package com.java;

public class ReverseSpecialChars {

	public static void main(String[] args) {
		
		//String input = "a@b*c"; //expected : a*b@c
		String input ="J@av%a*Scrip&t";
		
		char[] c =input.toCharArray();
		int j=input.length()-1;
		
		for(int i=0;i<input.length()-1;i++) {
			
			
				while(i<input.length()) {
					if(!(Character.isAlphabetic(c[i]))) {
						break;
					}else {
						i++;
					}
				}
				
				System.out.print("i="+i + " c[i]="+c[i]);
				System.out.println(" j="+j+"c[j]="+c[j]);
				while(j>0 ) {
					if(!Character.isAlphabetic(c[j])) {
						break;
					}else {
						j--;
						System.out.println("Else block j="+j+"c[j]="+c[j]);
					}
				}
				System.out.println("j="+j+"c[j]="+c[j]);
				if(i==j) {
					break;
				}
				
				System.out.print("swap i="+i + " c[i]="+c[i]);
				System.out.println(" j="+j+"c[j]="+c[j]);
				char temp = c[j];
				c[j]=c[i];
				c[i]=temp;
				j--;
				
			}
		System.out.println();
		
		String res = "";
		for(Character c1:c) {
			res=res+c1;
		}
		System.out.println(res);
		System.out.println("expe=J&av*a%Scrip@t");
		}

	

}
