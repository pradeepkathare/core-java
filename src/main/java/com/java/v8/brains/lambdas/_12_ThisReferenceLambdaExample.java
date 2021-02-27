package com.java.v8.brains.lambdas;

// continuation of this reference but using lambda
public class _12_ThisReferenceLambdaExample {

	public static void main(String[] args) {
		// lmbda
		
		
		process();
		new _12_ThisReferenceLambdaExample().execute();
	}

	private static void process() {
		Processing p = ()->{
			//System.out.println(this); // cannot use this in static method,because  we dont create any new object like annonynamus class
			//in lambda this refer directly to calling method object 
			//here same rule applies as static method
			System.out.println("using lambda in static method");
		};
		p.process();
	}
	
	private void execute() {
		Processing p = ()->{
			System.out.println(this); // lambda behaves same as instance method and prints calling method object refernce
			System.out.println("using lambda in instace method");
		};
		p.process();
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "_12_ThisReferenceLambdaExample tostring";
	}
}

/*
 * Summarize : this behaves differnct in static method and instance
 * this behaves differnt in lambda and annonymmus class
 */
