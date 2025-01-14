import java.util.Scanner;

public class Lv01_Program16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numberOfStudents = input.nextInt(); // Number of students

        int handshakes = (numberOfStudents * (numberOfStudents - 1)) / 2; // Calculate handshakes

        System.out.println("The maximum number of possible handshakes is " + handshakes);
		input.close();
    }
}
