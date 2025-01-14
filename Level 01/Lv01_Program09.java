import java.util.Scanner;

public class Lv01_Program09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the course fee: ");
        double fee = input.nextDouble(); // User input for fee

        System.out.print("Enter the discount percentage: ");
        double discountPercent = input.nextDouble(); // User input for discount percentage

        double discount = (fee * discountPercent) / 100; // Calculate discount
        double discountedFee = fee - discount; // Calculate final fee after discount

        System.out.println("The discount amount is INR " + discount + 
                           " and the final discounted fee is INR " + discountedFee);
    }
}
