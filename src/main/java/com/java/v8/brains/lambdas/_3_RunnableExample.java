package com.java.v8.brains.lambdas;
/*
 * we can use lambdas on Runnable because its a functional interface i,e only has one method run
 */

public class _3_RunnableExample {

	public static void main(String[] args) {
		// TO implement runnable we have 3 ways :1 : class implementing runnable,anonymous class,lambda

		Thread t1 = new Thread(new MyThread());
		Thread t2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Runnable using anonymous ");
				
			}
		});
		
		Thread t3 = new Thread(()->System.out.println("Runnable using lambda passing directly"));
		Runnable r = ()->{
			int i=10;
			System.out.println("lambda implementation for multiple lines in run method");
		};
		Thread t4 = new Thread(r);
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}

}


class MyThread implements Runnable{

	@Override
	public void run() {
		System.out.println("till java7 way to implement runnable run method");
		
	}
	
}