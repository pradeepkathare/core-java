package com.java.threads;

/*
 * DeadLock :one thread is waiting for resource locked by another thread and vice versa
 * so both dont be able to release lock   
 * Below also expalins creating thread using annoymous class
 */
public class DeadLock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Thread t1 = new Thread(){
			public void run(){
				System.out.println("Annonouys thread in java");
			}
		};
		t1.start();
	}

    
		
}
/*
 * Shared class has 2 synchronized methods and one method calling another method by passed reference object 
 * and passing this as reference parameter
 */

class Shared{
	
	synchronized public void test1(Shared s2) {

		System.out.println("In test1 method");
		try {
			Thread.sleep(50);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		
		s2.test2(this);
		System.out.println("End test1 method");
	}
	
	synchronized public void test2(Shared s1){
		System.out.println("In test2 method ");
		try {
			Thread.sleep(50);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		s1.test1(this);
		System.out.println("In test2 method ");
	}
}

/*
 * Thread has 2 reference of shared resource
 * one reference calling one shared method by passing another reference as parameter
 * say s1 call test1 and pass s2 as reference    
 */
class Thread7 extends Thread{

	Shared s1;
	Shared s2;
	
	Thread7(Shared s1,Shared s2){
		this.s1 = s1;
		this.s2 = s2;
	}
	public void run(){
		System.out.println("Within Thread7 run method");
		System.out.println("s1 calling test1 passing s2 reference  ");
		s1.test1(s2);
	}
	
	
}
/*
 * Thread2 has 2 shared  reference and its run method calls another shared method vice versa of thread1
 * say s2 calls test2  passing s1 as reference 
 * DeadLock occurs because test1 calls test2  
 */

class Thread8 extends Thread{

	Shared s1;
	Shared s2;
	
	Thread8(Shared s1,Shared s2){
		this.s1 = s1;
		this.s2 = s2;
	}
	public void run(){
		System.out.println("Within Thread8 run method");
		s2.test2(s1);
	}
	
	
}

/*
 * TestDead Lock creates 2 shared object and passes parameter for thread 1 and thread 2 
 * and when you start thread1 its run method call s1.test1(s2) so test1 is locked by s1
 * and test1 method has longer sleep before it calls s2.test2(this) 
 * 
 * During sleep of t1 ,t2 gets started and calls s2.test2(s1) and locks test2 method and 
 * In test2 ,tries to call
 * After sleep of t1 it will try to call s2.test2(this) but its already locked by thread2 and thread1 will be in wait state
 * After sleep of t2 it will try to call s1.test1(this) but its locked by t1 in beginng stage
 * be deadWhen you start thread2 its run method tries to call s2.test
 * holded by deadlock occurs
 */

class TestDeadLock{
	
	public static void main(String[] args) {
		 
		Shared s1 = new Shared();
		Shared s2 = new Shared();
		
		System.out.println("starting Thread7");
		Thread7 t7 = new Thread7(s1,s2);
		t7.start();
		
		System.out.println("starting Thread8");
		Thread8 t8 = new Thread8(s1,s2);
		t8.start();
		
		System.out.println("End of the TestDeadLock");
		 
	}
}






/*
 * Below provides annonmous thread sample in java
 */

class AnnonmoyusThread  {
	
	public static void main(String[] args) {
		
		Thread t1 = new Thread(){
			public void run(){
				System.out.println("Annonouys thread in java");
			}
		};
		t1.start();
	}
	
}













