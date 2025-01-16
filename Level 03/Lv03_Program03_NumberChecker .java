import java.util.Scanner;

public class Lv03_Program03_NumberChecker {

    // Method to find the count of digits in the number
    public static int countDigits(int number) {
        int count = 0;
        while (number != 0) {
            number /= 10;
            count++;
        }
        return count;
    }

    // Method to store the digits of the number in a digits array
    public static int[] storeDigits(int number) {
        int digitCount = countDigits(number);
        int[] digits = new int[digitCount];
        for (int i = digitCount - 1; i >= 0; i--) {
            digits[i] = number % 10;
            number /= 10;
        }
        return digits;
    }

    // Method to find the sum of the digits of a number using the digits array
    public static int sumOfDigits(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += digit;
        }
        return sum;
    }

    // Method to find the sum of the squares of the digits of a number using the digits array
    public static double sumOfSquaresOfDigits(int[] digits) {
        double sum = 0;
        for (int digit : digits) {
            sum += Math.pow(digit, 2);
        }
        return sum;
    }

    // Method to check if the number is a Harshad number using the digits array
    public static boolean isHarshadNumber(int[] digits, int number) {
        int sumOfDigits = sumOfDigits(digits);
        return number % sumOfDigits == 0;
    }

    // Method to find the frequency of each digit in the number using a 2D array
    public static int[][] findDigitFrequency(int[] digits) {
        int[][] frequency = new int[10][2]; // 10 digits (0 to 9)
        for (int i = 0; i < 10; i++) {
            frequency[i][0] = i; // digit
            frequency[i][1] = 0; // initialize frequency to 0
        }

        for (int digit : digits) {
            frequency[digit][1]++; // increment the frequency count of the digit
        }

        // Filter out digits with zero frequency
        int nonZeroCount = 0;
        for (int i = 0; i < 10; i++) {
            if (frequency[i][1] > 0) {
                nonZeroCount++;
            }
        }

        // Create a new array to store the digits with non-zero frequency
        int[][] nonZeroFrequency = new int[nonZeroCount][2];
        int index = 0;
        for (int i = 0; i < 10; i++) {
            if (frequency[i][1] > 0) {
                nonZeroFrequency[index][0] = frequency[i][0];
                nonZeroFrequency[index][1] = frequency[i][1];
                index++;
            }
        }

        return nonZeroFrequency;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input number from user
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Step 1: Store digits in an array
        int[] digits = storeDigits(number);

        // Step 2: Count the number of digits
        int count = countDigits(number);
        System.out.println("Number of digits: " + count);

        // Step 3: Calculate sum of digits
        int sum = sumOfDigits(digits);
        System.out.println("Sum of digits: " + sum);

        // Step 4: Calculate sum of squares of digits
        double sumOfSquares = sumOfSquaresOfDigits(digits);
        System.out.println("Sum of squares of digits: " + sumOfSquares);

        // Step 5: Check if the number is a Harshad number
        if (isHarshadNumber(digits, number)) {
            System.out.println(number + " is a Harshad number.");
        } else {
            System.out.println(number + " is not a Harshad number.");
        }

        // Step 6: Find digit frequency
        int[][] digitFrequency = findDigitFrequency(digits);
        System.out.println("Digit frequencies:");
        for (int[] entry : digitFrequency) {
            System.out.println("Digit " + entry[0] + ": " + entry[1] + " times");
        }

        // Closing scanner
        scanner.close();
    }
}
