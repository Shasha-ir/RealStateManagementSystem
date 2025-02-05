/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Shasha
 */

import java.time.LocalDate;

public class ResidentialProperty extends Property {
    private int bedrooms;
    private int bathrooms;
    private int squareFootage;

    // Constructor
    public ResidentialProperty(int propertyID, String address, double price, PropertyType type, PropertyStatus status, 
                               String description, LocalDate listingDate, int sellerID, 
                               int bedrooms, int bathrooms, int squareFootage) {
        super(propertyID, address, price, type, status, description, listingDate, sellerID);
        this.bedrooms = bedrooms;
        this.bathrooms = bathrooms;
        this.squareFootage = squareFootage;
    }

    // Getters and Setters
    public int getBedrooms() {
        return bedrooms;
    }

    public void setBedrooms(int bedrooms) {
        this.bedrooms = bedrooms;
    }

    public int getBathrooms() {
        return bathrooms;
    }

    public void setBathrooms(int bathrooms) {
        this.bathrooms = bathrooms;
    }

    public int getSquareFootage() {
        return squareFootage;
    }

    public void setSquareFootage(int squareFootage) {
        this.squareFootage = squareFootage;
    }
}

