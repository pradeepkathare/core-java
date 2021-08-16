package com.java.LogicalPrograms.programs;

/*
 * reverse string recursively 
 * 1 : write reverse method that will pick from substring(1) and return substring +concat first char at end
 * return  reverse(str.substring(1)) + str.charAt(0);
 */
public class ReverseStringRecursive {

	public static void main(String[] args) {
		
		String reversed = reverseString("JAVATPOINT");
		System.out.println("reversedString="+reversed);
	}
	
	static String reverseString(String inputstring) {
		
		if(null==inputstring || inputstring.isEmpty()) {
			System.out.println("comping="+inputstring);
			return inputstring;
		}else {
			System.out.println("input="+inputstring);
			//System.out.println("return vlu="+reverseString(inputstring.substring(1)) + inputstring.charAt(0));
			String s =  reverseString(inputstring.substring(1)) + inputstring.charAt(0);
			System.out.println("s="+reverseString(inputstring.substring(1)));
			return s;
		}
	}

}
