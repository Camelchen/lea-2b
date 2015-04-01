public class Assignment5_Q5 {

	public static void main(String[] args) {

		System.out.println("Fahrenheit\tCelsius");
		System.out.println("============================");

		for (int i = 1; i <= 10; i++) {
			System.out.printf(i + "\t\t%.2f\n", F2C(i));
		}

	}

	private static double F2C(int f) {
		// TODO Auto-generated method stub
		return (double) 5 / 9 * (f - 32);
	}

}