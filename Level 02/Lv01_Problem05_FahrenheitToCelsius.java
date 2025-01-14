import java.util.Scanner;

public class Lv01_Problem05_FahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the temperature in Fahrenheit: ");
        double fahrenheit = input.nextDouble();

        double celsius = (fahrenheit - 32) * 5 / 9; // Convert to Celsius

        System.out.println("The " + fahrenheit + " fahrenheit is " + celsius + " celsius.");

        input.close();
    }
}
