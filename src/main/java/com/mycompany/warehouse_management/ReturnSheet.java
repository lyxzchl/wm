/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.warehouse_management;

import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author lyeschl
 */
public class ReturnSheet extends javax.swing.JFrame {

    /**
     * Creates new form ExitSheet
     */
    public ReturnSheet() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        headerPanel = new javax.swing.JPanel();
        sheetLogo = new javax.swing.JLabel();
        returnSheetLabel = new javax.swing.JLabel();
        exitDescription = new javax.swing.JLabel();
        brsCodeLabel = new javax.swing.JLabel();
        brsCodeTextField = new javax.swing.JTextField();
        warehouseCodeLabel = new javax.swing.JLabel();
        warehouseCodeTextField = new javax.swing.JTextField();
        returnDateLabel = new javax.swing.JLabel();
        returnDateTextField = new javax.swing.JTextField();
        totalLabel = new javax.swing.JLabel();
        totalTextField = new javax.swing.JTextField();
        validDateLabel = new javax.swing.JLabel();
        validDateTextField = new javax.swing.JTextField();
        validToggleButton = new javax.swing.JToggleButton();
        validLabel = new javax.swing.JLabel();
        canceledLabel = new javax.swing.JLabel();
        canceledToggleButton = new javax.swing.JToggleButton();
        goToFirstButton = new javax.swing.JButton();
        lastButton = new javax.swing.JButton();
        nextButton = new javax.swing.JButton();
        goToLastButton = new javax.swing.JButton();
        addButton = new javax.swing.JButton();
        changeButton = new javax.swing.JButton();
        saveButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        headerPanel.setBackground(new java.awt.Color(102, 51, 0));

        sheetLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sheet_logo.png"))); // NOI18N

        returnSheetLabel.setFont(new java.awt.Font("POI Aeronaut Trial", 1, 24)); // NOI18N
        returnSheetLabel.setText("Return Sheet");

        javax.swing.GroupLayout headerPanelLayout = new javax.swing.GroupLayout(headerPanel);
        headerPanel.setLayout(headerPanelLayout);
        headerPanelLayout.setHorizontalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerPanelLayout.createSequentialGroup()
                .addGap(401, 401, 401)
                .addComponent(sheetLogo)
                .addGap(18, 18, 18)
                .addComponent(returnSheetLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        headerPanelLayout.setVerticalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(returnSheetLabel)
                    .addComponent(sheetLogo))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        exitDescription.setFont(new java.awt.Font("POI Aeronaut Trial", 0, 18)); // NOI18N
        exitDescription.setForeground(new java.awt.Color(255, 255, 255));
        exitDescription.setText("Return Description");

        brsCodeLabel.setFont(new java.awt.Font("POI Aeronaut Trial", 0, 14)); // NOI18N
        brsCodeLabel.setForeground(new java.awt.Color(255, 255, 255));
        brsCodeLabel.setText("BRS Code");

        brsCodeTextField.setBackground(new java.awt.Color(102, 102, 102));
        brsCodeTextField.setForeground(new java.awt.Color(255, 255, 255));
        brsCodeTextField.setText("245");
        brsCodeTextField.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 51, 102)));
        brsCodeTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brsCodeTextFieldActionPerformed(evt);
            }
        });

        warehouseCodeLabel.setFont(new java.awt.Font("POI Aeronaut Trial", 0, 14)); // NOI18N
        warehouseCodeLabel.setForeground(new java.awt.Color(255, 255, 255));
        warehouseCodeLabel.setText("Warehouse Code");

        warehouseCodeTextField.setBackground(new java.awt.Color(102, 102, 102));
        warehouseCodeTextField.setForeground(new java.awt.Color(255, 255, 255));
        warehouseCodeTextField.setText("245");
        warehouseCodeTextField.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 51, 102)));
        warehouseCodeTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                warehouseCodeTextFieldActionPerformed(evt);
            }
        });

        returnDateLabel.setFont(new java.awt.Font("POI Aeronaut Trial", 0, 14)); // NOI18N
        returnDateLabel.setForeground(new java.awt.Color(255, 255, 255));
        returnDateLabel.setText("Return Date");

        returnDateTextField.setBackground(new java.awt.Color(102, 102, 102));
        returnDateTextField.setForeground(new java.awt.Color(255, 255, 255));
        returnDateTextField.setText("245");
        returnDateTextField.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 51, 102)));
        returnDateTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnDateTextFieldActionPerformed(evt);
            }
        });

        totalLabel.setFont(new java.awt.Font("POI Aeronaut Trial", 0, 14)); // NOI18N
        totalLabel.setForeground(new java.awt.Color(255, 255, 255));
        totalLabel.setText("Total");

        totalTextField.setBackground(new java.awt.Color(102, 102, 102));
        totalTextField.setForeground(new java.awt.Color(255, 255, 255));
        totalTextField.setText("245");
        totalTextField.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 51, 102)));
        totalTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalTextFieldActionPerformed(evt);
            }
        });

        validDateLabel.setFont(new java.awt.Font("POI Aeronaut Trial", 0, 14)); // NOI18N
        validDateLabel.setForeground(new java.awt.Color(255, 255, 255));
        validDateLabel.setText("Validation Date");

        validDateTextField.setBackground(new java.awt.Color(102, 102, 102));
        validDateTextField.setForeground(new java.awt.Color(255, 255, 255));
        validDateTextField.setText("245");
        validDateTextField.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 51, 102)));
        validDateTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                validDateTextFieldActionPerformed(evt);
            }
        });

        validToggleButton.setBackground(new java.awt.Color(102, 102, 102));
        validToggleButton.setForeground(new java.awt.Color(255, 255, 255));
        validToggleButton.setText("No");
        validToggleButton.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 51, 102)));
        validToggleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                validToggleButtonActionPerformed(evt);
            }
        });

        validLabel.setFont(new java.awt.Font("POI Aeronaut Trial", 0, 14)); // NOI18N
        validLabel.setForeground(new java.awt.Color(255, 255, 255));
        validLabel.setText("Valid");

        canceledLabel.setFont(new java.awt.Font("POI Aeronaut Trial", 0, 14)); // NOI18N
        canceledLabel.setForeground(new java.awt.Color(255, 255, 255));
        canceledLabel.setText("Canceled");

        canceledToggleButton.setBackground(new java.awt.Color(102, 102, 102));
        canceledToggleButton.setForeground(new java.awt.Color(255, 255, 255));
        canceledToggleButton.setText("No");
        canceledToggleButton.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 51, 102)));
        canceledToggleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                canceledToggleButtonActionPerformed(evt);
            }
        });

        goToFirstButton.setFont(new java.awt.Font("POI Aeronaut Trial", 0, 16)); // NOI18N
        goToFirstButton.setForeground(new java.awt.Color(255, 255, 255));
        goToFirstButton.setText("Go to First");
        goToFirstButton.setBorder(null);
        goToFirstButton.setContentAreaFilled(false);
        goToFirstButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goToFirstButtonActionPerformed(evt);
            }
        });

        lastButton.setFont(new java.awt.Font("POI Aeronaut Trial", 0, 16)); // NOI18N
        lastButton.setForeground(new java.awt.Color(255, 255, 255));
        lastButton.setText("Last");
        lastButton.setBorder(null);
        lastButton.setContentAreaFilled(false);
        lastButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        nextButton.setFont(new java.awt.Font("POI Aeronaut Trial", 0, 16)); // NOI18N
        nextButton.setForeground(new java.awt.Color(255, 255, 255));
        nextButton.setText("Next");
        nextButton.setBorder(null);
        nextButton.setContentAreaFilled(false);
        nextButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextButtonActionPerformed(evt);
            }
        });

        goToLastButton.setFont(new java.awt.Font("POI Aeronaut Trial", 0, 16)); // NOI18N
        goToLastButton.setForeground(new java.awt.Color(255, 255, 255));
        goToLastButton.setText("Go to Last");
        goToLastButton.setBorder(null);
        goToLastButton.setContentAreaFilled(false);
        goToLastButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goToLastButtonActionPerformed(evt);
            }
        });

        addButton.setFont(new java.awt.Font("POI Aeronaut Trial", 0, 16)); // NOI18N
        addButton.setForeground(new java.awt.Color(255, 255, 255));
        addButton.setText("Add");
        addButton.setBorder(null);
        addButton.setContentAreaFilled(false);
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        changeButton.setFont(new java.awt.Font("POI Aeronaut Trial", 0, 16)); // NOI18N
        changeButton.setForeground(new java.awt.Color(255, 255, 255));
        changeButton.setText("Change");
        changeButton.setBorder(null);
        changeButton.setContentAreaFilled(false);
        changeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeButtonActionPerformed(evt);
            }
        });

        saveButton.setFont(new java.awt.Font("POI Aeronaut Trial", 0, 16)); // NOI18N
        saveButton.setForeground(new java.awt.Color(255, 255, 255));
        saveButton.setText("Save");
        saveButton.setBorder(null);
        saveButton.setContentAreaFilled(false);
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        cancelButton.setFont(new java.awt.Font("POI Aeronaut Trial", 0, 16)); // NOI18N
        cancelButton.setForeground(new java.awt.Color(255, 255, 255));
        cancelButton.setText("Cancel");
        cancelButton.setBorder(null);
        cancelButton.setContentAreaFilled(false);
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        jSeparator3.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(exitDescription)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(warehouseCodeLabel)
                                .addGap(2, 2, 2)
                                .addComponent(warehouseCodeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(returnDateLabel)
                                        .addGap(2, 2, 2)
                                        .addComponent(returnDateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(totalLabel)
                                        .addGap(2, 2, 2)
                                        .addComponent(totalTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(brsCodeLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(brsCodeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(289, 289, 289))))
            .addComponent(headerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(validDateLabel)
                .addGap(2, 2, 2)
                .addComponent(validDateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(validLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(validToggleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(canceledLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(canceledToggleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(203, 203, 203))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(goToFirstButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lastButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nextButton, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(goToLastButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(changeButton)
                        .addGap(288, 288, 288)
                        .addComponent(saveButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cancelButton))
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 822, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(169, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(headerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(exitDescription)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(brsCodeLabel))
                    .addComponent(brsCodeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(warehouseCodeLabel)
                            .addComponent(warehouseCodeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(returnDateLabel)
                            .addComponent(returnDateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(totalLabel)
                            .addComponent(totalTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(1, 1, 1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(validLabel)
                    .addComponent(validToggleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(canceledLabel)
                    .addComponent(canceledToggleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 187, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(validDateLabel)
                    .addComponent(validDateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(120, 120, 120)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lastButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nextButton, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(goToLastButton, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(changeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(goToFirstButton, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void brsCodeTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brsCodeTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_brsCodeTextFieldActionPerformed

    private void warehouseCodeTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_warehouseCodeTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_warehouseCodeTextFieldActionPerformed

    private void returnDateTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnDateTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_returnDateTextFieldActionPerformed

    private void totalTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_totalTextFieldActionPerformed

    private void validDateTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_validDateTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_validDateTextFieldActionPerformed

    private void validToggleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_validToggleButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_validToggleButtonActionPerformed

    private void canceledToggleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_canceledToggleButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_canceledToggleButtonActionPerformed
    private int currentIndex = 0;
    private List<Return> returns;
    private void goToFirstButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goToFirstButtonActionPerformed
        // TODO add your handling code here:
try {
        if (returns == null || returns.isEmpty()) {
            // Retrieve all returns from the database
            returns = DataBaseUtils.getAllReturns();
        }

        if (returns != null && !returns.isEmpty()) {
            // Get the first return in the list
            Return firstReturn = returns.get(0);

            // Populate the text fields with the first return's data
            brsCodeTextField.setText(firstReturn.getNumBrs());
            warehouseCodeTextField.setText(firstReturn.getCodeMag());
            returnDateTextField.setText(String.valueOf(firstReturn.getDateReint()));
            totalTextField.setText(String.valueOf(firstReturn.getTotal()));
            validDateTextField.setText(firstReturn.getDateValide().toString());
            validToggleButton.setSelected(Boolean.parseBoolean(firstReturn.getValide()));
            canceledToggleButton.setSelected(Boolean.parseBoolean(firstReturn.getAnnule()));
        }
    } catch (SQLException ex) {
        ex.printStackTrace();
    }        
    }//GEN-LAST:event_goToFirstButtonActionPerformed

    private void nextButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextButtonActionPerformed
        // TODO add your handling code here:
        if (returns == null || returns.isEmpty()) {
            try {
                // Retrieve all returns from the database
                returns = DataBaseUtils.getAllReturns();
            } catch (SQLException ex) {
                Logger.getLogger(ReturnSheet.class.getName()).log(Level.SEVERE, null, ex);
            }
            currentIndex = 0;
        }
        if (returns != null && !returns.isEmpty()) {
            currentIndex++;
            if (currentIndex >= returns.size()) {
                currentIndex = 0; // Wrap around to the first return
            }

            // Populate the text fields with the next return's data
            Return nextReturn = returns.get(currentIndex);
            brsCodeTextField.setText(nextReturn.getNumBrs());
            warehouseCodeTextField.setText(nextReturn.getCodeMag());
            returnDateTextField.setText(String.valueOf(nextReturn.getDateReint()));
            totalTextField.setText(String.valueOf(nextReturn.getTotal()));
            validDateTextField.setText(nextReturn.getDateValide().toString());
            validToggleButton.setSelected(Boolean.parseBoolean(nextReturn.getValide()));
            canceledToggleButton.setSelected(Boolean.parseBoolean(nextReturn.getAnnule()));
        }
    }//GEN-LAST:event_nextButtonActionPerformed

    private void goToLastButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goToLastButtonActionPerformed
    try {
        if (returns == null || returns.isEmpty()) {
            // Retrieve all returns from the database
            returns = DataBaseUtils.getAllReturns();
        }

        if (returns != null && !returns.isEmpty()) {
            // Get the last return in the list
            Return lastReturn = returns.get(returns.size() - 1);

            // Populate the text fields with the last return's data
            brsCodeTextField.setText(lastReturn.getNumBrs());
            warehouseCodeTextField.setText(lastReturn.getCodeMag());
            returnDateTextField.setText(String.valueOf(lastReturn.getDateReint()));
            totalTextField.setText(String.valueOf(lastReturn.getTotal()));
            validDateTextField.setText(lastReturn.getDateValide().toString());
            validToggleButton.setSelected(Boolean.parseBoolean(lastReturn.getValide()));
            canceledToggleButton.setSelected(Boolean.parseBoolean(lastReturn.getAnnule()));
        }
    } catch (SQLException ex) {
        ex.printStackTrace();
    }
    }//GEN-LAST:event_goToLastButtonActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_addButtonActionPerformed

    private void changeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeButtonActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_changeButtonActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_saveButtonActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        // TODO add your handling code here:
        dispose();
        Dashboard db = new Dashboard();
        db.setVisible(true);
    }//GEN-LAST:event_cancelButtonActionPerformed

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
            java.util.logging.Logger.getLogger(ReturnSheet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReturnSheet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReturnSheet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReturnSheet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReturnSheet().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JLabel brsCodeLabel;
    private javax.swing.JTextField brsCodeTextField;
    private javax.swing.JButton cancelButton;
    private javax.swing.JLabel canceledLabel;
    private javax.swing.JToggleButton canceledToggleButton;
    private javax.swing.JButton changeButton;
    private javax.swing.JLabel exitDescription;
    private javax.swing.JButton goToFirstButton;
    private javax.swing.JButton goToLastButton;
    private javax.swing.JPanel headerPanel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JButton lastButton;
    private javax.swing.JButton nextButton;
    private javax.swing.JLabel returnDateLabel;
    private javax.swing.JTextField returnDateTextField;
    private javax.swing.JLabel returnSheetLabel;
    private javax.swing.JButton saveButton;
    private javax.swing.JLabel sheetLogo;
    private javax.swing.JLabel totalLabel;
    private javax.swing.JTextField totalTextField;
    private javax.swing.JLabel validDateLabel;
    private javax.swing.JTextField validDateTextField;
    private javax.swing.JLabel validLabel;
    private javax.swing.JToggleButton validToggleButton;
    private javax.swing.JLabel warehouseCodeLabel;
    private javax.swing.JTextField warehouseCodeTextField;
    // End of variables declaration//GEN-END:variables
}