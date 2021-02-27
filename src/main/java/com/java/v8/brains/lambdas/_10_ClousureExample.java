package com.java.v8.brains.lambdas;

/*
 * Program to illustrate final keyword not required to be declared in scope variables while passing to inner methods 
 * and lambda because compiler itself will take care of it in java8.
 * try for inner class and lambdas both
 */
public class _10_ClousureExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i=10;
		Processing p = new Processing() {
				
			@Override 
			public void process() {
				//i = 2; uncomment this line u will get compiler error as final modifer cannot be changed even 
				//if we didnt decalre variable as final,this is because if we use instance variable inside annoynmus class
				//then it should be decalred as final till java7
				System.out.println(i+10);
				
			}
		};
		process(p);
		
		process(()->
		{
			//i=20; same explained as above
			System.out.println(i+10);	
		});
	}

	private static void process(Processing p) {
		p.process();
		
	}

	
}

 interface Processing {

	 void process();
}