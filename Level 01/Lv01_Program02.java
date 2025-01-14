public class Lv01_Program02 {
    public static void main(String[] args) {
        int maths = 94;     // Marks in Maths
        int physics = 95;   // Marks in Physics
        int chemistry = 96; // Marks in Chemistry

        int totalMarks = maths + physics + chemistry; // Total marks
        int subjects = 3; // Number of subjects
        double average = (double) totalMarks / subjects; // Calculate average

        System.out.println("Sam’s average mark in PCM is " + average);
    }
}
