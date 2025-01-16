import java.util.Scanner;

public class Lv02_Problem10_DigitFrequency {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // input for a number
        System.out.print("Enter a number: ");
        long number = input.nextLong();

        // Define an array to store digit frequencies
        int[] frequency = new int[10];

        // Find and count digits in the number
        while (number != 0) {
            int digit = (int) Math.abs(number % 10); //to get last digit
            frequency[digit]++;
            number /= 10; // Remove the last digit
        }

        // Display the frequency of each digit
        System.out.println("Frequency of each digit:");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + ": " + frequency[i]);
            }
        }

        input.close();
    }
}
