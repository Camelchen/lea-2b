import java.text.DecimalFormat;
import java.util.StringTokenizer;

import javax.swing.*;

public class Review_Q4 {

	public static void main(String[] args) {
		String input = JOptionPane.showInputDialog("Enter a series of numbers separated only by commas:");
		StringTokenizer cal = new StringTokenizer(input.trim(), ",");
		double sum = 0;
		while (cal.hasMoreTokens()) 
		{
			sum = sum + Double.parseDouble(cal.nextToken().toString());
		}
		DecimalFormat f = new DecimalFormat("#0.0");
		JOptionPane.showMessageDialog(null, "The sum of those numbers is " + f.format(sum));
	}
}