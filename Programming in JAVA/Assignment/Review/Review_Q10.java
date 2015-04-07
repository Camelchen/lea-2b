import java.util.Scanner;

/**
 * Created by ContEd Student on 08/04/15.
 */
class Coin {

    String sideUp = "";

    public void Coin ()
    {
        sideUp = "heads";
    }

    public void toss ()
    {
        if (Math.round(Math.random())==1)
            sideUp = "heads";
        else
            sideUp = "tails";
    }

    public String getSideUp ()
    {
        toss();
        return sideUp;
    }

}

public class Review_Q10
{

    public static void main(String[] args)
    {
        Coin c = new Coin();
        int i = 1;
        System.out.println("The side initially facing up: tails");
        System.out.println("Now I will toss the coin 20 times");
        while (i<=20) {
            System.out.println("Toss#" + i + ":  " + c.getSideUp());
            i++;
        }

    }
}