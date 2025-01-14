import java.util.Scanner;

public class Lv01_Program15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the unit price of the item: ");
        double unitPrice = input.nextDouble(); // Unit price

        System.out.print("Enter the quantity of items: ");
        int quantity = input.nextInt(); // Quantity

        double totalPrice = unitPrice * quantity; // Calculate total price

        System.out.println("The total purchase price is INR " + totalPrice + 
                           " if the quantity is " + quantity + " and unit price is INR " + unitPrice);
		input.close();
    }
}
