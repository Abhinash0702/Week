import java.util.Scanner;

public class Lv01_Problem18_MultiplicationTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input the number
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Print the multiplication table from 6 to 9
        System.out.println("Multiplication table of " + number + " from 6 to 9:");
        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + (number * i));
        }

        // Close the scanner
        input.close();
    }
}
