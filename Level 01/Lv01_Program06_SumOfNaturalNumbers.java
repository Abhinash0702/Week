import java.util.Scanner;

public class Lv01_Program06_SumOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = input.nextInt();

        int sum = calculateSumOfNaturalNumbers(n);
        System.out.println("The sum of first " + n + " natural numbers is: " + sum);
        input.close();
    }

    public static int calculateSumOfNaturalNumbers(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
}
