import java.util.Scanner;

// This program Assignment-1.

public class ProgrammingJava_Assignment1
{
   public static void main(String[] args)
   {

	System.out.println("Question 1-a:\n");
	   //four println
	   System.out.println("In Java, a String literal is a sequence of characters inside a pair of ");
	   System.out.println("double quotation marks, such as \"Java is fun\". Java programmers should ");
	   System.out.println("understand the difference between \" and \\\" as well as the difference ");
	   System.out.println("between ' and \".\n");


	System.out.println("Question 1-b:\n");
	   //one println
	   System.out.println("In Java, a String literal is a sequence of characters inside a pair of \ndouble quotation marks, such as \"Java is fun\". Java programmers should \nunderstand the difference between \" and \\\" as well as the difference \nbetween ' and \".\n");


	System.out.println("Question 2-a:\n");
      //display * diamond
      for (int i=1;i<=7;i++) {
		  for (int j=1;j<=7;j++) {
			  if (j<=Math.abs(i-4)){
				  System.out.print(" ");
			  } else {
				  System.out.print("*");
				  if (j>=(7-Math.abs(i-4)))	{break;}
			  }
		  }
		  System.out.println("\n");
	  };

	//without break;
	System.out.println("Question 2-a:\n");
      //display * diamond
      for (int i=1;i<=7;i++) {
		  int j = 1;
		  while ( j<=(7-Math.abs(i-4)) && j<=7)  {
			  if (j<=Math.abs(i-4)) {System.out.print(" ");}
			  	else {System.out.print("*");}
				j=j+1;
		  }
		  System.out.println("\n");
	  };



	System.out.println("Question 2-b:\n");
      //display rocket
      System.out.println("   /\\");
      System.out.println("  /  \\");
      System.out.println(" /    \\");
      System.out.println("+------+");
      System.out.println("|      |");
      System.out.println("|  GO  |");
      System.out.println("+------+");
      System.out.println("|      |");
      System.out.println("| Java |");
      System.out.println("+------+");
      System.out.println("|      |");
      System.out.println("|  GO  |");
      System.out.println("+------+");
      System.out.println("   /\\");
      System.out.println("  //\\\\");
      System.out.println(" //  \\\\");


	System.out.println("Question 3:\n");
      //Data type, Variable, String Literals
      String studentName ="Joe Mahoney";
      int age = 26;
      double annualPay = 100000.0;
      System.out.println("My name is "+studentName+", My age is "+age+" and\nI hope to earn $"+annualPay+" per year.\n");


	System.out.println("Question 4:\n");
      //Data type, Variable, String Literals
      String NAME ="John Smith";
      String CITY ="Montreal";
      int AGE = 26;
      String COLLEGE = "Vanier";
      String PROFESSION = "Web Programming";
      String ANIMAL = "Mouse";
      String PETNAME = "Jerry";
      System.out.println("There once was a person named "+NAME+" who lived in "+CITY+". At the age of "+AGE+",  \n"+NAME+" went to college at "+COLLEGE+". "+NAME+" graduated and went to work as a  \n"+PROFESSION+". Then, "+NAME+" adopted a (n) "+ANIMAL+" named "+PETNAME+". They both\nlived happily ever after!\n");


	System.out.println("Question 5:\n");
      //Data type
      System.out.println("Enter the price ###.##:\n(0 = ignore input, default value = 248.75)");
      Scanner inPrice = new Scanner(System.in);
      double price = inPrice.nextDouble();

      if (price == 0) {price = 248.75;}
      	else { price = (double)Math.round(price*100)/100;};

      int dolPrice = (int)price;
      double cenPrice = (price-(int)price);

      System.out.println("The price is "+dolPrice+" dollars and "+Double.toString(price).substring(Double.toString(price).length()-2,Double.toString(price).length())+" cents.\n");


	System.out.println("Question 6:\n");
      //Data type
      System.out.println("Enter elapsed time:\n(0 = ignore input, default value = 9630)");
      Scanner inTime = new Scanner(System.in);
      int elapsedTime = inTime.nextInt();
      if (elapsedTime == 0) elapsedTime = 9630;
      int second = elapsedTime % 60;
      int minute = (int)elapsedTime/60 % 60;
      int hour = (int)elapsedTime/60/60 % 60;
      System.out.println("Output: "+hour+":"+minute+":"+second);
      System.out.println("");
   }
}
