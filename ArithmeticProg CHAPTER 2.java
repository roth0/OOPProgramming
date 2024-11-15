package arithmeticprog;

import java.util.Scanner;

public class ArithmeticProg {

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Ask user for the first integer
        System.out.print("Enter the first integer: ");
        int num1 = scanner.nextInt();

        // Ask user for the second integer
        System.out.print("Enter the second integer: ");
        int num2 = scanner.nextInt();

        // Perform and display 5 arithmetic operations
        System.out.println("Addition: " + num1 + " + " + num2 + " = " + (num1 + num2));
        System.out.println("Subtraction: " + num1 + " - " + num2 + " = " + (num1 - num2));
        System.out.println("Multiplication: " + num1 + " * " + num2 + " = " + (num1 * num2));
        System.out.println("Division: " + num1 + " / " + num2 + " = " + (num1 / num2));
        System.out.println("Modulus : " + num1 + " % " + num2 + " = " + (num1 % num2));
        System.out.println("Increment num1: " + num1 + "++ = " + (num1++) + " (New value = " + num1 + ")");
        System.out.println("Decrement num2: " + num2 + "-- = " + (num2--) + " (New value = " + num2 + ")");
        
        // Close the scanner
        scanner.close();
    }
}
