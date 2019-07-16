import java.util.Scanner;

public class E5 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a number. ");
		double input1 = scan.nextDouble();
		System.out.println("Please enter another number. ");
		double input2 = scan.nextDouble();
		double product = input1 * input2;
		System.out.println("The product is " + product + ".");
		scan.close();
	}
}
