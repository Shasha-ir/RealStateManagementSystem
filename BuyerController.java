/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Buyer;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BuyerController {
    private final Connection conn;

    public BuyerController() {
        this.conn = DatabaseConnection.getConnection(); // Ensure you have a method to get the connection
    }
    

    //Search Buyers
    public Buyer searchBuyer(String name, String password) {
        Buyer buyer = null;
        String sql = "SELECT * FROM Buyer WHERE Name=? AND Password=?";

        try (PreparedStatement pst = conn.prepareStatement(sql)) {
            pst.setString(1, name);
            pst.setString(2, password);
            try (ResultSet rs = pst.executeQuery()) {
                if (rs.next()) {
                    buyer = new Buyer();
                    buyer.setBuyerId(rs.getInt("BuyerID"));
                    buyer.setName(rs.getString("Name"));
                    buyer.setEmail(rs.getString("Email"));
                    buyer.setPhoneNumber(rs.getString("PhoneNumber"));
                    buyer.setPassword(rs.getString("Password"));
                } else {
                    System.out.println("Buyer not found");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Error searching for buyer");
        }

        return buyer;
    }
    
    // Add a new buyer
    public boolean addBuyer(Buyer buyer) {
        String sql = "INSERT INTO Buyer (Name, Email, PhoneNumber, Password) VALUES (?, ?, ?, ?)";
        try (PreparedStatement pst = conn.prepareStatement(sql)) {
            pst.setString(1, buyer.getName());
            pst.setString(2, buyer.getEmail());
            pst.setString(3, buyer.getPhoneNumber());
            pst.setString(4, buyer.getPassword());
            
            int rowsAffected = pst.executeUpdate();
            return rowsAffected > 0; // Return true if the insertion was successful
        } catch (SQLException e) {
            e.printStackTrace();
            return false; // Return false if an error occurred
        }
    }
    
    //Delete Buyer
    public boolean deleteBuyer(int buyerId) {
        String sql = "DELETE FROM Buyer WHERE BuyerID=?";
        try (PreparedStatement pst = conn.prepareStatement(sql)) {
            pst.setInt(1, buyerId);
            int rowsAffected = pst.executeUpdate();
            return rowsAffected > 0; // Return true if the deletion was successful
        } catch (SQLException e) {
            e.printStackTrace();
            return false; // Return false if an error occurred
        }
    }
    
    // Method to search a buyer by BuyerID
    public Buyer searchBuyerById(int buyerId) {
        Buyer buyer = null;
        String sql = "SELECT * FROM Buyer WHERE BuyerID=?";

        try (PreparedStatement pst = conn.prepareStatement(sql)) {
            pst.setInt(1, buyerId);
            try (ResultSet rs = pst.executeQuery()) {
                if (rs.next()) {
                    buyer = new Buyer();
                    buyer.setBuyerId(rs.getInt("BuyerID"));
                    buyer.setName(rs.getString("Name"));
                    buyer.setEmail(rs.getString("Email"));
                    buyer.setPhoneNumber(rs.getString("PhoneNumber"));
                    buyer.setPassword(rs.getString("Password"));
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Error retrieving buyer by ID");
        }

        return buyer;
    }
    
    //Update Buyer
    public boolean updateBuyerDetails(Buyer buyer) {
        String sql = "UPDATE Buyer SET Name=?, Email=?, PhoneNumber=?, Password=? WHERE BuyerID=?";
    
        try (PreparedStatement pst = conn.prepareStatement(sql)) {
            pst.setString(1, buyer.getName());
            pst.setString(2, buyer.getEmail());
            pst.setString(3, buyer.getPhoneNumber());
            pst.setString(4, buyer.getPassword());
            pst.setInt(5, buyer.getBuyerId());

            int rowsAffected = pst.executeUpdate();
            return rowsAffected > 0; // Return true if the update was successful
        } catch (SQLException e) {
            e.printStackTrace();
            return false; // Return false if an error occurred
        }
    }
   
}




