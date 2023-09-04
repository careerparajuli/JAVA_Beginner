import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
	public static void main(String[] args) {
		List<String> output = new ArrayList<>();
		int count = 1;

		while (count <= 100) {
			if (count % 3 == 0 && count % 5 == 0) {
				output.add("FizzBuzz");
				count++;
			} else if (count % 3 == 0) {
				output.add("Fizz");
				count++;
			} else if (count % 5 == 0) {
				output.add("Buzz");
				count++;
			} else {
				output.add(Integer.toString(count));
				count++;
			}
		}
		System.out.println(output);
	}
}
