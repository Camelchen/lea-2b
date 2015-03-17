import java.util.Scanner;

public class ProgrammingJava_Assignment4_Q6 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int largest = -999;
		int smallest = 999;	
		int inputNum = 0;
		

		do {
			if (inputNum == -99)
			{
				System.out.print("[ First number cannot input -99 ]\n");				
			}				
			System.out.print("Enter an integer, or -99 to quit: ");
			inputNum = input.nextInt();		
		}
		while (inputNum ==-99);
		

		while (inputNum != -99)
		{
			largest = Math.max(largest, inputNum);
			smallest = Math.min(smallest, inputNum);
			
			System.out.print("Enter an integer, or -99 to quit: ");
			inputNum = input.nextInt();
		}	

		if (largest!=-999 && smallest!=999)
		{
			System.out.println("Largest: "+largest);
			System.out.println("Smallest: "+smallest);
		}
		
		input.close();

	}
}