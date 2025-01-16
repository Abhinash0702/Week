// Program to store multiple values in an array up to a maximum of 10 or until the user enters a 0 or negative number, and calculate their sum
import java.util.Scanner;

public class Lv01_Problem04_ArraySumAndDisplay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Declare variables
        double[] numbers = new double[10];
        double total = 0.0;
        int index = 0;

        System.out.println("Enter up to 10 numbers (enter 0 or a negative number to stop):");

        // Infinite loop to accept numbers from the user
        while (true) {
            System.out.print("Enter a number: ");
            double number = scanner.nextDouble();

            // Break if the user enters 0 or a negative number
            if (number <= 0 || index == 10) {
                break;
            }

            // Add the number to the array and increment index
            numbers[index] = number;
            index++;
        }

        // Calculate the total sum
        for (int i = 0; i < index; i++) {
            total += numbers[i];
        }

        // Display all numbers entered and the total sum
        System.out.println("\nNumbers entered:");
        for (int i = 0; i < index; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println("\nTotal sum of numbers: " + total);

        scanner.close();
    }
}
