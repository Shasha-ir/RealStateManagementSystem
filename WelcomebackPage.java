/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Controller.BuyerController;
import Model.Buyer;
import Controller.SellerController;
import Model.Seller;
import Controller.AppointmentController;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import Model.Appointment;
import java.sql.Connection;
import Controller.DatabaseConnection;
import java.sql.SQLException;

public class WelcomebackPage extends javax.swing.JFrame {

    private boolean isBuyer;
    private String loggedInName;
    private String loggedInPassword;

    // Constructor that accepts name and password
    public WelcomebackPage(String name, String password, boolean isBuyer) {
        initComponents();
        this.setExtendedState(javax.swing.JFrame.MAXIMIZED_BOTH);
        this.loggedInName = name;        // Store the logged-in name
        this.loggedInPassword = password; // Store the logged-in password
        this.isBuyer = isBuyer;  // Set if the user is a buyer

        nameLabel.setText(this.loggedInName + ",");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        welcomebackLabel = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        profileButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        property2Label = new javax.swing.JLabel();
        property3Label = new javax.swing.JLabel();
        property4Label = new javax.swing.JLabel();
        property1Label = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        sheduleLabel = new javax.swing.JLabel();
        sheduleLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        propertyidInsert = new javax.swing.JTextField();
        dateInsert = new javax.swing.JTextField();
        timeInsert = new javax.swing.JTextField();
        sheduleButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        property4Label1 = new javax.swing.JLabel();
        property4Label2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        welcomebackLabel.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        welcomebackLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        welcomebackLabel.setText("Welcome back");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.ipadx = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(52, 113, 0, 0);
        getContentPane().add(welcomebackLabel, gridBagConstraints);

        nameLabel.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        nameLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        nameLabel.setText(",");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 10;
        gridBagConstraints.ipadx = 243;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(52, 6, 0, 0);
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
        gridBagConstraints.gridx = 32;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 21;
        gridBagConstraints.ipady = 45;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(72, 101, 0, 0);
        getContentPane().add(profileButton, gridBagConstraints);

        jLabel1.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        jLabel1.setText("Available Properties");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 17;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.ipadx = 314;
        gridBagConstraints.ipady = 50;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(25, 54, 0, 0);
        getContentPane().add(jLabel1, gridBagConstraints);

        property2Label.setFont(new java.awt.Font("Serif", 0, 12)); // NOI18N
        property2Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        property2Label.setText("<html>Property 2<br>Address - Rivertown<br>Price - 400000<br>A large commercial office in<br>Rivertown<br>Property ID = 2</html>");
        property2Label.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        property2Label.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 9;
        gridBagConstraints.ipadx = 138;
        gridBagConstraints.ipady = 58;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 18, 0, 0);
        getContentPane().add(property2Label, gridBagConstraints);

        property3Label.setFont(new java.awt.Font("Serif", 0, 12)); // NOI18N
        property3Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        property3Label.setText("<html>Property 3<br>Address - Greenfield<br>Price - 350000<br>Type - Residential<br>A newly built home in<br>the peaceful town of Greenfield<br>Property ID = 5</html>");
        property3Label.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        property3Label.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 4;
        gridBagConstraints.ipadx = 141;
        gridBagConstraints.ipady = 41;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 26, 0, 0);
        getContentPane().add(property3Label, gridBagConstraints);

        property4Label.setFont(new java.awt.Font("Serif", 0, 12)); // NOI18N
        property4Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        property4Label.setText("<html>Property x<br>Address - sample<br>Price - sample<br>Type - sample<br>sample description<br>Property ID = y</html>");
        property4Label.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        property4Label.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 9;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.ipadx = 142;
        gridBagConstraints.ipady = 58;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 18, 0, 0);
        getContentPane().add(property4Label, gridBagConstraints);

        property1Label.setFont(new java.awt.Font("Serif", 0, 12)); // NOI18N
        property1Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        property1Label.setText("<html>Property 1<br>Address - Springfield<br>Price - 250000<br>Type - Residential<br>A cozy family home in Springfield<br>Property ID = 1</html>");
        property1Label.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        property1Label.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 141;
        gridBagConstraints.ipady = 58;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(36, 32, 0, 0);
        getContentPane().add(property1Label, gridBagConstraints);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 255)));

        sheduleLabel.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        sheduleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sheduleLabel.setText("Shedule an Appointment");
        sheduleLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        sheduleLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        sheduleLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sheduleLabel1.setText("with the Seller");
        sheduleLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("<html>Selected<br>Property ID</html>");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Date");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Time");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText(":");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText(":");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText(":");

        propertyidInsert.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        propertyidInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                propertyidInsertActionPerformed(evt);
            }
        });

        dateInsert.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        dateInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dateInsertActionPerformed(evt);
            }
        });

        timeInsert.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        timeInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timeInsertActionPerformed(evt);
            }
        });

        sheduleButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        sheduleButton.setText("Shedule Appointment");
        sheduleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sheduleButtonActionPerformed(evt);
            }
        });

        deleteButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        deleteButton.setForeground(new java.awt.Color(255, 0, 51));
        deleteButton.setText("Delete Appointment");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sheduleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(sheduleLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(propertyidInsert, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(dateInsert, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(timeInsert, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 40, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sheduleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(deleteButton)))
                .addGap(56, 56, 56))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(sheduleLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sheduleLabel1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(propertyidInsert, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6)
                    .addComponent(dateInsert, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel7)
                    .addComponent(timeInsert, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57)
                .addComponent(sheduleButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(deleteButton)
                .addContainerGap(52, Short.MAX_VALUE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 16;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 18;
        gridBagConstraints.gridheight = 12;
        gridBagConstraints.ipadx = 40;
        gridBagConstraints.ipady = 46;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(54, 61, 0, 0);
        getContentPane().add(jPanel1, gridBagConstraints);

        property4Label1.setFont(new java.awt.Font("Serif", 0, 12)); // NOI18N
        property4Label1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        property4Label1.setText("<html>Property x<br>Address - sample<br>Price - sample<br>Type - sample<br>sample description<br>Property ID = y</html>");
        property4Label1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        property4Label1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.gridheight = 5;
        gridBagConstraints.ipadx = 98;
        gridBagConstraints.ipady = 22;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 24, 0, 0);
        getContentPane().add(property4Label1, gridBagConstraints);

        property4Label2.setFont(new java.awt.Font("Serif", 0, 12)); // NOI18N
        property4Label2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        property4Label2.setText("<html>Property x<br>Address - sample<br>Price - sample<br>Type - sample<br>sample description<br>Property ID = y</html>");
        property4Label2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        property4Label2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 13;
        gridBagConstraints.ipadx = 71;
        gridBagConstraints.ipady = -14;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 62, 0, 0);
        getContentPane().add(property4Label2, gridBagConstraints);

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

    private void propertyidInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_propertyidInsertActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_propertyidInsertActionPerformed

    private void dateInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dateInsertActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dateInsertActionPerformed

    private void timeInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timeInsertActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_timeInsertActionPerformed

    private void sheduleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sheduleButtonActionPerformed
        try {
            // Get the property ID, date, and time inputs
            int propertyID = Integer.parseInt(propertyidInsert.getText());
            LocalDate date = LocalDate.parse(dateInsert.getText(), DateTimeFormatter.ofPattern("yyyy-MM-dd"));
            LocalTime time = LocalTime.parse(timeInsert.getText(), DateTimeFormatter.ofPattern("HH:mm"));

            // Determine whether the user is a buyer or seller
            int buyerID = -1;
            int sellerID = -1;

            AppointmentController appointmentController = new AppointmentController();

            // Attempt to get a connection
            try (Connection conn = DatabaseConnection.getConnection()) {
                if (isBuyer) {
                    BuyerController buyerController = new BuyerController();
                    Buyer buyer = buyerController.searchBuyer(loggedInName, loggedInPassword);
                    buyerID = buyer.getBuyerId();
                    sellerID = appointmentController.getSellerIdFromProperty(conn, propertyID); // Pass the connection
                } else {
                    SellerController sellerController = new SellerController();
                    Seller seller = sellerController.searchSeller(loggedInName, loggedInPassword);
                    sellerID = seller.getSellerId();
                    buyerID = appointmentController.getBuyerIdFromProperty(conn, propertyID); // Pass the connection
                }

                // Create an Appointment object
                Appointment appointment = new Appointment(0, propertyID, buyerID, sellerID, date, time, Appointment.AppointmentStatus.SCHEDULED);

                // Use AppointmentController to add the appointment to the database
                int appointmentID = appointmentController.addAppointment(conn, appointment); // Pass the connection

                // Show confirmation message
                if (appointmentID != -1) {
                    javax.swing.JOptionPane.showMessageDialog(this,
                            "Appointment Scheduled Successfully. Your Appointment ID is " + appointmentID
                            + ". You will receive an email for further steps within 2 working days.");
                } else {
                    javax.swing.JOptionPane.showMessageDialog(this, "Failed to schedule appointment.");
                }
            } catch (SQLException e) {
                javax.swing.JOptionPane.showMessageDialog(this, "Database connection error: " + e.getMessage());
            }
        } catch (DateTimeParseException | NumberFormatException e) {
            javax.swing.JOptionPane.showMessageDialog(this, "Invalid date/time format or property ID.");
        }
    }//GEN-LAST:event_sheduleButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        // Prompt the user for the Appointment ID
        String input = javax.swing.JOptionPane.showInputDialog(this, "Enter Appointment ID to delete:");

        // Check if the user entered something
        if (input != null && !input.trim().isEmpty()) {
            // Convert the input to an integer
            try {
                int appointmentID = Integer.parseInt(input.trim());

                // Get database connection
                try (Connection conn = DatabaseConnection.getConnection()) { // Use try-with-resources for auto closing
                    if (conn == null) {
                        javax.swing.JOptionPane.showMessageDialog(this, "Failed to connect to the database.");
                        return;
                    }

                    AppointmentController appointmentController = new AppointmentController();
                    boolean isDeleted = appointmentController.deleteAppointment(conn, appointmentID); // Pass the connection

                    // Show a confirmation or failure message
                    if (isDeleted) {
                        javax.swing.JOptionPane.showMessageDialog(this, "Appointment deleted successfully.");
                    } else {
                        javax.swing.JOptionPane.showMessageDialog(this, "Failed to delete appointment. Appointment ID may not exist.");
                    }
                }
            } catch (NumberFormatException e) {
                // Handle the case where the input is not a valid number
                javax.swing.JOptionPane.showMessageDialog(this, "Invalid Appointment ID. Please enter a valid number.");
            } catch (SQLException e) {
                // Handle SQL exceptions related to database operations
                e.printStackTrace();
                javax.swing.JOptionPane.showMessageDialog(this, "An error occurred while connecting to the database. Please try again.");
            }
        } else {
            // Handle the case where the user didn't enter anything
            javax.swing.JOptionPane.showMessageDialog(this, "Appointment ID is required to delete an appointment.");
        }
    }//GEN-LAST:event_deleteButtonActionPerformed

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
            java.util.logging.Logger.getLogger(WelcomebackPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WelcomebackPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WelcomebackPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WelcomebackPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WelcomebackPage("testUser", "testPassword", true).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField dateInsert;
    private javax.swing.JButton deleteButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JButton profileButton;
    private javax.swing.JLabel property1Label;
    private javax.swing.JLabel property2Label;
    private javax.swing.JLabel property3Label;
    private javax.swing.JLabel property4Label;
    private javax.swing.JLabel property4Label1;
    private javax.swing.JLabel property4Label2;
    private javax.swing.JTextField propertyidInsert;
    private javax.swing.JButton sheduleButton;
    private javax.swing.JLabel sheduleLabel;
    private javax.swing.JLabel sheduleLabel1;
    private javax.swing.JTextField timeInsert;
    private javax.swing.JLabel welcomebackLabel;
    // End of variables declaration//GEN-END:variables
}
