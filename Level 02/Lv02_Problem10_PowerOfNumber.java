import java.util.Scanner;

public class Lv02_Problem10_PowerOfNumber {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the number and the power
        System.out.print("Enter the base number: ");
        int number = input.nextInt();

        System.out.print("Enter the exponent (power): ");
        int power = input.nextInt();

        // Initialize the result variable with 1
        int result = 1;

        // Calculate the power using a loop
        for (int i = 1; i<= power; i++) {
            result *= number; // Multiply result by the number in each iteration
        }

        // Print the result
        System.out.println(number + " raised to the power of " + power + " is: " + result);

        // Close the Scanner object
        input.close();
    }
}
