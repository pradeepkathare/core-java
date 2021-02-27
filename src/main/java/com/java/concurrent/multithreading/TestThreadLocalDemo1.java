package com.java.concurrent.multithreading;

public class TestThreadLocalDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ThreadLocal<Object> t1 = new ThreadLocal<>();
		System.out.println("Thread Name : "+Thread.currentThread().getName());
		System.out.println("It will call intialValue so value : "+t1.get()); //null
		t1.set("pradeep.kathare");
		System.out.println("It will return threadLocal value : "+t1.get()); //pradeep.kathare
		System.out.println("I am removing value by remove method");
		t1.remove();
		System.out.println("Value removed hence again default value is set :"+t1.get());
	}

}
