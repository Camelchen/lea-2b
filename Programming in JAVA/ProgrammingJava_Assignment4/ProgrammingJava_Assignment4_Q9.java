import java.util.Scanner;
import java.io.*;
import javax.swing.JFileChooser;


public class ProgrammingJava_Assignment4_Q9 {

	public static void main(String[] args) throws FileNotFoundException {

		JFileChooser fc = new JFileChooser(new File("."));
		fc.showOpenDialog(null);
		File file = fc.getSelectedFile();

		Scanner inputFile = new Scanner(file);
		int line = 1;

		while (inputFile.hasNext()) {
			System.out.println(line + ": " + inputFile.nextLine());
			line++;
		}

		inputFile.close();

	}
}