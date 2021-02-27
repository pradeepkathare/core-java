package com.java.concurrent.multithreading;

/*
 * Pradeep.kathare
 * My Thread explains how thread will sleep and output prints after sleeping few sec
 */
public class MyThreadSleep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("mainMethod");
		for(int i=0;i<5;i++){
			try{
				Thread.currentThread().sleep(2000);
				System.out.println("prints once for 2sec : "+Thread.currentThread().getName());
			}catch(InterruptedException ex){
				
			}
			
		}
	}

}
