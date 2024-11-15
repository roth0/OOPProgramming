package usergrade;

public class ResultDisplay {

    // Method to display results
    public static void displayResults(int[] gradeCount) {
        System.out.println("Out of 10:");
        System.out.println("Grade A: " + gradeCount[0]);
        System.out.println("Grade B: " + gradeCount[1]);
        System.out.println("Grade C: " + gradeCount[2]);
        System.out.println("Grade D: " + gradeCount[3]);
        System.out.println("Grade E: " + gradeCount[4]);
    }
}
