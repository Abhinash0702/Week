import java.util.Scanner;

public class Lv01_Program08_RemainderAndQuotient {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the dividend: ");
        int number = input.nextInt();
        System.out.print("Enter the divisor: ");
        int divisor = input.nextInt();

        int[] result = findRemainderAndQuotient(number, divisor);
        System.out.println("Quotient: " + result[0] + ", Remainder: " + result[1]);
        input.close();
    }

    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int[] result = new int[2];
        result[0] = number / divisor; // Quotient
        result[1] = number % divisor; // Remainder
        return result;
    }
}
