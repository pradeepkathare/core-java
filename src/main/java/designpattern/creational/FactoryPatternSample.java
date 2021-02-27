package designpattern.creational;


// FactoryPattern is loose coupling of object  .
/*
 * FactoryPattern :
 * Usage : Need to use for loose coupling between the classes which becomes the most important factor
 * 
 * RealTime Scenerio : 
 * 1 : when u need to getConnection for mysql,mssql or otherdb then we can pass only dbname as paramter based on it create connection object.
 * 2 : when u need to copyFiles to azure,aws or system then pass only copyname
 * 
 *    Steps to create factoryPattern:
 *    1 : 1 super class(class can be abstract,interface or normal class) which contains all methods
 *    2 : all child class implementing/overriding methods of superclass
 *    3 : 1 Factory class which will give object based on name
 *    4 : 1 enum to define all constants  
 */


public class FactoryPatternSample {

	public static void main(String[] args) {

		System.out.println("Welcome to factory Pattern");
		
		Plane plan = new GetPlanObject().getObject("DomesticPlan");
		plan.getRate();
		plan = new GetPlanObjectFactory().getObject(PlaneType.DOMESTIC_PLAN);

	}

}



abstract class Plane{

	
	public abstract  int getRate();
		
	
	
}

class DomesticPlane extends Plane {
	
	@Override
	public int getRate() {
		System.out.println("GetRate of DomesticPlan");
		return 0;
	}
	
}

class InternationalPlane extends Plane{
	
	@Override
	public int getRate() {		
		System.out.println("GetRate of InternationalPlan");
		return 0;
	}
}

//This class shows without enum and hardcoding values 
//Disavantage :many if cases if scenarios  increases overcome by switch statement
class GetPlanObject{
	
	GetPlanObject(){
		System.out.println("GetPlanObject");
	}
	
	public Plane getObject(String planName) {
		
		if(planName.equalsIgnoreCase("InternationalPlan")) {
			
			return new InternationalPlane();
		}else if(planName.equalsIgnoreCase("DomesticPlan")) {
			
			return new DomesticPlane();
		} 
			
		
		return null;
		
	}
	
	
	
}

enum PlaneType{
	DOMESTIC_PLAN,INTERNATIONAL_PLAN
}

class GetPlanObjectFactory{
	
	Plane plane = null;
	GetPlanObjectFactory(){
		System.out.println("GetPlanObjectType");
	}
	
	public  Plane getObject(PlaneType planType) {
		
		switch(planType) {
		
		case DOMESTIC_PLAN:
			plane= new DomesticPlane();
			
		case INTERNATIONAL_PLAN:
			plane = new InternationalPlane();
		}
		
		return plane;
		
		
	}
	
}
