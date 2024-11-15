package interactiveage;

import java.util.Scanner;

public class InteractiveAge {
    public static void main(String[] args) {
        
        // Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the current year
        System.out.print("Enter the current year: ");
        int currentYear = scanner.nextInt();

        // Ask the user for their birth year
        System.out.print("Enter your birth year: ");
        int birthYear = scanner.nextInt();

        // Calculate the age
        int age = currentYear - birthYear;

        // Display the result
        System.out.println("Your age is: " + age);

        // Close the scanner
        scanner.close();
    }
}
