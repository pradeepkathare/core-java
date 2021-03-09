package programming.programs;

/*
 * Finidng subset in java
 * https://javaconceptoftheday.com/java-array-interview-programs/
 * https://www.geeksforgeeks.org/finding-all-subsets-of-a-given-set-in-java/
 https://java2blog.com/find-subsets-set-power-set/
 */


//A Java program to print all subsets of a set
import java.io.IOException;
import java.util.Set;
import java.util.TreeSet;

public class ArraySubSet
{
	// Print all subsets of given set[]
	TreeSet set1 = new TreeSet();
	int sum = 0;

	 void printSubsets(int set[])
	{
		int n = set.length;

		// Run a loop for printing all 2^n
		// subsets one by obe
		for (int i = 0; i < (1<<n); i++)
		{
			System.out.print("{ ");

			// Print current subset
			for (int j = 0; j < n; j++){
			//	System.out.println("j :"+j);

				/*System.out.print("(1 << j) : ");
				System.out.println((1 << j));
				*/
				/*System.out.print(" Result : i & (1 << j) : ");
				System.out.println(i & (1 << j));*/

				if ((i & (1 << j)) > 0){
					System.out.print(set[j] + " ");
					sum = sum+set[j];
				}

			}

				// (1<<j) is a number with jth bit 1
				// so when we 'and' them with the
				// subset number we get which numbers
				// are present in the subset and which
				// are not
				set1.add(sum);


			System.out.println("}");
		}


		System.out.println(set1);
	}

	// Driver code
	public static void main(String[] args)
	{
		 int set[] =  {1, 3, 6, 10, 11, 15};
		 ArraySubSet arrayS = new ArraySubSet();
		 arrayS.printSubsets(set);
	}
}