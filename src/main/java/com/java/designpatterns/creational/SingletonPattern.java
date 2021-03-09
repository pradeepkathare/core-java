package com.java.designpatterns.creational;

/*https://howtodoinjava.com/design-patterns/creational/singleton-design-pattern-in-java/
 * Pradeep.k
 * SingletonDesignPattern : This pattern is useful when you need single object of class
 * WhereToUse:objects used for logging,objects used for connecting db,cache and etc
 * SingleTon can be created in many approaches as shown below
 * 
 * How To Make class SingleTon:
 * 1: make constructor as private(no others can create the object other than its own class)
 * 2: Object to created only once
 */
public class SingletonPattern {
	//object is 
	static EagerInitalizationSingleton eagerInitalizationSingleton=EagerInitalizationSingleton.getInstance();
	public static void main(String[] args) {
		//System.out.println("main");
		//eagerInitalizationSingleton.add();
	}

}


/*
 * Usage : If your application always creates and uses an instance of the Singleton
 * Drawback : The instance is created irrespective of it is required in runtime or not.
 *  If this instance is not a big object and you can live with it being unused, 
 * this is the best approach.
 * 2 : It is one of threadsafe approach 
 * 
 */
class EagerInitalizationSingleton{
	
	private static EagerInitalizationSingleton instance = new EagerInitalizationSingleton();
	
	private EagerInitalizationSingleton() {
		//no one can create object
		System.out.println("EagerInitalizationSingleton");
	}
	
	public static EagerInitalizationSingleton getInstance() {
		
		return instance;
	}
	
	public void add() {
		System.out.println("add");
	}
}


/*
 * LazyInitalization : creates the object only when required 
 */
class LazyInitalization{
	
	private static LazyInitalization instance;
	
	private LazyInitalization() {
		System.out.println("LazyInitalization");
	}

	/*
	 * Below method is not thread safe : Approaches:
	 *  1 : add synchronized keyword for making thread safe(very costly because only one thread will execute one at time)	 *    
	 *   
	 */
	public static synchronized  LazyInitalization getInstance() {
		if(instance==null) {
			instance = new LazyInitalization();
		}
		return instance;
	}
}

class LazyInitalizationWithSynchronizedBlock{
	private static LazyInitalizationWithSynchronizedBlock instance;
	
	private LazyInitalizationWithSynchronizedBlock() {
		System.out.println("LazyInitalizationWithSynchronizedBlock");
	}
	
	//Threadsafe: and allows 2 or more thread to execute method simultaneously
	//DrawBack:when 2 threads comes at same time then 2 objects created (overcome by double check)
	//study howtodoin
	public static LazyInitalizationWithSynchronizedBlock getInstance() {
		
		if(instance==null) {
			
			synchronized (LazyInitalizationWithSynchronizedBlock.class) {
				instance = new LazyInitalizationWithSynchronizedBlock();
			}
		}
		return instance;
	}
	
}

class LazyInitalizationWithDoublecheck{
	private static LazyInitalizationWithDoublecheck instance;
	
	private LazyInitalizationWithDoublecheck() {
		System.out.println("LazyInitalizationWithDoublecheck");
	}
	
	//Threadsafe: and allows 2 or more thread to execute method simultaneously
	//(overcome by double check)
	//study howtodoin
	public static LazyInitalizationWithDoublecheck getInstance() {
		
		if(instance==null) {
			
			synchronized (LazyInitalizationWithDoublecheck.class) {
				if(instance==null) {
					instance = new LazyInitalizationWithDoublecheck();
				}
				
			}
		}
		return instance;
	}
	
}

//Billpugh says to have private constructor create object with in the static class
class BillPughIntialization{
	 
	
	private BillPughIntialization() {
		System.out.println("BillPughIntialization");
	}
	//static class is best because it is loaded 
	private static class LocalSingleTon{
		private static final BillPughIntialization INSTANCE = new  BillPughIntialization(); 
	}
	
	
	
	public static BillPughIntialization getInstance() {
		return LocalSingleTon.INSTANCE;
	}
	
	
	
}

//Best Approach and recommended approach because it solves all reflection and serialization issues
 enum EnumSingleton{
	INSTANCE;
	public void someMethod(String param) {
        System.out.println("EnumSingleton:someMethod");
    }
}
