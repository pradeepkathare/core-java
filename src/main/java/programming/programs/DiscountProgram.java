package programming.programs;

public class DiscountProgram {

	public static void main(String[] args) {
		
		double total = 10000;
		
		System.out.println("Actual Amout = "+total);
		//write discount formula example :10% ==>(10/100)
 
		if(total >=10000) {
			double discount = (double) 10/100; 
			double totalPriceToDiscount = discount*total;
			double discoutedPrice = total - totalPriceToDiscount;
			System.out.println("discoutedPrice = "+discoutedPrice);
			total = discoutedPrice;
		}else{
			System.out.println("no discount");
		}
		
		System.out.println("total = "+total);

	}

}
