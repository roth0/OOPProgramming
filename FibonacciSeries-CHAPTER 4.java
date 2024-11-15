package fibonacciseries;  

import java.util.Scanner;  // Import the Scanner class for reading user input

public class FibonacciSeries {     
    public static void main(String[] args) {   // Create a Scanner object for reading user input
        Scanner read = new Scanner(System.in);

        // Ask the user to enter the number up to which the Fibonacci series should be generated
        System.out.print("Enter the number up to which the Fibonacci series should be displayed: ");
        int limit = read.nextInt();  // Store the user's input in the variable 'limit'

        // Close the scanner object
        read.close();  

        // Check if the input is non-negative
        if (limit < 0) {  // Validate the input to ensure it's not a negative number
            System.out.println("Please enter a non-negative number.");  // Print an error message if input is negative
            return;  // Exit the program if the input is invalid
        }

        // Display the Fibonacci series
        System.out.println("Fibonacci series up to " + limit + ":");  // Inform the user about the series being displayed

        // Initialize the first two numbers of the Fibonacci series
        int first = 0, second = 1;  // 'first' and 'second' are the starting values of the series

        // Print the first number
        if (limit >= first) {  // Check if the limit is at least 0 to include the first number
            System.out.print(first);  // Print the first number of the series
        }

        // Iterate and generate the Fibonacci numbers
        while (second <= limit) {  // Continue generating the series as long as 'second' is within the limit
            System.out.print(", " + second);  // Print the current Fibonacci number

            // Calculate the next Fibonacci number
            int next = first + second;  // Compute the next number in the series

            // Update the previous two numbers
            first = second;  // Shift 'second' to 'first'
            second = next;  // Shift 'next' to 'second'
        }

        System.out.println();  // Move to the next line after the series
    }
}
