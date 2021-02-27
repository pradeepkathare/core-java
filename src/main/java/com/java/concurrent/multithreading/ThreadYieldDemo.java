package com.java.concurrent.multithreading;

public class ThreadYieldDemo {

	public static void main(String[] args) {
		
		System.out.println("main ");
		MyThreadYield t1 = new MyThreadYield();
		t1.start();
		for(int i =0;i<5;i++){
			System.out.println("parent-child : "+Thread.currentThread().getName());
		}
	}
}
