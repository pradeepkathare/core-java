package com.java.threads;

/*
 * Each Thread has its own callStack	
 * t1 and t2 has its own stack trace and main is start stacktrace 
 */
public class SingleTaskMultipleThread implements Runnable {

	String name;
	public SingleTaskMultipleThread(String name){
		this.name = name;
	}
	public void run(){
		System.out.println("Runiing thread :"+name);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SingleTaskMultipleThread s1 = new SingleTaskMultipleThread("s1");
		SingleTaskMultipleThread s2 = new SingleTaskMultipleThread("s2");
		Thread t1 = new Thread(s1);
		Thread t2 = new Thread(s2);
		
		t1.start();
		t2.start();
		
	}

}
/*
 * MultipleTaskByMultipleThreads sample 
 * 
 */

class Thread1 implements Runnable{
	
	public void run(){
		System.out.println("MultipleTaskByMultipleThreads t1");
	}
}

class Thread2 implements Runnable{
	
	public void run(){
		System.out.println("MultipleTaskByMultipleThreads t2");
	}
}



class MultipleTaskByMultipleThreads {
	
	public static void main(String[] args) {
		
		Thread t1 = new Thread(new Thread1());
		Thread t2 = new Thread(new Thread2());
		
		t1.start();
		t2.start();

	}
}


class TestGarbage2 {

	public void finalize() {
		System.out.println("object is garbage collected");
	}

	public static void main(String args[]) {
		TestGarbage2 s1 = new TestGarbage2();
		TestGarbage2 s2 = new TestGarbage2();
		s1 = null;
		s2 = null;
		System.gc();
	}
}

