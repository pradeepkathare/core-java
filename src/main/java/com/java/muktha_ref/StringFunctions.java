package com.java.muktha_ref;

/*
 * Pradeep.kathare
 * Important methods of Strings used most 
 * hover mouse at String function to see description,incase if your supports javadoc
 */
public class StringFunctions {

	public static void main(String[] args) {

		String s ="JAVA";
		String userName="";
		
		//System.out.println("username="+userName.isBlank());
		System.out.println("username="+userName.isEmpty());
		
		//System.out.println("isBlank= "+s.isBlank());
		System.out.println("isEmpty= "+s.isEmpty());
		
		//length is function in String but observe in array it is field
		System.out.println("length of String= "+s.length());
		
		//chars starts from 0 and end to length-1
		System.out.println("charAT index 0= "+s.charAt(0));
		
		//replacing J instead of j
		System.out.println("string replace= "+s.replace("J", "j"));
		
		System.out.println("String concats java with beginner= "+s.concat("-Beginners"));
		
		System.out.println("returns first index of provided character= "+s.indexOf("A"));
		
		//within singlecote is char and double quotes in string
		System.out.println("returns first index of provided character/String= "+s.lastIndexOf('A'));
		
		System.out.println("returns substring from index 1 to length= "+s.substring(1));
		
		//Inclusive of beginIndex and exclusive of lastIndex
		System.out.println("returns substring from index 1 to 3 but not charat 3= "+s.substring(1,3));
		
		System.out.println("hashcode is memorey allocation= "+s.hashCode());
		
		System.out.println("converts all chars to uppercase= "+s.toUpperCase());
		
		System.out.println("converts all chars to lowercase= "+s.toLowerCase());
		
		//trim is important method while client passing inputs,because there is chances of extra space  at begin and ending
		//example "  java   " returns  output="java"
		System.out.println("removes extra spaces in begnning and ending"+s.trim());
		//important method for client to converting
		System.out.println("valueOF convert  int,long or object to String= "+s.valueOf(0));
		//split method returns array of strings
		String s1= "lion,tiger";
		String [] s2=s1.split(",");
		
		
		System.out.println("Important method when client passes input in terms of comma seperated "+s2.length);
		
		//to iterate array we need
		//s2 is array so we used length field instead method
		for(int i=0;i<s2.length;i++) {
			System.out.print(","+s2[i]);
		}
		System.out.println();
		char [] s3=s.toCharArray();
		
		//for values to be printed need to iterate or refernce will be printed
		//toCharArray is useful ,to reverse string or to search particular char in string 
		System.out.println("tocharArray="+s3);
		
	}

}
