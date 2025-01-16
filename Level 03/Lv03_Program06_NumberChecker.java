import java.util.Scanner;

public class Lv03_Program06_NumberChecker {

    // Method to find factors of a number and return them as an array
    public static int[] findFactors(int number) {
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }

        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index++] = i;
            }
        }

        return factors;
    }

    // Method to find the greatest factor of a number using the factors array
    public static int greatestFactor(int[] factors) {
        return factors[factors.length - 1]; // Greatest factor is the last element
    }

    // Method to find the sum of the factors using factors array
    public static int sumOfFactors(int[] factors) {
        int sum = 0;
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }

    // Method to find the product of the factors using factors array
    public static int productOfFactors(int[] factors) {
        int product = 1;
        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }

    // Method to find the product of the cube of the factors using the factors array
    public static double productOfCubesOfFactors(int[] factors) {
        double product = 1;
        for (int factor : factors) {
            product *= Math.pow(factor, 3);
        }
        return product;
    }

    // Method to check if a number is a perfect number
    public static boolean isPerfectNumber(int number) {
        int[] factors = findFactors(number);
        int sumOfProperDivisors = sumOfFactors(factors) - number;
        return sumOfProperDivisors == number;
    }

    // Method to check if a number is an abundant number
    public static boolean isAbundantNumber(int number) {
        int[] factors = findFactors(number);
        int sumOfProperDivisors = sumOfFactors(factors) - number;
        return sumOfProperDivisors > number;
    }

    // Method to check if a number is a deficient number
    public static boolean isDeficientNumber(int number) {
        int[] factors = findFactors(number);
        int sumOfProperDivisors = sumOfFactors(factors) - number;
        return sumOfProperDivisors < number;
    }

    // Method to check if a number is a strong number
    public static boolean isStrongNumber(int number) {
        int temp = number;
        int sumOfFactorials = 0;

        while (temp > 0) {
            int digit = temp % 10;
            sumOfFactorials += factorial(digit);
            temp /= 10;
        }

        return sumOfFactorials == number;
    }

    // Method to calculate the factorial of a number
    public static int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input number from user
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Find factors of the number
        int[] factors = findFactors(number);

        // Display results
        System.out.println("Factors of " + number + ": ");
        for (int factor : factors) {
            System.out.print(factor + " ");
        }
        System.out.println();

        // Find greatest factor
        System.out.println("Greatest factor of " + number + ": " + greatestFactor(factors));

        // Find sum of factors
        System.out.println("Sum of factors of " + number + ": " + sumOfFactors(factors));

        // Find product of factors
        System.out.println("Product of factors of " + number + ": " + productOfFactors(factors));

        // Find product of cube of factors
        System.out.println("Product of cubes of factors of " + number + ": " + productOfCubesOfFactors(factors));

        // Check if the number is a perfect number
        if (isPerfectNumber(number)) {
            System.out.println(number + " is a perfect number.");
        } else {
            System.out.println(number + " is not a perfect number.");
        }

        // Check if the number is an abundant number
        if (isAbundantNumber(number)) {
            System.out.println(number + " is an abundant number.");
        } else {
            System.out.println(number + " is not an abundant number.");
        }

        // Check if the number is a deficient number
        if (isDeficientNumber(number)) {
            System.out.println(number + " is a deficient number.");
        } else {
            System.out.println(number + " is not a deficient number.");
        }

        // Check if the number is a strong number
        if (isStrongNumber(number)) {
            System.out.println(number + " is a strong number.");
        } else {
            System.out.println(number + " is not a strong number.");
        }

        // Closing scanner
        scanner.close();
    }
}
