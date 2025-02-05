/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.time.LocalDate;

// Enums for Property Type and Status (Non-public)
enum PropertyType {
    RESIDENTIAL, COMMERCIAL
}

enum PropertyStatus {
    AVAILABLE, SOLD, RENTED
}

public class Property {
    private int propertyID;
    private String address;
    private double price;
    private PropertyType type; // Enum for 'Residential' or 'Commercial'
    private PropertyStatus status; // Enum for 'Available', 'Sold', or 'Rented'
    private String description;
    private LocalDate listingDate; // LocalDate for handling dates
    private int sellerID;

    // Constructor
    public Property(int propertyID, String address, double price, PropertyType type, PropertyStatus status, String description, LocalDate listingDate, int sellerID) {
        this.propertyID = propertyID;
        this.address = address;
        this.price = price;
        this.type = type;
        this.status = status;
        this.description = description;
        this.listingDate = listingDate;
        this.sellerID = sellerID;
    }

    // Getters and Setters
    public int getPropertyID() {
        return propertyID;
    }

    public void setPropertyID(int propertyID) {
        this.propertyID = propertyID;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public PropertyType getType() {
        return type;
    }

    public void setType(PropertyType type) {
        this.type = type;
    }

    public PropertyStatus getStatus() {
        return status;
    }

    public void setStatus(PropertyStatus status) {
        this.status = status;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getListingDate() {
        return listingDate;
    }

    public void setListingDate(LocalDate listingDate) {
        this.listingDate = listingDate;
    }

    public int getSellerID() {
        return sellerID;
    }

    public void setSellerID(int sellerID) {
        this.sellerID = sellerID;
    }
}
