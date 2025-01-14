import java.util.Scanner;

public class Lv01_Program08{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the distance in kilometers: ");
        double km = input.nextDouble(); // User input for kilometers

        double conversionFactor = 1.6; // 1 km = 1.6 miles
        double miles = km * conversionFactor; // Convert to miles

        System.out.println("The total miles is " + miles + " mile for the given " + km + " km.");
    }
}
