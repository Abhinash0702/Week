	// Program to find the factors of a number and store them in an array
import java.util.Scanner;

public class Lv01_Problem08_FactorsArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the number from the user
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();

        if (number <= 0) {
            System.out.println("Error: The number must be a positive integer.");
            scanner.close();
            return;
        }

        // Initialize variables for factors array
        int maxFactors = 10;
        int[] factors = new int[maxFactors];
        int factorIndex = 0;

        // Find factors
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
				
				// Resize array 
                if (factorIndex == maxFactors) {
                    
                    maxFactors *= 2;
                    int[] temp = new int[maxFactors];
                    System.arraycopy(factors, 0, temp, 0, factors.length);
                    factors = temp;
                }
                factors[factorIndex++] = i;
            }
        }

        // Display factors
        System.out.print("Factors of " + number + ": ");
        for (int i = 0; i < factorIndex; i++) {
            System.out.print(factors[i] + " ");
        }
        System.out.println();

        scanner.close();
    }
}