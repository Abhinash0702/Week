// Program to find the multiplication table of a number from 6 to 9 and display the results
import java.util.Scanner;

public class Lv01_Problem05_MultiplicationTableFrom6To9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get input from the user
        System.out.print("Enter a number to generate its multiplication table from 6 to 9: ");
        int number = scanner.nextInt();

        // Define an array to store the multiplication results
        int[] multiplicationResults = new int[4];

        // Calculate and store multiplication results for 6 to 9
        for (int i = 6; i <= 9; i++) {
            multiplicationResults[i - 6] = number * i;
        }

        // Display the multiplication table
        System.out.println("Multiplication table of " + number + " from 6 to 9:");
        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + multiplicationResults[i - 6]);
        }

        scanner.close();
    }
}
