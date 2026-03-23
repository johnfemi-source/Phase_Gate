//generate random numbers that subtrsct between 10 and 100
//set number of questions
//set number of attempts
//display question
//display correct when correct
//display wrong when incorrect
//calculate final score
//


import java.util.Random;
import java.util.Scanner;

public class ArithmeticApp{
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner input = new Scanner(System.in);

        int score = 0;
        int totalQuestions = 10;

        for (int count=1;count <= totalQuestions;count++){
            int num1 = rand.nextInt(91) + 10; 
            int num2 = rand.nextInt(num1) + 1;

            int correctAnswer = num1 - num2;
            int attempts = 2;

            System.out.println("\nQuestion " + count + ": " + num1 + " - " + num2 + " = ?");

            while (attempts > 0) {
                System.out.print("Your answer: ");

                    if (userAnswer == correctAnswer) {
                        System.out.println("Correct!");
                        score++;
                        break;
                    } else {
                        attempts--;
                        if (attempts > 0) {
                            System.out.println("Wrong! Try again (" + attempts + " attempt left).");
                        } else {
                            System.out.println("Out of attempts! Correct answer is " + correctAnswer);
                        }
                    }
                    System.out.println("Please enter a valid number.");
                }
            }
        System.out.println("Your score: " + score + "/" + totalQuestions);
    }
}





