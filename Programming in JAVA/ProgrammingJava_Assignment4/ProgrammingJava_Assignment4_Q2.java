import java.util.Scanner;
import javax.swing.*;
import java.math.*;
import java.lang.*;

public class ProgrammingJava_Assignment4_Q2
{

   public static void main(String[] args)
   {
	   System.out.println("Enter two numbers.");
	   System.out.println("First number must be less than or equal to the second number you enter");

	   Scanner input = new Scanner(System.in);
	   System.out.print("Enter the first number: ");
	   int firstNum = input.nextInt();

	   System.out.print("Enter the second number: ");
	   int secondNum = input.nextInt();



	   if (firstNum <= secondNum)
	   	{
			System.out.println("Odd integers between "+firstNum+" and "+secondNum+" are:");

			int sum = 0;
			int i = firstNum;

			while(i<=secondNum)
			{
				if (i%2==0)
					sum=sum+i;
				else
					System.out.print(i+" ");
				i++;
			}

			System.out.println("\nSum of even integers between"+firstNum+" and "+secondNum+" = "+sum);


		}
		else
			System.out.println("Invalid,first number must be less than or equal to the second number");

   }
}