import java.util.Scanner;

public class Lv02_Program10_BMICalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[][] data = new double[10][3];
        String[] bmiStatuses = new String[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight of person " + (i + 1) + " (in kg): ");
            data[i][0] = input.nextDouble();
            System.out.print("Enter height of person " + (i + 1) + " (in cm): ");
            data[i][1] = input.nextDouble();
        } 

        calculateBMI(data);
        bmiStatuses = determineBMIStatus(data);

        System.out.println("Person | Weight (kg) | Height (cm) | BMI     | Status");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%6d | %11.2f | %11.2f | %7.2f | %s%n", i + 1, data[i][0], data[i][1], data[i][2], bmiStatuses[i]);
        }

        input.close();
    }

    public static void calculateBMI(double[][] data) {
        for (int i = 0; i < data.length; i++) {
            double heightInMeters = data[i][1] / 100.0;
            data[i][2] = data[i][0] / (heightInMeters * heightInMeters);
        }
    }

    public static String[] determineBMIStatus(double[][] data) {
        String[] statuses = new String[data.length];
        for (int i = 0; i < data.length; i++) {
            double bmi = data[i][2];
            if (bmi <= 18.4) {
                statuses[i] = "Underweight";
            } else if (bmi >= 18.5 && bmi <= 24.9) {
                statuses[i] = "Normal weight";
            } else if (bmi >=25.0 && bmi < 39.9) {
                statuses[i] = "Overweight";
            } else {
                statuses[i] = "Obese";
            }
        }
        return statuses;
    }
}
