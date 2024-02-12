import java.util.Scanner;

public class BMIcalculator {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter weight in pounds
        System.out.print("Enter your weight in pounds: ");
        double weightPounds = scanner.nextDouble();

        // Prompt user to enter height in inches
        System.out.print("Enter your height in inches: ");
        double heightInches = scanner.nextDouble();

        // Close the scanner
        scanner.close();

        // Convert weight from pounds to kilograms
        double weightKilograms = weightPounds * 0.4536;

        // Convert height from inches to meters
        double heightMeters = heightInches * 0.0254;

        // Calculate BMI
        double bmi = weightKilograms / (heightMeters * heightMeters);

        // Interpret BMI
        String interpretation;
        if (bmi < 18.5) {
            interpretation = "Underweight";
        } else if (bmi < 25.0) {
            interpretation = "Normal";
        } else if (bmi < 30.0) {
            interpretation = "Overweight";
        } else {
            interpretation = "Obese";
        }

        // Print BMI and interpretation
        System.out.println("Your BMI is: " + bmi);
        System.out.println("Interpretation: " + interpretation);
    }
}
