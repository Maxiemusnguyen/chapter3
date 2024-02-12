import java.util.Scanner;

public class CarInsuranceCalculator {
    public static void main(String[] args) {
        final int BASE_COST = 300;
        final int AGE_SURCHARGE = 100;
        final int[] ACCIDENT_SURCHARGES = {0, 100, 150, 250, 1000};
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);
        // Prompt user to enter driver's age
        System.out.print("Enter driver's age: ");
        int age = scanner.nextInt();
        // Prompt user to enter number of accidents
        System.out.print("Enter number of accidents: ");
        int accidents = scanner.nextInt();
        // Close the scanner
        scanner.close();
        // Calculate base insurance cost
        int insuranceCost = BASE_COST;
        // Apply age surcharge if driver is below 27
        if (age < 27) {
            insuranceCost += AGE_SURCHARGE;
        }
        // Apply accident surcharge
        if (accidents >= 1 && accidents <= 4) {
            insuranceCost += ACCIDENT_SURCHARGES[accidents];
        } else if (accidents >= 5) {
            insuranceCost += ACCIDENT_SURCHARGES[4]; // Apply maximum surcharge for 4 or more accidents
        }
        // Print the total insurance cost
        System.out.println("The total insurance cost is: $" + insuranceCost);
    }
}
