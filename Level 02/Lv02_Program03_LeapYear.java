import java.util.Scanner;

public class Lv02_Program03_LeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a year (>= 1582): ");
        int year = input.nextInt();
        if (year < 1582) {
            System.out.println("The LeapYear program only works for year >= 1582.");
            return;
        }

        boolean isLeap = checkLeapYear(year);
        System.out.println("The year " + year + " is " + (isLeap  +"a Leap Year." : "not a Leap Year."));

        input.close();
    }

    public static boolean checkLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
