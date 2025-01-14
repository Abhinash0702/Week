import java.util.Scanner;

public class Lv01_Problem04_SumOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input the number
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Check if it's a natural number
        if (number >= 0) {
            // Calculate the sum using formula
            int sum = number * (number + 1) / 2;
            System.out.println("The sum of " + number + " natural numbers is " + sum);
        } else {
            System.out.println("The number " + number + " is not a natural number.");
        }

        // Close the scanner
        input.close();
    }
}
