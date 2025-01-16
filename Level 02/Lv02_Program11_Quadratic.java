import java.util.Scanner;

public class Lv02_Program11_Quadratic {

    // Method to calculate the roots of the quadratic equation
    public static double[] findRoots(double a, double b, double c) {
        // Calculate delta (discriminant)
        double delta = Math.pow(b, 2) - 4 * a * c;
        double[] roots = new double[2]; // Array to store roots

        if (delta > 0) {
            // Two distinct real roots
            roots[0] = (-b + Math.sqrt(delta)) / (2 * a);
            roots[1] = (-b - Math.sqrt(delta)) / (2 * a);
            return roots;
        } else if (delta == 0) {
            // One real root
            roots[0] = -b / (2 * a);
            return roots;
        } else {
            // No real roots, delta is negative
            return new double[0]; // Return empty array for complex roots
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input for coefficients a, b, c
        System.out.print("Enter coefficient a: ");
        double a = scanner.nextDouble();
        System.out.print("Enter coefficient b: ");
        double b = scanner.nextDouble();
        System.out.print("Enter coefficient c: ");
        double c = scanner.nextDouble();

        // Call method to find the roots
        double[] roots = findRoots(a, b, c);

        // Display the roots
        if (roots.length == 0) {
            System.out.println("The equation has no real roots.");
        } else if (roots.length == 1) {
            System.out.println("The equation has one root: " + roots[0]);
        } else {
            System.out.println("The equation has two roots: " + roots[0] + " and " + roots[1]);
        }

        scanner.close(); // Close the scanner object
    }
}
