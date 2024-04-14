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
public class ArticleReturn {
    private String numBrs;
    private String codeArt;
    private int qteReint;
    private int prixUnit;
    private int montRe;
    private String numSort;
    private int pumpAnc;
    private int qteStockAnc;
    private int qteStockNouv;
    private int pumpNouv;
    private Date dateReint;
    private String heureReint;
    
    public ArticleReturn(String codeArt, int qteReint, int prixUnit, int montRe, String numSort, int pumpAnc, int qteStockAnc, int qteStockNouv, int pumpNouv, Date dateReint, String heureReint) {
        this.numBrs = generateNumBrs();
        this.codeArt = codeArt;
        this.qteReint = qteReint;
        this.prixUnit = prixUnit;
        this.montRe = montRe;
        this.numSort = generateNumSort();
        this.pumpAnc = pumpAnc;
        this.qteStockAnc = qteStockAnc;
        this.qteStockNouv = qteStockNouv;
        this.pumpNouv = pumpNouv;
        this.dateReint = dateReint;
        this.heureReint = heureReint;
    }
    private String generateNumBrs() {
    // Implement a logic to generate a unique number for the return
    return "BRS-" + System.currentTimeMillis();
}
    public String generateNumSort() {
    // Implement a logic to generate a unique number for the return
    return "SORT-" + System.currentTimeMillis();
}
    // Getters and Setters
    // ...

    public String getNumBrs() {
        return numBrs;
    }

    public void setNumBrs(String numBrs) {
        this.numBrs = numBrs;
    }

    public String getCodeArt() {
        return codeArt;
    }

    public void setCodeArt(String codeArt) {
        this.codeArt = codeArt;
    }

    public int getQteReint() {
        return qteReint;
    }

    public void setQteReint(int qteReint) {
        this.qteReint = qteReint;
    }

    public int getPrixUnit() {
        return prixUnit;
    }

    public void setPrixUnit(int prixUnit) {
        this.prixUnit = prixUnit;
    }

    public int getMontRe() {
        return montRe;
    }

    public void setMontRe(int montRe) {
        this.montRe = montRe;
    }

    public String getNumSort() {
        return numSort;
    }

    public void setNumSort(String numSort) {
        this.numSort = numSort;
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

    public int getQteStockNouv() {
        return qteStockNouv;
    }

    public void setQteStockNouv(int qteStockNouv) {
        this.qteStockNouv = qteStockNouv;
    }

    public int getPumpNouv() {
        return pumpNouv;
    }

    public void setPumpNouv(int pumpNouv) {
        this.pumpNouv = pumpNouv;
    }

    public Date getDateReint() {
        return dateReint;
    }

    public void setDateReint(Date dateReint) {
        this.dateReint = dateReint;
    }

    public String getHeureReint() {
        return heureReint;
    }

    public void setHeureReint(String heureReint) {
        this.heureReint = heureReint;
    }
    
}

