import java.util.Scanner;

public class Lv01_Program09_DivideChocolates {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of chocolates: ");
        int numberOfChocolates = input.nextInt();
        System.out.print("Enter the number of children: ");
        int numberOfChildren = input.nextInt();

        int[] result = divideChocolates(numberOfChocolates, numberOfChildren);
        System.out.println("Each child gets: " + result[0] + " chocolates, Remaining: " + result[1]);
        input.close();
    }

    public static int[] divideChocolates(int numberOfChocolates, int numberOfChildren) {
        int[] result = new int[2];
        result[0] = numberOfChocolates / numberOfChildren; // Chocolates per child
        result[1] = numberOfChocolates % numberOfChildren; // Remaining chocolates
        return result;
    }
}
