import java.util.Scanner;

public class Lv02_Problem09_GreatestFactor {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Take user input for the number
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Define the greatestFactor variable and initialize it to 1
        int greatestFactor = 1;

        // Loop through from number - 1 to 1
        for (int i = number - 1; i >= 1; i--) {
            // Check if the number is divisible by i
            if (number % i == 0) {
                greatestFactor = i; // Assign the factor to greatestFactor
                break; // Exit the loop as the greatest factor is found
            }
        }

        // Display the greatest factor beside the number
        System.out.println("The greatest factor of " + number + " is " + greatestFactor);

        // Close the Scanner object
        input.close();
    }
}
