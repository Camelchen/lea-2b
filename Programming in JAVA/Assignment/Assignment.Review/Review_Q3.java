
import javax.swing.*;


public class Review_Q3
{

   public static void main(String[] args)
   {
	   String input = JOptionPane.showInputDialog("Enter a password.");
   
	   boolean hasUpperCase = false;
	   boolean hasLowerCase = false;
	   boolean hasDigit = false;
	   for (char c : input.toCharArray())
	   {
		   if (Character.isUpperCase(c))
			   hasUpperCase = true;
		   if (Character.isLowerCase(c))
			   hasLowerCase = true;
		   if (Character.isDigit(c))
			   hasDigit = true;
	   }
	   
	   if (hasUpperCase && hasLowerCase && hasDigit && input.length()>=6)
		   JOptionPane.showMessageDialog(null,"Valid passowrd");
	   else 
		   JOptionPane.showMessageDialog(null,"Invalid passowrd");
   }
}