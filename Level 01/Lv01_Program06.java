public class Lv01_Program06{
    public static void main(String[] args) {
        double fee = 125000; // Course fee in INR
        double discountPercent = 10; // Discount percentage

        double discount = (fee * discountPercent) / 100; // Calculate discount
        double discountedFee = fee - discount; // Calculate final fee after discount

        System.out.println("The discount amount is INR " + discount + 
                           " and final discounted fee is INR " + discountedFee);
    }
}
