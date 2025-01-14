import java.util.Scanner;

public class Lv01_Problem18_EmployeeBonus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input salary and years of service
        System.out.print("Enter the salary: ");
        double salary = input.nextDouble();
        System.out.print("Enter years of service: ");
        int yearsOfService = input.nextInt();

        // Calculate bonus
        if (yearsOfService > 5) {
            double bonus = salary * 0.05;
            System.out.println("The bonus is: " + bonus);
        } else {
            System.out.println("No bonus as years of service are less than or equal to 5.");
        }

        // Close the scanner
        input.close();
    }
}
