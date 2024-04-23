package com.mycompany.warehouse_management;

import com.formdev.flatlaf.FlatDarkLaf;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;


//import com.apache.commons.dbutils.DbUtils; // Assuming you're using DbUtils for resultSetToTableModel

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author lyeschl
 */
public class DashboardEntry extends javax.swing.JFrame {
    private CustomPanel customPanel;
    /**
     * Creates new form Dashboard
     */

    public DashboardEntry() {
        try {
        UIManager.setLookAndFeel(new FlatDarkLaf());

        
        
    } catch (Exception ex) {
        Logger.getLogger(AdvancedSearch.class.getName()).log(Level.SEVERE, null, ex);
    }
        initComponents();
        int windowWidth = 1130; // Adjust the desired width
        int windowHeight = 659; // Adjust the desired height
        setSize(windowWidth, windowHeight);
        setResizable(false); // Prevent resizing
        setLocationRelativeTo(null);
        DataBaseUtils.populateArticleTableWithoutSearch(articleTable);
        DataBaseUtils.populateMoveTable(movesTable);
    }

    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu2 = new javax.swing.JPopupMenu();
        exitTicketOption = new javax.swing.JMenuItem();
        returnTicketOption = new javax.swing.JMenuItem();
        jPanel2 = new javax.swing.JPanel();
        stockSheetButton = new javax.swing.JToggleButton();
        advancedSearchButton = new javax.swing.JToggleButton();
        exitTicketButton = new javax.swing.JToggleButton();
        returnTicketButton = new javax.swing.JToggleButton();
        manageArticlesButton = new javax.swing.JToggleButton();
        makeAMoveLabel = new javax.swing.JLabel();
        accountSettingsButton = new javax.swing.JToggleButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        movesTable = new javax.swing.JTable();
        movesLabel = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        articleTable = new javax.swing.JTable();
        articlesLabel = new javax.swing.JLabel();
        dashboardLabel = new javax.swing.JLabel();
        welcomeLabel = new javax.swing.JLabel();
        logoLabel1 = new javax.swing.JLabel();
        dashboardLogo = new javax.swing.JLabel();
        totalArticlesLabel = new javax.swing.JLabel();
        totalExitsLabel = new javax.swing.JLabel();
        totalReturnsLabel = new javax.swing.JLabel();
        backgroundImageLabel = new javax.swing.JLabel();

        exitTicketOption.setText("Exit Ticket");
        exitTicketOption.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitTicketOptionMouseClicked(evt);
            }
        });

        returnTicketOption.setText("Return Ticket");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(700, 600));
        getContentPane().setLayout(null);

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));

        stockSheetButton.setBackground(new java.awt.Color(51, 51, 51));
        stockSheetButton.setFont(new java.awt.Font("POI Aeronaut Trial", 1, 14)); // NOI18N
        stockSheetButton.setForeground(new java.awt.Color(153, 153, 153));
        stockSheetButton.setText("Stock Sheet");
        stockSheetButton.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 51, 102)));
        stockSheetButton.setContentAreaFilled(false);
        stockSheetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stockSheetButtonActionPerformed(evt);
            }
        });

        advancedSearchButton.setBackground(new java.awt.Color(51, 51, 51));
        advancedSearchButton.setFont(new java.awt.Font("POI Aeronaut Trial", 1, 14)); // NOI18N
        advancedSearchButton.setForeground(new java.awt.Color(153, 153, 153));
        advancedSearchButton.setText("Advanced Search");
        advancedSearchButton.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 51, 102)));
        advancedSearchButton.setContentAreaFilled(false);
        advancedSearchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                advancedSearchButtonActionPerformed(evt);
            }
        });

        exitTicketButton.setBackground(new java.awt.Color(51, 51, 51));
        exitTicketButton.setFont(new java.awt.Font("POI Aeronaut Trial", 1, 14)); // NOI18N
        exitTicketButton.setForeground(new java.awt.Color(153, 153, 153));
        exitTicketButton.setText("Make an Exit");
        exitTicketButton.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 51, 102)));
        exitTicketButton.setContentAreaFilled(false);
        exitTicketButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitTicketButtonActionPerformed(evt);
            }
        });

        returnTicketButton.setBackground(new java.awt.Color(51, 51, 51));
        returnTicketButton.setFont(new java.awt.Font("POI Aeronaut Trial", 1, 14)); // NOI18N
        returnTicketButton.setForeground(new java.awt.Color(153, 153, 153));
        returnTicketButton.setText("Make a Return");
        returnTicketButton.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 51, 102)));
        returnTicketButton.setContentAreaFilled(false);
        returnTicketButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnTicketButtonActionPerformed(evt);
            }
        });

        manageArticlesButton.setBackground(new java.awt.Color(51, 51, 51));
        manageArticlesButton.setFont(new java.awt.Font("POI Aeronaut Trial", 1, 14)); // NOI18N
        manageArticlesButton.setForeground(new java.awt.Color(153, 153, 153));
        manageArticlesButton.setText("Manage Articles");
        manageArticlesButton.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 51, 102)));
        manageArticlesButton.setContentAreaFilled(false);
        manageArticlesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageArticlesButtonActionPerformed(evt);
            }
        });

        makeAMoveLabel.setFont(new java.awt.Font("POI Aeronaut Trial", 0, 16)); // NOI18N
        makeAMoveLabel.setForeground(new java.awt.Color(102, 102, 102));
        makeAMoveLabel.setText("- Make a Move");

        accountSettingsButton.setBackground(new java.awt.Color(51, 51, 51));
        accountSettingsButton.setFont(new java.awt.Font("POI Aeronaut Trial", 1, 14)); // NOI18N
        accountSettingsButton.setForeground(new java.awt.Color(153, 153, 153));
        accountSettingsButton.setText("Account");
        accountSettingsButton.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 51, 102)));
        accountSettingsButton.setContentAreaFilled(false);
        accountSettingsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accountSettingsButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(returnTicketButton, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
                    .addComponent(advancedSearchButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(manageArticlesButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(exitTicketButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(stockSheetButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(makeAMoveLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(accountSettingsButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(advancedSearchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(manageArticlesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(stockSheetButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addComponent(makeAMoveLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(exitTicketButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(returnTicketButton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(238, 238, 238))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addContainerGap(525, Short.MAX_VALUE)
                    .addComponent(accountSettingsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(27, 27, 27)))
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(890, 30, 230, 590);

        movesTable.setForeground(new java.awt.Color(153, 204, 255));
        movesTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        movesTable.setGridColor(new java.awt.Color(51, 102, 255));
        movesTable.setSelectionBackground(new java.awt.Color(102, 153, 255));
        movesTable.setSelectionForeground(new java.awt.Color(102, 102, 255));
        jScrollPane1.setViewportView(movesTable);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(20, 120, 410, 180);

        movesLabel.setBackground(new java.awt.Color(255, 255, 255));
        movesLabel.setFont(new java.awt.Font("POI Aeronaut Trial", 1, 18)); // NOI18N
        movesLabel.setForeground(new java.awt.Color(255, 255, 255));
        movesLabel.setText("Movements");
        getContentPane().add(movesLabel);
        movesLabel.setBounds(30, 90, 100, 20);

        articleTable.setForeground(new java.awt.Color(153, 204, 255));
        articleTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        articleTable.setGridColor(new java.awt.Color(51, 102, 255));
        articleTable.setSelectionBackground(new java.awt.Color(102, 153, 255));
        articleTable.setSelectionForeground(new java.awt.Color(102, 102, 255));
        articleTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                articleTableMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(articleTable);

        getContentPane().add(jScrollPane3);
        jScrollPane3.setBounds(20, 340, 420, 160);

        articlesLabel.setFont(new java.awt.Font("POI Aeronaut Trial", 1, 18)); // NOI18N
        articlesLabel.setForeground(new java.awt.Color(255, 255, 255));
        articlesLabel.setText("Articles");
        getContentPane().add(articlesLabel);
        articlesLabel.setBounds(30, 310, 60, 30);

        dashboardLabel.setBackground(new java.awt.Color(255, 255, 255));
        dashboardLabel.setFont(new java.awt.Font("POI Aeronaut Trial", 1, 36)); // NOI18N
        dashboardLabel.setForeground(new java.awt.Color(255, 255, 255));
        dashboardLabel.setText("Dashboard");
        getContentPane().add(dashboardLabel);
        dashboardLabel.setBounds(50, 10, 190, 40);

        welcomeLabel.setBackground(new java.awt.Color(255, 255, 255));
        welcomeLabel.setFont(new java.awt.Font("POI Aeronaut Trial", 1, 36)); // NOI18N
        welcomeLabel.setForeground(new java.awt.Color(255, 255, 255));
        welcomeLabel.setText("Welcome");
        getContentPane().add(welcomeLabel);
        welcomeLabel.setBounds(390, 10, 170, 40);

        logoLabel1.setBackground(new java.awt.Color(255, 255, 255));
        logoLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/output-onlinepngtools(1).png"))); // NOI18N
        getContentPane().add(logoLabel1);
        logoLabel1.setBounds(10, 590, 60, 65);

        dashboardLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dashboard_icon.png"))); // NOI18N
        getContentPane().add(dashboardLogo);
        dashboardLogo.setBounds(10, 10, 30, 30);

        totalArticlesLabel.setFont(new java.awt.Font("POI Aeronaut Trial", 0, 16)); // NOI18N
        int totalArticles = DataBaseUtils.getTotalArticles();
        totalArticlesLabel.setText("Total Articles: " + totalArticles);
        getContentPane().add(totalArticlesLabel);
        totalArticlesLabel.setBounds(500, 60, 120, 30);

        int totalExits = DataBaseUtils.getTotalExits();
        totalExitsLabel.setFont(new java.awt.Font("POI Aeronaut Trial", 0, 16)); // NOI18N
        totalExitsLabel.setText("Total Exits: " + totalExits);
        getContentPane().add(totalExitsLabel);
        totalExitsLabel.setBounds(620, 60, 120, 30);

        int totalReturns = DataBaseUtils.getTotalReturns();
        totalReturnsLabel.setFont(new java.awt.Font("POI Aeronaut Trial", 0, 16)); // NOI18N
        totalReturnsLabel.setText("Total Returns: " + totalReturns);
        getContentPane().add(totalReturnsLabel);
        totalReturnsLabel.setBounds(740, 60, 130, 30);

        backgroundImageLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sunset-gradient-hd-wallpaper(1).png"))); // NOI18N
        backgroundImageLabel.setText("jLabel1");
        getContentPane().add(backgroundImageLabel);
        backgroundImageLabel.setBounds(0, 0, 1340, 760);
        // Remove the backgroundImageLabel
        getContentPane().remove(backgroundImageLabel);

        // Create and add the CustomPanel
        customPanel = new CustomPanel();
        customPanel.setBounds(0, 0, 1340, 760);
        getContentPane().add(customPanel);
        customPanel.setLayout(null);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitTicketOptionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTicketOptionMouseClicked
        // TODO add your handling code here:
        dispose();
        ExitTicket eti = new ExitTicket();
        eti.setVisible(true);
    }//GEN-LAST:event_exitTicketOptionMouseClicked

    private void advancedSearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_advancedSearchButtonActionPerformed
        // TODO add your handling code here:
        dispose();

        AdvancedSearch advs = new AdvancedSearch();
        advs.setVisible(true);
    }//GEN-LAST:event_advancedSearchButtonActionPerformed

    private void stockSheetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stockSheetButtonActionPerformed
        // TODO add your handling code here:
        dispose();
        StockSheet ss = new StockSheet();
        ss.setVisible(true);
    }//GEN-LAST:event_stockSheetButtonActionPerformed

    private void exitTicketButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitTicketButtonActionPerformed
        // TODO add your handling code here:
        dispose();
        ExitTicket et = new ExitTicket();
        et.setVisible(true);
    }//GEN-LAST:event_exitTicketButtonActionPerformed

    private void returnTicketButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnTicketButtonActionPerformed
        // TODO add your handling code here:
        dispose();
        ReturnTicket rt = new ReturnTicket();
        rt.setVisible(true);
    }//GEN-LAST:event_returnTicketButtonActionPerformed

    private void articleTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_articleTableMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_articleTableMouseClicked

    private void manageArticlesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageArticlesButtonActionPerformed
        // TODO add your handling code here:
        dispose();
        ArticleSheetConsult as = new ArticleSheetConsult();
        as.setVisible(true);
    }//GEN-LAST:event_manageArticlesButtonActionPerformed

    private void accountSettingsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accountSettingsButtonActionPerformed
        // TODO add your handling code here:
        dispose();
        AccountSettings as = new AccountSettings();
        as.setVisible(true);
    }//GEN-LAST:event_accountSettingsButtonActionPerformed

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
            java.util.logging.Logger.getLogger(DashboardEntry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DashboardEntry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DashboardEntry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DashboardEntry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DashboardEntry().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton accountSettingsButton;
    private javax.swing.JToggleButton advancedSearchButton;
    private javax.swing.JTable articleTable;
    private javax.swing.JLabel articlesLabel;
    private javax.swing.JLabel backgroundImageLabel;
    private javax.swing.JLabel dashboardLabel;
    private javax.swing.JLabel dashboardLogo;
    private javax.swing.JToggleButton exitTicketButton;
    private javax.swing.JMenuItem exitTicketOption;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPopupMenu jPopupMenu2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel logoLabel1;
    private javax.swing.JLabel makeAMoveLabel;
    private javax.swing.JToggleButton manageArticlesButton;
    private javax.swing.JLabel movesLabel;
    private javax.swing.JTable movesTable;
    private javax.swing.JToggleButton returnTicketButton;
    private javax.swing.JMenuItem returnTicketOption;
    private javax.swing.JToggleButton stockSheetButton;
    private javax.swing.JLabel totalArticlesLabel;
    private javax.swing.JLabel totalExitsLabel;
    private javax.swing.JLabel totalReturnsLabel;
    private javax.swing.JLabel welcomeLabel;
    // End of variables declaration//GEN-END:variables
}
