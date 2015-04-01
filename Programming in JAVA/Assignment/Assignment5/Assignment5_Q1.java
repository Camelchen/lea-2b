import java.util.Scanner;

public class Assignment5_Q1 {

	public static void main(String[] args) {

		System.out.print("Enter a character: ");
		Scanner input = new Scanner(System.in);
		char ch = input.next().toLowerCase().charAt(0);

		System.out.println("output: " + isVowel(ch));

		input.close();
	}

	public static boolean isVowel(char ch) {

		switch (ch) {
		case 'a':
			return true;
		case 'e':
			return true;
		case 'i':
			return true;
		case 'o':
			return true;
		case 'u':
			return true;
		default:
			return false;
		}

	}
}