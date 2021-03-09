package programming.programs;

/*
 * Pradeep.kathare
 * https://www.geeksforgeeks.org/pascal-triangle/
 * Write pascal triangle
 */
public class TestPascalTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(1/2);
		//printPascal(5);
		printPascalmethod2(5);
		
	}

	// A O(n^2) time and O(1) extra space function for Pascal's Triangle
	static void printPascal(int n) {
		for (int line = 1; line <= n; line++) {
			int C = 1; // used to represent C(line, i)
			for (int i = 1; i <= line; i++) {
				System.out.print(C); // The first value in a line is always 1
				C = C * (line - i) / i;
			}
			System.out.println();
		}
	}

	static void printPascalmethod2(int n) {

		int arr[][] = new int[n][n]; // An auxiliary array to store generated
										// pscal triangle values

		// Iterate through every line and print integer(s) in it
		for (int line = 0; line < n; line++) {
			// Every line has number of integers equal to line number
			for (int i = 0; i <= line; i++) {
				// First and last values in every row are 1
				if (line == i || i == 0)
					arr[line][i] = 1;
				else // Other values are sum of values just above and left of
						// above
					arr[line][i] = arr[line - 1][i - 1] + arr[line - 1][i];
				System.out.print(arr[line][i]);
			}
			System.out.println();
		}
	}
}
