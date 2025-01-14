public class Lv01_Program04 {
    public static void main(String[] args) {
        double costPrice = 129;  // Cost price in INR
        double sellingPrice = 191;  // Selling price in INR

        double profit = sellingPrice - costPrice; // Calculate profit
        double profitPercentage = (profit / costPrice) * 100; // Calculate profit percentage

        System.out.println("The Cost Price is INR " + costPrice + 
                           " and Selling Price is INR " + sellingPrice +
                           "\nThe Profit is INR " + profit + 
                           " and the Profit Percentage is " + profitPercentage + "%");
    }
}
