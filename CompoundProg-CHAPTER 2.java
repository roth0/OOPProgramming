package compoundprog;

import java.util.Scanner;

public class CompoundProg {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask user for input
        System.out.print("Enter a number: ");
        int a = scanner.nextInt();
        int originalValue = a;  
    // Save the original value of a 

        int result;

        // Pre-increment
        result = ++a;
        System.out.println("Prefix : ");
        System.out.println("After ++a: a = " + a + ", result = " + result);

        // Reset a to the original value
        a = originalValue;

        // Pre-decrement
        result = --a;
        System.out.println("\nAfter --a: a = " + a + ", result = " + result);
        System.out.println("\nExplanation : In the prefix form, the operator is placed before the operand.\nThe value of the operand is incremented or decremented first, and then the result is used in the expression.");

        // Reset a to the original value
        a = originalValue;

        // Post-increment
        result = a++;
        System.out.println("Postfix : ");
        System.out.println("\nAfter a++: a = " + a + ", result = " + result);

        // Reset a to the original value
        a = originalValue;

        // Post-decrement
        result = a--;
        System.out.println("\nAfter a--: a = " + a + ", result = " + result);
        
        System.out.println("\nExplanation : In the postfix form, the operator is placed after the operand.\nThe value of the operand is used in the expression first, and then it is incremented or decremented.");

        // Close the scanner
        scanner.close();
    }
}
