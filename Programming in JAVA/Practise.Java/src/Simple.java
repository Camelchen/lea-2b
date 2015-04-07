
import java.io.*;
import java.util.*;


public class Simple
{
	public static void main (String []args) throws IOException
	{
		
		String s = "Today is the last week01234567890123456789!";
		s.substring(6, 20);
		System.out.println(s);
		
		StringTokenizer strTokenizer = new StringTokenizer("/data/user/root","/");
		System.out.println(strTokenizer.nextToken());
		System.out.println(strTokenizer.nextToken());
		System.out.println(strTokenizer.nextToken());
	}
}
