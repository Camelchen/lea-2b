import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.io.*;

import javax.swing.JOptionPane;

public class ProgrammingJava_Assignment4_Q8 {

	public static void main(String[] args) throws IOException {

		try {
			
			// get file name
			System.out
					.println("Please enter the file name: (default = ProgrammingJava_Assignment4_Q8_input.txt)");
			Scanner input = new Scanner(System.in);
			String fileName = input.nextLine();

			// get full path of file
			String defaultFileName = "ProgrammingJava_Assignment4_Q8_input.txt";
			String path = System.getProperty("user.dir")+"\\Assignment4\\";
			fileName = path
					+ (fileName.equals("default") ? defaultFileName : fileName);

			// read
			File file = new File(fileName);
			Scanner inputFile = new Scanner(file);
			
			System.out.print("Please enter the character: ");
			String match = input.nextLine();
			int count = 0;
			
			while (inputFile.hasNext()) {
				String context = inputFile.nextLine();
				
				//match character
				Pattern pattern = Pattern.compile(match);
				Matcher matcher = pattern.matcher(context);
				while (matcher.find()) count++;
				
				//System.out.println(context);
			}

			System.out.println("Output: " + match + " appears " + count + " times.");
			
			input.close();
			inputFile.close();
			
		} catch (FileNotFoundException e) {
			JOptionPane.showMessageDialog(null,"File not found, invalid file name.");
		}
		
		System.exit(0);

	}
}