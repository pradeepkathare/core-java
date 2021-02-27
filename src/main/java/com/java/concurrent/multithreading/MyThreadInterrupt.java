package com.java.concurrent.multithreading;

public class MyThreadInterrupt extends Thread {

	@Override
	public void run() {
		
		try{
			
			for(int i=0;i<5;i++){
				System.out.println("child thread :"+i);
				try{
					Thread.sleep(2000); // If i comment this line then there is no exception because thread is niether sleeping nor joining
				}catch(Exception ex){
					ex.printStackTrace();
				}
				 
			}
		}catch(Exception ex){
			System.out.println("Interrupted");
		}
		
	}
	
}
