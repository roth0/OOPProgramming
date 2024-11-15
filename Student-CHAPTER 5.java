package studentsaveragemarks; 

public class Student { // Declares the public class Student
    private String name; // Declares a private field to store the student's name
    private double mark1, mark2, mark3; // Declares private fields to store three marks for the student

    // Constructor to initialize student data
    public Student(String name, double mark1, double mark2, double mark3) { // Constructor to set initial values for the student's name and marks
        this.name = name; // Sets the student's name
        this.mark1 = mark1; // Sets the first mark
        this.mark2 = mark2; // Sets the second mark
        this.mark3 = mark3; // Sets the third mark
    }

    // Method to calculate the average of three marks
    public double calculateAverage() { // Method to calculate and return the average of the marks
        return (mark1 + mark2 + mark3) / 3; // Calculates the average and returns it
    }

    // Getter for student name
    public String getName() { // Method to retrieve the student's name
        return name; // Returns the student's name
    }
}
