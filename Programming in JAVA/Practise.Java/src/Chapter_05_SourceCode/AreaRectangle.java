package Chapter_05_SourceCode;

/**
   You must complete this program so it calculates
   and displays the area of a rectangle. 
*/

// Insert any necessary import statements here.

public class AreaRectangle
{
   public static void main(String[] args)
   {
      double length,    // The rectangle's length
             width,     // The rectangle's width
             area;      // The rectangle's area
   
      // Get the rectangle's length from the user.
      length = getLength();
   
      // Get the rectangle's width from the user.
      width = getWidth();

      // Get the rectangle's area.
      area = getArea(length, width);

      // Display the rectangle data.
      displayData(length, width, area);
   }

private static void displayData(double length, double width, double area) {
	// TODO Auto-generated method stub
	
}

private static double getArea(double length, double width) {
	// TODO Auto-generated method stub
	return 0;
}

private static double getWidth() {
	// TODO Auto-generated method stub
	return 0;
}

private static double getLength() {
	// TODO Auto-generated method stub
	
	return 0;
}
}

