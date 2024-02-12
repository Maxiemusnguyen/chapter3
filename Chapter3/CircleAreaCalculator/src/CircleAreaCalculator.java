import java.util.Scanner;
public class CircleAreaCalculator {
    public static void main(String[] args) {
        // Create a Scanner
        Scanner scanner = new Scanner(System.in);
        // enter the radius of the circle
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();
        // Check if the entered radius is negative
        if (radius < 0) {
            System.out.println("Invalid Entry. The radius should be positive.");
            // Quit the program
            System.exit(0);
        }
        // Calculate the area of the circle
        double area = Math.PI * radius * radius;
        // Print the area of the circle
        System.out.println("The area of a circle with radius " + radius + " is " + area);
        // Close
        scanner.close();
    }
}
