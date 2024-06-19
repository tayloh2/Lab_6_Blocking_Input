import java.util.Scanner;

public class RectangleInfo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double rectangleWidth = 0.0;
        double rectangleHeight = 0.0;
        double rectangleArea = 0.0;
        double rectanglePerimeter = 0.0;
        double rectangleDiagonal = 0.0;
        boolean done = false;
        do {
            System.out.println("What is the width of the rectangle?");
            if (in.hasNextDouble()) {
                rectangleWidth = in.nextDouble();
                done = true;
            } else {
                String trash = in.nextLine();
                System.out.println("You said that the width of the rectangle is " + trash);
                System.out.println("Please enter a valid input");
                done = false;
            }
            in.nextLine();
        } while (!done);
        done = false;
        do {
            System.out.println("What is the height of the rectangle?");
            if (in.hasNextDouble()) {
                rectangleHeight = in.nextDouble();
                done = true;
            } else {
                String trash = in.nextLine();
                System.out.println("You said that the height of the rectangle is " + trash);
                System.out.println("Please enter a valid input");
                done = false;
            }
            in.nextLine();
        } while (!done);

        rectangleArea = rectangleWidth * rectangleHeight;
        rectanglePerimeter = 2 * (rectangleWidth + rectangleHeight);
        rectangleDiagonal = Math.sqrt((rectangleWidth * rectangleWidth) + (rectangleHeight * rectangleHeight));

        System.out.println("The area of the rectangle is " + rectangleArea + " and the perimeter of the rectangle is " + rectanglePerimeter);
        System.out.println("The length of the rectangle's diagonal is " + rectangleDiagonal);
    }
}





