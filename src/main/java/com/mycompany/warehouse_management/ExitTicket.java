/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.warehouse_management;
import com.formdev.flatlaf.FlatDarkLaf;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.IOException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author lyeschl
 */
public class ExitTicket extends javax.swing.JFrame {
    private List<ArticleExit> exitArticles;
    /**
     * Creates new form ReturnTicket
     */
    public ExitTicket() {
        try {
        UIManager.setLookAndFeel(new FlatDarkLaf());

        
        
    } catch (Exception ex) {
        Logger.getLogger(AdvancedSearch.class.getName()).log(Level.SEVERE, null, ex);
    }
        initComponents();
        int windowWidth = 1280; // Adjust the desired width
        int windowHeight = 720; // Adjust the desired height
        setSize(windowWidth, windowHeight);
        setResizable(false); // Prevent resizing
        setLocationRelativeTo(null);
    }
    public ExitTicket(List<ArticleExit> exitArticles) {
        initComponents();
        this.exitArticles = exitArticles;
        populateExitArticlesTable();
    }
    private void populateExitArticlesTable() {
        DefaultTableModel model = (DefaultTableModel) exit_articlesTable.getModel();
        model.setRowCount(0); // Clear the table

        for (ArticleExit article : exitArticles) {
            Object[] row = {
                article.getNumSort(),
                article.getCodeArt(),
                article.getQteSort(),
                article.getPrixUnit(),
                article.getMontantS(),
                article.getPumpAnc(),
                article.getQteStockAnc(),
                article.getPumpNouv(),
                article.getQteStockNouv(),
                article.getDateSort(),
                article.getHeureSort(),
                article.getQteSortRest(),
                article.getQteDem()
            };
            model.addRow(row);
        }
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
        exitTicketLabel = new javax.swing.JLabel();
        exitDateLabel = new javax.swing.JLabel();
        exitDateFormattedTextField = new javax.swing.JFormattedTextField();
        ticketCodeLabel = new javax.swing.JLabel();
        ticketCodeTextField = new javax.swing.JTextField();
        costcenterLabel = new javax.swing.JLabel();
        costcenterTextField = new javax.swing.JTextField();
        logoLabel = new javax.swing.JLabel();
        nbssLabel = new javax.swing.JLabel();
        nbssTextField = new javax.swing.JTextField();
        validDateLabel = new javax.swing.JLabel();
        validDateFormattedTextField = new javax.swing.JFormattedTextField();
        validToggleButton = new javax.swing.JToggleButton();
        validLabel = new javax.swing.JLabel();
        cancelLabel = new javax.swing.JLabel();
        cancelToggleButton = new javax.swing.JToggleButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        exit_articlesTable = new javax.swing.JTable();
        warehousecodeLabel = new javax.swing.JLabel();
        warehousecodeTextField = new javax.swing.JTextField();
        printButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        addButton = new javax.swing.JButton();
        nextButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 51));

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        exitTicketLabel.setBackground(new java.awt.Color(0, 0, 0));
        exitTicketLabel.setFont(new java.awt.Font("POI Aeronaut Trial", 1, 36)); // NOI18N
        exitTicketLabel.setForeground(new java.awt.Color(255, 255, 255));
        exitTicketLabel.setText("Exit Ticket ");

        exitDateLabel.setFont(new java.awt.Font("POI Aeronaut Trial", 1, 14)); // NOI18N
        exitDateLabel.setForeground(new java.awt.Color(153, 153, 153));
        exitDateLabel.setText("Exit Date");

        exitDateFormattedTextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));
        exitDateFormattedTextField.setFont(new java.awt.Font("Roboto", 0, 11)); // NOI18N
        exitDateFormattedTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitDateFormattedTextFieldActionPerformed(evt);
            }
        });

        ticketCodeLabel.setFont(new java.awt.Font("POI Aeronaut Trial", 1, 14)); // NOI18N
        ticketCodeLabel.setForeground(new java.awt.Color(153, 153, 153));
        ticketCodeLabel.setText("N* OT");

        ticketCodeTextField.setFont(new java.awt.Font("POI Aeronaut Trial", 0, 16)); // NOI18N
        ticketCodeTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ticketCodeTextFieldActionPerformed(evt);
            }
        });

        costcenterLabel.setFont(new java.awt.Font("POI Aeronaut Trial", 1, 14)); // NOI18N
        costcenterLabel.setForeground(new java.awt.Color(153, 153, 153));
        costcenterLabel.setText("Cost Center");

        costcenterTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                costcenterTextFieldActionPerformed(evt);
            }
        });

        logoLabel.setBackground(new java.awt.Color(255, 255, 255));

        nbssLabel.setFont(new java.awt.Font("POI Aeronaut Trial", 1, 14)); // NOI18N
        nbssLabel.setForeground(new java.awt.Color(153, 153, 153));
        nbssLabel.setText("N* BSS");

        nbssTextField.setFont(new java.awt.Font("POI Aeronaut Trial", 0, 16)); // NOI18N
        nbssTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nbssTextFieldActionPerformed(evt);
            }
        });

        validDateLabel.setFont(new java.awt.Font("POI Aeronaut Trial", 1, 14)); // NOI18N
        validDateLabel.setForeground(new java.awt.Color(153, 153, 153));
        validDateLabel.setText("Validation Date");

        validDateFormattedTextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));
        validDateFormattedTextField.setFont(new java.awt.Font("Roboto", 0, 11)); // NOI18N
        validDateFormattedTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                validDateFormattedTextFieldActionPerformed(evt);
            }
        });

        validToggleButton.setText("No");

        validLabel.setFont(new java.awt.Font("POI Aeronaut Trial", 1, 14)); // NOI18N
        validLabel.setForeground(new java.awt.Color(153, 153, 153));
        validLabel.setText("Valid?");

        cancelLabel.setFont(new java.awt.Font("POI Aeronaut Trial", 1, 14)); // NOI18N
        cancelLabel.setForeground(new java.awt.Color(153, 153, 153));
        cancelLabel.setText("Canceled?");

        cancelToggleButton.setText("No");
        cancelToggleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelToggleButtonActionPerformed(evt);
            }
        });

        exit_articlesTable.setFont(new java.awt.Font("POI Aeronaut Trial", 0, 16)); // NOI18N
        exit_articlesTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object[][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String[] {
                "Num Sort", "Code Art", "Qte Sort", "Prix Unit", "Montant S", "Pump Anc", "Qte Stock Anc", "Pump Nouv", "Qte Stock Nouv", "Date Sort", "Heure Sort", "Qte Sort Rest", "Qte Dem"
            }
        ) {
            @Override
            public java.lang.Class<?> getColumnClass(int columnIndex) {
                switch (columnIndex) {
                    case 0:
                    case 1:
                    case 9:
                    case 10:
                    return String.class;
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 11:
                    case 12:
                    return Integer.class;
                    default:
                    return Object.class;
                }
            }
        });
        jScrollPane1.setViewportView(exit_articlesTable);

        warehousecodeLabel.setFont(new java.awt.Font("POI Aeronaut Trial", 1, 14)); // NOI18N
        warehousecodeLabel.setForeground(new java.awt.Color(153, 153, 153));
        warehousecodeLabel.setText("Warehouse Code");

        warehousecodeTextField.setFont(new java.awt.Font("POI Aeronaut Trial", 0, 16)); // NOI18N
        warehousecodeTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                warehousecodeTextFieldActionPerformed(evt);
            }
        });

        printButton.setBackground(new java.awt.Color(0, 51, 102));
        printButton.setFont(new java.awt.Font("POI Aeronaut Trial", 1, 14)); // NOI18N
        printButton.setForeground(new java.awt.Color(255, 255, 255));
        printButton.setText("Print");
        printButton.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 1, new java.awt.Color(51, 51, 51)));
        printButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printButtonActionPerformed(evt);
            }
        });

        cancelButton.setBackground(new java.awt.Color(255, 127, 0));
        cancelButton.setFont(new java.awt.Font("POI Aeronaut Trial", 1, 14)); // NOI18N
        cancelButton.setForeground(new java.awt.Color(255, 255, 255));
        cancelButton.setText("Cancel");
        cancelButton.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(51, 51, 51)));
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        addButton.setFont(new java.awt.Font("POI Aeronaut Trial", 0, 16)); // NOI18N
        addButton.setForeground(new java.awt.Color(255, 255, 255));
        addButton.setText("Add");
        addButton.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 51, 102)));
        addButton.setContentAreaFilled(false);
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        nextButton.setFont(new java.awt.Font("POI Aeronaut Trial", 0, 16)); // NOI18N
        nextButton.setForeground(new java.awt.Color(255, 255, 255));
        nextButton.setText("Next >");
        nextButton.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 51, 102)));
        nextButton.setContentAreaFilled(false);
        nextButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(539, 539, 539)
                                .addComponent(exitTicketLabel))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGap(31, 31, 31)
                                        .addComponent(logoLabel)
                                        .addGap(60, 60, 60))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(61, 61, 61)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(nbssLabel)
                                                .addGap(18, 18, 18)
                                                .addComponent(nbssTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(warehousecodeLabel)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(warehousecodeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(costcenterLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(ticketCodeLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(11, 11, 11)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(ticketCodeTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                                    .addComponent(costcenterTextField))
                                .addGap(58, 58, 58)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(validDateLabel)
                                        .addGap(18, 18, 18)
                                        .addComponent(validDateFormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(exitDateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(exitDateFormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(103, 103, 103)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cancelLabel)
                            .addComponent(validLabel))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(validToggleButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cancelToggleButton, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(nextButton, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(792, 792, 792)
                                .addComponent(printButton, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1046, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(233, 233, 233))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(logoLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(warehousecodeLabel)
                            .addComponent(warehousecodeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(141, 141, 141))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(exitTicketLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cancelToggleButton)
                            .addComponent(cancelLabel)
                            .addComponent(validDateFormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(validDateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(costcenterTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(costcenterLabel))
                        .addGap(54, 54, 54)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(exitDateFormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(exitDateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(validToggleButton)
                            .addComponent(validLabel)
                            .addComponent(ticketCodeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ticketCodeLabel)
                            .addComponent(nbssTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nbssLabel))
                        .addGap(45, 45, 45)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nextButton)
                    .addComponent(addButton)
                    .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(printButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44))
        );

        LocalDate currentDate = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String formattedDate = currentDate.format(formatter);
        exitDateFormattedTextField.setText(formattedDate);

        // Set the current date in the validDateFormattedTextField
        validDateFormattedTextField.setText(formattedDate);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1280, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitDateFormattedTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitDateFormattedTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_exitDateFormattedTextFieldActionPerformed

    private void costcenterTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_costcenterTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_costcenterTextFieldActionPerformed

    private void nbssTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nbssTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nbssTextFieldActionPerformed

    private void validDateFormattedTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_validDateFormattedTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_validDateFormattedTextFieldActionPerformed

    private void cancelToggleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelToggleButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cancelToggleButtonActionPerformed

    private void warehousecodeTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_warehousecodeTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_warehousecodeTextFieldActionPerformed

    private void printButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printButtonActionPerformed
        // TODO add your handling code here:
        PDFGenerator pdfGenerator = new PDFGenerator();
    try {
        String exitDate = exitDateFormattedTextField.getText();
        String ticketCode = ticketCodeTextField.getText();
        List<ArticleExit> exitArticles = this.exitArticles;

        pdfGenerator.generateExitPDF(exitDate, ticketCode, exitArticles, "exit-ticket.pdf");
        System.out.println("PDF generated successfully!");
    } catch (IOException e) {
        System.err.println("Error generating PDF: " + e.getMessage());
    }
    }//GEN-LAST:event_printButtonActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        // TODO add your handling code here:
        dispose();

        DashboardConsult dash = new DashboardConsult();
        dash.setVisible(true);
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        // TODO add your handling code here:
        // Get the necessary data from the interface
        String numOT = ticketCodeTextField.getText();
        String codeMag = warehousecodeTextField.getText();
        String codeAnal = costcenterTextField.getText();
        String exitDate = exitDateFormattedTextField.getText();
        String validDate = validDateFormattedTextField.getText();
        String valide = (validToggleButton.isSelected()) ? "Yes" : "No";
        String annule = (cancelToggleButton.isSelected()) ? "Yes" : "No";

        String numSort = DataBaseUtils.createExitTuple(numOT, codeMag, codeAnal, exitDate, validDate, valide, annule,this.exitArticles);
        if (numSort != null) {
            DataBaseUtils.createArticleExitTuples(exitDate, numSort, this.exitArticles);
            JOptionPane.showMessageDialog(this, "Exit and Article_Exit tuples created successfully!");
        } else {
            JOptionPane.showMessageDialog(this, "Error creating Exit and Article_Exit tuples.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_addButtonActionPerformed

    private void ticketCodeTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ticketCodeTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ticketCodeTextFieldActionPerformed

    private void nextButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextButtonActionPerformed
        // TODO add your handling code here:
        DataBaseUtils.displayNextExit(this, ticketCodeTextField, warehousecodeTextField, costcenterTextField,
                                 exitDateFormattedTextField, validToggleButton, cancelToggleButton,
                                 exit_articlesTable);
    }//GEN-LAST:event_nextButtonActionPerformed
//private String createExitTuple(String numOT, String codeMag, String codeAnal, String exitDate, String validDate, String valide, String annule) {
//    try {
//        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
//        java.util.Date exitDateObj = sdf.parse(exitDate);
//        java.sql.Date dateSortSql = new java.sql.Date(exitDateObj.getTime());
//
//        java.util.Date validDateObj = sdf.parse(validDate);
//        java.sql.Date dateValideSql = new java.sql.Date(validDateObj.getTime());
//
//        String numSort = generateNumSort();
//
//        try (Connection conn = DriverManager.getConnection(DataBaseUtils.getDB_URL(), DataBaseUtils.getDB_USER(), DataBaseUtils.getDB_PASSWORD());
//             PreparedStatement stmt = conn.prepareStatement("INSERT INTO `Exit` (num_sort, num_OT, code_anal, code_mag, date_sort, date_valide, valide, annule) VALUES (?, ?, ?, ?, ?, ?, ?, ?)")) {
//            stmt.setString(1, numSort);
//            stmt.setString(2, numOT);
//            stmt.setString(3, codeAnal);
//            stmt.setString(4, codeMag);
//            stmt.setDate(5, dateSortSql);
//            stmt.setDate(6, dateValideSql);
//            stmt.setString(7, valide);
//            stmt.setString(8, annule);
//            stmt.executeUpdate();
//        } catch (SQLException e) {
//            e.printStackTrace();
//            return null;
//        }
//        return numSort;
//    } catch (ParseException e) {
//        e.printStackTrace();
//        return null;
//    }
//}
//
//
//private void createArticleExitTuples(String exitDate, String numSort) {
//    try {
//        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
//        java.util.Date date = sdf.parse(exitDate);
//        java.sql.Date dateSortSql = new java.sql.Date(date.getTime());
//
//        try (Connection conn = DriverManager.getConnection(DataBaseUtils.getDB_URL(), DataBaseUtils.getDB_USER(), DataBaseUtils.getDB_PASSWORD());
//             PreparedStatement stmt = conn.prepareStatement("INSERT INTO Article_Exit (num_sort, code_art, qte_sort, prix_unit, montant_S, pump_anc, qte_stk_anc, pump_nouv, qte_stk_nouv, date_sort, heure_sort, qte_sort_rest, qte_dem) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)")) {
//            for (ArticleExit article : this.exitArticles) {
//                stmt.setString(1, numSort);
//                stmt.setString(2, article.getCodeArt());
//                stmt.setInt(3, article.getQteSort());
//                stmt.setInt(4, article.getPrixUnit());
//                stmt.setInt(5, article.getMontantS());
//                stmt.setInt(6, article.getPumpAnc());
//                stmt.setInt(7, article.getQteStockAnc());
//                stmt.setInt(8, article.getPumpNouv());
//                stmt.setInt(9, article.getQteStockNouv());
//                stmt.setDate(10, dateSortSql);
//                stmt.setString(11, article.getHeureSort());
//                stmt.setInt(12, article.getQteSortRest());
//                stmt.setInt(13, article.getQteDem());
//                stmt.executeUpdate();
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    } catch (ParseException e) {
//        e.printStackTrace();
//    }
//}
//
//private String generateNumSort() {
//    // Implement a logic to generate a unique number for the sort
//    return "SORT-" + System.currentTimeMillis();
//}








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
            java.util.logging.Logger.getLogger(ExitTicket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ExitTicket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ExitTicket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ExitTicket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ExitTicket().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JButton cancelButton;
    private javax.swing.JLabel cancelLabel;
    private javax.swing.JToggleButton cancelToggleButton;
    private javax.swing.JLabel costcenterLabel;
    private javax.swing.JTextField costcenterTextField;
    private javax.swing.JFormattedTextField exitDateFormattedTextField;
    private javax.swing.JLabel exitDateLabel;
    private javax.swing.JLabel exitTicketLabel;
    private javax.swing.JTable exit_articlesTable;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel logoLabel;
    private javax.swing.JLabel nbssLabel;
    private javax.swing.JTextField nbssTextField;
    private javax.swing.JButton nextButton;
    private javax.swing.JButton printButton;
    private javax.swing.JLabel ticketCodeLabel;
    private javax.swing.JTextField ticketCodeTextField;
    private javax.swing.JFormattedTextField validDateFormattedTextField;
    private javax.swing.JLabel validDateLabel;
    private javax.swing.JLabel validLabel;
    private javax.swing.JToggleButton validToggleButton;
    private javax.swing.JLabel warehousecodeLabel;
    private javax.swing.JTextField warehousecodeTextField;
    // End of variables declaration//GEN-END:variables
}
