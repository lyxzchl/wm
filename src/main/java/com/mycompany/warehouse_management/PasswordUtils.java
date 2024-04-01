/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.warehouse_management;

/**
 *
 * @author lyeschl
 */
import java.util.logging.Level;
import java.util.logging.Logger;
import org.mindrot.jbcrypt.BCrypt;

public class PasswordUtils {
    public static String hashPassword(String password) {
        return BCrypt.hashpw(password, BCrypt.gensalt());
    }

    public static boolean verifyPassword(String password, String hashedPassword) {
    try {
        return BCrypt.checkpw(password, hashedPassword);
    } catch (IllegalArgumentException e) {
        // Handle the case where the hashed password format is different
        // You can try to parse the hashed password and extract the salt and cost factor
        // to create a new hashed password using the same parameters
        String[] parts = hashedPassword.split("\\$");
        if (parts.length == 4) {
            int cost = Integer.parseInt(parts[2]);
            String salt = parts[3];
            String newHashedPassword = BCrypt.hashpw(password, "$2a$" + cost + "$" + salt);
            return newHashedPassword.equals(hashedPassword);
        } else {
            // If the format is still not recognized, you can log the error and return false
            Logger.getLogger(PasswordUtils.class.getName()).log(Level.SEVERE, "Invalid hashed password format: " + hashedPassword, e);
            return false;
        }
    }
}

}

