import java.util.Scanner;
import javax.swing.*;
import java.math.*;
import java.lang.*;

public class ProgrammingJava_Assignment3_Q6
{

   public static void main(String[] args)
   {

	   System.out.print("Enter the customer's package: ");
	   Scanner input = new Scanner(System.in);
	   String typeOfPackage = input.next();

	   System.out.print("Enter the number of hours used: ");
	   input = new Scanner(System.in);
	   int usedHour = input.nextInt();


	   double baseCharge = 0;
	   double additionCharge = 0;

	   switch (typeOfPackage.toUpperCase()) {

		   case "A" :
		   				baseCharge = 9.95;
		   				additionCharge = (double)(usedHour - 10 )*2;
		   				break;
		   case "B" :	baseCharge = 13.95;
		   				additionCharge = (double)(usedHour - 20 )*1;
		   				break;
		   case "C" :	baseCharge = 19.95;

		   default	:	System.out.println("Invalid package input...");
	   }

   }
}