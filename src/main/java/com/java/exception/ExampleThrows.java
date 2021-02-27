package com.java.exception;



public class ExampleThrows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try{
			setValue();
		}catch(Exception ex){
			System.err.println("error : exception :"+ex);
		}
		

	}
	public static String setValue() throws Exception{
		
		String a=null;
		return a.trim();
	}
}
