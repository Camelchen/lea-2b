import java.util.Scanner;
import javax.swing.*;
import java.math.*;
import java.lang.*;

public class ProgrammingJava_Assignment3_Q5
{

   public static void main(String[] args)
   {

	   Scanner input = new Scanner(System.in);

	   System.out.print("Enter test score #1: ");
	   double score1 = input.nextDouble();

	   System.out.print("Enter test score #2: ");
	   double score2 = input.nextDouble();

	   System.out.print("Enter test score #3: ");
	   double score3 = input.nextDouble();


	   double avgScore = (score1+score2+score3)/3;
	   System.out.println("Average score: "+ avgScore);

	   System.out.print("Letter grade:");
	   if (avgScore<60)
	   		System.out.println("F");
	   	else if (avgScore>=60 && avgScore <70)
	   		System.out.println("D");
	   	else if (avgScore>=70 && avgScore <80)
	   		System.out.println("C");
	   	else if (avgScore>=80 && avgScore <90)
	   		System.out.println("B");
	   	else if (avgScore>=90 && avgScore <= 100)
	   		System.out.println("A");

   }
}