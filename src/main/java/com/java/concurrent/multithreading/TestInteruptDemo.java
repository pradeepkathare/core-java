package com.java.concurrent.multithreading;

public class TestInteruptDemo {

	public static void main(String[] args) {
		
		System.out.println("I am main method");
		MyThreadInterrupt t1 = new MyThreadInterrupt();
		t1.start(); // child  Threadstarted execution and im calling interrupt 
		t1.interrupt();//Parent/main thread calling interrupt method on child object i,e it is called by t1 object
		//hence child thread is interrupted and output is 
	}
}
