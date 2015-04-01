import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.io.*;

public class ProgrammingJava_Assignment4_Q8 {

	public static void main(String[] args) throws IOException {

		// get file name
		System.out.println("Please enter the file name: (default = ProgrammingJava_Assignment4_Q8_input.txt)");
		Scanner input = new Scanner(System.in);
		String fileName = input.nextLine();

		String path = System.getProperty("user.dir") + "\\Assignment4\\";
		File file = new File(path + "\\" + fileName);

		if (!file.exists()) {
			System.out.println("File not found, [" + fileName + "] invalid file name. Will use DEFAULT file");
			String defaultFileName = "ProgrammingJava_Assignment4_Q8_input.txt";
			fileName = path + "\\" + defaultFileName;
			file = new File(fileName);
		}

		// read

		Scanner inputFile = new Scanner(file);

		System.out.println("Already load file: [" + fileName + "]");
		System.out.print("Please enter the character: ");
		String match = input.nextLine();
		int count = 0;


		while (inputFile.hasNext()) {

			String context = inputFile.nextLine();
			// match character
			Pattern pattern = Pattern.compile(match);
			Matcher matcher = pattern.matcher(context);
			while (matcher.find())
				count++;

			// System.out.println(context);
		}

		System.out
				.println("Output: " + match + " appears " + count + " times.");

		input.close();
		inputFile.close();

		System.exit(0);

	}
}