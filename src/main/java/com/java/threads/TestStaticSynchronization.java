package com.java.threads;

/*
 * When i used 2 new objects then both of them have different locks so even though 
 * method  is synchronized 2 objects have own 2 locks so output will be unpredictable
 * To avoid such conflicts we have to use static on synchronized methods so it will be class scoped
 * 
 * NOTE : To check difference in output just remove static keyword from printtable method  
 */
public class TestStaticSynchronization {

	synchronized static public void printTable(int n) {
		for (int i = 1; i < 5; i++) {
			System.out.println(n * i);
			try {
				Thread.sleep(20);
			} catch (Exception ex) {
				ex.printStackTrace();
			}

		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Thread5 t5 =new Thread5();
		Thread6 t6 = new Thread6();
		t5.start();
		t6.start();
	}

	
	
}

class Thread5 extends Thread{
	TestStaticSynchronization Synchronization1 = new TestStaticSynchronization();
	 public void run() {
		// TODO Auto-generated method stub
		 Synchronization1.printTable(10);
	}
}

class Thread6 extends Thread{
	TestStaticSynchronization Synchronization2 = new TestStaticSynchronization();
	 public void run() {
		// TODO Auto-generated method stub
		 Synchronization2.printTable(100);
	}
}

