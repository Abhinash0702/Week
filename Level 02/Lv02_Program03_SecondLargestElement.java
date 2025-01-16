import java.util.Scanner;

public class Lv02_Program03_SecondLargestElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number
        System.out.println("Enter a positive integer:");
        int number = scanner.nextInt();

        // Check for non-positive input
        if (number <= 0) {
            System.out.println("Please enter a positive integer.");
            return;
        }

        // Define variables and array
        int maxDigit = 10;
        int[] digits = new int[maxDigit];
        int index = 0;

        // Extract digits from the number
        while (number != 0) {
            digits[index++] = number % 10; // Extract the last digit
            number /= 10;                 // Remove the last digit

            if (index == maxDigit) {      // Break if array is full
                System.out.println("Reached the maximum digit limit. Some digits may be ignored.");
                break;
            }
        }

        // Initialize variables for largest and second largest
        int largest = -1;
        int secondLargest = -1;

        // Loop through the digits to find the largest and second largest
        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        // Display the results
        if (index == 1) {
            System.out.println("Only one digit found. No second largest digit.");
        } else if (secondLargest == -1) {
            System.out.println("All digits are the same. No second largest digit.");
        } else {
            System.out.println("The largest digit is: " + largest);
            System.out.println("The second largest digit is: " + secondLargest);
        }

        scanner.close();
    }
}
