package com.java.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
 * Pradeep.kathare
 * ThreadPool is useed to create fixed  number of threads in pool
 * ThreadPool in java can be created by the service ExecutorService
 * ThreadPool in java is to be  called in the static method to execute only once 
 * Threads reamin in the pool till externally shutdown  
 */
public class TestExecutorThread extends Thread {

	String name ;
	
	public TestExecutorThread(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
	}

	public void run(){
		System.out.println("I am in run method by "+Thread.currentThread().getName()+"task name : "+name);
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("End Thread "+Thread.currentThread().getName());
		
	}
	/*
	 * Suppose if we create the threads of size 5 and 
	 * if we have 10 task  to execute then 5 threads will finish it one after another
	 * sequentially 5 task will be executed because we have 5 threads and rest of the task will be in the Queue
	 * and start other task  if any 1 threas out of 5 are free 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ExecutorService exservice = Executors.newFixedThreadPool(5);
		System.out.println("within main method ");
		for(int i=1;i<=10;i++){
			TestExecutorThread thread = new TestExecutorThread(""+i);
			//thread.start();
			exservice.execute(thread);
		}
	//	exservice.
		exservice.shutdown();  

	}
	

}
