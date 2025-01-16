import java.util.Scanner;

public class Lv03_Problem01_ArmstrongNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input number from the user
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Initialize sum and originalNumber
        int sum = 0, originalNumber = number;

        // Use a while loop to process each digit
        while (number != 0) {
            int digit = number % 10;  // Get the last digit
            sum += digit * digit * digit;  // Add cube of the digit to sum
            number /= 10;  // Remove the last digit
        }

        // Check if the sum is equal to the original number
        if (sum == originalNumber) {
            System.out.println(originalNumber + " is an Armstrong Number.");
        } else {
            System.out.println(originalNumber + " is not an Armstrong Number.");
        }

        input.close();
    }
}
