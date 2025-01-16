import java.util.Scanner;

public class Lv03_Problem06_CalculatorUsingSwitchCase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input first number, operator, and second number
        System.out.print("Enter first number: ");
        double first = input.nextDouble();
        System.out.print("Enter operator (+, -, *, /): ");
        String op = input.next();
        System.out.print("Enter second number: ");
        double second = input.nextDouble();

        // Perform the operation using switch-case
        double result = 0;
        switch (op) {
            case "+":
                result = first + second;
                break;
            case "-":
                result = first - second;
                break;
            case "*":
                result = first * second;
                break;
            case "/":
                if (second != 0) {
                    result = first / second;
                } else {
                    System.out.println("Division by zero is not allowed.");
                    input.close();
                    return;
                }
                break;
            default:
                System.out.println("Invalid Operator.");
                input.close();
                return;
        }

        // Display the result
        System.out.println("Result: " + result);

        input.close();
    }
}
