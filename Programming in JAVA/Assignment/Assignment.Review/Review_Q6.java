import java.util.Scanner;

public class Review_Q6
{

   public static void main(String[] args)
   {
	   Scanner input = new Scanner(System.in);
	   System.out.println("Enter something: ");
	   String s = input.nextLine();
	   StringBuilder output = new StringBuilder();
	   
	   for (int i=s.length()-1; i >= 0 ; i--)
	   {
		   output.append(s.charAt(i));		   
	   }
	   
		System.out.println("output: " + output.toString());
	   
	   input.close();
   }
}