public class Lv01_Program07 {
    public static void main(String[] args) {
        double radiusKm = 6378; // Radius of Earth in km
        double kmToMiles = 0.621371; // Conversion factor

        // Volume formula: (4/3) * pi * r^3
        double volumeKm3 = (4.0 / 3) * Math.PI * Math.pow(radiusKm, 3);
        double volumeMiles3 = volumeKm3 * Math.pow(kmToMiles, 3);

        System.out.println("The volume of Earth in cubic kilometers is " + volumeKm3 + 
                           " and cubic miles is " + volumeMiles3);
    }
}
