import java.util.Scanner;

public class E2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a number: ");
		double input = scan.nextDouble();
		double result = input + 1;
		
		if (result % 1 == 0) {
			String formattedResult = String.format("%.0f", result);
			System.out.println("That number plus one is " + formattedResult + ".");
		}
		else {
			String formattedResult = Double.toString(result);
			System.out.println("That number plus one is " + formattedResult + ".");
		}
		
		scan.close();
	}
}
