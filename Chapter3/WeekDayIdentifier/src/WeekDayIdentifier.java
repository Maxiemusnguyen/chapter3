import java.util.Scanner;

public class WeekDayIdentifier {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);
        // Prompt user to enter the day of the week as an integer
        System.out.print("Enter the day of the week (1-7): ");
        int dayOfWeek = scanner.nextInt();
        // Close the scanner
        scanner.close();
        // Check the entered day of the week
        switch (dayOfWeek) {
            case 1:
                System.out.println("Weekday: Sunday");
                break;
            case 2:
                System.out.println("Weekday: Monday");
                break;
            case 3:
                System.out.println("Weekday: Tuesday");
                break;
            case 4:
                System.out.println("Weekday: Wednesday");
                break;
            case 5:
                System.out.println("Weekday: Thursday");
                break;
            case 6:
            case 7:
                System.out.println("Weekend");
                break;
            default:
                System.out.println("Invalid weekday");
        }
    }
}
