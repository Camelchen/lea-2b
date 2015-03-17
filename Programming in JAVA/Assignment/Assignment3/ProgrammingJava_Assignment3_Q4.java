
import java.util.Scanner;


public class ProgrammingJava_Assignment3_Q4
{

   public static void main(String[] args)
   {

	   Scanner input = new Scanner(System.in);

	   int baseSalary ;
	   int numEmployeeYear ;
	   int amountSale ;
	   double monthSalary = 0;

	   System.out.print("Enter the base salary: ");
	   baseSalary = input.nextInt();

	   System.out.print("Enter the number of years the employee is with the company: ");
	   numEmployeeYear = input.nextInt();

	   System.out.print("Enter total sale amount for the month: ");
	   amountSale = input.nextInt();


	   //calculate
	   monthSalary = baseSalary;

	   if (numEmployeeYear <= 5)
	   		monthSalary = monthSalary + numEmployeeYear*10;
	   else
	   		monthSalary = monthSalary + numEmployeeYear*20;

	   if (amountSale >= 5000 && amountSale < 10000)
	   		monthSalary = monthSalary + amountSale*0.03;
	   else if (amountSale >= 10000)
	    	monthSalary = monthSalary + amountSale*0.06;

	   System.out.println("This month salary: " + monthSalary);


   }
}