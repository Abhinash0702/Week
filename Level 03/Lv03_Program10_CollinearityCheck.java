import java.util.Scanner;

public class Lv03_Program10_CollinearityCheck {

    // Method to check if three points are collinear using the area of the triangle formula
    public static boolean arePointsCollinear(double x1, double y1, double x2, double y2, double x3, double y3) {
        // Calculate the area of the triangle formed by points A(x1, y1), B(x2, y2), and C(x3, y3)
        double area = 0.5 * (x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));

        // If the area is zero, the points are collinear
        return area == 0;
    }

    public static void main(String[] args) {
        // Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Taking input for the coordinates of three points A(x1, y1), B(x2, y2), and C(x3, y3)
        System.out.print("Enter x1: ");
        double x1 = scanner.nextDouble();
        System.out.print("Enter y1: ");
        double y1 = scanner.nextDouble();
        
        System.out.print("Enter x2: ");
        double x2 = scanner.nextDouble();
        System.out.print("Enter y2: ");
        double y2 = scanner.nextDouble();
        
        System.out.print("Enter x3: ");
        double x3 = scanner.nextDouble();
        System.out.print("Enter y3: ");
        double y3 = scanner.nextDouble();

        // Check if the points are collinear
        if (arePointsCollinear(x1, y1, x2, y2, x3, y3)) {
            System.out.println("The points are collinear.");
        } else {
            System.out.println("The points are not collinear.");
        }

        // Close the scanner
        scanner.close();
    }
}
