package designpattern.creational;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/*
 * Below approaches show how singleton can break and prevention for it 
 * 1 : By serialization(prevention override readresolve method)
 * 2 : By reflection(prevention Enums)
 * 3 : By cloning override clone method
 * 
 * I will use Billpugh singleton class to show all above approaches
 * 
 */
public class SingletonPreventions {
  static  BillPughSingletonClass instance =BillPughSingletonClass.getInstance();
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, CloneNotSupportedException {
		System.out.println("");
		 
		
		
		//Serialize object to file 
		System.out.println("instance hashcode before serialization : "+instance);
		System.out.println("instance a= value before serialization : "+instance.getA());		
		ObjectOutputStream outputstream = new ObjectOutputStream(new FileOutputStream("/opt/pradeep/serial.ser"));
		outputstream.writeObject(instance);
		outputstream.close();
		
		
		//desrialize object from file:It create new instance and copy all the values serialzed 
		ObjectInputStream inputstream = new ObjectInputStream(new FileInputStream("/opt/pradeep/serial.ser"));
		BillPughSingletonClass instance2 = (BillPughSingletonClass) inputstream.readObject();
		System.out.println("instance hashcode after serialization : "+instance2);
		System.out.println("instance a value after serialization (copied): "+instance2.getA());
		inputstream.close();
				
	/*	//Reflection Method to break singleton
		BillPughSingletonClass instance3 = null;
		Constructor []constructors = BillPughSingletonClass.class.getDeclaredConstructors();
		
		for(Constructor<BillPughSingletonClass> constructor:constructors) {
			constructor.setAccessible(true);
			instance3=  constructor.newInstance();
			break;
		}
		
		System.out.println("Before reflection instance1 hashcode :"+instance);
		System.out.println("after reflection instance3 hashcode :"+instance3);
		*/
		//cloning breaks the singleton
		/*
		 * step 1 : override the clone method as usual without changes and check output
		 */
		BillPughSingletonClass instanceClone = (BillPughSingletonClass) instance.clone();
		System.out.println("cloning "+instance.hashCode());
		System.out.println("cloning "+instanceClone.hashCode());
		
	}

	
}

//imporatant : for serialization u should  implements Serializable
class BillPughSingletonClass implements Serializable,Cloneable{
	
	/** preRequiste : understand serialzation issue and add serialversionUID 
	 * This is required in cases where your class structure changes between 
	 * serialization and deserialization. A changed class structure will cause
	 *  the JVM to give an exception in the de-serializing process
	 */
	private static final long serialVersionUID = 1L;

	private BillPughSingletonClass() {
		System.out.println("constructor BillPughSingletonClass");
	}
	
	private static class LocalSingleton{
		private static final BillPughSingletonClass  INSTANCE = new BillPughSingletonClass();
	}
	public static  BillPughSingletonClass getInstance() {
		return LocalSingleton.INSTANCE;
	}
	
	//declare variable
	int a =10;
	
	public void setA(int a) {
		this.a = a;
	}
	public int getA() {
		return a;
	}
	
	//to overcome implement readresolve 
	//COMMENT AND UNCOMMENT THIS METHOD TO SEE SERIALIZATION ISSUE
	protected Object readResolve() {
		return LocalSingleton.INSTANCE;
	}
	
	//uncomment the super.clone and check hashcode it will create new object so singleton break
	//Overcome : return the same instance
	@Override
	protected Object clone() throws CloneNotSupportedException {
	System.out.println("clone method");
		//return super.clone();
		return LocalSingleton.INSTANCE;
	}
	
}