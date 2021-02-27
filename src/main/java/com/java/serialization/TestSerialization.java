package com.java.serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/*
 * Serialization means converting object to stream and deserialization means vice versa
 * 
 * In serialization we get serialVrsion issu in many  cases :one of them are :
 * 
 * 1 : If i have bean class with 3 fields while serialization and if remove one field whil dserrializing then i will get 
 * servial version issue 
 * Following example shows the srialization and deserialzation issue  
 * Importance of transient
 */
//study this link
//https://www.geeksforgeeks.org/object-serialization-inheritance-java/#:~:text=Serialization%20is%20a%20mechanism%20of,object%20into%20a%20byte%20stream.&text=So%20we%20can%20say%20that,during%20serialization%20in%20this%20case.
public class TestSerialization {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub

		String fileName = "Employee.txt";
		Employee emp = new Employee(20, "pradeep", 40, 258);
		System.out.println(emp.age);
		SerializeAndDeserialzeUtil util = new SerializeAndDeserialzeUtil();
		util.serialize(fileName, emp);
		
		Employee emp_des = (Employee)util.deserialize(fileName);
		
		System.out.println("serial : "+emp.toString());
		System.out.println("deserial : "+emp_des.toString());
	}

}



/*
 * Serailiaze and desrialize util class
 */

class SerializeAndDeserialzeUtil{
	
	ObjectOutputStream oos ;
	ObjectInputStream ois;
	FileInputStream fis;
	FileOutputStream fos;
	Object obj;

	
	public  Object deserialize(String fileName) throws ClassNotFoundException {
		
		try {
			ois = new ObjectInputStream(new FileInputStream(fileName));
			obj = ois.readObject();
			ois.close();
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return obj;
	}
	
public void serialize(String fileName,Object object) throws ClassNotFoundException {
		
		try {
			//object.
			oos = new ObjectOutputStream(new FileOutputStream(fileName));
			oos.writeObject(object);
			oos.flush();
			//ois.close();
			System.out.println("success serialized");
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//return obj;
	}
}


/*
 * Bean class or pojo
 */
class Employee implements Serializable {
	
	private static final long serialVersionUID  = 1L;
	
	int age ;
	//String name;
	transient int salary; //it wont be serialized it means when i deserialize its  will be default value  as of data type
	static int id;//same as tranisent it wont be serialized 
	
	Employee(int age,String name,int salary,int id){
		this.age = age;
		//this.name = name;
		this.salary = salary;
		this.id = id;
	}

	public int getAge() {
		return age;
	}

/*	public String getName() {
		return name;
	}*/

	public int getSalary() {
		return salary;
	}

	public static int getId() {
		return id;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "age : "+age+"name :" +" salary : "+salary +" id : "+id;
	}
	
}
