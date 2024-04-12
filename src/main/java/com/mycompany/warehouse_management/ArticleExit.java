/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.warehouse_management;

import java.util.Date;

/**
 *
 * @author lyeschl
 */
public class ArticleExit {
    private String numSort;
    private String codeArt;
    private int qteSort;
    private int prixUnit;
    private int montantS;
    private int pumpAnc;
    private int qteStockAnc;
    private int pumpNouv;
    private int qteStockNouv;
    private Date dateSort;
    private String heureSort;
    private int qteSortRest;
    private int qteDem;

    // Getters and Setters
    // ...
    
    public ArticleExit() {
    }

    public ArticleExit(String codeArt, int qteSort, int prixUnit, int montantS, int pumpAnc, int qteStockAnc, int pumpNouv, int qteStockNouv, Date dateSort, String heureSort, int qteSortRest, int qteDem) {
        this.numSort = generateNumSort(); // Generate a unique number for the sort
        this.codeArt = codeArt;
        this.qteSort = qteSort;
        this.prixUnit = prixUnit;
        this.montantS = montantS;
        this.pumpAnc = pumpAnc;
        this.qteStockAnc = qteStockAnc;
        this.pumpNouv = pumpNouv;
        this.qteStockNouv = qteStockNouv;
        this.dateSort = dateSort;
        this.heureSort = heureSort;
        this.qteSortRest = qteSortRest;
        this.qteDem = qteDem;
    }
    private String generateNumSort() {
        // Implement a logic to generate a unique number for the sort
        return "SORT-" + System.currentTimeMillis();
    }

    public String getNumSort() {
        return numSort;
    }

    public void setNumSort(String numSort) {
        this.numSort = numSort;
    }

    public String getCodeArt() {
        return codeArt;
    }

    public void setCodeArt(String codeArt) {
        this.codeArt = codeArt;
    }

    public int getQteSort() {
        return qteSort;
    }

    public void setQteSort(int qteSort) {
        this.qteSort = qteSort;
    }

    public int getPrixUnit() {
        return prixUnit;
    }

    public void setPrixUnit(int prixUnit) {
        this.prixUnit = prixUnit;
    }

    public int getMontantS() {
        return montantS;
    }

    public void setMontantS(int montantS) {
        this.montantS = montantS;
    }

    public int getPumpAnc() {
        return pumpAnc;
    }

    public void setPumpAnc(int pumpAnc) {
        this.pumpAnc = pumpAnc;
    }

    public int getQteStockAnc() {
        return qteStockAnc;
    }

    public void setQteStockAnc(int qteStockAnc) {
        this.qteStockAnc = qteStockAnc;
    }

    public int getPumpNouv() {
        return pumpNouv;
    }

    public void setPumpNouv(int pumpNouv) {
        this.pumpNouv = pumpNouv;
    }

    public int getQteStockNouv() {
        return qteStockNouv;
    }

    public void setQteStockNouv(int qteStockNouv) {
        this.qteStockNouv = qteStockNouv;
    }

    public Date getDateSort() {
        return dateSort;
    }

    public void setDateSort(Date dateSort) {
        this.dateSort = dateSort;
    }

    public String getHeureSort() {
        return heureSort;
    }

    public void setHeureSort(String heureSort) {
        this.heureSort = heureSort;
    }

    public int getQteSortRest() {
        return qteSortRest;
    }

    public void setQteSortRest(int qteSortRest) {
        this.qteSortRest = qteSortRest;
    }

    public int getQteDem() {
        return qteDem;
    }

    public void setQteDem(int qteDem) {
        this.qteDem = qteDem;
    }
    
}
