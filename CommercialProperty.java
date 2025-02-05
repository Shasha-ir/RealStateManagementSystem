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

public class CommercialProperty extends Property {
    private String businessType;

    // Constructor
    public CommercialProperty(int propertyID, String address, double price, PropertyType type, PropertyStatus status, 
                             String description, LocalDate listingDate, int sellerID, String businessType) {
        super(propertyID, address, price, type, status, description, listingDate, sellerID);
        this.businessType = businessType;
    }

    // Getters and Setters
    public String getBusinessType() {
        return businessType;
    }

    public void setBusinessType(String businessType) {
        this.businessType = businessType;
    }
}

