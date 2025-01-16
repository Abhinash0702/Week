import java.util.Scanner;

public class Lv01_Program02_MaxHandshakes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numberOfStudents = input.nextInt();

        int handshakes = calculateHandshakes(numberOfStudents);
        System.out.println("The maximum number of possible handshakes is: " + handshakes);
        input.close();
    }

    public static int calculateHandshakes(int n) {
        return (n * (n - 1)) / 2;
    }
}
