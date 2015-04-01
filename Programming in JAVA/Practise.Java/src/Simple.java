
import java.io.*;
import java.util.*;


public class Simple
{
	public static void main (String []args) throws IOException
	{
		Random rand = new Random();
		int i = 0 ;
		while (i<100) {
			System.out.print(rand.nextInt(6)+1);
			i++;
		}

	}
}
