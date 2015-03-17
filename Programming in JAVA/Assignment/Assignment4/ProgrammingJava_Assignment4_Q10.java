import java.util.Scanner;
import java.io.*;


public class ProgrammingJava_Assignment4_Q10 {

	public static void main(String[] args) throws FileNotFoundException {

	
		Scanner input = new Scanner(System.in);
		System.out.print("Please input the length of each side of the square:(2~15) ");
		int length = input.nextInt();
		int i = length;
		int j = length;
		
		while (i>0)
		{
			while (j>0)
			{
				System.out.print("X");
				j--;
			}
			System.out.println();
			j = length;
			i--;
		}
		
		input.close();
	}
}