import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * Created by ContEd Student on 09/04/15.
 */

public class Final_Qn_Bonus {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Please input a phrase: ");
        System.out.print("The reversed phrase is: " + reverseWordsInString(input.nextLine()));
    }

    private static String reverseWordsInString(String origin) {

        String result="";
        StringTokenizer ost = new StringTokenizer(origin.trim()," ",true);

        while (ost.hasMoreElements()) {

            result = ost.nextElement() + result;

        }

        return result;
    }

}

