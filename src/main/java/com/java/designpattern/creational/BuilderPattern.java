package designpattern.creational;

public class BuilderPattern {

	public static void main(String[] args) {
System.out.println("main");
		Student student = new Builder().setAddress("hospet")
					  .setId(10)
					  .build();
		System.out.println("student : "+student);
		
	}

}





class Student{
	
	
	
	int id;
	long phone;
	String name;
	String address;
	
	public Student(int id,long phone,String name,String address){
		
		this.id = id;
		this.phone = phone;
		this.name = name;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", phone=" + phone + ", name=" + name + ", address=" + address + "]";
	}
	
	
}


class Builder {

	int id;
	long phone;
	String name;
	String address;

	public Builder() {

	}

	public Builder setId(int id) {
		this.id = id;
		return this;
	}

	public Builder setPhone(long phone) {
		this.phone = phone;
		return this;
	}

	public Builder setName(String name) {
		this.name = name;
		return this;
	}

	public Builder setAddress(String address) {
		this.address = address;
		return this;
	}

	public   Student build() {
		return new Student(id,phone,name,address);
	}
}