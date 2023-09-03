
public class Alphabets {

	public static void main(String[] args) {
		char upperCase = 'A';
		char lowerCase = 'a';

		for (int i = 1; i <= 26; i++) {
			System.out.println(upperCase + "\t" + lowerCase);
			upperCase++;
			lowerCase++;
		}
	}
}
