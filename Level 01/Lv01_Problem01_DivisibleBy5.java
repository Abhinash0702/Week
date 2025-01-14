import java.util.Scanner;

public class Lv01_Problem01_DivisibleBy5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take user input for the number
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Check if the number is divisible by 5
        boolean isDivisible = number % 5 == 0;

        // Output the result
        System.out.println("Is the number " + number + " divisible by 5? " + isDivisible);

        // Close the scanner
        input.close();
    }
}
