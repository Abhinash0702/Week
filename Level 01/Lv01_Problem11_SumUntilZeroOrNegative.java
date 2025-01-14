import java.util.Scanner;

public class Lv01_Problem11_SumUntilZeroOrNegative {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Initialize variables
        double total = 0.0;

        // Infinite loop to get inputs
        while (true) {
            System.out.print("Enter a number (0 or negative to stop): ");
            double value = input.nextDouble();

            if (value <=0) {
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
