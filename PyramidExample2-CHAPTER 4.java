package pyramidexample2;

public class PyramidExample2 {  
    
    public static void main(String[] args) {  
    
        int heights = 7;  // Height of the dumbbell
        int width = heights * 2 + 1; // Calculate the width needed for two dumbbell and a space in between
    
        // Loop through each row of the pattern
        for (int i = 1; i <= heights; i++) {  
    
            // Loop through each column of the current row
            for (int j = 1; j <= width; j++) {  
    
                // Print '*' for the vertical lines of dumbbell at the borders and the middle horizontal line
                if (j == 1 || j == heights || j == heights + 2 || j == width || i == heights / 2 + 1) {  
                    System.out.print("* ");  
                } else {  
                    System.out.print("  ");  // Print space for other areas
                }  
            }  
            System.out.println(); // Move to the next line after finishing a row
        }  
    }  
}
