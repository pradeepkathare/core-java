package com.java.v8;

public class ThreadWithoutLambda {

	public static void main(String[] args) {

		System.out.println("smaple main");
		Thread t1 = new Thread(new TestThread());
		t1.start();
		
		 new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Running custom thread nested method");
				
			}
		}).start();
		 
		 
		 
		 //with lambda

		new Thread(

				() -> {
					System.out.println("new lambda expression");

				}).start();

	}

}


class TestThread extends Thread{
	
	@Override
	public void run() {

		System.out.println("running the thread");
	}
	
	
}

