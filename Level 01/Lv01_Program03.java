public class Lv01_Program03 {
    public static void main(String[] args) {
        double kilometers = 10.8; // Distance in kilometers
        double conversionFactor = 1.6; // 1 kilometer = 1.6 miles

        double miles = kilometers * conversionFactor; // Convert to miles

        System.out.println("The distance " + kilometers + " km in miles is " + miles);
    }
}
