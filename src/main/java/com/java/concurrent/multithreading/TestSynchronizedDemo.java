package com.java.concurrent.multithreading;

 class TestSynchronizedDisplay {

	public void wish(String name){
		
		for(int i=0;i<5;i++){
			System.out.print("Good Morning : ");
			try{
				Thread.sleep(1000);
			}catch(Exception ex){
				ex.printStackTrace();
			}
			System.out.println(name);
		}
	}
}


class MyThreadSynchronized extends Thread {
	
	TestSynchronizedDisplay d;
	String name;
	public MyThreadSynchronized(TestSynchronizedDisplay d,String name) {
		this.d = d;
		this.name = name;
	}
	public void run(){
		d.wish(name);
	}
}


public class TestSynchronizedDemo{
	
	public static void main(String[] args) {
		System.out.println("I am executing");
		TestSynchronizedDisplay d1 = new TestSynchronizedDisplay(); //calling 2 threads on single object is like keeping 
		//1 biryani for 2 dogs and each other fight
		
		
		MyThreadSynchronized t1 = new MyThreadSynchronized(d1, "Dhoni");
		t1.start();
		
		
		MyThreadSynchronized t2 = new MyThreadSynchronized(d1, "sachin");
		t2.start();
		
		
		
	}
}