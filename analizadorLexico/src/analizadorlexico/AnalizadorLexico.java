/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package analizadorlexico;

import gui.mainJFrame;

/**
 *
 * @author hamme
 */
public class AnalizadorLexico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        mainJFrame mainWindow = new mainJFrame();
        mainWindow.setVisible(true);
        for (int i = 0; i < 80 * 300; i++) // Default Height of cmd is 300 and Default width is 80
        {
            System.out.println("\b"); // Prints a backspace
        }
    }
    
}
