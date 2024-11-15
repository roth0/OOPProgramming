package forloopsum;

public class ForLoopSum {

    public static void main(String[] args) {
        int sum = 0; // Variable to hold the sum
        
        System.out.println("Calculating the sum of numbers from 1 to 10");
        
        for (int count = 1; count <= 10; count++) {
            sum += count; // Add the current number to sum
        }
        
        System.out.println("The sum of numbers from 1 to 10 is: " + sum);
    }
}
