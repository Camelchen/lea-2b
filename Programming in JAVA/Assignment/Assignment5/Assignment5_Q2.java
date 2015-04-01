import java.util.Scanner;

public class Assignment5_Q2 {

	public static void main(String[] args) {

		System.out.print("Enter a character: ");
		Scanner input = new Scanner(System.in);
		String in = input.nextLine().toLowerCase();
		int countV = 0;
		for (int i = 0; i < in.length(); i++) {
			if (isVowel(in.charAt(i)))
				countV++;
		}

		System.out.printf("output: There are %d vowel in the input line",
				countV);

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