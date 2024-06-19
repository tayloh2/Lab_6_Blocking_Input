import java.util.Scanner;

public class CtoFConverter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double fTemp;
        double cTemp = 0.0;
        boolean done = false;
        do {
            System.out.println("Enter the temperature in C");
            if (in.hasNextDouble()) {
                cTemp = in.nextDouble();
                fTemp = (cTemp * 9 / 5) + 32;
                done = true;
                System.out.println("That temperature in F is " + fTemp);
            } else {
                String trash = in.nextLine();
                System.out.println("Your said that the temp was " + trash);
                System.out.println("Please enter a valid C temperature");
            }
            in.nextLine();
        } while (!done);

        in.close();
    }
}





