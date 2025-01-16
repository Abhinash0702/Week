import java.util.Scanner;

public class Lv02_Program01_Factors {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a positive number: ");
        int number = input.nextInt();
        if (number <= 0) {
            System.out.println("Please enter a valid positive number.");
            return;
        }

        int[] factors = findFactors(number);
        displayFactors(factors);

        System.out.println("Sum of factors: " + findSum(factors));
        System.out.println("Sum of squares of factors: " + findSumOfSquares(factors));
        System.out.println("Product of factors: " + findProduct(factors));

        input.close();
    }

    public static int[] findFactors(int number) {
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) count++;
        }

        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) factors[index++] = i;
        }
        return factors;
    }

    public static void displayFactors(int[] factors) {
        System.out.print("Factors: ");
        for (int factor : factors) {
            System.out.print(factor + " ");
        }
        System.out.println();
    }

    public static int findSum(int[] factors) {
        int sum = 0;
        for (int factor : factors) sum += factor;
        return sum;
    }

    public static int findSumOfSquares(int[] factors) {
        int sumOfSquares = 0;
        for (int factor : factors) sumOfSquares += factor * factor;
        return sumOfSquares;
    }

    public static long findProduct(int[] factors) {
        long product = 1;
        for (int factor : factors) product *= factor;
        return product;
    }
}
