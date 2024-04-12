package com.mycompany.warehouse_management;

import com.formdev.flatlaf.FlatDarkLaf;
import com.formdev.flatlaf.FlatLightLaf;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author lyeschl
 */


public class ExitSheet extends javax.swing.JFrame {
    private List<Article> selectedArticles = new ArrayList<>();    /**
     * Creates new form AdvancedSearch
     */
    public ExitSheet() {
    try {
        UIManager.setLookAndFeel(new FlatDarkLaf());
    } catch (Exception ex) {
        Logger.getLogger(ExitSheet.class.getName()).log(Level.SEVERE, null, ex);
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

    // Add the listener to the resultsTable
    resultsTable.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
    @Override
    public void valueChanged(ListSelectionEvent event) {
        if (!event.getValueIsAdjusting()) {
            int selectedRow = resultsTable.getSelectedRow();
            if (selectedRow != -1) {
                // Retrieve the values directly from the TableModel
                DefaultTableModel model = (DefaultTableModel) resultsTable.getModel();
                String codeArt = (String) model.getValueAt(selectedRow, 0);
                String desigArt = (String) model.getValueAt(selectedRow, 1);
                double qteSt = ((Number) model.getValueAt(selectedRow, 4)).doubleValue();
                String codeClass = (String) model.getValueAt(selectedRow, 2);
                String uniteMes = (String) model.getValueAt(selectedRow, 3);
                String casier = (String) model.getValueAt(selectedRow, 5);
                double stockMini = ((Number) model.getValueAt(selectedRow, 6)).doubleValue();
                double stockMax = ((Number) model.getValueAt(selectedRow, 7)).doubleValue();
                double stockSecu = ((Number) model.getValueAt(selectedRow, 8)).doubleValue();
                double valeur = ((Number) model.getValueAt(selectedRow, 9)).doubleValue();
                boolean mort = (boolean) model.getValueAt(selectedRow, 10);
                String observation = (String) model.getValueAt(selectedRow, 11);
                String rayon = (String) model.getValueAt(selectedRow, 12);
                boolean dormant = (boolean) model.getValueAt(selectedRow, 13);
                boolean actif = (boolean) model.getValueAt(selectedRow, 14);

                // Create a new Article object with the selected data
                Article selectedArticle = new Article(
                    codeArt,
                    desigArt,
                    codeClass,
                    uniteMes,
                    qteSt,
                    casier,
                    stockMini,
                    stockMax,
                    stockSecu,
                    valeur,
                    mort,
                    observation,
                    rayon,
                    dormant,
                    actif
                );

                // Add the selected article to the list of selected articles
                selectedArticles.add(selectedArticle);

                // Update the selectedArticlesList model
                DefaultListModel<String> listModel = new DefaultListModel<>();
                for (Article article : selectedArticles) {
                    listModel.addElement(article.getCodeArt() + " - " + article.getDesigArt());
                }
                selectedArticlesList.setModel(listModel);
;
            }
        }
    }
});


}
private double getDoubleValue(JTable table, int row, int column) {
    java.lang.Class columnClass = table.getColumnClass(column);
    if (columnClass == Double.class) {
        return (double) table.getValueAt(row, column);
    } else if (columnClass == Number.class) {
        Number value = (Number) table.getValueAt(row, column);
        return value.doubleValue();
    } else {
        throw new ClassCastException("Cannot cast column " + column + " to Double");
    }
}



private boolean getBooleanValue(JTable table, int row, int column) {
    java.lang.Class columnClass = table.getColumnClass(column);
    if (columnClass == Boolean.class) {
        return (boolean) table.getValueAt(row, column);
    } else {
        throw new ClassCastException("Cannot cast column " + column + " to Boolean");
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        jPanel1 = new javax.swing.JPanel();
        searchBar = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        resultsTable = new javax.swing.JTable();
        logoLabel = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();
        searchLogoLabel = new javax.swing.JLabel();
        articleCount = new javax.swing.JLabel();
        articleCountTextField = new javax.swing.JTextField();
        searchButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        selectedArticlesList = new javax.swing.JList<>();
        createExitButton = new javax.swing.JButton();

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        searchBar.setBackground(new java.awt.Color(102, 102, 102));
        searchBar.setFont(new java.awt.Font("Roboto", 0, 13)); // NOI18N
        searchBar.setForeground(new java.awt.Color(255, 255, 255));
        searchBar.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 51, 102)));
        searchBar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBarActionPerformed(evt);
            }
        });
        searchBar.addKeyListener(new KeyListener() {
            //    @Override
            public void keyTyped(KeyEvent e) {
                // Not used
            }

            //    @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    searchButtonActionPerformed(null);
                }
            }

            //    @Override
            public void keyReleased(KeyEvent e) {
                // Not used
            }
        });

        jScrollPane2.setBackground(new java.awt.Color(255, 255, 102));

        resultsTable.setBackground(new java.awt.Color(102, 102, 102));
        resultsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object[][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String[] {
                "Code_Art", "Desig_Art", "Code_Class", "Unite_Mes", "Qte_St", "Casier", "Stock_Mini", "Stock_Max", "Stock_Secu", "Valeur", "Mort", "Observation", "Rayon", "Dormant", "Actif"
            })
            {@Override
                public java.lang.Class getColumnClass(int columnIndex) {
                    switch (columnIndex) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 5:
                        case 11:
                        case 12:
                        return String.class;
                        case 4:
                        return Number.class;
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        return Double.class;
                        case 10:
                        case 13:
                        case 14:
                        return Boolean.class;
                        default:
                        return Object.class;
                    }
                }}
            );
            resultsTable.setGridColor(new java.awt.Color(153, 153, 153));
            resultsTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
            resultsTable.setShowGrid(true);
            resultsTable.setShowVerticalLines(false);
            jScrollPane2.setViewportView(resultsTable);

            logoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/output-onlinepngtools(1).png"))); // NOI18N

            backButton.setBackground(new java.awt.Color(51, 51, 51));
            backButton.setFont(new java.awt.Font("POI Aeronaut Trial", 1, 12)); // NOI18N
            backButton.setForeground(new java.awt.Color(153, 153, 153));
            backButton.setText("<<Back");
            backButton.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 51, 102)));
            backButton.setContentAreaFilled(false);
            backButton.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    backButtonActionPerformed(evt);
                }
            });

            searchLogoLabel.setIcon(new javax.swing.ImageIcon("/run/media/lyeschl/ssd/main/dox/study/l3si/pfe/thesis/images/icons/search_icon.png")); // NOI18N

            articleCount.setBackground(new java.awt.Color(0, 0, 0));
            articleCount.setFont(new java.awt.Font("POI Aeronaut Trial", 1, 14)); // NOI18N
            articleCount.setForeground(new java.awt.Color(153, 153, 153));
            articleCount.setText("Article count: ");

            articleCountTextField.setBackground(new java.awt.Color(51, 51, 51));
            articleCountTextField.setFont(new java.awt.Font("POI Aeronaut Trial", 0, 11)); // NOI18N
            articleCountTextField.setForeground(new java.awt.Color(153, 153, 153));
            articleCountTextField.setText("69420");
            articleCountTextField.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 51, 102)));
            articleCountTextField.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    articleCountTextFieldActionPerformed(evt);
                }
            });

            searchButton.setBackground(new java.awt.Color(51, 51, 51));
            searchButton.setFont(new java.awt.Font("POI Aeronaut Trial", 0, 11)); // NOI18N
            searchButton.setForeground(new java.awt.Color(153, 153, 153));
            searchButton.setText("Search");
            searchButton.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 51, 102)));
            searchButton.setContentAreaFilled(false);
            searchButton.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    searchButtonActionPerformed(evt);
                }
            });

            jLabel1.setFont(new java.awt.Font("POI Aeronaut Trial", 1, 36)); // NOI18N
            jLabel1.setText("Choose your Exits!");

            selectedArticlesList.setModel(new javax.swing.AbstractListModel<String>() {
                String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
                public int getSize() { return strings.length; }
                public String getElementAt(int i) { return strings[i]; }
            });
            jScrollPane1.setViewportView(selectedArticlesList);

            createExitButton.setBackground(new java.awt.Color(51, 51, 51));
            createExitButton.setFont(new java.awt.Font("POI Aeronaut Trial", 0, 11)); // NOI18N
            createExitButton.setForeground(new java.awt.Color(153, 153, 153));
            createExitButton.setText("Create Exit");
            createExitButton.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 51, 102)));
            createExitButton.setContentAreaFilled(false);
            createExitButton.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    createExitButtonActionPerformed(evt);
                }
            });

            javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
            jPanel1.setLayout(jPanel1Layout);
            jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(articleCount)
                    .addGap(18, 18, 18)
                    .addComponent(articleCountTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(49, 49, 49))
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(20, 20, 20)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(28, 28, 28)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(107, 107, 107)
                                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(121, 121, 121)
                                            .addComponent(createExitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(searchLogoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(searchBar, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(203, 203, 203)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 326, Short.MAX_VALUE)
                            .addComponent(logoLabel)
                            .addGap(14, 14, 14))))
            );
            jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(17, 17, 17)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel1)
                                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(47, 47, 47)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(searchLogoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(1, 1, 1)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(searchBar)
                                        .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGap(95, 95, 95)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(createExitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(21, 21, 21))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(logoLabel)
                            .addGap(9, 9, 9)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(articleCount, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(articleCountTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(22, 22, 22))
            );

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap())
            );
            layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap())
            );

            pack();
        }// </editor-fold>//GEN-END:initComponents

    private void searchBarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchBarActionPerformed

    private void articleCountTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_articleCountTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_articleCountTextFieldActionPerformed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        
        String searchValue = searchBar.getText().trim();

        // If no radio button is selected, search in all columns
        DataBaseUtils.populateArticleTable(resultsTable, searchValue);
        resultsTable.revalidate();
        resultsTable.repaint();
    
        // Get the count of articles
        int articleCount;
        try {
            articleCount = DataBaseUtils.countArticles();
            // Set the count in the text field
            articleCountTextField.setText(Integer.toString(articleCount));
        } catch (SQLException ex) {
            Logger.getLogger(ExitSheet.class.getName()).log(Level.SEVERE, null, ex);
        }
        

    }//GEN-LAST:event_searchButtonActionPerformed
    
    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        dispose();
        
        Dashboard db = new Dashboard();
        db.setVisible(true);
    }//GEN-LAST:event_backButtonActionPerformed

    private void createExitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createExitButtonActionPerformed
        // TODO add your handling code here:
        if (!selectedArticles.isEmpty()) {
        List<ArticleExit> exitArticles = convertToExitArticles(selectedArticles);
        ExitTicket exitTicket = new ExitTicket(exitArticles);
        exitTicket.setVisible(true);
        dispose();
    } else {
        // Display a message or do something else if no articles are selected
    }
    }//GEN-LAST:event_createExitButtonActionPerformed
    private List<ArticleExit> convertToExitArticles(List<Article> selectedArticles) {
    List<ArticleExit> exitArticles = new ArrayList<>();
    for (Article article : selectedArticles) {
        ArticleExit exitArticle;
        exitArticle = new ArticleExit(
                article.getCodeArt(),
                (int) article.getQteSt(),
                // Set the other properties of the ArticleExit object
                0, // prixUnit
                0, // montantS
                0, // pumpAnc
                (int) article.getQteSt(), // qteStockAnc
                0, // pumpNouv
                (int) article.getQteSt(), // qteStockNouv
                new Date(), // dateSort
                "00:00", // heureSort
                (int) article.getQteSt(), // qteSortRest
                0 // qteDem
        );
        exitArticles.add(exitArticle);
    }
    return exitArticles;
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
            java.util.logging.Logger.getLogger(ExitSheet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ExitSheet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ExitSheet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ExitSheet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new ExitSheet().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel articleCount;
    private javax.swing.JTextField articleCountTextField;
    private javax.swing.JButton backButton;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton createExitButton;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel logoLabel;
    private javax.swing.JTable resultsTable;
    private javax.swing.JTextField searchBar;
    private javax.swing.JButton searchButton;
    private javax.swing.JLabel searchLogoLabel;
    private javax.swing.JList<String> selectedArticlesList;
    // End of variables declaration//GEN-END:variables
}
