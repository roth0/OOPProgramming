package averagemarks;

import java.util.Scanner;

public class AverageMarks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get student details from the user
        System.out.print("Enter the student's name: ");
        String name = scanner.nextLine();

        System.out.print("Enter the student's ID: ");
        String id = scanner.nextLine();

        System.out.print("Enter the subject: ");
        String subject = scanner.nextLine();

        System.out.print("Enter the marks for Test 1 (/100): ");
        double test1 = scanner.nextDouble();

        System.out.print("Enter the marks for Test 2 (/100): ");
        double test2 = scanner.nextDouble();

        // Calculate the average mark
        double average = (test1 + test2) / 2;

        // Display the results
        System.out.println("\nStudent Information :");
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Subject: " + subject);
        System.out.println("Average Mark: " + average);

        // Close the scanner
        scanner.close();
    }
}
