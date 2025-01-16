import java.util.Scanner;

public class Lv01_Program10_WindChill {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the temperature (Fahrenheit): ");
        double temperature = input.nextDouble();
        System.out.print("Enter the wind speed (miles per hour): ");
        double windSpeed = input.nextDouble();

        double windChill = calculateWindChill(temperature, windSpeed);
        System.out.println("The wind chill temperature is: " + windChill);
        input.close();
    }

    public static double calculateWindChill(double temperature, double windSpeed) {
        return 35.74 + 0.6215 * temperature + (0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16);
    }
}
