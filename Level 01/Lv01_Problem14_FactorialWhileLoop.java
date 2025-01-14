import java.util.Scanner;

public class Lv01_Problem14_FactorialWhileLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input the number
        System.out.print("Enter a number: ");
        int n = input.nextInt();

        // Check if the number is a positive integer
        if (n >= 0) {
            long factorial = 1;
            int i = 1;

            // Compute factorial using while loop
            while (i <= n) {
                factorial *= i;
                i++;
            }

            // Print the result
            System.out.println("The factorial of " + n + " is: " + factorial);
        } else {
            System.out.println("Factorial is not defined for negative numbers.");
        }

        // Close the scanner
        input.close();
    }
}
