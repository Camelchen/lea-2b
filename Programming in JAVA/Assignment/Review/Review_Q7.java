import java.util.Scanner;

public class Review_Q7 {

	public static String coinToss() {
		if (Math.round(Math.random()) == 0)
			return "Heads";
		else
			return "Tails";
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("How many times do you want to toss the coin? ");
		int times = input.nextInt();
		for (int i = 1; i <= times; i++) {
			System.out.println("Toss#" + i + "\t: " + coinToss());
		}
		input.close();
	}
}