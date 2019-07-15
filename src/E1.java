import java.util.Scanner;

public class E1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("It's the echo machine! It just echoes back what you tell it.");
		String input = scan.nextLine();
		System.out.println(input);
		
		scan.close();
	}
}
