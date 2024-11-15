package factorial2; 

import java.util.Scanner; // Import the Scanner class for user input

public class Factorial2 { 
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in); // Create a Scanner object to read user input

        // Asking for user input
        System.out.print("Enter a number: "); //Ask user to enter a number
        int n = scanner.nextInt(); // Read the user input and store it in variable 'n'
        long factorial = 1; // Variable to store the result of the factorial calculation, initialized to 1

        // Calculating factorial using iterative method
        for (int i = 1; i <= n; i++) { // Loop from 1 to 'n'
            factorial *= i; // Multiply 'factorial' by 'i' in each iteration
        }

        // Displaying the result
        System.out.println("Factorial of " + n + " is: " + factorial); // Print the result of the factorial calculation

        // Showing calculation
        System.out.print("Calculation: "); // Print the beginning of the calculation string
        for (int i = 1; i <= n; i++) { // Loop from 1 to 'n'
            System.out.print(i); // Print the current number 'i'
            if (i < n) { // If 'i' is less than 'n'
                System.out.print(" x "); // Print multiplication symbol if not the last number
            }
        }
        System.out.println(" = " + factorial); // Print the equals sign and the result of the factorial calculation

      
    }
}
