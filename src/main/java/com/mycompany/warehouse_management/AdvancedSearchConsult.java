package com.mycompany.warehouse_management;

import com.formdev.flatlaf.FlatDarkLaf;
import com.formdev.flatlaf.FlatLightLaf;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
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


public class AdvancedSearchConsult extends javax.swing.JFrame {

    /**
     * Creates new form AdvancedSearch
     */
    public AdvancedSearchConsult() {
    try {
        UIManager.setLookAndFeel(new FlatDarkLaf());
    } catch (Exception ex) {
        Logger.getLogger(AdvancedSearchConsult.class.getName()).log(Level.SEVERE, null, ex);
    }
    initComponents();
    int windowWidth = 1130; // Adjust the desired width
        int windowHeight = 659; // Adjust the desired height
        setSize(windowWidth, windowHeight);
        setResizable(false); // Prevent resizing
    setLocationRelativeTo(null);
    DataBaseUtils.populateArticleTableWithoutSearch(resultsTable);
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
                String codeClass = (String) model.getValueAt(selectedRow, 2);
                String uniteMes = (String) model.getValueAt(selectedRow, 3);
                double qteSt = ((Number) model.getValueAt(selectedRow, 4)).doubleValue();
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
                // Open the ArticleSheetEntry interface and pass the selected article
                ArticleSheetEntry articleSheet = new ArticleSheetEntry(selectedArticle);
                articleSheet.setVisible(true);
                dispose();
            }
        }
    }
});


}
private double getDoubleValue(JTable table, int row, int column) {
    java.lang.Class columnClass = table.getColumnClass(column);
    if (columnClass == Double.class) {
        return (double) table.getValueAt(row, column);
    } else if (columnClass == Integer.class) {
        return (int) table.getValueAt(row, column);
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
        codeRadio = new javax.swing.JRadioButton();
        classRadio = new javax.swing.JRadioButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        resultsTable = new javax.swing.JTable();
        logoLabel = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();
        desigRadio = new javax.swing.JRadioButton();
        searchLogoLabel = new javax.swing.JLabel();
        articleCount = new javax.swing.JLabel();
        articleCountTextField = new javax.swing.JTextField();
        searchButton = new javax.swing.JButton();
        measureUnitRadio = new javax.swing.JRadioButton();
        rayonRadio = new javax.swing.JRadioButton();
        casierRadio = new javax.swing.JRadioButton();
        valueRadio = new javax.swing.JRadioButton();
        stockQRadio = new javax.swing.JRadioButton();
        stockMinRadio = new javax.swing.JRadioButton();
        stockMaxRadio = new javax.swing.JRadioButton();
        stockSecRadio = new javax.swing.JRadioButton();
        observRadio = new javax.swing.JRadioButton();
        activeRadio = new javax.swing.JRadioButton();
        dormantRadio = new javax.swing.JRadioButton();
        deadRadio = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();

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

        codeRadio.setBackground(new java.awt.Color(51, 51, 51));
        buttonGroup1.add(codeRadio);
        codeRadio.setFont(new java.awt.Font("POI Aeronaut Trial", 0, 12)); // NOI18N
        codeRadio.setForeground(new java.awt.Color(153, 153, 153));
        codeRadio.setText("Code");
        codeRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codeRadioActionPerformed(evt);
            }
        });

        classRadio.setBackground(new java.awt.Color(51, 51, 51));
        buttonGroup1.add(classRadio);
        classRadio.setFont(new java.awt.Font("POI Aeronaut Trial", 0, 12)); // NOI18N
        classRadio.setForeground(new java.awt.Color(153, 153, 153));
        classRadio.setText("Class");
        classRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                classRadioActionPerformed(evt);
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

            backButton.setBackground(new java.awt.Color(0, 51, 102));
            backButton.setFont(new java.awt.Font("POI Aeronaut Trial", 1, 12)); // NOI18N
            backButton.setForeground(new java.awt.Color(153, 153, 153));
            backButton.setText("<<Back");
            backButton.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 51, 102)));
            backButton.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    backButtonActionPerformed(evt);
                }
            });

            desigRadio.setBackground(new java.awt.Color(51, 51, 51));
            buttonGroup1.add(desigRadio);
            desigRadio.setFont(new java.awt.Font("POI Aeronaut Trial", 0, 12)); // NOI18N
            desigRadio.setForeground(new java.awt.Color(153, 153, 153));
            desigRadio.setText("Designation");
            desigRadio.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    desigRadioActionPerformed(evt);
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
            articleCountTextField.setText("11");
            articleCountTextField.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 51, 102)));
            articleCountTextField.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    articleCountTextFieldActionPerformed(evt);
                }
            });

            searchButton.setBackground(new java.awt.Color(0, 51, 102));
            searchButton.setFont(new java.awt.Font("POI Aeronaut Trial", 0, 11)); // NOI18N
            searchButton.setForeground(new java.awt.Color(153, 153, 153));
            searchButton.setText("Search");
            searchButton.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 51, 102)));
            searchButton.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    searchButtonActionPerformed(evt);
                }
            });

            measureUnitRadio.setBackground(new java.awt.Color(51, 51, 51));
            buttonGroup1.add(measureUnitRadio);
            measureUnitRadio.setFont(new java.awt.Font("POI Aeronaut Trial", 0, 12)); // NOI18N
            measureUnitRadio.setForeground(new java.awt.Color(153, 153, 153));
            measureUnitRadio.setText("Measure Unit");
            measureUnitRadio.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    measureUnitRadioActionPerformed(evt);
                }
            });

            rayonRadio.setBackground(new java.awt.Color(51, 51, 51));
            buttonGroup1.add(rayonRadio);
            rayonRadio.setFont(new java.awt.Font("POI Aeronaut Trial", 0, 12)); // NOI18N
            rayonRadio.setForeground(new java.awt.Color(153, 153, 153));
            rayonRadio.setText("Aisle");
            rayonRadio.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    rayonRadioActionPerformed(evt);
                }
            });

            casierRadio.setBackground(new java.awt.Color(51, 51, 51));
            buttonGroup1.add(casierRadio);
            casierRadio.setFont(new java.awt.Font("POI Aeronaut Trial", 0, 12)); // NOI18N
            casierRadio.setForeground(new java.awt.Color(153, 153, 153));
            casierRadio.setText("Shelf");
            casierRadio.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    casierRadioActionPerformed(evt);
                }
            });

            valueRadio.setBackground(new java.awt.Color(51, 51, 51));
            buttonGroup1.add(valueRadio);
            valueRadio.setFont(new java.awt.Font("POI Aeronaut Trial", 0, 12)); // NOI18N
            valueRadio.setForeground(new java.awt.Color(153, 153, 153));
            valueRadio.setText("Value");
            valueRadio.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    valueRadioActionPerformed(evt);
                }
            });

            stockQRadio.setBackground(new java.awt.Color(51, 51, 51));
            buttonGroup1.add(stockQRadio);
            stockQRadio.setFont(new java.awt.Font("POI Aeronaut Trial", 0, 12)); // NOI18N
            stockQRadio.setForeground(new java.awt.Color(153, 153, 153));
            stockQRadio.setText("Stock Quantity");
            stockQRadio.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    stockQRadioActionPerformed(evt);
                }
            });

            stockMinRadio.setBackground(new java.awt.Color(51, 51, 51));
            buttonGroup1.add(stockMinRadio);
            stockMinRadio.setFont(new java.awt.Font("POI Aeronaut Trial", 0, 12)); // NOI18N
            stockMinRadio.setForeground(new java.awt.Color(153, 153, 153));
            stockMinRadio.setText("Minimum Stock");
            stockMinRadio.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    stockMinRadioActionPerformed(evt);
                }
            });

            stockMaxRadio.setBackground(new java.awt.Color(51, 51, 51));
            buttonGroup1.add(stockMaxRadio);
            stockMaxRadio.setFont(new java.awt.Font("POI Aeronaut Trial", 0, 12)); // NOI18N
            stockMaxRadio.setForeground(new java.awt.Color(153, 153, 153));
            stockMaxRadio.setText("Maximum Stock");
            stockMaxRadio.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    stockMaxRadioActionPerformed(evt);
                }
            });

            stockSecRadio.setBackground(new java.awt.Color(51, 51, 51));
            buttonGroup1.add(stockSecRadio);
            stockSecRadio.setFont(new java.awt.Font("POI Aeronaut Trial", 0, 12)); // NOI18N
            stockSecRadio.setForeground(new java.awt.Color(153, 153, 153));
            stockSecRadio.setText("Secure Stock");
            stockSecRadio.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    stockSecRadioActionPerformed(evt);
                }
            });

            observRadio.setBackground(new java.awt.Color(51, 51, 51));
            buttonGroup1.add(observRadio);
            observRadio.setFont(new java.awt.Font("POI Aeronaut Trial", 0, 12)); // NOI18N
            observRadio.setForeground(new java.awt.Color(153, 153, 153));
            observRadio.setText("Observation");
            observRadio.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    observRadioActionPerformed(evt);
                }
            });

            activeRadio.setBackground(new java.awt.Color(51, 51, 51));
            buttonGroup1.add(activeRadio);
            activeRadio.setFont(new java.awt.Font("POI Aeronaut Trial", 0, 12)); // NOI18N
            activeRadio.setForeground(new java.awt.Color(153, 153, 153));
            activeRadio.setText("Active");
            activeRadio.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    activeRadioActionPerformed(evt);
                }
            });

            dormantRadio.setBackground(new java.awt.Color(51, 51, 51));
            buttonGroup1.add(dormantRadio);
            dormantRadio.setFont(new java.awt.Font("POI Aeronaut Trial", 0, 12)); // NOI18N
            dormantRadio.setForeground(new java.awt.Color(153, 153, 153));
            dormantRadio.setText("Dormant");
            dormantRadio.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    dormantRadioActionPerformed(evt);
                }
            });

            deadRadio.setBackground(new java.awt.Color(51, 51, 51));
            buttonGroup1.add(deadRadio);
            deadRadio.setFont(new java.awt.Font("POI Aeronaut Trial", 0, 12)); // NOI18N
            deadRadio.setForeground(new java.awt.Color(153, 153, 153));
            deadRadio.setText("Dead");
            deadRadio.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    deadRadioActionPerformed(evt);
                }
            });

            jLabel1.setFont(new java.awt.Font("POI Aeronaut Trial", 1, 36)); // NOI18N
            jLabel1.setText("Advanced Search");

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
                    .addGap(161, 161, 161)
                    .addComponent(searchLogoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(searchBar, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(38, 38, 38)
                            .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(valueRadio)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(codeRadio)
                                    .addGap(9, 9, 9)
                                    .addComponent(classRadio)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(desigRadio)
                                    .addGap(26, 26, 26)
                                    .addComponent(stockMaxRadio)
                                    .addGap(12, 12, 12)
                                    .addComponent(measureUnitRadio)
                                    .addGap(28, 28, 28)
                                    .addComponent(rayonRadio))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(stockSecRadio)
                                    .addGap(25, 25, 25)
                                    .addComponent(stockQRadio)
                                    .addGap(18, 18, 18)
                                    .addComponent(observRadio)
                                    .addGap(18, 18, 18)
                                    .addComponent(activeRadio)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(stockMinRadio)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(dormantRadio)))
                            .addGap(26, 26, 26)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(deadRadio)
                                .addComponent(casierRadio))))
                    .addContainerGap(284, Short.MAX_VALUE))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addGap(20, 20, 20)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jScrollPane2)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(203, 203, 203)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(logoLabel)))
                    .addGap(14, 14, 14))
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
                            .addGap(53, 53, 53)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(searchBar)
                                        .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(casierRadio)
                                        .addComponent(rayonRadio)
                                        .addComponent(measureUnitRadio)
                                        .addComponent(stockMaxRadio)
                                        .addComponent(desigRadio)
                                        .addComponent(classRadio)
                                        .addComponent(codeRadio)
                                        .addComponent(valueRadio))
                                    .addGap(21, 21, 21)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(observRadio)
                                        .addComponent(activeRadio)
                                        .addComponent(dormantRadio)
                                        .addComponent(deadRadio)
                                        .addComponent(stockSecRadio)
                                        .addComponent(stockMinRadio)
                                        .addComponent(stockQRadio))
                                    .addGap(23, 23, 23))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(searchLogoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(9, 9, 9))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(logoLabel)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(articleCount, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(articleCountTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(22, 22, 22))
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

    private void searchBarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchBarActionPerformed

    private void codeRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codeRadioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codeRadioActionPerformed

    private void classRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_classRadioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_classRadioActionPerformed

    private void desigRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_desigRadioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_desigRadioActionPerformed

    private void articleCountTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_articleCountTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_articleCountTextFieldActionPerformed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        String searchColumn = "";
        String searchValue = searchBar.getText().trim();

        if (codeRadio.isSelected()) {
            searchColumn = "code_art";
        } else if (classRadio.isSelected()) {
            searchColumn = "code_class";
        } else if (desigRadio.isSelected()) {
            searchColumn = "desig_art";
        } else if (measureUnitRadio.isSelected()) {
            searchColumn = "unite_mes";
        } else if (rayonRadio.isSelected()) {
            searchColumn = "rayon";
        } else if (casierRadio.isSelected()) {
            searchColumn = "casier";
        } else if (valueRadio.isSelected()) {
            searchColumn = "valeur";
        } else if (stockQRadio.isSelected()) {
            searchColumn = "qte_st";
        } else if (stockMinRadio.isSelected()) {
            searchColumn = "stock_mini";
        } else if (stockMaxRadio.isSelected()) {
            searchColumn = "stock_max";
        } else if (stockSecRadio.isSelected()) {
            searchColumn = "stock_secu";
        } else if (observRadio.isSelected()) {
            searchColumn = "observation";
        } else if (activeRadio.isSelected()) {
            searchColumn = "actif";
        } else if (dormantRadio.isSelected()) {
            searchColumn = "dormant";
        } else if (deadRadio.isSelected()) {
            searchColumn = "mort";
        }

        if (!searchValue.isEmpty()) {
            if (!searchColumn.isEmpty()) {
                DataBaseUtils.populateArticleTable(resultsTable, searchColumn, searchValue);
            } else {
                // If no radio button is selected, search in all columns
                DataBaseUtils.populateArticleTable(resultsTable, searchValue);
            } 
        resultsTable.revalidate();
        resultsTable.repaint();
        } else {
            DataBaseUtils.populateArticleTableWithoutSearch(resultsTable);    
        }
        // Get the count of articles
        int articleCount;
        try {
            articleCount = DataBaseUtils.countArticles();
            // Set the count in the text field
            articleCountTextField.setText(Integer.toString(articleCount));
        } catch (SQLException ex) {
            Logger.getLogger(AdvancedSearchConsult.class.getName()).log(Level.SEVERE, null, ex);
        }
        

    }//GEN-LAST:event_searchButtonActionPerformed
    
    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        dispose();
        
        DashboardConsult db = new DashboardConsult();
        db.setVisible(true);
    }//GEN-LAST:event_backButtonActionPerformed

    private void measureUnitRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_measureUnitRadioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_measureUnitRadioActionPerformed

    private void rayonRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rayonRadioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rayonRadioActionPerformed

    private void casierRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casierRadioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_casierRadioActionPerformed

    private void valueRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valueRadioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_valueRadioActionPerformed

    private void stockQRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stockQRadioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_stockQRadioActionPerformed

    private void stockMinRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stockMinRadioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_stockMinRadioActionPerformed

    private void stockMaxRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stockMaxRadioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_stockMaxRadioActionPerformed

    private void stockSecRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stockSecRadioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_stockSecRadioActionPerformed

    private void observRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_observRadioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_observRadioActionPerformed

    private void activeRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_activeRadioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_activeRadioActionPerformed

    private void dormantRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dormantRadioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dormantRadioActionPerformed

    private void deadRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deadRadioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deadRadioActionPerformed

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
            java.util.logging.Logger.getLogger(AdvancedSearchConsult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdvancedSearchConsult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdvancedSearchConsult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdvancedSearchConsult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new AdvancedSearchConsult().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton activeRadio;
    private javax.swing.JLabel articleCount;
    private javax.swing.JTextField articleCountTextField;
    private javax.swing.JButton backButton;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton casierRadio;
    private javax.swing.JRadioButton classRadio;
    private javax.swing.JRadioButton codeRadio;
    private javax.swing.JRadioButton deadRadio;
    private javax.swing.JRadioButton desigRadio;
    private javax.swing.JRadioButton dormantRadio;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel logoLabel;
    private javax.swing.JRadioButton measureUnitRadio;
    private javax.swing.JRadioButton observRadio;
    private javax.swing.JRadioButton rayonRadio;
    private javax.swing.JTable resultsTable;
    private javax.swing.JTextField searchBar;
    private javax.swing.JButton searchButton;
    private javax.swing.JLabel searchLogoLabel;
    private javax.swing.JRadioButton stockMaxRadio;
    private javax.swing.JRadioButton stockMinRadio;
    private javax.swing.JRadioButton stockQRadio;
    private javax.swing.JRadioButton stockSecRadio;
    private javax.swing.JRadioButton valueRadio;
    // End of variables declaration//GEN-END:variables
}
