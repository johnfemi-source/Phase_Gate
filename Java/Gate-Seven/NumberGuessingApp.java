import java.util.Random;
import java.util.Scanner;

public class NumberGuessingApp {

    public static int generateNumber() {
        Random rand = new Random();
        return rand.nextInt(100) + 1;
    }

    public static int getUserGuess(Scanner scanner) {
        System.out.print("Enter your guess (1-100): ");
        int guess = scanner.nextInt(); 

        if (guess < 1 || guess > 100) {
            System.out.println("Number must be between 1 and 100.");
            return -1; 
        }

        return guess;
    }

    public static boolean checkGuess(int secret, int guess) {
        if (guess < secret) {
            System.out.println("Too low!");
            return false;
        } else if (guess > secret) {
            System.out.println("Too high!");
            return false;
        } else {
            System.out.println("Correct!");
            return true;
        }
    }
}
