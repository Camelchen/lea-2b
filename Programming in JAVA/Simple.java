import java.text.DecimalFormat;

public class Simple
{
	public static void main (String []args)
	{
		double score;

		score = 0.15;

		DecimalFormat formatter = new DecimalFormat("#0%");
		System.out.println(formatter.format(score));

		System.out.printf("#0%",score);


		System.out.println("Zhuorui");
		System.out.println(15.0/100);
		System.out.println(10>5?"number = 10":"number = 5");


		int hours = 40;
		//String hours = "Camel";
		System.out.printf("I worked %10d hours.\n", hours);
		//System.out.printf("I worked %s hours.\n", hours);


	}
}
