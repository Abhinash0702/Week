import java.util.Scanner;

public class Lv03_Problem3_HarshadNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input number from the user
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Initialize sum of digits
        int sum = 0, temp = number;

        // Compute sum of digits
        while (temp != 0) {
            sum += temp % 10;  // Add the last digit to sum
            temp /= 10;  // Remove the last digit
        }

        // Check if the number is divisible by the sum of digits
        if (number % sum == 0) {
            System.out.println(number + " is a Harshad Number.");
        } else {
            System.out.println(number + " is not a Harshad Number.");
        }

        input.close();
    }
}
