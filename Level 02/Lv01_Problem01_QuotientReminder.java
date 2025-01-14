import java.util.Scanner;

public class Lv01_Problem01_QuotientReminder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int number1 = input.nextInt();

        System.out.print("Enter the second number: ");
        int number2 = input.nextInt();

        int quotient = number1 / number2; // Calculate quotient
        int remainder = number1 % number2; // Calculate remainder

        System.out.println("The Quotient is " + quotient + " and Reminder is " + remainder + 
                           " of two numbers " + number1 + " and " + number2);

        input.close();
    }
}
