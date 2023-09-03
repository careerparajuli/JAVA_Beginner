
public class For_Loops {

	public static void main(String[] args) {

		for (int n = 1; n <= 20; n++) {

			if (n == 1) {
				System.out.println(n + " inch is equal to " + 0.0833333 * n + " feet");
			} else {
				System.out.println(n + " inch is equal to " + 0.0833333 * n + " feets");
			}
			if (n % 4 == 0) {
				System.out.println();
			}
		}
	}
}
