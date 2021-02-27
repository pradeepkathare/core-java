package com.java.concurrent.multithreading;

public class MyThreadJoin extends Thread {

	/*
	 * In below example child thread is wating until main thread complete task.becaue of join method called 
	 * in try block
	 * o/p will main-thread follwed by child thread
	 */
	public static Thread mt;
	
	@Override
	public void run() {
		
		for(int i =0;i<5;i++){
			System.out.println("Child Thread");
			try{
				Thread.sleep(100); //--1
				mt.join(); //comment to look output if parent wants to wait for child
			}catch(Exception ex){
				
			}
			
		}
	}
}
