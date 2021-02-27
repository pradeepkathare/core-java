package com.java.threads;
/*
 * InterThread communication occurs between threads aand on same object for using notify and wait method
 * Below exaple show how to use notify and wait methods
 */


public class InterThreadCommunication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterThreadCommunication i1 = new InterThreadCommunication();
		
		Thread t1 = new Thread() {
			
			public void run() {
				System.out.println("Im in t1 run mthod");
				i1.add1();
				
				System.out.println("finished waiting");
			}
		};
		
	Thread t2 = new Thread() {
			
			public void run() {
				System.out.println("Im in t2 run mthod");
				i1.add2();
			
			}
		};
		
		t1.start();
		t2.start();
		
	}

	synchronized  public  void add1() {

		System.out.println("add1 method");
		try {
			wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("add1 finish method");
	}
	
	
	synchronized public  void add2() {

		System.out.println("add2 method finishd");
		
		notify();
		
	}
	
	
}
