import java.util.Scanner;

public class ASCII {
	public static void main(String [] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any alphanets: ");
		String input= scanner.nextLine();
		System.out.print(input);
				
		for (int i = 0; i < input.length(); i++) {
            char character = input.charAt(i);
            int asciiValue = (int) character;
            System.out.println(" is: " + asciiValue);
        }
		
	}
	
	}

