/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Seller;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SellerController {

    private final Connection conn;

    public SellerController() {
        this.conn = DatabaseConnection.getConnection();
    }

    public Seller searchSeller(String name, String password) {
        Seller seller = null;
        String sql = "SELECT * FROM Seller WHERE Name=? AND Password=?";

        try (PreparedStatement pst = conn.prepareStatement(sql)) {
            pst.setString(1, name);
            pst.setString(2, password);
            try (ResultSet rs = pst.executeQuery()) {
                if (rs.next()) {
                    seller = new Seller();
                    seller.setSellerId(rs.getInt("SellerID"));
                    seller.setName(rs.getString("Name"));
                    seller.setEmail(rs.getString("Email"));
                    seller.setPhoneNumber(rs.getString("PhoneNumber"));
                    seller.setAgency(rs.getString("Agency"));
                    seller.setPassword(rs.getString("Password"));
                } else {
                    System.out.println("Seller not found");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Error searching for seller");
        }

        return seller;
    }

    // Method to add a new seller
    public boolean addSeller(Seller seller) {
        String sql = "INSERT INTO Seller (Name, Email, PhoneNumber, Agency, Password) VALUES (?, ?, ?, ?, ?)";
        try (PreparedStatement pst = conn.prepareStatement(sql)) {
            pst.setString(1, seller.getName());
            pst.setString(2, seller.getEmail());
            pst.setString(3, seller.getPhoneNumber());
            pst.setString(4, seller.getAgency());
            pst.setString(5, seller.getPassword());

            int rowsAffected = pst.executeUpdate();
            return rowsAffected > 0; // Return true if the insertion was successful
        } catch (SQLException e) {
            e.printStackTrace();
            return false; // Return false if an error occurred
        }
    }

    //Delete Seller
    public boolean deleteSeller(int sellerId) {
        // First, delete related residential properties
        String deleteResidentialPropertiesSql = "DELETE FROM ResidentialProperty WHERE PropertyID IN (SELECT PropertyID FROM Property WHERE SellerID=?)";
        try (PreparedStatement pst = conn.prepareStatement(deleteResidentialPropertiesSql)) {
            pst.setInt(1, sellerId);
            pst.executeUpdate(); // Delete related residential properties
        } catch (SQLException e) {
            e.printStackTrace();
            return false; // Return false if an error occurs while deleting residential properties
        }

        // Next, delete related commercial properties
        String deleteCommercialPropertiesSql = "DELETE FROM CommercialProperty WHERE PropertyID IN (SELECT PropertyID FROM Property WHERE SellerID=?)";
        try (PreparedStatement pst = conn.prepareStatement(deleteCommercialPropertiesSql)) {
            pst.setInt(1, sellerId);
            pst.executeUpdate(); // Delete related commercial properties
        } catch (SQLException e) {
            e.printStackTrace();
            return false; // Return false if an error occurs while deleting commercial properties
        }

        // Next, delete related properties
        String deletePropertiesSql = "DELETE FROM Property WHERE SellerID=?";
        try (PreparedStatement pst = conn.prepareStatement(deletePropertiesSql)) {
            pst.setInt(1, sellerId);
            pst.executeUpdate(); // Delete related properties
        } catch (SQLException e) {
            e.printStackTrace();
            return false; // Return false if an error occurs while deleting properties
        }

        // Finally, delete the seller
        String sql = "DELETE FROM Seller WHERE SellerID=?";
        try (PreparedStatement pst = conn.prepareStatement(sql)) {
            pst.setInt(1, sellerId);
            int rowsAffected = pst.executeUpdate();
            return rowsAffected > 0; // Return true if the deletion was successful
        } catch (SQLException e) {
            e.printStackTrace();
            return false; // Return false if an error occurred
        }
    }

    // Method to search a seller by SellerID
    public Seller searchSellerById(int sellerId) {
        Seller seller = null;
        String sql = "SELECT * FROM Seller WHERE SellerID=?";

        try (PreparedStatement pst = conn.prepareStatement(sql)) {
            pst.setInt(1, sellerId);
            try (ResultSet rs = pst.executeQuery()) {
                if (rs.next()) {
                    seller = new Seller();
                    seller.setSellerId(rs.getInt("SellerID"));
                    seller.setName(rs.getString("Name"));
                    seller.setEmail(rs.getString("Email"));
                    seller.setPhoneNumber(rs.getString("PhoneNumber"));
                    seller.setPassword(rs.getString("Password"));
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Error retrieving buyer by ID");
        }

        return seller;
    }

    //update Seller
    public boolean updateSellerDetails(Seller seller) {
        String sql = "UPDATE Seller SET Name=?, Email=?, PhoneNumber=?, Password=? WHERE SellerID=?";

        try (PreparedStatement pst = conn.prepareStatement(sql)) {
            pst.setString(1, seller.getName());
            pst.setString(2, seller.getEmail());
            pst.setString(3, seller.getPhoneNumber());
            pst.setString(4, seller.getPassword());
            pst.setInt(5, seller.getSellerId());

            int rowsAffected = pst.executeUpdate();
            return rowsAffected > 0; // Return true if the update was successful
        } catch (SQLException e) {
            e.printStackTrace();
            return false; // Return false if an error occurred
        }
    }

    public int getSellerId(String name, String password) {
        String query = "SELECT SellerID FROM Seller WHERE Name = ? AND Password = ?";
        try (PreparedStatement pstmt = conn.prepareStatement(query)) {
            pstmt.setString(1, name);
            pstmt.setString(2, password);
            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                return rs.getInt("SellerID");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return -1; // Return -1 if seller is not found
    }

}
