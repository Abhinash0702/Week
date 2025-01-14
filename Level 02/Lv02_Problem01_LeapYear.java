import java.util.Scanner;

public class Lv02_Problem01_LeapYear {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Prompt user to enter a year
        System.out.print("Enter a year (>= 1582): ");
        int year = input.nextInt();

        // Check for valid input year
        if (year < 1582) {
            System.out.println("The year must be 1582 or later.");
        } else {
            // Check Leap Year using multiple if-else statements
            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    if (year % 400 == 0) {
                        System.out.println("The year " + year + " is a Leap Year.");
                    } else {
                        System.out.println("The year " + year + " is not a Leap Year.");
                    }
                } else {
                    System.out.println("The year " + year + " is a Leap Year.");
                }
            } else {
                System.out.println("The year " + year + " is not a Leap Year.");
            }

            // Check Leap Year using a single if statement with logical operators
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                System.out.println("Using logical operators: The year " + year + " is a Leap Year.");
            } else {
                System.out.println("Using logical operators: The year " + year + " is not a Leap Year.");
            }
        }

        // Close the Scanner object
        input.close();
    }
}
