import java.util.Scanner;

public class Lv03_Problem5_DayOfWeek {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input month, day, and year
        System.out.print("Enter month (1-12): ");
        int m = input.nextInt();
        System.out.print("Enter day: ");
        int d = input.nextInt();
        System.out.print("Enter year: ");
        int y = input.nextInt();

        // Calculate day of the week using the formula
        int y0 = y - (14 - m) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        int d0 = (d + x + 31 * m0 / 12) % 7;

        // Output the day of the week
        System.out.println("Day of the week: " + d0);

        input.close();
    }
}
