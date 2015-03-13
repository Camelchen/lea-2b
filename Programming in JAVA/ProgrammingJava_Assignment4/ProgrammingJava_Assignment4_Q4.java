import java.util.Scanner;
import javax.swing.*;
import java.math.*;
import java.lang.*;
import java.util.Random;


public class ProgrammingJava_Assignment4_Q4
{

   public static void main(String[] args)
   {


	   Scanner input = new Scanner(System.in);

	   Random ranNum = new Random();
	   int result = ranNum.nextInt(100);

	   int guess = 0;

	   System.out.print("\nEnter an integer greater than or equal to 0 and less than 100: ");
	   guess = input.nextInt();

	   while (guess != result)
		{

 		   if (guess > result)
			{
				System.out.println("Too high.");
				System.out.println("Guess again!");
			}
			else
			{
				System.out.println("Too low.");
				System.out.println("Guess again!");
			}

			System.out.print("\nEnter an integer greater than or equal to 0 and less than 100: ");
			guess = input.nextInt();

	  	 }

	   System.out.println("You guessed the correct number.");


   }
}