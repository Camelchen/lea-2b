import java.util.StringTokenizer;
import javax.swing.*;

public class Review_Q1
{

   public static void main(String[] args)
   {
	   String input = JOptionPane.showInputDialog("Enter a string.");
	   StringTokenizer output = new StringTokenizer(input.trim()," ");
	   JOptionPane.showMessageDialog(null,"That string has "+output.countTokens()+" words in it.");
   }
}