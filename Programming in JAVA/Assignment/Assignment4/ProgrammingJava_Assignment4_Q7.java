import java.text.DecimalFormat;
import java.util.Scanner;
import java.io.*;

public class ProgrammingJava_Assignment4_Q7 {

	public static String getGrade(double score) {
		if (score < 60)
			return "F";
		else if (score >= 60 && score < 70)
			return "D";
		else if (score >= 70 && score < 80)
			return "C";
		else if (score >= 80 && score < 90)
			return "B";
		else if (score >= 90 && score <= 100)
			return "A";
		else
			return "";
	}

	public static void main(String[] args) throws FileNotFoundException {

		String path = System.getProperty("user.dir")+"\\Assignment4\\";
		File file = new File(path+"ProgrammingJava_Assignment4_Q7_input.txt");
		Scanner inputFile = new Scanner(file);

		String[] student;
		int count = 0;
		double sumScore = 0;

		PrintWriter outputFile = new PrintWriter(path+"ProgrammingJava_Assignment4_Q7_output.txt");

		// Read lines from the file until no more are left.
		while (inputFile.hasNext()) {
			// Read the next name.
			String studentInfo = inputFile.nextLine();

			student = studentInfo.split(" ");

			count++;
			sumScore = sumScore + Double.parseDouble(student[2]);

			DecimalFormat myFormatter = new DecimalFormat("##.00");
			// Display
			System.out.println(student[0] + "\t" + student[1] + "\t"
					+ myFormatter.format(Double.parseDouble(student[2])) + "\t"
					+ getGrade(Double.parseDouble(student[2])));
			//Output
			outputFile.println(student[0] + "\t" + student[1] + "\t"
					+ myFormatter.format(Double.parseDouble(student[2])) + "\t"
					+ getGrade(Double.parseDouble(student[2])));
		}

		System.out.println("\nClass Average: " + (int) (sumScore / count));
		outputFile.println("\nClass Average: " + (int) (sumScore / count));

		inputFile.close();
		outputFile.close();

	}
}