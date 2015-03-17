import java.io.File;
import java.io.IOException;
import java.text.DecimalFormat;

public class Simple
{
	public static void main (String []args) throws IOException
	{
		double score;
		
		
		score = 0.15;

		DecimalFormat formatter = new DecimalFormat("#0%");
		System.out.println(formatter.format(score));


		System.out.println("Zhuorui");
		System.out.println(15.0/100);
		System.out.println(score>5?"number = 10":"number = 5");



	}
}
