import java.util.Scanner;

public class Lv02_Problem11_SimpleInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the Principal amount (INR): ");
        double principal = input.nextDouble();

        System.out.print("Enter the Rate of Interest (%): ");
        double rate = input.nextDouble();

        System.out.print("Enter the Time (in years): ");
        double time = input.nextDouble();

        double simpleInterest = (principal * rate * time) / 100;

        System.out.println("The Simple Interest is INR " + simpleInterest +
                           " for Principal INR " + principal + ", Rate of Interest " + rate +
                           "% and Time " + time + " years.");

        input.close();
    }
}
