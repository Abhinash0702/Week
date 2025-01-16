import java.util.Scanner;

public class Lv03_Program04_NumberChecker {

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

    // Method to reverse the digits array
    public static int[] reverseDigits(int[] digits) {
        int[] reversedDigits = new int[digits.length];
        int j = 0;
        for (int i = digits.length - 1; i >= 0; i--) {
            reversedDigits[j++] = digits[i];
        }
        return reversedDigits;
    }

    // Method to compare two arrays and check if they are equal
    public static boolean areArraysEqual(int[] array1, int[] array2) {
        if (array1.length != array2.length) {
            return false;
        }
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {
                return false;
            }
        }
        return true;
    }

    // Method to check if a number is a palindrome using the digits array
    public static boolean isPalindrome(int[] digits) {
        int[] reversedDigits = reverseDigits(digits);
        return areArraysEqual(digits, reversedDigits);
    }

    // Method to check if a number is a duck number using the digits array
    public static boolean isDuckNumber(int[] digits) {
        for (int digit : digits) {
            if (digit != 0) {
                return true; // If there is a non-zero digit, it's a Duck number
            }
        }
        return false; // If no non-zero digit is found, it's not a Duck number
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

        // Step 3: Check if the number is a palindrome
        if (isPalindrome(digits)) {
            System.out.println(number + " is a palindrome.");
        } else {
            System.out.println(number + " is not a palindrome.");
        }

        // Step 4: Check if the number is a Duck number
        if (isDuckNumber(digits)) {
            System.out.println(number + " is a Duck number.");
        } else {
            System.out.println(number + " is not a Duck number.");
        }

        // Step 5: Reverse the digits array and display it
        int[] reversedDigits = reverseDigits(digits);
        System.out.print("Reversed digits: ");
        for (int digit : reversedDigits) {
            System.out.print(digit);
        }
        System.out.println();

        // Closing scanner
        scanner.close();
    }
}
