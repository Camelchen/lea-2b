import java.io.*;
import java.util.Scanner;

public class Circle {
	double radius;
	public static final double PI = 3.14;

	public void setRadius(double r) {
		this.radius = r;
	}

	public double getRadius() {
		return this.radius;
	}

	public double area() {
		return Math.pow(radius, 2) * PI;
	}

	public static void main(String[] args) throws IOException {

		Circle c = new Circle();

		Scanner input = new Scanner(System.in);

		System.out.print("radius: ");
		c.setRadius(input.nextDouble());
			
		System.out.println("area is : " + c.area());
		
		input.close();

	}
}
