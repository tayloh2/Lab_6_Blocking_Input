import java.util.Scanner;

public class FuelCosts {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double tankGallons = 0.0;
        double milesGallon = 0.0;
        double priceGallon = 0.0;
        double cost100Miles;
        double driveDistance;
        boolean done = false;
        do {
            System.out.println("How many gallons are in your tank?");
            if (in.hasNextDouble()) {
                tankGallons = in.nextDouble();
                done = true;
            } else {
                String trash = in.nextLine();
                System.out.println("You said that the number of gallons of gas in your car was " + trash);
                System.out.println("Please enter a valid number");
                done = false;
            }
            in.nextLine();
        } while (!done);
        done = false;
        do {
            System.out.println("What is your fuel efficiency in miles per gallon?");
            if (in.hasNextDouble()) {
                milesGallon = in.nextDouble();
                done = true;
            } else {
                String trash = in.nextLine();
                System.out.println("You said that your fuel efficiency was " + trash);
                System.out.println("Please enter a valid number");
            }
            in.nextLine();
        } while (!done);
        done = false;
        do {
            System.out.println("What is the price of gas per gallon?");
            if (in.hasNextDouble()) {
                priceGallon = in.nextDouble();
                done = true;
            } else {
                String trash = in.nextLine();
                System.out.println("You said that the price of gas per gallon is " + trash);
                System.out.println("Please enter a valid number");
            }
            in.nextLine();
        } while (!done);

        cost100Miles = (100 / milesGallon) * priceGallon;
        driveDistance = tankGallons * milesGallon;
        System.out.println("Your cost per 100 miles is " + cost100Miles);
        System.out.println("The distance you can travel is " + driveDistance);
        in.close();
    }
}
