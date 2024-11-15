package maximumandminimum;

/**
 *
 * @author User
 */
public class FindMaximumAndMinimum {

    public static void main(String[] args) {
        // Sample input values
        int num1 = 5;
        int num2 = 10;
        int num3 = 3;
        
        // Find maximum and minimum values
        int maxVal = findMaximum(num1, num2, num3);
        int minVal = findMinimum(num1, num2, num3);

    }

    // Method to find the maximum value
    private static int findMaximum(int num1, int num2, int num3) {
        return Math.max(num1, Math.max(num2, num3));
    }

    // Method to find the minimum value
    private static int findMinimum(int num1, int num2, int num3) {
        return Math.min(num1, Math.min(num2, num3));
    }
}
