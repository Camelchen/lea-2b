import java.util.Random;
import java.util.Scanner;

/**
 * Created by ContEd Student on 09/04/15.
 */

public class Final_Q4 {

    public static int question(){

        int p1,p2;
        Random r = new Random();

        p1 = r.nextInt(9) + 1;
        p2 = r.nextInt(9) + 1;

        System.out.print("How much is " + p1 + " times " + p2 + " ?  ");
        return p1*p2;
    }

    public static boolean check(int result, int input){
        if (result == input)
            return true;
        else
            return false;
    }


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        do {

            int result = question();

            while (!check(result, input.nextInt())) {
                System.out.print("No. Please try again.");
            }

            System.out.println("Correct. Very good!");
            System.out.print("Do you want to another multiplication question (yes or no) ?  ");

        }
        while (input.next().toLowerCase().equals("yes"));

        System.out.println("Goodbye!");
    }

}

