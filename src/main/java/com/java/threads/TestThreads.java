package com.java.threads;

/*
 * pradeep.kathare
 * sample of thread 
 */
//Two ways to create thread in java 

public class TestThreads  {
	
	public static void main(String[] args) throws Exception {
		
		System.out.println("main in ThestThreads");
		ThreadRunable runnable1 = new ThreadRunable();
		Thread t1 = new Thread(runnable1);
		t1.start();
		Thread t2 = new Thread(runnable1);
		t1.join();
		t2.start();
		System.out.println("parent thread in java :"+t1.currentThread().getThreadGroup().getParent());
		t1.interrupt();
		System.out.println(t1.getName());
		//t1.s
	}
	
	

}

class ThreadRunable implements Runnable{
	
	public void run(){
		for(int i =0 ;i<=3;i++){
			System.out.println("running thread :"+Thread.currentThread().getName());
		}
		
	}
}

class ThreadExtendsThread extends Thread{
	
	public void run(){
		for(int i =0 ;i<=3;i++){
			System.out.println("ThreadExtendsThread running thread :"+Thread.currentThread().getName());
		}
		
	}
	
	public static void main(String[] args) {
		
		ThreadExtendsThread t1 = new ThreadExtendsThread();
		t1.start();
	}
	
}

//garbage collector 

 class TestGarbage1{  
	 public void finalize(){System.out.println("object is garbage collected");}  
	 public static void main(String args[]){  
	  TestGarbage1 s1=new TestGarbage1();  
	  TestGarbage1 s2=new TestGarbage1();  
	  s1=null;  
	  s2=null;  
	  System.gc();  
	 }  
	}  


  class Runtime4{  
	 public static void main(String args[])throws Exception{  
	  System.out.println(Runtime.getRuntime().availableProcessors()); 
	 // Object 
	 }  
	}  






