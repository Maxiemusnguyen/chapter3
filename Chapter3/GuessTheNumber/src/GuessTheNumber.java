import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        // Generate a random number between 0 and 10
        int randomNumber = (int) (Math.random() * 11); // Generate random number between 0 and 10
        // Create a Scanner object
        Scanner scanner = new Scanner(System.in);
        // Prompt user to guess the number
        System.out.print("Guess the number between 0 and 10: ");
        int userGuess = scanner.nextInt();
        // Check if user's guess matches the random number
        if (userGuess == randomNumber) {
            System.out.println("Hooray! You guessed the number.");
        } else {
            System.out.println("You Lost! The number was " + randomNumber + ".");
        }
        // Close
        scanner.close();
    }
}
