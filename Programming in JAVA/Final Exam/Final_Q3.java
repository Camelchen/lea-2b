import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by ContEd Student on 09/04/15.
 */

public class Final_Q3 {

    public static double conversion(int convType,double givenValue){

        if (convType==1)    //feet to meter
            return givenValue*0.3098;
        if (convType==2)    //meter to feet
            return givenValue*3.280;

        return 0;
    }


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please choice conversion type:");
        System.out.println("\t1. feet to meter");
        System.out.println("\t2. meter to feet");

        int convType = input.nextInt();

        DecimalFormat f = new DecimalFormat("###.####");

        if (convType==1) {
            System.out.print("Please input feet number: ");
            int feet = input.nextInt();
            System.out.println(feet+" feet = "+ f.format(conversion(convType, feet)) + " meter.");
        }
        if (convType==2) {
            System.out.print("Please input meter number: ");
            int meter = input.nextInt();
            System.out.println(meter+" meter = "+ f.format(conversion(convType,meter)) + " feet.");
        }

    }

}

