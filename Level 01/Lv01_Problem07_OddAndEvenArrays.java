// Program to save odd and even numbers into separate arrays
import java.util.Scanner;

public class Lv01_Problem07_OddAndEvenArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the number from the user
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();

        // Checking if the input is a natural number
        if (number <= 0) {
            System.out.println("Error: The number must be a positive integer.");
            scanner.close();
            return;
        }

        // Create arrays for odd and even numbers
        int[] oddNumbers = new int[(number / 2) + 1];
        int[] evenNumbers = new int[(number / 2) + 1];
        int oddIndex = 0, evenIndex = 0;

        // Separate odd and even numbers
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                evenNumbers[evenIndex] = i;
				evenIndex++;
				
            } 
			else {
                oddNumbers[oddIndex] = i;
				oddIndex++;
            }
        }

        // Display odd and even numbers
        System.out.print("Odd numbers: ");
        for (int i = 0; i < oddIndex; i++) {
            System.out.print(oddNumbers[i] + " ");
        }
        System.out.println();

        System.out.print("Even numbers: ");
        for (int i = 0; i < evenIndex; i++) {
            System.out.print(evenNumbers[i] + " ");
        }
        System.out.println();

        scanner.close();
    }
}
