import java.util.Scanner;

public class Lv01_Program04_CheckNumberType {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        int result = checkNumberType(number);
        System.out.println("The number is: " + (result == 1 ? "Positive" : (result == -1 ? "Negative" : "Zero")));
        input.close();
    }

    public static int checkNumberType(int number) {
        if (number > 0) {
            return 1; // Positive
        } else if (number < 0) {
            return -1; // Negative
        } else {
            return 0; // Zero
        }
    }
}
