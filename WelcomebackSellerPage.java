/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import java.sql.PreparedStatement;
import Controller.PropertyController;
import java.sql.Connection;
import Controller.DatabaseConnection;
import java.sql.SQLException;
import Controller.BuyerController;
import Model.Buyer;
import Controller.SellerController;
import Model.Seller;

public class WelcomebackSellerPage extends javax.swing.JFrame {

    private boolean isBuyer;
    private String loggedInName;
    private String loggedInPassword;
    private String sellerName;
    private String sellerPassword;
    private int sellerId;

    // Constructor that accepts name and password
    public WelcomebackSellerPage(String name, String password, boolean isBuyer) {
        initComponents();
        this.sellerName = name;
        this.sellerPassword = password;
        this.setExtendedState(javax.swing.JFrame.MAXIMIZED_BOTH);
        this.loggedInName = name;        // Store the logged-in name
        this.loggedInPassword = password; // Store the logged-in password
        this.isBuyer = isBuyer;  // Set if the user is a buyer

        nameLabel.setText(this.loggedInName + ",");

        // Fetch the seller ID using SellerController
        SellerController sellerController = new SellerController();
        this.sellerId = sellerController.getSellerId(this.sellerName, this.sellerPassword);

        if (this.sellerId == -1) {
            javax.swing.JOptionPane.showMessageDialog(this, "Error fetching seller ID.");
        } else {
            // Use sellerId for other actions (e.g., display seller information, perform actions)
            System.out.println("Seller ID: " + this.sellerId);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        welcomebackLabel = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        profileButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        addressLabel = new javax.swing.JLabel();
        priceLabel = new javax.swing.JLabel();
        typeLabel = new javax.swing.JLabel();
        descLabel = new javax.swing.JLabel();
        dateLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        priceInsert = new javax.swing.JTextField();
        typeInsert = new javax.swing.JTextField();
        descInsert = new javax.swing.JTextField();
        dateInsert = new javax.swing.JTextField();
        addressInsert = new javax.swing.JTextField();
        addButton = new javax.swing.JButton();
        editButton = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        propertyIdInsert = new javax.swing.JTextField();
        deleteButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        welcomebackLabel.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        welcomebackLabel.setText("Hello");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(36, 88, 0, 0);
        getContentPane().add(welcomebackLabel, gridBagConstraints);

        nameLabel.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        nameLabel.setText(",");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 197;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(36, 6, 0, 0);
        getContentPane().add(nameLabel, gridBagConstraints);

        profileButton.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        profileButton.setText("<html>Your<br>Profile</html> ");
        profileButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        profileButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        profileButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                profileButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 21;
        gridBagConstraints.ipady = 45;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(8, 61, 0, 57);
        getContentPane().add(profileButton, gridBagConstraints);

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Add/Edit Property Details");

        addressLabel.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        addressLabel.setText("Address");

        priceLabel.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        priceLabel.setText("Price");

        typeLabel.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        typeLabel.setText("Type");

        descLabel.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        descLabel.setText("Description");

        dateLabel.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        dateLabel.setText("List. Date");

        jLabel2.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel2.setText(":");

        jLabel3.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel3.setText(":");

        jLabel4.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel4.setText(":");

        jLabel5.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel5.setText(":");

        jLabel6.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel6.setText(":");

        priceInsert.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N

        typeInsert.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N

        descInsert.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N

        dateInsert.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N

        addressInsert.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N

        addButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        addButton.setText("Add Details");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        editButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        editButton.setText("Save Edits");
        editButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(addressLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(priceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(typeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(descLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dateInsert))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(descInsert))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(typeInsert))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(addressInsert))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(priceInsert))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(addButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                        .addComponent(editButton)
                        .addGap(46, 46, 46)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(addressLabel)
                    .addComponent(addressInsert, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(priceLabel)
                    .addComponent(jLabel3)
                    .addComponent(priceInsert, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(typeLabel)
                    .addComponent(jLabel4)
                    .addComponent(typeInsert, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(descLabel)
                    .addComponent(jLabel5)
                    .addComponent(descInsert, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dateLabel)
                    .addComponent(jLabel6)
                    .addComponent(dateInsert, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addButton)
                    .addComponent(editButton))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.ipadx = 50;
        gridBagConstraints.ipady = 29;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(28, 100, 0, 0);
        getContentPane().add(jPanel2, gridBagConstraints);

        jLabel8.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jLabel8.setText("Property ID");

        jLabel11.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel11.setText(":");

        propertyIdInsert.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        propertyIdInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                propertyIdInsertActionPerformed(evt);
            }
        });

        deleteButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        deleteButton.setForeground(new java.awt.Color(255, 51, 51));
        deleteButton.setText("Delete");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(propertyIdInsert, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(72, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(169, 169, 169)
                .addComponent(deleteButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(propertyIdInsert, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(18, 18, 18)
                .addComponent(deleteButton)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 66;
        gridBagConstraints.ipady = 41;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 69, 16, 0);
        getContentPane().add(jPanel3, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void profileButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_profileButtonActionPerformed
        if (isBuyer) {
            // Handle buyer profile retrieval
            BuyerController buyerController = new BuyerController();
            Buyer buyer = buyerController.searchBuyer(loggedInName, loggedInPassword);

            if (buyer != null) {
                BuyerProfilePage profilePage = new BuyerProfilePage();
                profilePage.setVisible(true);

                // Set the profile fields with buyer's information
                profilePage.setNameField(buyer.getName());
                profilePage.setEmailField(buyer.getEmail());
                profilePage.setPhoneField(buyer.getPhoneNumber());
                profilePage.setPasswordField(buyer.getPassword());
                profilePage.setUserIdField(String.valueOf(buyer.getBuyerId()));

                this.dispose(); // Close the current window
            }
        } else {
            // Handle seller profile retrieval
            SellerController sellerController = new SellerController();
            Seller seller = sellerController.searchSeller(loggedInName, loggedInPassword);

            if (seller != null) {
                SellerProfilePage profilePage = new SellerProfilePage();
                profilePage.setVisible(true);

                // Set the profile fields with seller's information
                profilePage.setNameField(seller.getName());
                profilePage.setEmailField(seller.getEmail());
                profilePage.setPhoneField(seller.getPhoneNumber());
                profilePage.setPasswordField(seller.getPassword());
                profilePage.setUserIdField(String.valueOf(seller.getSellerId()));

                this.dispose(); // Close the current window
            }
        }
    }//GEN-LAST:event_profileButtonActionPerformed

    private void propertyIdInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_propertyIdInsertActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_propertyIdInsertActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        String propertyId = propertyIdInsert.getText().trim();

        if (propertyId.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this, "Property ID is required!", "Warning", javax.swing.JOptionPane.WARNING_MESSAGE);
            return;
        }

        PropertyController propertyController = new PropertyController();
        boolean success = propertyController.deleteProperty(Integer.parseInt(propertyId));

        if (success) {
            javax.swing.JOptionPane.showMessageDialog(this, "Property deleted successfully!");
        } else {
            javax.swing.JOptionPane.showMessageDialog(this, "Failed to delete property. Property does not exist.", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        String address = addressInsert.getText().trim();
        String price = priceInsert.getText().trim();
        String type = typeInsert.getText().trim();
        String description = descInsert.getText().trim();
        String listingDate = dateInsert.getText().trim();

        // Check for empty fields
        if (address.isEmpty() || price.isEmpty() || type.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this, "Address, Price, and Type are required fields!", "Warning", javax.swing.JOptionPane.WARNING_MESSAGE);
            return;
        }

        try {
            // Parse price and listing date
            double priceValue = Double.parseDouble(price);
            java.sql.Date sqlDate = java.sql.Date.valueOf(listingDate);

            PropertyController propertyController = new PropertyController();

            // Retrieve the SellerID based on logged-in name and password
            int sellerId = propertyController.getSellerId(loggedInName, loggedInPassword);

            if (sellerId == -1) {
                javax.swing.JOptionPane.showMessageDialog(this, "Error retrieving seller information. Please try again.", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
                return;
            }

            int propertyId = propertyController.addProperty(address, priceValue, type, description, sqlDate, sellerId);

            if (propertyId != -1) {
                javax.swing.JOptionPane.showMessageDialog(this, "Property added successfully!\nYou will receive an Email after the varification process for furthur steps.\nProperty ID: " + propertyId);
            } else {
                javax.swing.JOptionPane.showMessageDialog(this, "Failed to add property.", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
            }
        } catch (NumberFormatException e) {
            javax.swing.JOptionPane.showMessageDialog(this, "Invalid price format.", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_addButtonActionPerformed

    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed
        // Prompt for Property ID if not already provided
        String propertyId = propertyIdInsert.getText().trim();

        if (propertyId.isEmpty()) {
            propertyId = javax.swing.JOptionPane.showInputDialog(this, "Enter Property ID to update:");
            if (propertyId == null || propertyId.trim().isEmpty()) {
                javax.swing.JOptionPane.showMessageDialog(this, "Property ID is required!", "Warning", javax.swing.JOptionPane.WARNING_MESSAGE);
                return;
            }
        }

        // Get input from other fields
        String address = addressInsert.getText().trim();
        String price = priceInsert.getText().trim();
        String type = typeInsert.getText().trim();
        String description = descInsert.getText().trim();
        String listingDate = dateInsert.getText().trim();

        // Check if at least one field is filled
        if (address.isEmpty() && price.isEmpty() && type.isEmpty() && description.isEmpty() && listingDate.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this, "At least one field must be filled to update!", "Warning", javax.swing.JOptionPane.WARNING_MESSAGE);
            return;
        }

        try {
            // Build the query dynamically based on filled fields
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

            // Prepare the statement and set values
            try (Connection conn = DatabaseConnection.getConnection(); PreparedStatement pstmt = conn.prepareStatement(query.toString())) {
                int index = 1;
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
                    pstmt.setDate(index++, java.sql.Date.valueOf(listingDate));
                }
                pstmt.setInt(index, Integer.parseInt(propertyId));

                // Execute update
                int affectedRows = pstmt.executeUpdate();
                if (affectedRows > 0) {
                    javax.swing.JOptionPane.showMessageDialog(this, "Property updated successfully!");
                } else {
                    javax.swing.JOptionPane.showMessageDialog(this, "Failed to update property. Property ID may not exist.", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
            javax.swing.JOptionPane.showMessageDialog(this, "Database error: " + e.getMessage(), "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_editButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(WelcomebackSellerPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WelcomebackSellerPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WelcomebackSellerPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WelcomebackSellerPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WelcomebackSellerPage("testUser", "testPassword", true).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JTextField addressInsert;
    private javax.swing.JLabel addressLabel;
    private javax.swing.JTextField dateInsert;
    private javax.swing.JLabel dateLabel;
    private javax.swing.JButton deleteButton;
    private javax.swing.JTextField descInsert;
    private javax.swing.JLabel descLabel;
    private javax.swing.JButton editButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextField priceInsert;
    private javax.swing.JLabel priceLabel;
    private javax.swing.JButton profileButton;
    private javax.swing.JTextField propertyIdInsert;
    private javax.swing.JTextField typeInsert;
    private javax.swing.JLabel typeLabel;
    private javax.swing.JLabel welcomebackLabel;
    // End of variables declaration//GEN-END:variables
}
