/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.time.LocalDate;

public class Transaction {
    private int transactionID;
    private int propertyID; // Foreign key
    private int buyerID;    // Foreign key
    private int sellerID;   // Foreign key
    private LocalDate transactionDate;
    private double amount;
    private TransactionStatus status; // Enum for transaction status

    // Enum for transaction status
    public enum TransactionStatus {
        PENDING, COMPLETED, CANCELLED
    }

    // Constructor
    public Transaction(int transactionID, int propertyID, int buyerID, int sellerID, 
                       LocalDate transactionDate, double amount, TransactionStatus status) {
        this.transactionID = transactionID;
        this.propertyID = propertyID;
        this.buyerID = buyerID;
        this.sellerID = sellerID;
        this.transactionDate = transactionDate;
        this.amount = amount;
        this.status = status;
    }

    // Getters and Setters
    public int getTransactionID() {
        return transactionID;
    }

    public void setTransactionID(int transactionID) {
        this.transactionID = transactionID;
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

    public LocalDate getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(LocalDate transactionDate) {
        this.transactionDate = transactionDate;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public TransactionStatus getStatus() {
        return status;
    }

    public void setStatus(TransactionStatus status) {
        this.status = status;
    }
}

