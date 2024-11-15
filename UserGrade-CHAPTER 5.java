package usergrade;

public class UserGrade {

    public static void main(String[] args) {
        int[] marks = new int[10];
        int[] gradeCount = new int[5]; // Indexes: 0 - Grade A, 1 - Grade B, 2 - Grade C, 3 - Grade D, 4 - Grade E

        // Accept marks from the user
        Marks.acceptMarks(marks);

        // Determine grades and count them
        GradeCounter.countGrades(marks, gradeCount);

        // Display results
        ResultDisplay.displayResults(gradeCount);
    }
}
