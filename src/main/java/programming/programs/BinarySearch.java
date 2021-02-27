package programming.programs;

/*
 * In sorted array search given element by dividing array in parts
 */
public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Not found");
		int input[] = {10,20,45,56,78};
		//int mid = input.length/2;
		int l = 0;
		int r = input.length;
		int searchElement = 78;
		int mid =0;
		while(l<=r){
			
			mid = (l+(r-1))/2;
			
			if(input[mid] == searchElement){
				System.out.println("SearchElement found");
				return ;
			}
			
			else if(searchElement > input[mid]){
				 l = mid+1;
			}
			else{
				r = mid-1;
			}
			
		}
		System.out.println("Not found");
	}

}
