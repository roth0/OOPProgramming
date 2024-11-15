package salesman;

import java.util.Scanner;

public class Salesman {

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner read = new Scanner(System.in);
        
        double baseSalary = 600.0;  // Weekly base salary in RM
        double comissionRate = 0.05;  // Commission rate (5%)

        double totalSales = 0.0;  // Initialize total sales

        // Input number of items
        System.out.print("Enter the number of items sold: ");
        int numberOfItems = read.nextInt();
        read.nextLine();  // Consume the newline character left after nextInt()

        // Input item details one by one
        for (int i = 1; i <= numberOfItems; i++) {
            System.out.print("Enter the name of item " + i + ": ");
            String itemName = read.nextLine();
            System.out.print("Enter the price of " + itemName + " (RM): ");
            double itemPrice = read.nextDouble();
            read.nextLine();  // Consume the newline character left after nextDouble()

            totalSales += itemPrice;  // Accumulate the total sales
        }

        // Calculate commission
        double commission = totalSales * comissionRate;

        // Calculate total earnings
        double totalEarnings = baseSalary + commission;

        // Display earnings
        System.out.printf("\nThe salesman's earnings for the week are: RM%.2f\n", totalEarnings);

       
    }
}
