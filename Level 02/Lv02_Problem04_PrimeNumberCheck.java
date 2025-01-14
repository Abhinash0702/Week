import java.util.Scanner;

public class Lv02_Problem04_PrimeNumberCheck {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Prompt the user to input a number
        System.out.print("Enter a number to check if it is prime: ");
        int number = input.nextInt();

        // Variable to store the result of the prime check
        boolean isPrime = true;

        // Prime check: A prime number is greater than 1 and divisible only by 1 and itself
        if (number <= 1) {
            isPrime = false;  // Numbers less than or equal to 1 are not prime
        } else {
            // Loop through numbers from 2 to the number - 1
            for (int i = 2; i <= number / 2; i++) {
                if (number % i == 0) {
                    // If the number is divisible by any number other than 1 and itself, it is not prime
                    isPrime = false;
                    break;  // No need to check further, exit the loop
                }
            }
        }

        // Output the result
        if (isPrime) {
            System.out.println("The number " + number + " is a prime number.");
        } else {
            System.out.println("The number " + number + " is not a prime number.");
        }

        // Close the Scanner object
        input.close();
    }
}
