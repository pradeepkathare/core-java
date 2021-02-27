package com.java.jvm;

 public class RuntimeGc2 {

	 int a=10;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Runtime rt = Runtime.getRuntime();
		int _s=1;
		int $s=1;
		//int &s=1;
		//System.out.println(a);
		System.out.println("Max memory:"+(rt.maxMemory()/(1024*1024)));
		System.out.println("freeMemory:"+rt.freeMemory()/(1024*1024));
		System.out.println("totalMemory:"+rt.totalMemory()/(1024*1024));
		
		for(int i=0;i<10000;i++) {
			Student s1= new Student(10);
			s1=null; //important to make null for gc
		}
		System.out.println("freeMemory:"+rt.freeMemory()/(1024*1024)); //it might occupied some memory
		 
		rt.gc();
		System.out.println("freeMemory:"+rt.freeMemory()/(1024*1024)); //check difference
		

	}

}
 class Student2{
	 //rollno,name,address or marks
	 
	 int rollno = 10;
	 String name;
	 String address;
	 int marks;
	 int Marks;
	 
	 int mlk = 10;
	 //marks=20;
	 
	 void add() {
		 int localvariable=1;
		System.out.println(rollno); 
		System.out.println(localvariable);
	 }
	 
	 
 }
  class _abc$1{
	
	  public static void main(String[] args) {
		System.out.println("hello");
	}
	 }
  
  class VishalPatange{
	 static int a = 10;
	 static int b = 20;
	 // System.out.println(a);
	  
	  public static void main(String[] args) {
			System.out.println(b);
		}
	  
	  
	  
  }
  class pradeep{
	  
  }