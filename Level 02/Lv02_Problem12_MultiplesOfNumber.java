import java.util.Scanner;

public class Lv02_Problem12_MultiplesOfNumber {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number to find its multiples below 100: ");
        int number = input.nextInt();

        // Check for valid input
        if (number <= 0) {
            System.out.println("Please enter a positive number.");
        } else {
            System.out.println("The multiples of " + number + " below 100 are:");
            // Loop backward from 100 to 1
            for (int i = 100; i >= 1; i--) {
                if (i % number == 0) { // Check if i is a multiple of the number
                    System.out.println(i); // Print the multiple
                }
            }
        }

        // Close the Scanner object
        input.close();
    }
}
