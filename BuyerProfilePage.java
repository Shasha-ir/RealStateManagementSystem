/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Controller.BuyerController;
import javax.swing.JOptionPane;



public class BuyerProfilePage extends javax.swing.JFrame {

    public BuyerProfilePage() {
        initComponents();
        this.setExtendedState(javax.swing.JFrame.MAXIMIZED_BOTH);
        makeFieldsNonEditable();
    }

    
    @SuppressWarnings("unchecked")

    // Setters to display the buyer's information in the text fields
    public void setNameField(String name) {
        nameInsert.setText(name);
    }

    public void setEmailField(String email) {
        emailInsert.setText(email);
    }

    public void setPhoneField(String phone) {
        phonenumInsert.setText(phone);
    }

    public void setPasswordField(String password) {
        passwordInsert.setText(password);
    }

    public void setUserIdField(String userId) {
        useridInsert.setText(userId);
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        profileLabel = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        emailLabel = new javax.swing.JLabel();
        phonenumLabel = new javax.swing.JLabel();
        passwordLabel = new javax.swing.JLabel();
        editButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        nameInsert = new javax.swing.JTextField();
        emailInsert = new javax.swing.JTextField();
        phonenumInsert = new javax.swing.JTextField();
        passwordInsert = new javax.swing.JTextField();
        homeButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        useridLabel = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        useridInsert = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        profileLabel.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        profileLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        profileLabel.setText("Profile");
        profileLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        profileLabel.setVerifyInputWhenFocusTarget(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 11;
        gridBagConstraints.ipadx = 799;
        gridBagConstraints.ipady = 22;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(32, 0, 0, 27);
        getContentPane().add(profileLabel, gridBagConstraints);

        nameLabel.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        nameLabel.setText("Name");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.ipadx = 53;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 117, 0, 0);
        getContentPane().add(nameLabel, gridBagConstraints);

        emailLabel.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        emailLabel.setText("E-mail");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 49;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(17, 117, 0, 0);
        getContentPane().add(emailLabel, gridBagConstraints);

        phonenumLabel.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        phonenumLabel.setText("Phone Number");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(22, 117, 0, 0);
        getContentPane().add(phonenumLabel, gridBagConstraints);

        passwordLabel.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        passwordLabel.setText("Password");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 57;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(24, 117, 0, 0);
        getContentPane().add(passwordLabel, gridBagConstraints);

        editButton.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        editButton.setText("Edit Details");
        editButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        editButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.ipadx = 76;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(95, 16, 16, 0);
        getContentPane().add(editButton, gridBagConstraints);

        jLabel1.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel1.setText(":");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 19;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 48, 0, 0);
        getContentPane().add(jLabel1, gridBagConstraints);

        jLabel2.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel2.setText(":");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 19;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 48, 0, 0);
        getContentPane().add(jLabel2, gridBagConstraints);

        jLabel3.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel3.setText(":");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 19;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(22, 48, 0, 0);
        getContentPane().add(jLabel3, gridBagConstraints);

        jLabel4.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel4.setText(":");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.ipadx = 19;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(22, 44, 0, 0);
        getContentPane().add(jLabel4, gridBagConstraints);

        nameInsert.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        nameInsert.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        nameInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameInsertActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(19, 6, 0, 0);
        getContentPane().add(nameInsert, gridBagConstraints);

        emailInsert.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        emailInsert.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        emailInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailInsertActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 358;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 6, 0, 0);
        getContentPane().add(emailInsert, gridBagConstraints);

        phonenumInsert.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        phonenumInsert.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        phonenumInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phonenumInsertActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 6, 0, 0);
        getContentPane().add(phonenumInsert, gridBagConstraints);

        passwordInsert.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        passwordInsert.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        passwordInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordInsertActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 8, 0, 0);
        getContentPane().add(passwordInsert, gridBagConstraints);

        homeButton.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        homeButton.setText("Home");
        homeButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        homeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 120;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(95, 52, 16, 0);
        getContentPane().add(homeButton, gridBagConstraints);

        deleteButton.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        deleteButton.setForeground(new java.awt.Color(255, 0, 0));
        deleteButton.setText("Delete Account");
        deleteButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.ipadx = 44;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(95, 77, 16, 0);
        getContentPane().add(deleteButton, gridBagConstraints);

        useridLabel.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        useridLabel.setText("User ID");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 37;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(67, 117, 0, 0);
        getContentPane().add(useridLabel, gridBagConstraints);

        jLabel5.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel5.setText(":");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 19;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(67, 44, 0, 0);
        getContentPane().add(jLabel5, gridBagConstraints);

        useridInsert.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        useridInsert.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        useridInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                useridInsertActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(63, 8, 0, 0);
        getContentPane().add(useridInsert, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void makeFieldsNonEditable() {
        nameInsert.setEditable(false);
        emailInsert.setEditable(false);
        phonenumInsert.setEditable(false);
        passwordInsert.setEditable(false);
        useridInsert.setEditable(false);
    }
    
    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed
        try {
            // Assuming useridInsert is a JTextField and contains the BuyerID as a String
            int buyerId = Integer.parseInt(useridInsert.getText());

            // Now pass the integer BuyerID to the EditBuyerPage constructor
            EditBuyerPage editBuyerPage = new EditBuyerPage(buyerId);
            editBuyerPage.setVisible(true);
            this.dispose();
        } catch (NumberFormatException e) {
            // Handle the case where the input is not a valid integer
            JOptionPane.showMessageDialog(this, "Invalid Buyer ID", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_editButtonActionPerformed

    private void nameInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameInsertActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameInsertActionPerformed

    private void emailInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailInsertActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailInsertActionPerformed

    private void phonenumInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phonenumInsertActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phonenumInsertActionPerformed

    private void passwordInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordInsertActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordInsertActionPerformed

    private void homeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeButtonActionPerformed
        // TODO add your handling code here:
        Home homePage = new Home();
        // Set the homePage to be visible
        homePage.setVisible(true);
        // Close the current frame
        this.dispose();
    }//GEN-LAST:event_homeButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        BuyerController buyerController = new BuyerController();
    
        // Get the text from the useridInsert JTextField
        String useridInsertString = useridInsert.getText(); // Get text from the JTextField

        try {
            // Parse the String to an int
            int buyerIdToDelete = Integer.parseInt(useridInsertString);
        
            // Perform delete operation
            boolean isDeleted = buyerController.deleteBuyer(buyerIdToDelete);

            if (isDeleted) {
                // Show success message
                JOptionPane.showMessageDialog(this, "Your Account is Successfully Deleted.\nSorry to see you go!", "Success", JOptionPane.INFORMATION_MESSAGE);
            
                // Navigate to Home.java
                Home homePage = new Home(); // Create an instance of Home
                homePage.setVisible(true);   // Show the Home page
                this.dispose();              // Close the current JFrame
            } else {
                // Show error message if deletion failed
                JOptionPane.showMessageDialog(this, "Error deleting account. Please try again.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (NumberFormatException e) {
            // Handle the case where the input is not a valid integer
            JOptionPane.showMessageDialog(this, "Invalid Buyer ID. Please enter a valid number.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void useridInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_useridInsertActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_useridInsertActionPerformed

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
            java.util.logging.Logger.getLogger(BuyerProfilePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BuyerProfilePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BuyerProfilePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BuyerProfilePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BuyerProfilePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton editButton;
    private javax.swing.JTextField emailInsert;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JButton homeButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField nameInsert;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextField passwordInsert;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JTextField phonenumInsert;
    private javax.swing.JLabel phonenumLabel;
    private javax.swing.JLabel profileLabel;
    private javax.swing.JTextField useridInsert;
    private javax.swing.JLabel useridLabel;
    // End of variables declaration//GEN-END:variables
}
