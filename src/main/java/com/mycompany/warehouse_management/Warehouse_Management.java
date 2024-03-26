/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.warehouse_management;
import javax.swing.JFrame;

/**
 *
 * @author lyeschl
 */
public class Warehouse_Management {

    public static void main(String[] args) {
          // Instantiate LoginInterface
        LoginInterface loginInterface = new LoginInterface();
        
        // Set the default close operation
        loginInterface.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Set visibility to true
        loginInterface.setVisible(true);
    }
}
