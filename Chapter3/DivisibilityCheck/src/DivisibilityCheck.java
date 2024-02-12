import java.util.Scanner;

public class DivisibilityCheck {
    public static void main(String[] args) {
        // Create a Scanner
        Scanner scanner = new Scanner(System.in);
        // Prompt user to enter a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        // Close the scanner
        scanner.close();
        // Check divisibility by 3 and 5
        if (number % 3 == 0 && number % 5 == 0) {
            System.out.println("The number is a multiple of 3 and a multiple of 5");
        } else if (number % 3 == 0 ^ number % 5 == 0) {
            System.out.println("The number is divisible by either 3 or 5 but not both.");
        } else {
            System.out.println("The number is not divisible by either 3 or 5.");
        }
    }
}
