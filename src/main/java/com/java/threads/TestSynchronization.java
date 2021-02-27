package com.java.threads;

/*
 * Difference in output between with and without synchronization 
 * Synchronization 2 types 1 : Mutual Exclusive and InterThread Communication
 * 
 * Without synchronization : When we run two threads  that accessing same method by same object as shown in code 
 * then both of them run simultaneously so output will be not predictable
 *  Always  use synchronized key words on methods that are acceded by multiple threads with same reference
 *  check output with and without synchronization
 *  NOTE :SCOPE OF SYNCHRONIZED METHOD IS MORE THAN SYNCHROINIZAED BLOCK it will be displayed in output
 *  First synchronized method is run first than synchronized block(thread3 and tread4 synchronized method 
 *  is executed than synchronized block)
 *  synchronized method and block has scope to objects 
 */

public class TestSynchronization {
	
	
	synchronized public void printTable(int n) {
		for (int i = 1; i < 5; i++) {
			System.out.println(n * i);
			try {
				Thread.sleep(20);
			} catch (Exception ex) {
				ex.printStackTrace();
			}

		}
	}
		/*
		 * Below method shows how to use synchronized block on Threads 
		 * 
		 */
		  void printTableUsingSynchronizedBlock(int n) {
			  
			  synchronized(this){
				  for (int i = 1; i < 5; i++) {
						System.out.println(n * i);
						try {
							Thread.sleep(20);
						} catch (Exception ex) {
							ex.printStackTrace();
						}

					}
			  }
			

	}

	public static void main(String[] args) {

		TestSynchronization testsynch = new TestSynchronization();
		
		Thread3 t1 = new Thread3(testsynch);
		Thread4 t2 = new Thread4(testsynch);
	
		Thread t4 = new Thread(t1);
		Thread t5 = new Thread(t2);
		t4.start();
		t5.start();

	}

	
}

class Thread3 implements Runnable {
	TestSynchronization test;

	public Thread3(TestSynchronization t) {
		this.test = t;
	}

	public void run() {
		test.printTable(50);
		test.printTableUsingSynchronizedBlock(100);
	}
}

class Thread4 implements Runnable {

	TestSynchronization test;

	public Thread4(TestSynchronization t) {
		this.test = t;
	}

	public void run() {
		test.printTable(10);
		test.printTableUsingSynchronizedBlock(20);
	}
}










