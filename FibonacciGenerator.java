import java.util.ArrayList;
import java.util.List;

public class FibonacciGenerator {

	public static List<Integer> fibonacciGenerator(int n) {
		List<Integer> output = new ArrayList<>();

		if (n == 1) {
			output.add(0);
		} else if (n == 2) {
			output.add(0);
			output.add(1);
		} else {
			output.add(0);
			output.add(1);

			for (int i = 2; i < n; i++) {
				output.add(output.get(output.size() - 2) + output.get(output.size() - 1));
			}
		}
		return output;
	}

	public static void main(String[] args) {
		List<Integer> result = fibonacciGenerator(7);
		System.out.println(result);
	}
}
