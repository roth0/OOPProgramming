/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package maximumandminimum;

/**
 *
 * @author User
 */
// File: InputHelper.java

import java.util.Scanner;

public class InputHelp {

    // Method to get user input
    public static int getInput(String prompt) {
        Scanner read = new Scanner(System.in);
        System.out.print(prompt);
        return read.nextInt();
    }
}
