import java.text.DecimalFormat;
import java.util.Scanner;

class TestScores {

	double[] scores = null;

	public TestScores(int count) {
		scores = new double[count + 1];
	}

	public void addScore() {
		Scanner input = new Scanner(System.in);
		for (int i = 1; i < scores.length; i++) {
			System.out.print("Enter test score #" + i + " : ");
			scores[i - 1] = input.nextDouble();
		}
		input.close();
	}

	public void avgScores() {
		double sum = 0;
		for (int i = 1; i < scores.length; i++) {
			sum = sum + scores[i - 1];
		}
		DecimalFormat f = new DecimalFormat("#0.0");
		System.out.println("The average test score is " + f.format(sum / 3));
	}
}

public class Review_Q9 {

	public static void main(String[] args) {
		
		TestScores ts = new TestScores(3);

		ts.addScore();
		ts.avgScores();

	}
}