import java.util.StringTokenizer;
import javax.swing.*;

public class Review_Q2
{

   public static void main(String[] args)
   {
	   String input = JOptionPane.showInputDialog("Enter a string.");
	   //Currently, only support Period
	   StringTokenizer phrase = new StringTokenizer(input.trim(),".!?",true);
	   StringBuilder output = new StringBuilder();
	   while (phrase.hasMoreTokens())
	   {
		   String pattern = phrase.nextToken().trim();
		   String init = pattern.substring(0,1).toUpperCase();
		   String tail = pattern.substring(1);
		   output.append(init).append(tail);
	   }
	   JOptionPane.showMessageDialog(null,output.toString());
   }
}