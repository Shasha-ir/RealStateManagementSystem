/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    public static Connection getConnection() {
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ir_real_estates", "root", "Isuri#02");
            System.out.println("Connected to the database");
            return conn;
        } catch (SQLException e) {
            System.out.println("Connection Failed: " + e.getMessage());
            return null; // Return null if connection fails
        }
    }
}

