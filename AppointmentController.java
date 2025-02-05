/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Appointment;
import java.sql.Connection;
import java.sql.Date;
import java.sql.Time;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class AppointmentController {

    private Connection conn;

    public AppointmentController() {
        this.conn = DatabaseConnection.getConnection();
    }

    public int getSellerIdFromProperty(Connection conn, int propertyID) {
        String query = "SELECT SellerID FROM Property WHERE PropertyID = ?";
        try (PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setInt(1, propertyID);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return rs.getInt("SellerID");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return -1; // Return -1 if not found
    }

    public int getBuyerIdFromProperty(Connection conn, int propertyID) {
        String query = "SELECT BuyerID FROM Transaction WHERE PropertyID = ?";
        try (PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setInt(1, propertyID);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return rs.getInt("BuyerID");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return -1; // Return -1 if not found
    }

    public int addAppointment(Connection conn, Appointment appointment) {
        String query = "INSERT INTO Appointment (PropertyID, BuyerID, SellerID, Date, Time, Status) VALUES (?, ?, ?, ?, ?, ?)";
        try (PreparedStatement stmt = conn.prepareStatement(query, Statement.RETURN_GENERATED_KEYS)) {
            stmt.setInt(1, appointment.getPropertyID());
            stmt.setInt(2, appointment.getBuyerID());
            stmt.setInt(3, appointment.getSellerID());
            stmt.setDate(4, Date.valueOf(appointment.getDate()));
            stmt.setTime(5, Time.valueOf(appointment.getTime()));
            stmt.setString(6, appointment.getStatus().name());

            int affectedRows = stmt.executeUpdate();
            if (affectedRows > 0) {
                ResultSet generatedKeys = stmt.getGeneratedKeys();
                if (generatedKeys.next()) {
                    return generatedKeys.getInt(1); // Return the generated Appointment ID
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return -1; // Return -1 if insertion failed
    }

    public boolean deleteAppointment(Connection conn, int appointmentID) throws SQLException {
        String query = "DELETE FROM Appointment WHERE AppointmentID = ?";
        try (PreparedStatement pstmt = conn.prepareStatement(query)) {
            pstmt.setInt(1, appointmentID);
            int affectedRows = pstmt.executeUpdate();
            return affectedRows > 0; // Returns true if a row was deleted
        }
    }

}
