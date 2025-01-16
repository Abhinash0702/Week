import java.util.Scanner;

public class Lv03_Program02_NumberChecker {

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

    // Method to check if a number is a Duck number
    public static boolean isDuckNumber(int[] digits) {
        // A Duck number has at least one non-zero digit
        for (int digit : digits) {
            if (digit != 0) {
                return true;
            }
        }
        return false;
    }

    // Method to check if a number is an Armstrong number
    public static boolean isArmstrongNumber(int[] digits, int number) {
        int sum = 0;
        int numDigits = digits.length;
        for (int digit : digits) {
            sum += Math.pow(digit, numDigits);
        }
        return sum == number;
    }

    // Method to find the largest and second largest elements in the digits array
    public static int[] findLargestAndSecondLargest(int[] digits) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        
        for (int digit : digits) {
            if (digit > largest) {
                secondLargest = largest;
                largest = digit;
            } else if (digit > secondLargest && digit != largest) {
                secondLargest = digit;
            }
        }
        return new int[]{largest, secondLargest};
    }

    // Method to find the smallest and second smallest elements in the digits array
    public static int[] findSmallestAndSecondSmallest(int[] digits) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int digit : digits) {
            if (digit < smallest) {
                secondSmallest = smallest;
                smallest = digit;
            } else if (digit < secondSmallest && digit != smallest) {
                secondSmallest = digit;
            }
        }
        return new int[]{smallest, secondSmallest};
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

        // Step 3: Check if it's a Duck Number
        if (isDuckNumber(digits)) {
            System.out.println(number + " is a Duck number.");
        } else {
            System.out.println(number + " is not a Duck number.");
        }

        // Step 4: Check if it's an Armstrong Number
        if (isArmstrongNumber(digits, number)) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }

        // Step 5: Find largest and second largest digits
        int[] largestElements = findLargestAndSecondLargest(digits);
        System.out.println("Largest digit: " + largestElements[0]);
        System.out.println("Second largest digit: " + largestElements[1]);

        // Step 6: Find smallest and second smallest digits
        int[] smallestElements = findSmallestAndSecondSmallest(digits);
        System.out.println("Smallest digit: " + smallestElements[0]);
        System.out.println("Second smallest digit: " + smallestElements[1]);

        // Closing scanner
        scanner.close();
    }
}
