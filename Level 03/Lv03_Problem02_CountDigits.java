import java.util.Scanner;

public class Lv03_Problem02_CountDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input number from the user
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Initialize the count variable
        int count = 0;

        // Count digits using a while loop
        while (number != 0) {
            number /= 10;  // Remove the last digit
            count++;  // Increment the digit count
        }

        // Display the result
        System.out.println("The number has " + count + " digits.");

        input.close();
    }
}
