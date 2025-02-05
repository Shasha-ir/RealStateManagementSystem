/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

/**
 *
 * @author Shasha
 */
import Controller.BuyerController;
import Controller.SellerController;
import Model.Buyer;
import Model.Seller;
import javax.swing.JOptionPane;
import View.Home; 

public class LoginPage extends javax.swing.JFrame {

    /**
     * Creates new form LoginPage
     */
    public LoginPage() {
        initComponents();
        this.setExtendedState(javax.swing.JFrame.MAXIMIZED_BOTH);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        nameLabel = new javax.swing.JLabel();
        passwordLabel1 = new javax.swing.JLabel();
        passwordInput = new javax.swing.JTextField();
        nameInput1 = new javax.swing.JTextField();
        loginButton = new javax.swing.JButton();
        backButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        nameLabel.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        nameLabel.setText("Name        :-");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(224, 159, 0, 0);
        getContentPane().add(nameLabel, gridBagConstraints);

        passwordLabel1.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        passwordLabel1.setText("Password   :-");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 27;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(21, 159, 0, 0);
        getContentPane().add(passwordLabel1, gridBagConstraints);

        passwordInput.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        passwordInput.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 409;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 6, 0, 92);
        getContentPane().add(passwordInput, gridBagConstraints);

        nameInput1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        nameInput1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        nameInput1.setDragEnabled(true);
        nameInput1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameInput1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 409;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(221, 6, 0, 92);
        getContentPane().add(nameInput1, gridBagConstraints);

        loginButton.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        loginButton.setText("Log In");
        loginButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.ipadx = 84;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(56, 6, 0, 0);
        getContentPane().add(loginButton, gridBagConstraints);

        backButton1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        backButton1.setText("Back");
        backButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButton1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.ipadx = 102;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(36, 6, 118, 0);
        getContentPane().add(backButton1, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nameInput1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameInput1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameInput1ActionPerformed

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        String name = nameInput1.getText().trim();
        String password = passwordInput.getText().trim();

        // Check if both fields are filled
        if (name.isEmpty() || password.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter both name and password.", "Input Error", JOptionPane.WARNING_MESSAGE);
            return;
        }

        // Create instances of BuyerController and SellerController
        BuyerController buyerController = new BuyerController();
        SellerController sellerController = new SellerController();

        // Check in Buyer table
        Buyer buyer = buyerController.searchBuyer(name, password);
        if (buyer != null) {
            // Pass buyer's name and password to WelcomebackPage
            new WelcomebackPage(buyer.getName(), password, true).setVisible(true);
            this.dispose(); // Close the LoginPage
            return;
        }

        // Check in Seller table
        Seller seller = sellerController.searchSeller(name, password);
        if (seller != null) {
            // Pass seller's name and password to WelcomebackPage
            new WelcomebackSellerPage(seller.getName(), password, false).setVisible(true);
            this.dispose(); // Close the LoginPage
            return;
        }

        // If no match is found
        JOptionPane.showMessageDialog(this, "Invalid credentials. Please check and try again.", "Login Failed", JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_loginButtonActionPerformed

    private void backButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButton1ActionPerformed
        // TODO add your handling code here:
        // Create an instance of the Home class
        Home homePage = new Home();
        // Set the homePage to be visible
        homePage.setVisible(true);
        // Close the current frame
        this.dispose();
    }//GEN-LAST:event_backButton1ActionPerformed

    
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
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton1;
    private javax.swing.JButton loginButton;
    private javax.swing.JTextField nameInput1;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextField passwordInput;
    private javax.swing.JLabel passwordLabel1;
    // End of variables declaration//GEN-END:variables
}
