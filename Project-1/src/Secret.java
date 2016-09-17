import java.util.Scanner;

public class Secret {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Type in your secret message: ");
		String message = sc.nextLine();
		
		int secretNumber = (message.length() * 2) + 7;
		
		System.out.printf("The secret message has %d characters.\n", message.length());
		System.out.printf("Your secret number is %d.", secretNumber);

	}

}
