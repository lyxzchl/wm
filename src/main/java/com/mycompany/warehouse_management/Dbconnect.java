/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.warehouse.manager;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author lyeschl
 */
public class Dbconnect {
    // Database URL, username, and password
    private static final String URL = "jdbc:mariadb://localhost:3306/spare_parts_warehouse";
    private static final String USERNAME = "lyeschl";
    private static final String PASSWORD = "lyessou1213";

    // Method to establish a database connection
    /**
     * Establishes a connection to the database.
     * @return Connection object representing the database connection.
    */
public static Connection connect() {
    try {
        // Load the MySQL JDBC driver
        Class.forName("org.mariadb.cj.jdbc.Driver");

        // Establish the database connection
        Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        System.out.println("Connected to the database");
        return connection;
    } catch (ClassNotFoundException e) {
        System.err.println("Failed to load JDBC driver: " + e.getMessage());
    } catch (SQLException e) {
        System.err.println("Error connecting to the database: " + e.getMessage());
    }
    return null;
    }
}

