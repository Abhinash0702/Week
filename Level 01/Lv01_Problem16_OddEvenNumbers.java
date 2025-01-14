import java.util.Scanner;

public class Lv01_Problem16_OddEvenNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input the number
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Check if it's a natural number
        if (number > 0) {
            System.out.println("Odd and even numbers between 1 and " + number + ":");

            // Iterate from 1 to the number
            for (int i = 1; i <= number; i++) {
                if (i % 2 == 0) {
                    System.out.println(i + " is an even number.");
                } else {
                    System.out.println(i + " is an odd number.");
                }
            }
        } else {
            System.out.println("The number " + number + " is not a natural number.");
        }

        // Close the scanner
        input.close();
    }
}
