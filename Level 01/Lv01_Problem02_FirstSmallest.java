import java.util.Scanner;

public class Lv01_Problem02_FirstSmallest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take user input for three numbers
        System.out.print("Enter the first number: ");
        int number1 = input.nextInt();
        System.out.print("Enter the second number: ");
        int number2 = input.nextInt();
        System.out.print("Enter the third number: ");
        int number3 = input.nextInt();

        // Check if the first number is the smallest
        boolean isFirstSmallest = number1< number2 && number1< number3;

        // Output the result
        System.out.println("Is the first number the smallest? " + isFirstSmallest);

        // Close the scanner
        input.close();
    }
}
