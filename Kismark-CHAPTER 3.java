package kismark;

// Imports the Scanner class for user input
import java.util.Scanner;

public class Kismark {

    public static void main(String[] args) {
        
        //Ask user to enter number of late
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of late submissions: ");
        int latenumber = input.nextInt();
       
        
        float deductmarks = 0.3f; //Deduction marks per late 
        float initialKISmarks = 10; // Initial total KIS marks
        float totalDeduction = 0;
        float totalKISmarks = initialKISmarks;
        
        if (latenumber >= 3) {
            totalDeduction = latenumber * deductmarks; // Calculates the total deduction based on the number of late submissions
            totalKISmarks = initialKISmarks - totalDeduction;  // Calculates the total KIS marks after the deduction
        }
        
        
       //Print the output 
        System.out.println("Total KIS Marks After Deduction: " + totalKISmarks);
        System.out.printf("Total Marks Deducted: %.1f\n", totalDeduction);
    }
}
