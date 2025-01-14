public class Lv01_Program05 {
    public static void main(String[] args) {
        int totalPens = 14;  // Total pens
        int students = 3;    // Number of students

        int pensPerStudent = totalPens / students; // Pens per student
        int remainingPens = totalPens % students;  // Remaining pens

        System.out.println("The Pen Per Student is " + pensPerStudent + 
                           " and the remaining pen not distributed is " + remainingPens);
    }
}
