import java.util.Scanner;

public class Lv03_Program08_CalendarDisplay {

    // Method to get the name of the month
    public static String getMonthName(int month) {
        String[] months = {"January", "February", "March", "April", "May", "June",
                            "July", "August", "September", "October", "November", "December"};
        return months[month - 1];
    }

    // Method to get the number of days in a month
    public static int getNumberOfDaysInMonth(int month, int year) {
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        // Check if it's a leap year and adjust February days
        if (month == 2 && isLeapYear(year)) {
            return 29;
        }
        return daysInMonth[month - 1];
    }

    // Method to check if a year is a leap year
    public static boolean isLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return true;
        }
        return false;
    }

    // Method to get the first day of the month using the Gregorian calendar algorithm
    public static int getFirstDayOfMonth(int month, int year) {
        // Apply Gregorian calendar algorithm
        int y0 = year - (14 - month) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = month + 12 * ((14 - month) / 12) - 2;
        int d0 = (1 + x + 31 * m0 / 12) % 7; // 1 represents the 1st day of the month

        return d0; // Return day of the week (0 = Sunday, 1 = Monday, ..., 6 = Saturday)
    }

    // Method to display the calendar for the given month and year
    public static void displayCalendar(int month, int year) {
        // Get the month name
        String monthName = getMonthName(month);
        
        // Get the number of days in the month
        int numberOfDays = getNumberOfDaysInMonth(month, year);
        
        // Get the first day of the month
        int firstDay = getFirstDayOfMonth(month, year);
        
        // Display the calendar header
        System.out.println("     " + monthName + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        // Print leading spaces for the first day
        for (int i = 0; i < firstDay; i++) {
            System.out.print("    ");
        }

        // Print the days of the month
        int day = 1;
        for (int i = firstDay; i < 7; i++) {
            System.out.printf("%3d ", day++);
        }
        System.out.println();

        // Print the remaining weeks
        for (int i = 2; day <= numberOfDays; i++) {
            for (int j = 0; j < 7 && day <= numberOfDays; j++) {
                System.out.printf("%3d ", day++);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Scanner object for taking input
        Scanner scanner = new Scanner(System.in);

        // Taking month and year as input from the user
        System.out.print("Enter month (1-12): ");
        int month = scanner.nextInt();
        System.out.print("Enter year: ");
        int year = scanner.nextInt();

        // Display the calendar for the given month and year
        displayCalendar(month, year);

        // Closing the scanner
        scanner.close();
    }
}
