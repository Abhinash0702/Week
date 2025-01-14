import java.util.Scanner;

public class Lv01_Problem13_SumNaturalNumbersForLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input the number
        System.out.print("Enter a number: ");
        int n = input.nextInt();

        // Check if it's a natural number
        if (n >= 0) {
            int sum = 0;

            // Calculate sum using for loop
            for (int i = 1; i <= n; i++) {
                sum += i;
            }

            // Compare with formula
            int formulaSum = n * (n + 1) / 2;
            System.out.println("Sum using for loop: " + sum);
            System.out.println("Sum using formula: " + formulaSum);
            System.out.println("The results match: " + (sum == formulaSum));
        } else {
            System.out.println("The number " + n + " is not a natural number.");
        }

        // Close the scanner
        input.close();
    }
}
