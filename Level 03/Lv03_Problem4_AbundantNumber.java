import java.util.Scanner;

public class Lv03_Problem4_AbundantNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input number from the user
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Initialize sum of divisors
        int sum = 0;

        // Find divisors of the number and calculate their sum
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;  // Add divisor to sum
            }
        }

        // Check if the number is abundant
        if (sum > number) {
            System.out.println(number + " is an Abundant Number.");
        } else {
            System.out.println(number + " is not an Abundant Number.");
        }

        input.close();
    }
}
