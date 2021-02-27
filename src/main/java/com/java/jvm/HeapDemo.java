package com.java.jvm;

/*
 * output in mb:
 * Max memory:2708
freeMemory:181
totalMemory:184
consumedMemory:2
 */
public class HeapDemo {

	public static void main(String[] args) {
		//output will be in bytes so convert to mb 
		Runtime rt = Runtime.getRuntime();
		System.out.println("Max memory:"+(rt.maxMemory()/(1024*1024)));
		System.out.println("freeMemory:"+rt.freeMemory()/(1024*1024));
		System.out.println("totalMemory:"+rt.totalMemory()/(1024*1024));
		System.out.println("consumedMemory:"+(rt.totalMemory()-rt.freeMemory())/(1024*1024));
	}

}
