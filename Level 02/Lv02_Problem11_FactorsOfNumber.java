import java.util.Scanner;

public class Lv02_Problem11_FactorsOfNumber {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number to find its factors: ");
        int number = input.nextInt();

        // Print the factors of the number
        System.out.println("The factors of " + number + " are:");
        for (int i = 1; i <= number; i++) { // Loop from 1 to the number
            if (number % i == 0) { // Check if the number is perfectly divisible by i
                System.out.println(i); // Print the factor
            }
        }

        // Close the Scanner object
        input.close();
    }
}
