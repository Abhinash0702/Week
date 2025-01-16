import java.util.Scanner;

public class Lv01_Program11_TrigonometricFunctions {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the angle in degrees: ");
        double angle = input.nextDouble();

        double[] trigonometricValues = calculateTrigonometricFunctions(angle);

        System.out.println("Sine: " + trigonometricValues[0]);
        System.out.println("Cosine: " + trigonometricValues[1]);
        System.out.println("Tangent: " + trigonometricValues[2]);
        input.close();
    }

    public static double[] calculateTrigonometricFunctions(double angle) {
        double[] result = new double[3];
        double radians = Math.toRadians(angle);
        result[0] = Math.sin(radians);
        result[1] = Math.cos(radians);
        result[2] = Math.tan(radians);
        return result;
    }
}
