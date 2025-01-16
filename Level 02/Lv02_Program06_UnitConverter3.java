public class Lv02_Program06_UnitConverter3 {

    // Convert Fahrenheit to Celsius
    public static double convertFahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    // Convert Celsius to Fahrenheit
    public static double convertCelsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    // Convert pounds to kilograms
    public static double convertPoundsToKilograms(double pounds) {
        return pounds * 0.453592;
    }

    // Convert kilograms to pounds
    public static double convertKilogramsToPounds(double kilograms) {
        return kilograms * 2.20462;
    }

    // Convert gallons to liters
    public static double convertGallonsToLiters(double gallons) {
        return gallons * 3.78541;
    }

    // Convert liters to gallons
    public static double convertLitersToGallons(double liters) {
        return liters * 0.264172;
    }

    public static void main(String[] args) {
        // Example usage of the UnitConverter class
        System.out.println("Fahrenheit to Celsius: " + convertFahrenheitToCelsius(98.6) + " °C");
        System.out.println("Celsius to Fahrenheit: " + convertCelsiusToFahrenheit(37.0) + " °F");
        System.out.println("Pounds to Kilograms: " + convertPoundsToKilograms(150) + " kg");
        System.out.println("Kilograms to Pounds: " + convertKilogramsToPounds(68) + " lbs");
        System.out.println("Gallons to Liters: " + convertGallonsToLiters(10) + " liters");
        System.out.println("Liters to Gallons: " + convertLitersToGallons(37.85) + " gallons");
    }
}
