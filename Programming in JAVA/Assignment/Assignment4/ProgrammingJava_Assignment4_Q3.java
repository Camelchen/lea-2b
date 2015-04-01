import java.util.Scanner;

public class ProgrammingJava_Assignment4_Q3 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		String again = "";

		do {

			System.out.println("\nEnter two numbers.");

			System.out.print("Enter the first number: ");
			int firstNum = input.nextInt();

			System.out.print("Enter the second number: ");
			int secondNum = input.nextInt();

			int sum = firstNum + secondNum;
			System.out.println("The sum of " + firstNum + " and " + secondNum
					+ " is: " + sum);

			input = new Scanner(System.in);
			System.out.print("You would like to perform the operation again?");
			again = input.nextLine();

		} while (again.toLowerCase().equals("yes"));

		input.close();
	}
}