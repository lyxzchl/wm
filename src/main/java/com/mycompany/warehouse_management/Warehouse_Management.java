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
//        String p1 = PasswordUtils.hashPassword("admin01");
//        String p2 = PasswordUtils.hashPassword("entry01");
//        String p3 = PasswordUtils.hashPassword("consult01");
//        System.out.println(p1);
//        System.out.println(p2);
//        System.out.println(p3);
    }
}
