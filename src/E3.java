import java.util.Scanner;

public class E3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a number.");
		double input = scan.nextDouble();
		System.out.println("That number plus 0.5 is " + (input + 0.5) + ".");
		scan.close();
	}
}
