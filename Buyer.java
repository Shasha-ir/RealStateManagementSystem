/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

public class Buyer {
    private int buyerId; // BuyerID
    private String name;
    private String email;
    private String phoneNumber;
    private String password; // Added password field

    // Constructor
    public Buyer(int buyerId, String name, String email, String phoneNumber, String password) {
        this.buyerId = buyerId;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.password = password; // Initialize password
    }

    // Default constructor
    public Buyer() {}

    // Getters and Setters
    public int getBuyerId() {
        return buyerId;
    }

    public void setBuyerId(int buyerId) {
        this.buyerId = buyerId;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}



