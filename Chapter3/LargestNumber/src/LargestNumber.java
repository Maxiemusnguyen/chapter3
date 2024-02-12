import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        // Create a Scanner
        Scanner scanner = new Scanner(System.in);
        // enter the three integers
        System.out.print("Enter the first integer: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second integer: ");
        int num2 = scanner.nextInt();
        System.out.print("Enter the third integer: ");
        int num3 = scanner.nextInt();
        // Close the scanner
        scanner.close();
        // Find the largest number among the three
        int largest = num1;
        if (num2 > largest) {
            largest = num2;
        }
        if (num3 > largest) {
            largest = num3;
        }
        // Print the largest number
        System.out.println("The largest number is: " + largest);
    }
}
