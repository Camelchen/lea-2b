import java.util.Scanner;

class Circle {
	
	double radius;
	
	static final double PI = 3.14159;
	
	public Circle(double r)
	{
		radius = r;
	}
	
	public Circle()
	{
		radius = 0.0;
	}
	
	public void setRadius(double r)
	{
		radius = r;
	}
	
	public double getRadius ()
	{
		return radius;
	}
	
	public double getArea ()
	{
		return PI*radius*radius;
	}
	
	public double getDiameter ()
	{
		return radius*2;
	}
	
	public double getCircumference()
	{
		return 2*PI*radius;
	}

}

public class Assignment6_Q5 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the radius of a circle: ");
		Circle c = new Circle(input.nextDouble());
		
		System.out.printf("The circle's area is %.2f \n",c.getArea());
		System.out.printf("The circle's diameter is %.1f \n",c.getDiameter());
		System.out.printf("The circle's circumference is %.1f \n",c.getCircumference());

		
		input.close();
	}

}
