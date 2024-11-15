package usergrade;

public class GradeCounter {

    // Method to determine grades and count them
    public static void countGrades(int[] marks, int[] gradeCount) {
        for (int mark : marks) {
            if (mark >= 85) {
                gradeCount[0]++;
            } else if (mark >= 70) {
                gradeCount[1]++;
            } else if (mark >= 55) {
                gradeCount[2]++;
            } else if (mark >= 40) {
                gradeCount[3]++;
            } else {
                gradeCount[4]++;
            }
        }
    }
}
