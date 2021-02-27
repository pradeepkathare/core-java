package com.java.concurrent.multithreading;
/*
 * Pradeep.kathare
 * Sample Example for threadPool
 * In above example 2 threads are responsiblie to execute 6 jobs 
 * so that a single thread can be re-used for multiple jobs 
 */

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class PrintJob implements Runnable{
	
	String name;
	public PrintJob(String name) {
		this.name = name;
	}
	@Override
	public void run() {
		System.out.print("I am in run method of the print job :ThreadExecutor thread name : "+Thread.currentThread().getName());
		System.out.println("JOb is :"+this.name);
		try{
			Thread.sleep(3000);
		}catch(Exception ex){
			System.out.println("Interupted exception : "+ex.getMessage());
		}
	}
	
}
public class ExecutorDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PrintJob[] jobs = {
			new PrintJob("Dhoni"),new PrintJob("yuraj"),new PrintJob("sehwag")	
		};
		ExecutorService service = Executors.newFixedThreadPool(2);
		for(PrintJob job : jobs){
			service.submit(job);
		}
		service.shutdown();
	}

}
