package com.java.threads;
/*
 * Interrupt  means disturbing thread while it is waiting or sleeping mode and throws Intrupted exception
 * t1.interrupt -->interrupts threads
 * Thread.interrupted --> returns interruptd flag and later it makes interrupted to false
 * t1.isInterrupted-->returns true or false 
 */
public class InteruptThread implements Runnable {

	public static void main(String[] args) {
		InteruptThread i1 = new InteruptThread();
		Thread t1 = new Thread(i1);
		t1.start();
		t1.interrupt();
		System.out.println(t1.isInterrupted());
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("New thread running");
		try {
			//If we dont call sleep then there will be no diffrnce in Intrrupt
			Thread.sleep(100); //commnt this line to check thread.INTRRUPTED METHOD 
			
			if(Thread.interrupted()) {
				System.out.println("Thread is Interupted and now it release and make to false");
			}
			else {
				System.out.println("Thread not intrupted");
			}
			//
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Intrruptd handled");
	}
}
