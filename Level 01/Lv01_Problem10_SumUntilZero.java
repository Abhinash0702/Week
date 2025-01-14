import java.util.Scanner;

public class Lv01_Problem10_SumUntilZero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Initialize variables
        double total = 0.0;

        // Loop until the user enters 0
        while (true) {
            System.out.print("Enter a number (0 to stop): ");
            double value = input.nextDouble();

            if (value == 0) {
                break;
            }
            total += value;
        }

        // Print the total sum
        System.out.println("The total sum is: " + total);

        // Close the scanner
        input.close();
    }
}
