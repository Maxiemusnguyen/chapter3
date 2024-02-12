import java.util.Scanner;

public class TrianglePerimeterCalculator {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter the lengths of the three edges of the triangle
        System.out.println("Enter the lengths of the three edges of the triangle:");
        System.out.print("Edge 1: ");
        double edge1 = scanner.nextDouble();
        System.out.print("Edge 2: ");
        double edge2 = scanner.nextDouble();
        System.out.print("Edge 3: ");
        double edge3 = scanner.nextDouble();

        // Close the scanner
        scanner.close();

        // Check if the input is valid
        if (isValidTriangle(edge1, edge2, edge3)) {
            // Calculate the perimeter
            double perimeter = edge1 + edge2 + edge3;
            System.out.println("The perimeter of the triangle is: " + perimeter);
        } else {
            System.out.println("Invalid input. The input lengths do not form a valid triangle.");
        }
    }

    // Method to check if the input lengths form a valid triangle
    private static boolean isValidTriangle(double edge1, double edge2, double edge3) {
        return (edge1 + edge2 > edge3) && (edge1 + edge3 > edge2) && (edge2 + edge3 > edge1);
    }
}
