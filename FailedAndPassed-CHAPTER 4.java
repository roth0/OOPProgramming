package failedandpassed;

import java.util.Scanner;

public class FailedAndPassed {

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner passW = new Scanner(System.in);

        // Ask user to enter the number of students
        System.out.print("Enter the number of students: ");
        int numberOfStudents = passW.nextInt();

        // Check if the number of students is valid
        if (numberOfStudents <= 0) {
            System.out.println("Number of students must be greater than 0.");
            return; 
        }

        //  counters for passed and failed students
        int passedCount = 0;
        int failedCount = 0;

        // Loop through each student to get their marks
        for (int i = 0; i < numberOfStudents; i++) {
            // Ask user to enter the mark for the current student
            System.out.print("Enter mark for student " + (i + 1) + " (0-100): ");
            int mark = passW.nextInt();

            
            if (mark < 0 || mark > 100) {
                System.out.println("Invalid mark. Enter a value between 0 and 100.");
                i--; // Decrement index to re-enter the mark for this student
                continue; // Skip to the next iteration of the loop
            }

            // Increment the appropriate counter based on the mark
            if (mark >= 30) {
                passedCount++;
            } else {
                failedCount++;
            }
        }

        // Calculate the percentage of students who passed
        double passPercentage = (double) passedCount / numberOfStudents * 100;

        // Display the results
        System.out.println("\nNumber of students passed: " + passedCount);
        System.out.println("Number of students failed: " + failedCount);

        // Determine if the instructor receives a bonus based on pass percentage
        if (passPercentage > 50) {
            System.out.println("\nBonus to Instructor");
        } else {
            System.out.println("\nNo Bonus to Instructor");
        }

    }
}
