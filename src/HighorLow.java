import java.util.Scanner;
import java.util.Random;

public class HighorLow {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random random = new Random();
        int userGuess = 0;
        int randomNumber = random.nextInt(10) + 1;
        System.out.println("Guess the number between 1 and 10.");
        do {
            while (!in.hasNextInt()) {
                System.out.println("Invalid. Please guess an integer between one and ten.");
                in.next();
            }
            userGuess = in.nextInt();
            if (userGuess < 1 && userGuess > 10) {
                System.out.println("Invalid. Please guess an integer between one and ten.");
            }
        } while (userGuess > 1 && userGuess > 10);
        if (userGuess < randomNumber) {
            System.out.println("Too low");
        } else if (userGuess > randomNumber) {
            System.out.println("Too high");
        } else {
            System.out.println("On the money");
        }
        System.out.println("The number is " + randomNumber);
        in.close();
    }
}
