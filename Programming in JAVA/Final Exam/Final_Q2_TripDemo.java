import java.util.Scanner;

/**
 * Created by ContEd Student on 09/04/15.
 */

class Trip {
    int distance;
    double gas_price;
    double cost_hotel;

    Trip(int d,double gp,double ch){
        distance = d  ;
        gas_price = gp;
        cost_hotel = ch;
    }

    public boolean setDistance(int d) {

        if (d<=0) {
            System.out.println("Cannot input negative number.");
            return false;
        }
        else {
            distance = d;
            return true;
        }
    }

    public boolean setGas_price(double gp) {

        if (gp<=0) {
            System.out.println("Cannot input negative number.");
            return false;
        }
        else {
            gas_price = gp;
            return true;
        }
    }

    public boolean setCost_hotel(double ch) {

        if (ch<=0) {
            System.out.println("Cannot input negative number.");
            return false;
        }
        else {
            cost_hotel = ch;
            return true;
        }
    }

    public int getDistance() {return distance;}
    public double getGas_price() {return gas_price;}
    public double getCost_hotel() {return cost_hotel;}

    public double cost_trip(){
        return distance*gas_price+cost_hotel;
    }

}

public class Final_Q2_TripDemo {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //initialize myTrip, display it
        Trip myTrip = new Trip(15,3,10);
        System.out.println("My trip initialize cost is " + myTrip.cost_trip());

        //initialize yourTrip, display it
        Trip yourTrip = new Trip(25,5,60);
        System.out.println("Your trip initialize cost is " + yourTrip.cost_trip());

        System.out.println("\nYou can change your trip.");

        do {
            System.out.print("Enter the distance: ");
        }
        while (!yourTrip.setDistance(input.nextInt()));

        do {
            System.out.print("Enter the gas price: ");
        }
        while (!yourTrip.setGas_price(input.nextInt()));

        do {
            System.out.print("Enter the cost hotel: ");
        }
        while (!yourTrip.setCost_hotel(input.nextInt()));


        System.out.println("Your trip new cost is " + yourTrip.cost_trip());

    }

}

