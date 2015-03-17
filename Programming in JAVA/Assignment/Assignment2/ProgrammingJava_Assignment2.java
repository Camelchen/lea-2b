// This program Assignment-2.
import java.util.Scanner;


public class ProgrammingJava_Assignment2
{

  public static void main(String[] args)
   {

		Scanner input = new Scanner(System.in);

	    System.out.println("Question 1:\n");
   		System.out.print("Enter a number: ");
   		double inputNum = input.nextDouble();
   		System.out.println("The power 4 of the entered number: " +String.format("%.4f",Math.pow(inputNum,4)));
   		System.out.println("Square root of the number is: " + String.format("%.4f",Math.sqrt(inputNum))+"\n");

	    System.out.println("Question 2:\n");
		//description
		System.out.println("a. prompt the user to input five decimal numbers\nb. print the five decimal numbers\nc. convert each decimal number to the nearest integer\nd. add the five integers\ne. print the sum and average of five integers\n");

		//input numbers
		double[] numbers = new double[6];
		for(int i=1;i<=5;i++)
		{
			if (i==1) {System.out.print("Enter "+i+"st number: ");}
				else if (i==2) {System.out.print("Enter "+i+"nd number: ");}
				else if (i==3) {System.out.print("Enter "+i+"rd number: ");}
				else if (i>3) {System.out.print("Enter "+i+"th number: ");}
			numbers[i] = input.nextDouble();
			System.out.println();
		}
		//calculate and print result
		int sumNumber = 0;
		int avgNumber = 0;
		System.out.println("\nUser given 5 numbers are: ");
		for(int i=1;i<=5;i++)
		{
			if (i==5) {System.out.print("and "+numbers[i]);}
				else	{System.out.print(numbers[i]+", ");}
			sumNumber = (int)Math.round(numbers[i])+sumNumber;
			avgNumber = Math.round(sumNumber / i);
		};
		System.out.println("\nThe sum of the 5 numbers is " +  sumNumber + " and the average is " + avgNumber);


	System.out.println("Question 3:\n");
		System.out.print("Enter the charge for the meal: ");
		double mealPrice = input.nextDouble();
		System.out.println("The total of the restaurant bill is: "+ String.format("%.2f",mealPrice*1.0675*1.15)+" $");
		System.out.println("The tax amount: "+String.format("%.2f",mealPrice*0.0675)+" $");
		System.out.println("The tip amount: "+String.format("%.2f",mealPrice*1.0675*0.15)+" $");
		System.out.println("\n");

	System.out.println("Question 4:\n");

		input = new Scanner(System.in);
		System.out.println("a. the number of characters in the city name\nb. the first character in the name of the city\nc. the name of the city in all uppercase letters\n");
		System.out.print("Enter your favorite city name: ");
		String cityName = input.nextLine();
		System.out.println("Number of characters in the user given city: " + cityName.length());
		System.out.println("The first character in the user given city is: "+ cityName.substring(0,1));
		System.out.println("The name of the city in all uppercase letters: "+cityName.toUpperCase()+"\n");

   }
}