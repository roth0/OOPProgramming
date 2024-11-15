package mainclass;

import javax.swing.JOptionPane;

public class InputEXP {

    public void inputexpread() {
        // Show an initial message before asking for input
        JOptionPane.showMessageDialog(null, "This Is A BMI Calculator", "BMI Calculator", JOptionPane.INFORMATION_MESSAGE);
        
        String weightStr;
        String heightStr;
        double weight, height, bmi;
        
        // Get weight input from user
        weightStr = JOptionPane.showInputDialog("Enter your weight in kilograms :");
        weight = Double.parseDouble(weightStr);
        
        // Get height input from user
        heightStr = JOptionPane.showInputDialog("Enter your height in meters :");
        height = Double.parseDouble(heightStr);
        
        // Calculate BMI
        bmi = weight / (height * height);
        
        // Show the calculated BMI
        JOptionPane.showMessageDialog(null, "Your BMI is " + String.format("%.2f", bmi), "BMI Results", JOptionPane.PLAIN_MESSAGE);
        System.exit(0);
    }   
}
