package com.java.concurrent.multithreading;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/*
 * T
 */

class MyCallableDemo implements Callable{
	
	int num;
	public MyCallableDemo(int num) {
		this.num = num;
	}
	@Override
	public Object call() throws Exception {
		System.out.println(Thread.currentThread().getName()+" :is respsonsible to  fins sum of first "+num+" numbers");
		int sum = 0;
		for(int i = 1;i<=num;i++){
			sum = sum+i;
		}
		return sum;
		
	}
}
public class CallableInterfaceDemo {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		MyCallableDemo[] myCallableDemo = {new MyCallableDemo(10),new MyCallableDemo(20),
				new MyCallableDemo(30),new MyCallableDemo(40),new MyCallableDemo(50)};
		ExecutorService service = Executors.newFixedThreadPool(3);
		
		for(MyCallableDemo job : myCallableDemo){
			Future future = service.submit(job);
			System.out.println("sum is : "+future.get());
		}
		
		service.shutdown();
		
	}

}
