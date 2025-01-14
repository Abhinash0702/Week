import java.util.Scanner;

public class Lv01_Program13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the perimeter of the square: ");
        double perimeter = input.nextDouble(); // Perimeter of square

        double side = perimeter / 4; // Calculate side

        System.out.println("The length of the side is " + side + " whose perimeter is " + perimeter);
        sc.close();
    }
}
