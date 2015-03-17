
import java.util.Scanner;
import javax.swing.*;
import java.math.*;

public class ProgrammingJava_Assignment3_Q1
{

	public static boolean isNumeric(String str)
	{
	  try
	  {
		double d = Double.parseDouble(str);
	  }
	  catch(NumberFormatException nfe)
	  {
		return false;
	  }
	  return true;
	}

   public static void main(String[] args)
   {

		JTextField FirstSide = new JTextField();
		JTextField SecondSide = new JTextField();
		JTextField ThirdSide = new JTextField();

		Object[]  message  = {
			"Enter the length of the first side:", FirstSide,
			"Enter the length of the second side:", SecondSide,
			"Enter the length of the third side:", ThirdSide
			};

		int option;

		//read side number until all side are valid.
		do {
			option = JOptionPane.showConfirmDialog(null, message, "Triangle side input", JOptionPane.OK_CANCEL_OPTION);
			}
		while (option == JOptionPane.OK_OPTION
			&& (!isNumeric(FirstSide.getText())
				|| !isNumeric(SecondSide.getText())
				|| !isNumeric(ThirdSide.getText())));

		double iFirstSide = Double.parseDouble(FirstSide.getText());
		double iSecondSide = Double.parseDouble(SecondSide.getText());
		double iThirdSide = Double.parseDouble(ThirdSide.getText());

		//get min,mid and max side
		double maxSide = Math.max(iFirstSide,Math.max(iSecondSide,iThirdSide));
		double minSide = Math.min(iFirstSide,Math.min(iSecondSide,iThirdSide));
		double midSide = (iFirstSide+iSecondSide+iThirdSide)-(maxSide+minSide);

		System.out.println("Enter the length of the first side: "+ iFirstSide);
		System.out.println("Enter the length of the second side: "+ iSecondSide);
		System.out.println("Enter the length of the third side: "+ iThirdSide);

		//calculate: In a right triangle, the square of the length of one side is equal to the sum of the squares of the lengths of the other two sides.
		if(minSide*minSide + midSide*midSide == maxSide*maxSide)
			System.out.println("It is a right triangle.");
		else
			System.out.println("It is not a right triangle.");

   }
}