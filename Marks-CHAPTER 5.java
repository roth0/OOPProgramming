package usergrade;

import java.util.Scanner;

public class Marks {
    
    // Method to accept marks from the user
    public static void acceptMarks(int[] marks) {
        Scanner read = new Scanner(System.in);
        for (int i = 0; i < marks.length; i++) {
            System.out.print("Enter mark " + (i + 1) + " (0-100): ");
            marks[i] = read.nextInt();

            // Validate input
            while (marks[i] < 0 || marks[i] > 100) {
                System.out.print("Invalid input. Enter mark " + (i + 1) + " (0-100): ");
                marks[i] = read.nextInt();
            }
        }
    }
}
