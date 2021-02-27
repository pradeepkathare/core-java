package programming.programs;

/*
 * Pradeep.kathare
 * Question : Program to identify hihest number in string
 * Input : abc123e2gh78
 * output :123
 */

public class HighestNumericInString {

	public static void main(String[] args) {

		System.out.println("Within in main");

		// String res1 = finMax("abc0");
		// System.out.println(res1);
		int res = finMax("a9d5a232uj999");
		System.out.println(res);
		/*
		 * for(int i = 0;i<res2.length;i++){ System.out.println(res2[i]); }
		 */
	}

	static int finMax(String instring) {

		String res = "";
		int resNum = 0;
		int min = 0;
		int max = 0;

		if (instring.length() == 0 || instring == null)
			return 0;

		for (int i = 0; i < instring.length(); i++) {

			while (i < instring.length() && Character.isDigit(instring.charAt(i))) {
				System.out.println("char : " + instring.charAt(i));
				int a = Character.getNumericValue(instring.charAt(i));
				System.out.println("resNum*10+a : " + resNum * 10 + a + " :a :" + a);
				resNum = resNum * 10 + a;
				System.out.println("resNum : " + resNum);
				i++;
			}
			min = resNum;
			resNum = 0;
			if (min > max) {
				max = min;
			}
		}
		return max;

	}
}
