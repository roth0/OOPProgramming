package studentsaveragemarks; 

import java.util.Scanner; // Imports the Scanner class for reading input

public class StudentsAverageMarks { // Declares the public class StudentsAverageMarks
    public static void main(String[] args) { // Main method where program execution starts
        Scanner read = new Scanner(System.in); // Creates a Scanner object to read input from the console
        
        // Create an array to store 3 students
        Student[] students = new Student[3]; // Initializes an array of Student objects to hold details for 3 students

        // Get marks for each student
        for (int i = 0; i < 3; i++) { // Loops through to get details for 3 students
            System.out.println("Enter details for student " + (i + 1) + ":"); // Prompts user for the current student's details
            System.out.print("Name: "); // Prompts user to enter the student's name
            String name = read.next(); // Reads the student's name from the console
            System.out.print("Mark 1: "); // Prompts user to enter the first mark
            double mark1 = read.nextDouble(); // Reads the first mark from the console
            System.out.print("Mark 2: "); // Prompts user to enter the second mark
            double mark2 = read.nextDouble(); // Reads the second mark from the console
            System.out.print("Mark 3: "); // Prompts user to enter the third mark
            double mark3 = read.nextDouble(); // Reads the third mark from the console
            
            // Create Student object and add it to the array
            students[i] = new Student(name, mark1, mark2, mark3); // Creates a new Student object with the entered details and stores it in the array
        }
        
        // Calculate and display the highest average
        Calculation calculation = new Calculation(); // Creates a Calculation object for performing calculations
        calculation.displayHighestAverage(students); // Calls method to calculate and display the highest average from the array of students
        
        read.close(); // Closes the Scanner object to release resources
    }
}
