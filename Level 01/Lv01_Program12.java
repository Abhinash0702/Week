import java.util.Scanner;

public class Lv01_Program12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the base of the triangle (in cm): ");
        double base = input.nextDouble(); // Base of triangle

        System.out.print("Enter the height of the triangle (in cm): ");
        double height = input.nextDouble(); // Height of triangle

        double area = 0.5 * base * height; // Calculate area

        System.out.println("The area of the triangle is " + area + " square cm.");
    }
}
