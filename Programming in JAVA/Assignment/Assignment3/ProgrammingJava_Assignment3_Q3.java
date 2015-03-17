
import java.util.Scanner;
import javax.swing.*;
import java.math.*;

public class ProgrammingJava_Assignment3_Q3
{

   public static void main(String[] args)
   {

	   Scanner input = new Scanner(System.in);

		int numerator;
		int denominator;
		String Operator;

	   do {
		   System.out.print("\nEnter numerator (integer):");
		   numerator = input.nextInt();

		   System.out.print("Enter denominator (integer) : ");
		   denominator = input.nextInt();

		   System.out.print("Enter Operator (+,-,*,/): ");
		   Operator = input.next();
	   }
	   while (!Operator.equals("+") && !Operator.equals("-") && !Operator.equals("*") && !Operator.equals("/"));

		try {

			double result = 0;

			//output
			switch(Operator) {
				case "+": result = numerator+denominator;
							break;
				case "-": result = numerator-denominator;
							break;
				case "*": result = numerator*denominator;
							break;
				case "/": result = numerator/denominator;
							break;
				}
			System.out.println("Output: "+ result);
		}
		catch (Exception  e) {

			JOptionPane.showMessageDialog(null,"Division by zero exception");
		}


   }
}