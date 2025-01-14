import java.util.Scanner;

public class Lv01_Problem04_CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the temperature in Celsius: ");
        double celsius = input.nextDouble();

        double fahrenheit = (celsius * 9 / 5) + 32; // Convert to Fahrenheit

        System.out.println("The " + celsius + " celsius is " + fahrenheit + " fahrenheit.");

        input.close();
    }
}    