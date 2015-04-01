import java.util.Scanner;

public class Assignment5_Q4 {

	public static void main(String[] args) {

		System.out.print("Enter an integer: ");
		Scanner input = new Scanner(System.in);
		int in = input.nextInt();

		if (isPalindrome(in))
			System.out.print(in + " is a palindrome number.");
		else
			System.out.print(in + " is not a palindrome number.");

		input.close();
		System.exit(0);
	}

	private static boolean isPalindrome(int in) {
		// TODO Auto-generated method stub
		int reversedNum = 0;
		int input = in;
		while (input != 0) {
			reversedNum = reversedNum * 10 + input % 10;
			input = input / 10;
		}
		if (in == reversedNum)
			return true;
		else
			return false;
	}

}