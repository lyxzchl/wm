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
public class ReturnTicket extends javax.swing.JFrame {
    private List<ArticleReturn> returnArticles;
    /**
     * Creates new form ReturnTicket
     */
    public ReturnTicket() {
        try {
        UIManager.setLookAndFeel(new FlatDarkLaf());

        
        
    } catch (Exception ex) {
        Logger.getLogger(AdvancedSearch.class.getName()).log(Level.SEVERE, null, ex);
    }
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
    public ReturnTicket(List<ArticleReturn> returnArticles) {
        initComponents();
        this.returnArticles = returnArticles;
        populateReturnArticlesTable();
    }

    private void populateReturnArticlesTable() {
        DefaultTableModel model = (DefaultTableModel) return_articlesTable.getModel();
        model.setRowCount(0); // Clear the table

        for (ArticleReturn article : returnArticles) {
            Object[] row = {
                article.getNumBrs(),
                article.getCodeArt(),
                article.getQteReint(),
                article.getPrixUnit(),
                article.getMontRe(),
                article.getNumSort(),
                article.getPumpAnc(),
                article.getQteStockAnc(),
                article.getQteStockNouv(),
                article.getPumpNouv(),
                article.getDateReint(),
                article.getHeureReint()
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
        returnDateLabel = new javax.swing.JLabel();
        returnDateFormattedTextField = new javax.swing.JFormattedTextField();
        logoLabel = new javax.swing.JLabel();
        nbrsLabel = new javax.swing.JLabel();
        nbrsTextField = new javax.swing.JTextField();
        validDateLabel = new javax.swing.JLabel();
        validDateFormattedTextField = new javax.swing.JFormattedTextField();
        validToggleButton = new javax.swing.JToggleButton();
        validLabel = new javax.swing.JLabel();
        cancelLabel = new javax.swing.JLabel();
        cancelToggleButton = new javax.swing.JToggleButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        return_articlesTable = new javax.swing.JTable();
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
        exitTicketLabel.setFont(new java.awt.Font("POI Aeronaut Trial", 1, 24)); // NOI18N
        exitTicketLabel.setForeground(new java.awt.Color(255, 255, 255));
        exitTicketLabel.setText("Return Ticket ");

        returnDateLabel.setFont(new java.awt.Font("POI Aeronaut Trial", 1, 14)); // NOI18N
        returnDateLabel.setForeground(new java.awt.Color(153, 153, 153));
        returnDateLabel.setText("Return Date");

        returnDateFormattedTextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));
        returnDateFormattedTextField.setFont(new java.awt.Font("Roboto", 0, 11)); // NOI18N
        returnDateFormattedTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnDateFormattedTextFieldActionPerformed(evt);
            }
        });

        logoLabel.setBackground(new java.awt.Color(255, 255, 255));
        logoLabel.setIcon(new javax.swing.ImageIcon("/run/media/lyeschl/ssd/main/load/output-onlinepngtools(1).png")); // NOI18N

        nbrsLabel.setFont(new java.awt.Font("POI Aeronaut Trial", 1, 14)); // NOI18N
        nbrsLabel.setForeground(new java.awt.Color(153, 153, 153));
        nbrsLabel.setText("N* BRS");

        nbrsTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nbrsTextFieldActionPerformed(evt);
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

        validToggleButton.setText("Yes");

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

        return_articlesTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(return_articlesTable);

        warehousecodeLabel.setFont(new java.awt.Font("POI Aeronaut Trial", 1, 14)); // NOI18N
        warehousecodeLabel.setForeground(new java.awt.Color(153, 153, 153));
        warehousecodeLabel.setText("Warehouse Code");

        warehousecodeTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                warehousecodeTextFieldActionPerformed(evt);
            }
        });

        printButton.setBackground(new java.awt.Color(0, 51, 102));
        printButton.setFont(new java.awt.Font("POI Aeronaut Trial", 1, 14)); // NOI18N
        printButton.setForeground(new java.awt.Color(153, 153, 153));
        printButton.setText("Print");
        printButton.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 1, new java.awt.Color(51, 51, 51)));
        printButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printButtonActionPerformed(evt);
            }
        });

        cancelButton.setBackground(new java.awt.Color(255, 127, 0));
        cancelButton.setFont(new java.awt.Font("POI Aeronaut Trial", 1, 14)); // NOI18N
        cancelButton.setForeground(new java.awt.Color(153, 153, 153));
        cancelButton.setText("Cancel");
        cancelButton.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(51, 51, 51)));
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        addButton.setFont(new java.awt.Font("POI Aeronaut Trial", 0, 16)); // NOI18N
        addButton.setText("Add");
        addButton.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 51, 102)));
        addButton.setContentAreaFilled(false);
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        nextButton.setFont(new java.awt.Font("POI Aeronaut Trial", 0, 16)); // NOI18N
        nextButton.setText("Next");
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
                .addComponent(logoLabel)
                .addGap(257, 257, 257)
                .addComponent(exitTicketLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(printButton, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(520, 520, 520))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(nbrsLabel)
                            .addComponent(validLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(validToggleButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(nbrsTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(returnDateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(returnDateFormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(validDateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(warehousecodeLabel))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(warehousecodeTextField)
                    .addComponent(validDateFormattedTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                .addGap(35, 35, 35)
                .addComponent(cancelLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cancelToggleButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(842, 842, 842))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 906, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nextButton, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nbrsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nbrsLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(validToggleButton)
                                .addComponent(validLabel))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(validDateFormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(validDateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cancelToggleButton)
                                .addComponent(cancelLabel))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(printButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(exitTicketLabel)))
                    .addComponent(logoLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(warehousecodeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(warehousecodeLabel))
                    .addComponent(returnDateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(returnDateFormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addButton)
                    .addComponent(nextButton))
                .addContainerGap())
        );

        // Code adding the component to the parent container - not shown here
        // Code adding the component to the parent container - not shown here
        LocalDate currentDate = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String formattedDate = currentDate.format(formatter);
        returnDateFormattedTextField.setText(formattedDate);

        // Set the current date in the validDateFormattedTextField
        validDateFormattedTextField.setText(formattedDate);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 922, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        // TODO add your handling code here:
        // Get the necessary data from the interface
        String numBRS = nbrsTextField.getText();
        String codeMag = warehousecodeTextField.getText();
        String dateReint = returnDateFormattedTextField.getText();
        String dateValid = validDateFormattedTextField.getText();
        String valide = (validToggleButton.isSelected()) ? "Yes" : "No";
        String annule = (cancelToggleButton.isSelected()) ? "Yes" : "No";

        String numSort = createReturnTuple(numBRS, codeMag, dateReint, dateValid, valide, annule);
        if (numSort != null) {
            createArticleReturnTuples(dateReint, numSort);
            JOptionPane.showMessageDialog(this, "Return and Article_Return tuples created successfully!");
        } else {
            JOptionPane.showMessageDialog(this, "Error creating Return and Article_Return tuples.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_addButtonActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        // TODO add your handling code here:
        dispose();

        Dashboard dash = new Dashboard();
        dash.setVisible(true);
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void printButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printButtonActionPerformed
        // TODO add your handling code here:
        PDFGenerator pdfGenerator = new PDFGenerator();
        try {
            String returnDate = returnDateFormattedTextField.getText();
            String nbrs = nbrsTextField.getText();
            List<ArticleReturn> returnArticles = this.returnArticles;

            pdfGenerator.generateReturnPDF(returnDate, nbrs, returnArticles, "return-ticket.pdf");
            System.out.println("PDF generated successfully!");
        } catch (IOException e) {
            System.err.println("Error generating PDF: " + e.getMessage());
        }
    }//GEN-LAST:event_printButtonActionPerformed

    private void warehousecodeTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_warehousecodeTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_warehousecodeTextFieldActionPerformed

    private void cancelToggleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelToggleButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cancelToggleButtonActionPerformed

    private void validDateFormattedTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_validDateFormattedTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_validDateFormattedTextFieldActionPerformed

    private void nbrsTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nbrsTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nbrsTextFieldActionPerformed

    private void returnDateFormattedTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnDateFormattedTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_returnDateFormattedTextFieldActionPerformed

    private void nextButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextButtonActionPerformed
        // TODO add your handling code here:
        DataBaseUtils.displayNextReturn(this, nbrsTextField, warehousecodeTextField,
                                   returnDateFormattedTextField, validToggleButton, cancelToggleButton,
                                   return_articlesTable);
    }//GEN-LAST:event_nextButtonActionPerformed
    private String createReturnTuple(String numBRS, String codeMag, String dateReint, String dateValid, String valide, String annule) {
    try {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        java.util.Date dateReintObj = sdf.parse(dateReint);
        java.sql.Date dateReintSql = new java.sql.Date(dateReintObj.getTime());

        java.util.Date dateValidObj = sdf.parse(dateValid);
        java.sql.Date dateValidSql = new java.sql.Date(dateValidObj.getTime());

        try (Connection conn = DriverManager.getConnection(DataBaseUtils.getDB_URL(), DataBaseUtils.getDB_USER(), DataBaseUtils.getDB_PASSWORD());
             PreparedStatement stmt = conn.prepareStatement("INSERT INTO `Return` (num_brs, code_mag, date_reint, date_valide, valide, annule) VALUES (?, ?, ?, ?, ?, ?)")) {
            stmt.setString(1, numBRS);
            stmt.setString(2, codeMag);
            stmt.setDate(3, dateReintSql);
            stmt.setDate(4, dateValidSql);
            stmt.setString(5, valide);
            stmt.setString(6, annule);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
        return numBRS;
    } catch (ParseException e) {
        e.printStackTrace();
        return null;
    }
}

private void createArticleReturnTuples(String dateReint, String numBRS) {
    try {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        java.util.Date date = sdf.parse(dateReint);
        java.sql.Date dateReintSql = new java.sql.Date(date.getTime());

        try (Connection conn = DriverManager.getConnection(DataBaseUtils.getDB_URL(), DataBaseUtils.getDB_USER(), DataBaseUtils.getDB_PASSWORD());
             PreparedStatement stmt = conn.prepareStatement("INSERT INTO Article_Return (num_brs, code_art, qte_reint, prix_unit, mont_re, num_sort, pump_anc, qte_stk_anc, qte_stk_nouv, pump_nouv, date_reint, heure_reint) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)")) {
            for (ArticleReturn article : this.returnArticles) {
                stmt.setString(1, numBRS);
                stmt.setString(2, article.getCodeArt());
                stmt.setInt(3, article.getQteReint());
                stmt.setInt(4, article.getPrixUnit());
                stmt.setInt(5, article.getMontRe());
                stmt.setString(6, article.getNumSort());
                stmt.setInt(7, article.getPumpAnc());
                stmt.setInt(8, article.getQteStockAnc());
                stmt.setInt(9, article.getQteStockNouv());
                stmt.setInt(10, article.getPumpNouv());
                stmt.setDate(11, dateReintSql);
                stmt.setString(12, article.getHeureReint());
                stmt.executeUpdate();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    } catch (ParseException e) {
        e.printStackTrace();
    }
}
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
            java.util.logging.Logger.getLogger(ReturnTicket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReturnTicket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReturnTicket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReturnTicket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReturnTicket().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JButton cancelButton;
    private javax.swing.JLabel cancelLabel;
    private javax.swing.JToggleButton cancelToggleButton;
    private javax.swing.JLabel exitTicketLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel logoLabel;
    private javax.swing.JLabel nbrsLabel;
    private javax.swing.JTextField nbrsTextField;
    private javax.swing.JButton nextButton;
    private javax.swing.JButton printButton;
    private javax.swing.JFormattedTextField returnDateFormattedTextField;
    private javax.swing.JLabel returnDateLabel;
    private javax.swing.JTable return_articlesTable;
    private javax.swing.JFormattedTextField validDateFormattedTextField;
    private javax.swing.JLabel validDateLabel;
    private javax.swing.JLabel validLabel;
    private javax.swing.JToggleButton validToggleButton;
    private javax.swing.JLabel warehousecodeLabel;
    private javax.swing.JTextField warehousecodeTextField;
    // End of variables declaration//GEN-END:variables
}
