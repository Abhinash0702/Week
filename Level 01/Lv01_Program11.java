import java.util.Scanner;

public class Lv01_Program11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double number1 = input.nextDouble(); // First number

        System.out.print("Enter the second number: ");
        double number2 = input.nextDouble(); // Second number

        // Perform operations
        double addition = number1 + number2;
        double subtraction = number1 - number2;
        double multiplication = number1 * number2;
        double division = number1 / number2;

        // Display results
        System.out.println("The addition, subtraction, multiplication and division of " + 
                           number1 + " and " + number2 + " is " + 
                           addition + ", " + subtraction + ", " + multiplication + ", and " + division);
    }
}
