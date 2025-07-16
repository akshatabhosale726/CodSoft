package com.codSoft;
import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      Random random = new Random();
       int randomNo = random.nextInt(100) + 1; 
       int guess = 0;
       int attempts = 0;
       final int Max_Attempts = 10; 
       System.out.println("Hello,Welcome to the Number Guessing Game!");
       System.out.println("Number is choosen between 1 and 100.");
       System.out.println("You have maximum attempts: " + Max_Attempts);

       while (attempts < Max_Attempts) {
            System.out.print("Enter your guess: ");
            guess = sc.nextInt();
            attempts++;

            if (guess == randomNo) {
                System.out.println("Congratulations! You guessed the correct number!!You Win the game :) " + randomNo + " in " + attempts + " attempts.");
                
            } else if (guess < randomNo) {
                System.out.println("The number you guess is too low ): Try again.");
            } else {
                System.out.println("The number you guess is too high ): Try again.");
            }
        }

        if (attempts >= Max_Attempts && guess != randomNo) {
            System.out.println("Your attempts are over!! Bad Luck. The correct number was: " + randomNo);
        }

        sc.close();
    }

}