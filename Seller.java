/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

public class Seller {
    private int sellerId;
    private String name;
    private String email;
    private String phoneNumber;
    private String agency;
    private String password;

    // Existing constructor with all fields
    public Seller(int sellerId, String name, String email, String phoneNumber, String agency, String password) {
        this.sellerId = sellerId;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.agency = agency;
        this.password = password;
    }

    // New constructor without the agency field
    public Seller(int sellerId, String name, String email, String phoneNumber, String password) {
        this.sellerId = sellerId;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.password = password;
    }

    // Default constructor
    public Seller() {}

    // Getters and Setters
    public int getSellerId() {
        return sellerId;
    }

    public void setSellerId(int sellerId) {
        this.sellerId = sellerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAgency() {
        return agency;
    }

    public void setAgency(String agency) {
        this.agency = agency;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}


