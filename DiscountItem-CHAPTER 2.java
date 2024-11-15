package discountitem;

import java.util.Scanner;

public class DiscountItem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input
        System.out.print("Enter item name: ");
        String itemName = scanner.nextLine();
        
        System.out.print("Enter item price: ");
        double price = scanner.nextDouble();
        
        System.out.print("Enter quantity: ");
        int quantity = scanner.nextInt();
        
        System.out.print("Enter discount rate (in %): ");
        double discountRate = scanner.nextDouble();
        
        // Calculations
        double totalPrice = price * quantity;
        double discountAmount = (discountRate / 100) * totalPrice;
        double priceAfterDiscount = totalPrice - discountAmount;
        
        // Output
        System.out.println("\nPrice Calculation Summary : ");
        System.out.println("Item name: " + itemName);
        System.out.println("Price: RM" + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Price: RM" + totalPrice);
        System.out.println("Discount Rate: " + discountRate + "%");
        System.out.println("Price after Discount: RM" + priceAfterDiscount);
        
        scanner.close();
    }
}
