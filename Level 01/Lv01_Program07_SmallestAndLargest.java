import java.util.Scanner;

public class Lv01_Program07_SmallestAndLargest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter 3 numbers: ");
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        int number3 = input.nextInt();

        int[] result = findSmallestAndLargest(number1, number2, number3);
        System.out.println("Smallest: " + result[0] + ", Largest: " + result[1]);
        input.close();
    }

    public static int[] findSmallestAndLargest(int number1, int number2, int number3) {
        int[] result = new int[2];
        result[0] = Math.min(number1, Math.min(number2, number3));
        result[1] = Math.max(number1, Math.max(number2, number3));
        return result;
    }
}
