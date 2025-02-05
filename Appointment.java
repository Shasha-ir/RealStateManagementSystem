/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.time.LocalDate;
import java.time.LocalTime;

public class Appointment {
    private int appointmentID;
    private int propertyID; // Foreign key
    private int buyerID;    // Foreign key
    private int sellerID;   // Foreign key
    private LocalDate date;
    private LocalTime time;
    private AppointmentStatus status; // Enum for appointment status

    // Enum for appointment status
    public enum AppointmentStatus {
        SCHEDULED, COMPLETED, CANCELLED
    }

    // Constructor
    public Appointment(int appointmentID, int propertyID, int buyerID, int sellerID, 
                       LocalDate date, LocalTime time, AppointmentStatus status) {
        this.appointmentID = appointmentID;
        this.propertyID = propertyID;
        this.buyerID = buyerID;
        this.sellerID = sellerID;
        this.date = date;
        this.time = time;
        this.status = status;
    }

    // Getters and Setters
    public int getAppointmentID() {
        return appointmentID;
    }

    public void setAppointmentID(int appointmentID) {
        this.appointmentID = appointmentID;
    }

    public int getPropertyID() {
        return propertyID;
    }

    public void setPropertyID(int propertyID) {
        this.propertyID = propertyID;
    }

    public int getBuyerID() {
        return buyerID;
    }

    public void setBuyerID(int buyerID) {
        this.buyerID = buyerID;
    }

    public int getSellerID() {
        return sellerID;
    }

    public void setSellerID(int sellerID) {
        this.sellerID = sellerID;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    public AppointmentStatus getStatus() {
        return status;
    }

    public void setStatus(AppointmentStatus status) {
        this.status = status;
    }
}

