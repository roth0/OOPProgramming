package studentsaveragemarks; 

public class Calculation { // Declares the public class Calculation

    // Method to display the highest average
    public void displayHighestAverage(Student[] students) { // Method to find and display the student with the highest average from an array of Student objects
        double highestAverage = 0; // Initializes a variable to keep track of the highest average found
        String topStudent = ""; // Initializes a variable to store the name of the student with the highest average

        for (Student student : students) { // Iterates over each Student object in the array
            double average = student.calculateAverage(); // Calculates the average marks for the current student
            // Display average with two decimal places
            System.out.printf("\n%s's average marks: %.2f%n", student.getName(), average); // Prints the student's name and average with two decimal places
            
            // Find the highest average
            if (average > highestAverage) { // Checks if the current student's average is higher than the current highest average
                highestAverage = average; // Updates the highest average
                topStudent = student.getName(); // Updates the name of the student with the highest average
            }
        }

        // Display the student with the highest average
        System.out.printf("\nThe student with the highest average is %s with an average of %.2f%n", topStudent, highestAverage); // Prints the name and average of the student with the highest average
    }
}
