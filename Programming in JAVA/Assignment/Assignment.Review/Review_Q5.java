import java.util.Scanner;

public class Review_Q5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a sentence with no spaces between the words and the first letter of each word capitalized.");
		String s = input.nextLine();
		StringBuilder output = new StringBuilder();
		boolean init = true;
		for (char c : s.toCharArray()) {
			if (Character.isUpperCase(c)) {
				if (init) {
					output.append(c);
					init = false;
				} else
					output.append(" ").append(Character.toLowerCase(c));
			} else
				output.append(c);
		}
		output.append(".");
		System.out.println(output);
		
		input.close();
	}
}