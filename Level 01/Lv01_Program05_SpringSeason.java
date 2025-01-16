import java.util.Scanner;

public class Lv01_Program05_SpringSeason {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter month (1-12): ");
        int month = input.nextInt();
        System.out.print("Enter day (1-31): ");
        int day = input.nextInt();

        boolean isSpring = checkSpringSeason(month, day);
        System.out.println(isSpring ? "It's a Spring Season" : "Not a Spring Season");
        input.close();
    }

    public static boolean checkSpringSeason(int month, int day) {
        if (month > 3 && month < 6) {
            return true;
        } else if (month == 3 && day >= 20) {
            return true;
        } else if (month == 6 && day <= 20) {
            return true;
        }
        return false;
    }
}
