import java.util.Scanner;

public class ProgrammingJava_Assignment4_Q5 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("\nEnter two numbers.");

		System.out.print("Enter the population of town A: ");
		int aPop = input.nextInt();

		System.out.print("Enter the growth rate of town A: ");
		int aRate = input.nextInt();

		System.out.print("Enter the population of town B: ");
		int bPop = input.nextInt();

		System.out.print("Enter the growth rate of town B: ");
		int bRate = input.nextInt();

		if ((aPop <= bPop) && (aRate >= bRate)) {
			int year = 0;
			double aPopFur = (double) aPop;
			double bPopFur = (double) bPop;

			while (aPopFur < bPopFur) {
				aPopFur = (int) (aPopFur * (1 + (double) aRate / 100));
				bPopFur = (int) (bPopFur * (1 + (double) bRate / 100));
				year++;

			}

			System.out
					.println("After "
							+ year
							+ " year(s) the population of town A will be greater than or\nequal to the population of town B.");
			System.out.println("After " + year + " population of town A is "
					+ (int) aPopFur);
			System.out.println("After " + year + " population of town B is "
					+ (int) bPopFur);
		} else
			System.out.print("Invalid input");
		input.close();

	}
}