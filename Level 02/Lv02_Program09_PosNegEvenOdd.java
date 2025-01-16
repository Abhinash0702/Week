import java.util.Scanner;

public class Lv02_Program09_PosNegEvenOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = input.nextInt();
        }

        for (int i = 0; i < 5; i++) {
            if (isPositive(numbers[i])) {
                System.out.print(numbers[i] + " is positive and ");
                System.out.println(isEven(numbers[i]) ? "even." : "odd.");
            } else {
                System.out.println(numbers[i] + " is negative.");
            }
        }

        int comparison = compare(numbers[0], numbers[4]);
        if (comparison == 0) {
            System.out.println("First and last numbers are equal.");
        } else if (comparison > 0) {
            System.out.println("First number is greater than the last number.");
        } else {
            System.out.println("First number is less than the last number.");
        }

        input.close();
    }

    public static boolean isPositive(int number) {
        return number > 0;
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static int compare(int number1, int number2) {
        return Integer.compare(number1, number2);
    }
}
