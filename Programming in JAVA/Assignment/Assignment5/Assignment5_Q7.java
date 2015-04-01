import java.util.Random;
import java.util.Scanner;

public class Assignment5_Q7 {

	public static void main(String[] args) {

		System.out
				.print("The number of times the dice are rolled to get the sum: ");
		Scanner input = new Scanner(System.in);
		int in = input.nextInt();

		if (in > 12 || in < 2)
			System.out.print("Impossible!!");
		else
			System.out.print("output: " + roll(in));
		input.close();
		System.exit(0);

	}

	private static int roll(int in) {
		// TODO Auto-generated method stub
		int time = 0;
		Random rand = new Random();
		do {
			time++;
		} while (in != ((rand.nextInt(6) + 1) + (rand.nextInt(6) + 1)));
		return time;
	}

}