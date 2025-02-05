/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PropertyController {

    private Connection conn;

    public PropertyController() {
        this.conn = DatabaseConnection.getConnection();
    }

    // Method to add a property
    public int addProperty(String address, double price, String type, String description, Date listingDate, int sellerId) {
        String query = "INSERT INTO Property (Address, Price, Type, Status, Description, ListingDate, SellerID) VALUES (?, ?, ?, 'Available', ?, ?, ?)";
        try (PreparedStatement pstmt = conn.prepareStatement(query, PreparedStatement.RETURN_GENERATED_KEYS)) {
            pstmt.setString(1, address);
            pstmt.setDouble(2, price);
            pstmt.setString(3, type);
            pstmt.setString(4, description);
            pstmt.setDate(5, listingDate);
            pstmt.setInt(6, sellerId);

            int affectedRows = pstmt.executeUpdate();
            if (affectedRows > 0) {
                try (ResultSet generatedKeys = pstmt.getGeneratedKeys()) {
                    if (generatedKeys.next()) {
                        return generatedKeys.getInt(1); // Return the generated PropertyID
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return -1; // Return -1 if the insertion failed
    }

    // Method to update property details
    public boolean updateProperty(String propertyId, String address, String price, String type, String description, String listingDate) throws SQLException {
        // Check if at least one field is provided for update
        if (address.isEmpty() && price.isEmpty() && type.isEmpty() && description.isEmpty() && listingDate.isEmpty()) {
            return false; // No fields to update
        }

        // Build the update query based on filled fields
        StringBuilder query = new StringBuilder("UPDATE Property SET ");
        boolean isFirst = true;

        if (!address.isEmpty()) {
            query.append("Address = ?");
            isFirst = false;
        }
        if (!price.isEmpty()) {
            if (!isFirst) {
                query.append(", ");
            }
            query.append("Price = ?");
            isFirst = false;
        }
        if (!type.isEmpty()) {
            if (!isFirst) {
                query.append(", ");
            }
            query.append("Type = ?");
            isFirst = false;
        }
        if (!description.isEmpty()) {
            if (!isFirst) {
                query.append(", ");
            }
            query.append("Description = ?");
            isFirst = false;
        }
        if (!listingDate.isEmpty()) {
            if (!isFirst) {
                query.append(", ");
            }
            query.append("ListingDate = ?");
        }

        query.append(" WHERE PropertyID = ?");

        try (PreparedStatement pstmt = conn.prepareStatement(query.toString())) {
            int index = 1;

            // Set values dynamically based on which fields are filled
            if (!address.isEmpty()) {
                pstmt.setString(index++, address);
            }
            if (!price.isEmpty()) {
                pstmt.setDouble(index++, Double.parseDouble(price));
            }
            if (!type.isEmpty()) {
                pstmt.setString(index++, type);
            }
            if (!description.isEmpty()) {
                pstmt.setString(index++, description);
            }
            if (!listingDate.isEmpty()) {
                pstmt.setDate(index++, Date.valueOf(listingDate));
            }
            pstmt.setInt(index, Integer.parseInt(propertyId));

            // Execute update and return success status
            int affectedRows = pstmt.executeUpdate();
            return affectedRows > 0; // Return true if any rows were updated
        }
    }

    public boolean deleteProperty(int propertyId) {
        String deleteQuery = "DELETE FROM Property WHERE PropertyID = ?";

        try (PreparedStatement pstmtDelete = conn.prepareStatement(deleteQuery)) {
            pstmtDelete.setInt(1, propertyId);
            int affectedRows = pstmtDelete.executeUpdate();
            return affectedRows > 0;  // Return true if deletion was successful
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
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
