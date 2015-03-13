import java.util.Scanner;

public class ProgrammingJava_Assignment4_Q1 {

	public static void main(String[] args) {

		System.out.print("Enter a positive nonzero number:(1~50) ");
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();

		if (num <= 50 && num > 0) {
			int sum = 0;
			int i = 1;
			while (i <= num) {
				sum = i + sum;
				i++;
			}

			System.out.println("The sum of all the integers from 1 through "
					+ num + " is " + sum);

		} else
			System.out.println("Invalid.");

		input.close();
	}
}