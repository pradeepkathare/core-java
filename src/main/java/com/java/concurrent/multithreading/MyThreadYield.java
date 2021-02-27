package com.java.concurrent.multithreading;
/*
 * If i comment line 1 then both threads will be executed simultaneously and we cannot expect which thread 
 * will complete first.
 * 
 * If we are not commenting line 1 then child thread always calls yield method becuase of that 
 * main thread will get chance more number times and chance of completing main thread first 
 * is high
 */
public class MyThreadYield extends Thread {

	@Override
	public void run() {
		
		for(int i =0;i<5;i++){
			System.out.println("Child Thread");
			Thread.yield(); //--1
		}
	}
}
