/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.warehouse_management;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.FontFormatException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author lyeschl
 */
public class LoginInterface extends javax.swing.JFrame {

    /**
     * Creates new form LoginInterface2
     */
    public LoginInterface() {
        initComponents();
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension screenSize = toolkit.getScreenSize();
        int screenWidth = screenSize.width;
        int screenHeight = screenSize.height;

        int windowWidth = (int) (screenWidth * 0.8);
        int windowHeight = (int) (screenHeight * 0.8);
        setSize(windowWidth, windowHeight);
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        loginPanel = new javax.swing.JPanel();
        loginLabel = new javax.swing.JLabel();
        usernameLabel = new javax.swing.JLabel();
        usernameField = new javax.swing.JTextField();
        passwordLabel = new javax.swing.JLabel();
        passwordField = new javax.swing.JPasswordField();
        continueButton = new javax.swing.JButton();
        blockedButton = new javax.swing.JButton();
        sloganLabel2 = new javax.swing.JLabel();
        sloganLabel3 = new javax.swing.JLabel();
        logoLabel = new javax.swing.JLabel();
        sloganLabel1 = new javax.swing.JLabel();
        sloganLabel4 = new javax.swing.JLabel();
        backgroundImage = new javax.swing.JLabel();
        jSplitPane1 = new javax.swing.JSplitPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(600, 500));
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                formMouseMoved(evt);
            }
        });
        getContentPane().setLayout(null);

        loginPanel.setBackground(new java.awt.Color(51, 51, 51));
        loginPanel.setForeground(new java.awt.Color(204, 204, 204));

        loginLabel.setFont(new java.awt.Font("POI Aeronaut Trial", 1, 36)); // NOI18N
        loginLabel.setForeground(new java.awt.Color(204, 204, 204));
        loginLabel.setText("Login ");

        usernameLabel.setFont(new java.awt.Font("POI Aeronaut Trial", 0, 18)); // NOI18N
        usernameLabel.setForeground(new java.awt.Color(204, 204, 204));
        usernameLabel.setText("username");

        usernameField.setBackground(new java.awt.Color(51, 51, 51));
        usernameField.setFont(new java.awt.Font("POI Aeronaut Trial", 0, 18)); // NOI18N
        usernameField.setForeground(new java.awt.Color(153, 153, 153));
        usernameField.setText("gdt");
        usernameField.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 51, 102)));

        passwordLabel.setFont(new java.awt.Font("POI Aeronaut Trial", 0, 14)); // NOI18N
        passwordLabel.setForeground(new java.awt.Color(204, 204, 204));
        passwordLabel.setText("password");

        passwordField.setBackground(new java.awt.Color(51, 51, 51));
        passwordField.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        passwordField.setForeground(new java.awt.Color(153, 153, 153));
        passwordField.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 51, 102)));
        passwordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordFieldActionPerformed(evt);
            }
        });

        continueButton.setBackground(new java.awt.Color(102, 102, 255));
        continueButton.setFont(new java.awt.Font("POI Aeronaut Trial", 1, 14)); // NOI18N
        continueButton.setForeground(new java.awt.Color(153, 153, 153));
        continueButton.setText("Continue");
        continueButton.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 51, 102)));
        continueButton.setContentAreaFilled(false);
        continueButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                continueButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                continueButtonMouseEntered(evt);
            }
        });
        continueButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                continueButtonActionPerformed(evt);
            }
        });

        blockedButton.setBackground(new java.awt.Color(51, 51, 51));
        blockedButton.setFont(new java.awt.Font("POI Aeronaut Trial", 0, 11)); // NOI18N
        blockedButton.setForeground(new java.awt.Color(153, 153, 153));
        blockedButton.setText("Account Blocked ?");
        blockedButton.setBorder(null);
        blockedButton.setContentAreaFilled(false);

        javax.swing.GroupLayout loginPanelLayout = new javax.swing.GroupLayout(loginPanel);
        loginPanel.setLayout(loginPanelLayout);
        loginPanelLayout.setHorizontalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginPanelLayout.createSequentialGroup()
                .addContainerGap(98, Short.MAX_VALUE)
                .addComponent(loginLabel)
                .addGap(96, 96, 96))
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(usernameField)
                    .addComponent(passwordField)
                    .addComponent(passwordLabel)
                    .addComponent(usernameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(continueButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(blockedButton, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        loginPanelLayout.setVerticalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(loginLabel)
                .addGap(56, 56, 56)
                .addComponent(usernameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(passwordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(continueButton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(blockedButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );

        getContentPane().add(loginPanel);
        loginPanel.setBounds(780, 40, 290, 440);

        sloganLabel2.setFont(new java.awt.Font("URW Gothic", 1, 36)); // NOI18N
        sloganLabel2.setForeground(new java.awt.Color(255, 255, 255));
        sloganLabel2.setText("Effortless Exits,");
        getContentPane().add(sloganLabel2);
        sloganLabel2.setBounds(60, 130, 270, 50);

        sloganLabel3.setFont(new java.awt.Font("URW Gothic", 1, 36)); // NOI18N
        sloganLabel3.setForeground(new java.awt.Color(255, 255, 255));
        sloganLabel3.setText("Seemless Returns.");
        getContentPane().add(sloganLabel3);
        sloganLabel3.setBounds(230, 200, 320, 70);

        logoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/output-onlinepngtools(1).png"))); // NOI18N
        getContentPane().add(logoLabel);
        logoLabel.setBounds(10, 550, 50, 65);

        sloganLabel1.setFont(new java.awt.Font("URW Gothic", 1, 36)); // NOI18N
        sloganLabel1.setForeground(new java.awt.Color(255, 255, 255));
        sloganLabel1.setText("#########");
        getContentPane().add(sloganLabel1);
        sloganLabel1.setBounds(280, 60, 363, 45);

        sloganLabel4.setFont(new java.awt.Font("URW Gothic", 1, 36)); // NOI18N
        sloganLabel4.setForeground(new java.awt.Color(255, 255, 255));
        sloganLabel4.setText("Warehouse Management App");
        getContentPane().add(sloganLabel4);
        sloganLabel4.setBounds(10, 20, 550, 45);

        backgroundImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sunset-gradient-hd-wallpaper(1).png"))); // NOI18N
        backgroundImage.setText("jLabel1");
        getContentPane().add(backgroundImage);
        backgroundImage.setBounds(0, -10, 1120, 630);
        getContentPane().add(jSplitPane1);
        jSplitPane1.setBounds(180, 420, 202, 26);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void continueButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_continueButtonMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_continueButtonMouseEntered

    private void formMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_formMouseMoved

    private void passwordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordFieldActionPerformed

    private void continueButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_continueButtonActionPerformed
        try {
        int authResult = DataBaseUtils.authenticateUser(usernameField.getText(), passwordField.getText());
        switch (authResult) {
            case 0:
                // User authentication successful
                // Open the dashboard and close the login interface
                Dashboard db = new Dashboard();
                db.setVisible(true);
                dispose();
                break;
            case 1:
                // User authentication failed
                JOptionPane.showMessageDialog(this, "Invalid username or password.", "Error", JOptionPane.ERROR_MESSAGE);
                break;
            case 2:
                // Account is not active
                JOptionPane.showMessageDialog(this, "Your account is currently inactive. Please contact the administrator.", "Error", JOptionPane.ERROR_MESSAGE);
                break;
            case 3:
                // Account is locked
                JOptionPane.showMessageDialog(this, "Your account has been locked due to too many failed attempts. Please contact the administrator.", "Error", JOptionPane.ERROR_MESSAGE);
                break;
            case -1:
                // Username not found
                JOptionPane.showMessageDialog(this, "Invalid username or password.", "Error", JOptionPane.ERROR_MESSAGE);
                break;
        }
    } catch (SQLException ex) {
        Logger.getLogger(LoginInterface.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_continueButtonActionPerformed

    private void continueButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_continueButtonMouseClicked
        // TODO add your handling code here:
        try {
        int authResult = DataBaseUtils.authenticateUser(usernameField.getText(), passwordField.getText());
        switch (authResult) {
            case 0:
                // User authentication successful
                // Open the dashboard and close the login interface
                Dashboard db = new Dashboard();
                db.setVisible(true);
                dispose();
                break;
            case 1:
                // User authentication failed
                JOptionPane.showMessageDialog(this, "Invalid username or password.", "Error", JOptionPane.ERROR_MESSAGE);
                break;
            case 2:
                // Account is not active
                JOptionPane.showMessageDialog(this, "Your account is currently inactive. Please contact the administrator.", "Error", JOptionPane.ERROR_MESSAGE);
                break;
            case 3:
                // Account is locked
                JOptionPane.showMessageDialog(this, "Your account has been locked due to too many failed attempts. Please contact the administrator.", "Error", JOptionPane.ERROR_MESSAGE);
                break;
            case -1:
                // Username not found
                JOptionPane.showMessageDialog(this, "Invalid username or password.", "Error", JOptionPane.ERROR_MESSAGE);
                break;
        }
    } catch (SQLException ex) {
        Logger.getLogger(LoginInterface.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_continueButtonMouseClicked

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
            java.util.logging.Logger.getLogger(LoginInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginInterface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backgroundImage;
    private javax.swing.JButton blockedButton;
    private javax.swing.JButton continueButton;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JLabel loginLabel;
    private javax.swing.JPanel loginPanel;
    private javax.swing.JLabel logoLabel;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JLabel sloganLabel1;
    private javax.swing.JLabel sloganLabel2;
    private javax.swing.JLabel sloganLabel3;
    private javax.swing.JLabel sloganLabel4;
    private javax.swing.JTextField usernameField;
    private javax.swing.JLabel usernameLabel;
    // End of variables declaration//GEN-END:variables
}
