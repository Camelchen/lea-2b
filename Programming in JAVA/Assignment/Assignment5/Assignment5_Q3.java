import java.util.Scanner;

public class Assignment5_Q3 {

	public static void main(String[] args) {

		System.out.print("Enter an integer: ");
		Scanner input = new Scanner(System.in);
		int in = input.nextInt();

		System.out.print(in + " with digits reversed = " + reverseDigit(in)
				+ " leading zeros if any are not shown.");
		input.close();
		System.exit(0);

	}

	private static String reverseDigit(int in) {
		// TODO Auto-generated method stub
		String out = "";
		for (int i = 0; i < Integer.toString(in).length(); i++) {
			out = Integer.toString(in).charAt(i) + out;
		}

		return out;
	}

}