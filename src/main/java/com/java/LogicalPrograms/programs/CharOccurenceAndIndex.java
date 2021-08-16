package com.java.LogicalPrograms.programs;

public class CharOccurenceAndIndex {

	public static void main(String[] args) {
		
		char [] input = {'a','b','a','c'};
		char []parsed = new char[input.length];
		boolean isparsed = false;
		int count=0;
		String index="";
		String result = "";
		for(int i =0;i<input.length;i++) {
			int j=0;
			count =0;
			index="";
			result = "";
			//check each char alredy parsed if parsed increment i;
			while(j<parsed.length) {
				if(input[i]==parsed[j]) {
					isparsed=true;
					break;
				}
				j++;
			}
			//check each char in whole array for index and count
			if(!isparsed) {
				
				for(int k=0;k<input.length;k++) {
					if(input[i]==input[k]) {
						count++;
						index = index+k;
						
					}
				}
				result = count+index;
				//print char along with index and count
				System.out.println("char "+input[i]+" count="+result);
			}
		
			
			//System.out.println("char "+input[i]+"index="+index);
		}
	}

}
