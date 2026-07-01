package Project1;

import java.util.Random;
import java.util.Scanner;

public class NumberGame {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        char playAgain;

        do {
            int randomNumber = random.nextInt(100) + 1; // 1 to 100
            int guess;
            int attempts = 0;

            System.out.println("\n===== NUMBER GUESSING GAME =====");
            System.out.println("Guess a number between 1 and 100");

            do {
                System.out.print("Enter your guess: ");
                guess = sc.nextInt();
                attempts++;

                if (guess > randomNumber) {
                    System.out.println("Too High!");
                } else if (guess < randomNumber) {
                    System.out.println("Too Low!");
                } else {
                    System.out.println("Correct! You guessed the number.");
                }

            } while (guess != randomNumber);

            System.out.println("Attempts: " + attempts);

            if (attempts <= 5)
                System.out.println("Score: Excellent!");
            else if (attempts <= 10)
                System.out.println("Score: Good!");
            else
                System.out.println("Score: Keep Practicing!");

            System.out.print("\nPlay Again? (Y/N): ");
            playAgain = sc.next().charAt(0);

        } while (playAgain == 'Y' || playAgain == 'y');

        System.out.println("Thank you for playing!");
        sc.close();
    }
}
