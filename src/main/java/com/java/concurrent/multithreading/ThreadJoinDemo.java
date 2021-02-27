package com.java.concurrent.multithreading;
/*
 * output
 * main 
Child Thread
parent-child : main
parent-child : main
parent-child : main
parent-child : main
parent-child : main
Child Thread
Child Thread
Child Thread
Child Thread

 */
public class ThreadJoinDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("main ");
		MyThreadJoin t1 = new MyThreadJoin();
		MyThreadJoin.mt = Thread.currentThread();
		
		t1.start(); 
		try{
			//Thread.currentThread().join(); //Deadlock case 4 :
			//t1.join(); //main thread calling join method of t1 so main thread wait untill child complets it task
			//so in output we can observe that parent-child is prinited later i,e once child is completed task...child printed first then parent
			//t1.join(100); //it will wait only for 100 ms and later parent starts execution irrespective of child complete task or not i,e output will be mixed
			//uncomment any one of the join then you will notice DeadLock situation
			for(int i =0;i<5;i++){
				System.out.println("parent-child : "+Thread.currentThread().getName());
			}
		}catch(Exception ex){
			ex.printStackTrace();
		}
		
		
	}

}


