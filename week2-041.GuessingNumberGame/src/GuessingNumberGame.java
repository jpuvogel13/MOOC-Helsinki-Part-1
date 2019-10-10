
import java.util.Random;
import java.util.Scanner;

public class GuessingNumberGame {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int numberDrawn = drawNumber();

        // program your solution here. Do not touch the above lines!

        System.out.println("Guess a number: ");
        int guess = Integer.parseInt(reader.nextLine());
        int counter = 0;
            while (true) {
                if (guess > numberDrawn) {
                    counter++;
                    System.out.println("The number is lesser, guesses made: " + counter);
                    System.out.println("Guess a number: ");
                    guess = Integer.parseInt(reader.nextLine());
                } else if (guess < numberDrawn) {
                    counter++;
                    System.out.println("The number is greater, guesses made: " + counter);
                    System.out.println("Guess a number: ");
                    guess = Integer.parseInt(reader.nextLine());
                } else {

                    System.out.println("Congratulations, your guess is correct");
                    break;
                }

            }
    }

    // DO NOT MODIFY THIS!
    private static int drawNumber() {
        return new Random().nextInt(101);
    }
}
