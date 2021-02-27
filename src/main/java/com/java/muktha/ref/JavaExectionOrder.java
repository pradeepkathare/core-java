package com.java.muktha.ref;

public class JavaExectionOrder {

	
	public static void main(String[] args) {
		//check order of execution
		//C c = new C();
		//object is c,but class AA is executed then BB and then CC
		CC cc = new CC();
	}

}

class C{
	
	static int a=20; //first
	int b=20;
	
	//static block
	static {
		System.out.println("static block a="+a);
		a=10;
	}
	
	//initalization block
	{
		System.out.println("initalization block");
	}
	
	public C() {
		System.out.println("constructor of c");
		System.out.println("value of a="+a);
		System.out.println();
	}
	
}

class AA{
	
	public AA() {
		System.out.println("Constructor AA");
	}
}

class BB extends AA{
	 public BB() {
		 System.out.println("Constructor BB");
	 }
}

class CC extends BB{
	
	
	public CC() {
		super();
		System.out.println("Constructor CC");
	}
}