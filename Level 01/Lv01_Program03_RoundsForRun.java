import java.util.Scanner;

public class Lv01_Program03_RoundsForRun {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the 3 sides of the triangular park (in meters): ");
        double side1 = input.nextDouble();
        double side2 = input.nextDouble();
        double side3 = input.nextDouble();

        double rounds = calculateRounds(side1, side2, side3);
        System.out.println("The number of rounds to complete a 5 km run is: " + rounds);
        input.close();
    }

    public static double calculateRounds(double side1, double side2, double side3) {
        double perimeter = side1 + side2 + side3;
        int distanceToRun = 5000; // 5 km in meters
		double a=distanceToRun/perimeter;
		System.out.println(a);
        return distanceToRun / perimeter;
    }
}
