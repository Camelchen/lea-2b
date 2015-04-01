import java.text.DecimalFormat;
import java.util.Scanner;

public class Assignment5_Q6 {

	public static void main(String[] args) {

		System.out.print("Enter a distance in meters: ");
		Scanner input = new Scanner(System.in);
		int meter = input.nextInt();

		int menuIndex = 4;
		do {
			// chose menu
			System.out.println("1. Convert to kilometers");
			System.out.println("2. Convert to inches");
			System.out.println("3. Convert to feet");
			System.out.println("4. Quit the program");

			System.out.println("Enter your choice: ");
			menuIndex = input.nextInt();

			if ((menuIndex != 1) && (menuIndex != 2) && (menuIndex != 3)
					&& (menuIndex != 4)) {
				System.out.println("Invalid selection.");
			} else if (menuIndex != 4)
				// calculate
				System.out
						.println(new DecimalFormat("#0.0").format(meter)
								+ " meters is "
								+ meterConvert(meter, menuIndex) + "\n");
		} while (menuIndex != 4);

		System.out.println("Bye!");

		input.close();

	}

	private static String meterConvert(int meter, int type) {
		// TODO Auto-generated method stub
		switch (type) {
		case 1:
			return new DecimalFormat("#0.000").format(meter * 0.001)
					+ " kilometers.";
		case 2:
			return new DecimalFormat("#0.00").format(meter * 39.37)
					+ " inches.";
		case 3:
			return new DecimalFormat("#0.000").format(meter * 3.281) + " feet";
		default:
			return "";
		}

	}

}