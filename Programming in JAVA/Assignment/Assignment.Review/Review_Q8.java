import java.io.File;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.StringTokenizer;


public class Review_Q8
{

   @SuppressWarnings("resource")
public static void main(String[] args) throws FileNotFoundException
   {
	   String path = System.getProperty("user.dir")+"\\Review\\";
	   File file = new File(path+"SalesData.txt");
	   Scanner inputFile = new Scanner(file);
	   
	   DecimalFormat f = new DecimalFormat("'$',000.00");
	   double sumTotal = 0,maxSales = Double.MIN_VALUE,minSales = Double.MAX_VALUE;
	   int weekCount = 1,highestWeek = 1,lowestWeek = 1;
	
	   while (inputFile.hasNextLine())
	   {
		   StringTokenizer output = new StringTokenizer(inputFile.nextLine(),",");
		   
		   double sumWeekly = 0;
		   int dayCount = 0;
		   while (output.hasMoreTokens())
		   {
			   double daySales =  Double.parseDouble(output.nextToken());
			   dayCount++;
			   sumWeekly = sumWeekly + daySales;
			   if (maxSales < daySales)
			   {
				   highestWeek = weekCount;
				   maxSales = daySales;
			   }
			   if (minSales > daySales)
			   {
				   lowestWeek = weekCount;
				   minSales = daySales;
			   }
		   }
		   
		   System.out.println("Week #"+ weekCount + " sales: "+f.format(sumWeekly)+"\tAverage daily sales for week #"+weekCount+": "+ f.format(sumWeekly/dayCount));
		   sumTotal = sumTotal + sumWeekly;
		   weekCount ++;
	   }
	   
	   System.out.println("Total sales for all weeks: "+ f.format(sumTotal));
	   System.out.println("Average weekly sales: " + f.format(sumTotal/(weekCount-1)));
	   System.out.println("The highest sales were made during week #"+highestWeek);
	   System.out.println("The lowest sales were made during week #"+lowestWeek);
	   

   }
}