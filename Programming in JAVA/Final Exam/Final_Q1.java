import java.util.Scanner;

/**
 * Created by ContEd Student on 09/04/15.
 */

public class Final_Q1 {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the height: ");
        double height = input.nextDouble();
        System.out.print("Enter the width: ");
        double width = input.nextDouble();

        calculateArea(height,width);
    }

    private static void calculateArea(double height, double width) {

        System.out.println("The rectangle area is " + height * width);
    }

}

