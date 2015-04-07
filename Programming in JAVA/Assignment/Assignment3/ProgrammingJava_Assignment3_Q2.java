
import java.util.Scanner;


public class ProgrammingJava_Assignment3_Q2
{

   public static void main(String[] args)
   {

	   Scanner input = new Scanner(System.in);
	   System.out.println("Enter a number: (integer,between 1 to 35)");
	   int number = input.nextInt();

	   if (number >= 10 && number <= 35)
	   	System.out.println(Character.toChars(number+55));
	   else
	   	System.out.println(number);

   }
}