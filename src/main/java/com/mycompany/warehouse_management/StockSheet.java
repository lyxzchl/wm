/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.warehouse_management;

import com.formdev.flatlaf.FlatDarkLaf;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author lyeschl
 */
public class StockSheet extends javax.swing.JFrame {

    /**
     * Creates new form StockSheet
     */
    public StockSheet() {
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
        
        DataBaseUtils.populateMoveTable(movesTable);
        movesTable.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
        @Override
    public void valueChanged(ListSelectionEvent event) {
        if (!event.getValueIsAdjusting()) {
            int selectedRow = movesTable.getSelectedRow();
            if (selectedRow != -1) {
                // Retrieve the values directly from the TableModel
                DefaultTableModel model = (DefaultTableModel) movesTable.getModel();
                String type = (String) model.getValueAt(selectedRow, 0);
                String num = (String) model.getValueAt(selectedRow, 1);
                String numOT = (String) model.getValueAt(selectedRow, 2);
                String codeAnal = (String) model.getValueAt(selectedRow, 3);
                String codeMag = (String) model.getValueAt(selectedRow, 4);
                String codeUnit = (String) model.getValueAt(selectedRow, 5);
                Date dateSort = (Date) model.getValueAt(selectedRow, 6);
                int total = ((Number) model.getValueAt(selectedRow, 7)).intValue();
                Date dateValide = (Date) model.getValueAt(selectedRow, 8);
                String valide = (String) model.getValueAt(selectedRow, 9);
                String annule = (String) model.getValueAt(selectedRow, 10);

                // Populate the text fields
                articleCodeTextField.setText(num);
                classTextField.setText(codeAnal);
                mesureUTextField.setText(codeUnit);
                shelfTextField.setText(codeMag);
                aisleTextField.setText(numOT);
                stockMinTextField.setText(String.valueOf(total));
                stockMaxTextField.setText(valide);
            }
        }
    }
});





    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        headerPanel = new javax.swing.JPanel();
        articleCodeLabel = new javax.swing.JLabel();
        articleCodeTextField = new javax.swing.JTextField();
        classTextField = new javax.swing.JTextField();
        classLabel = new javax.swing.JLabel();
        measureULabel = new javax.swing.JLabel();
        mesureUTextField = new javax.swing.JTextField();
        shelfTextField = new javax.swing.JTextField();
        shelfLabel = new javax.swing.JLabel();
        aisleLabel = new javax.swing.JLabel();
        aisleTextField = new javax.swing.JTextField();
        stockMinLabel = new javax.swing.JLabel();
        stockMaxLabel = new javax.swing.JLabel();
        stockMaxTextField = new javax.swing.JTextField();
        stockMinTextField = new javax.swing.JTextField();
        stockSheetTitleLabel = new javax.swing.JLabel();
        aisleLabel1 = new javax.swing.JLabel();
        pumpTextField = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        movesTable = new javax.swing.JTable();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        articleCodeLabel.setFont(new java.awt.Font("POI Aeronaut Trial", 0, 16)); // NOI18N
        articleCodeLabel.setText("Article Code");

        articleCodeTextField.setBackground(new java.awt.Color(102, 102, 102));
        articleCodeTextField.setFont(new java.awt.Font("POI Aeronaut Trial", 0, 16)); // NOI18N
        articleCodeTextField.setForeground(new java.awt.Color(255, 255, 255));
        articleCodeTextField.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 51)));
        articleCodeTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                articleCodeTextFieldActionPerformed(evt);
            }
        });

        classTextField.setBackground(new java.awt.Color(102, 102, 102));
        classTextField.setForeground(new java.awt.Color(255, 255, 255));
        classTextField.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 51, 102)));
        classTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                classTextFieldActionPerformed(evt);
            }
        });

        classLabel.setFont(new java.awt.Font("POI Aeronaut Trial", 0, 14)); // NOI18N
        classLabel.setForeground(new java.awt.Color(255, 255, 255));
        classLabel.setText("Class");

        measureULabel.setFont(new java.awt.Font("POI Aeronaut Trial", 0, 14)); // NOI18N
        measureULabel.setForeground(new java.awt.Color(255, 255, 255));
        measureULabel.setText("Mesure Unit");

        mesureUTextField.setBackground(new java.awt.Color(102, 102, 102));
        mesureUTextField.setForeground(new java.awt.Color(255, 255, 255));
        mesureUTextField.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 51, 102)));
        mesureUTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mesureUTextFieldActionPerformed(evt);
            }
        });

        shelfTextField.setBackground(new java.awt.Color(102, 102, 102));
        shelfTextField.setForeground(new java.awt.Color(255, 255, 255));
        shelfTextField.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 51, 102)));
        shelfTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shelfTextFieldActionPerformed(evt);
            }
        });

        shelfLabel.setFont(new java.awt.Font("POI Aeronaut Trial", 0, 14)); // NOI18N
        shelfLabel.setForeground(new java.awt.Color(255, 255, 255));
        shelfLabel.setText("Shelf");

        aisleLabel.setFont(new java.awt.Font("POI Aeronaut Trial", 0, 14)); // NOI18N
        aisleLabel.setForeground(new java.awt.Color(255, 255, 255));
        aisleLabel.setText("Aisle");

        aisleTextField.setBackground(new java.awt.Color(102, 102, 102));
        aisleTextField.setForeground(new java.awt.Color(255, 255, 255));
        aisleTextField.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 51, 102)));
        aisleTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aisleTextFieldActionPerformed(evt);
            }
        });

        stockMinLabel.setFont(new java.awt.Font("POI Aeronaut Trial", 0, 14)); // NOI18N
        stockMinLabel.setForeground(new java.awt.Color(255, 255, 255));
        stockMinLabel.setText("Stock Min");

        stockMaxLabel.setFont(new java.awt.Font("POI Aeronaut Trial", 0, 14)); // NOI18N
        stockMaxLabel.setForeground(new java.awt.Color(255, 255, 255));
        stockMaxLabel.setText("Stock Max");

        stockMaxTextField.setBackground(new java.awt.Color(102, 102, 102));
        stockMaxTextField.setForeground(new java.awt.Color(255, 255, 255));
        stockMaxTextField.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 51, 102)));
        stockMaxTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stockMaxTextFieldActionPerformed(evt);
            }
        });

        stockMinTextField.setBackground(new java.awt.Color(102, 102, 102));
        stockMinTextField.setForeground(new java.awt.Color(255, 255, 255));
        stockMinTextField.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 51, 102)));
        stockMinTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stockMinTextFieldActionPerformed(evt);
            }
        });

        stockSheetTitleLabel.setFont(new java.awt.Font("POI Aeronaut Trial", 1, 36)); // NOI18N
        stockSheetTitleLabel.setText("Stock Sheet");

        aisleLabel1.setFont(new java.awt.Font("POI Aeronaut Trial", 0, 14)); // NOI18N
        aisleLabel1.setForeground(new java.awt.Color(255, 255, 255));
        aisleLabel1.setText("PUMP");

        pumpTextField.setBackground(new java.awt.Color(102, 102, 102));
        pumpTextField.setForeground(new java.awt.Color(255, 255, 255));
        pumpTextField.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 51, 102)));
        pumpTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pumpTextFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout headerPanelLayout = new javax.swing.GroupLayout(headerPanel);
        headerPanel.setLayout(headerPanelLayout);
        headerPanelLayout.setHorizontalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerPanelLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(headerPanelLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(articleCodeLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(articleCodeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(274, 274, 274)
                        .addComponent(stockSheetTitleLabel)
                        .addContainerGap(329, Short.MAX_VALUE))
                    .addGroup(headerPanelLayout.createSequentialGroup()
                        .addGroup(headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(headerPanelLayout.createSequentialGroup()
                                .addComponent(measureULabel)
                                .addGap(39, 39, 39)
                                .addComponent(mesureUTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(headerPanelLayout.createSequentialGroup()
                                .addComponent(classLabel)
                                .addGap(28, 28, 28)
                                .addComponent(classTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(headerPanelLayout.createSequentialGroup()
                                .addComponent(shelfLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(shelfTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(headerPanelLayout.createSequentialGroup()
                                .addComponent(aisleLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pumpTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(stockMinLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(aisleLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(stockMaxLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(aisleTextField, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(stockMaxTextField, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(stockMinTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36))))
        );
        headerPanelLayout.setVerticalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerPanelLayout.createSequentialGroup()
                .addGroup(headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(headerPanelLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(articleCodeLabel)
                            .addComponent(articleCodeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(stockSheetTitleLabel))
                        .addGap(5, 5, 5)
                        .addGroup(headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(stockMinTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(stockMinLabel))
                        .addGap(18, 18, 18)
                        .addGroup(headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(stockMaxTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(stockMaxLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(aisleTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(aisleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(headerPanelLayout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addGroup(headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(mesureUTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(measureULabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(classLabel)
                            .addComponent(classTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(shelfTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(shelfLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pumpTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(aisleLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        // Define the column types
        java.lang.Class<?>[] columnTypes = {
            String.class, // type
            String.class, // num
            String.class, // num_OT
            String.class, // code_anal
            String.class, // code_mag
            String.class, // code_unit
            Date.class,   // date_sort
            Integer.class, // total
            Date.class,   // date_valide
            String.class, // valide
            String.class  // annule
        };
        movesTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object[][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "type", "num", "num_OT", "code_anal", "code_mag", "code_unit", "date_sort", "total", "date_valide", "valide", "annule"
            }
        ) {
            @Override
            public java.lang.Class<?> getColumnClass(int columnIndex) {
                return columnTypes[columnIndex];
            }
        }
    );
    jScrollPane2.setViewportView(movesTable);

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addComponent(headerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(126, 126, 126))
                .addComponent(jScrollPane2))
            .addContainerGap(220, Short.MAX_VALUE))
    );
    jPanel1Layout.setVerticalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(headerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGap(18, 18, 18)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap())
    );

    getContentPane().add(jPanel1);
    jPanel1.setBounds(0, 0, 1330, 660);

    pack();
    }// </editor-fold>//GEN-END:initComponents

    private void articleCodeTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_articleCodeTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_articleCodeTextFieldActionPerformed

    private void classTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_classTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_classTextFieldActionPerformed

    private void mesureUTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mesureUTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mesureUTextFieldActionPerformed

    private void stockMinTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stockMinTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_stockMinTextFieldActionPerformed

    private void stockMaxTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stockMaxTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_stockMaxTextFieldActionPerformed

    private void shelfTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shelfTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_shelfTextFieldActionPerformed

    private void aisleTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aisleTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_aisleTextFieldActionPerformed

    private void pumpTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pumpTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pumpTextFieldActionPerformed

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
            java.util.logging.Logger.getLogger(StockSheet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StockSheet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StockSheet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StockSheet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StockSheet().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel aisleLabel;
    private javax.swing.JLabel aisleLabel1;
    private javax.swing.JTextField aisleTextField;
    private javax.swing.JLabel articleCodeLabel;
    private javax.swing.JTextField articleCodeTextField;
    private javax.swing.JLabel classLabel;
    private javax.swing.JTextField classTextField;
    private javax.swing.JPanel headerPanel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel measureULabel;
    private javax.swing.JTextField mesureUTextField;
    private javax.swing.JTable movesTable;
    private javax.swing.JTextField pumpTextField;
    private javax.swing.JLabel shelfLabel;
    private javax.swing.JTextField shelfTextField;
    private javax.swing.JLabel stockMaxLabel;
    private javax.swing.JTextField stockMaxTextField;
    private javax.swing.JLabel stockMinLabel;
    private javax.swing.JTextField stockMinTextField;
    private javax.swing.JLabel stockSheetTitleLabel;
    // End of variables declaration//GEN-END:variables
}
