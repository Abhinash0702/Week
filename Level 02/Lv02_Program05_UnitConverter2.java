public class Lv02_Program05_UnitConverter {

    // Convert yards to feet
    public static double convertYardsToFeet(double yards) {
        return yards * 3;
    }

    // Convert feet to yards
    public static double convertFeetToYards(double feet) {
        return feet * 0.333333;
    }

    // Convert meters to inches
    public static double convertMetersToInches(double meters) {
        return meters * 39.3701;
    }

    // Convert inches to meters
    public static double convertInchesToMeters(double inches) {
        return inches * 0.0254;
    }

    // Convert inches to centimeters
    public static double convertInchesToCentimeters(double inches) {
        return inches * 2.54;
    }

    public static void main(String[] args) {
        // Example usage of the UnitConverter class
        System.out.println("Yards to Feet: " + convertYardsToFeet(5) + " feet");
        System.out.println("Feet to Yards: " + convertFeetToYards(15) + " yards");
        System.out.println("Meters to Inches: " + convertMetersToInches(2) + " inches");
        System.out.println("Inches to Meters: " + convertInchesToMeters(78.74) + " meters");
        System.out.println("Inches to Centimeters: " + convertInchesToCentimeters(12) + " cm");
    }
}
