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
public class Return {
    private String numBrs;
    private String codeMag;
    private int dateReint;
    private int total;
    private Date dateValide;
    private String valide;
    private String annule;

    // Getters and Setters
    // ...

    public String getNumBrs() {
        return numBrs;
    }

    public void setNumBrs(String numBrs) {
        this.numBrs = numBrs;
    }

    public String getCodeMag() {
        return codeMag;
    }

    public void setCodeMag(String codeMag) {
        this.codeMag = codeMag;
    }

    public int getDateReint() {
        return dateReint;
    }

    public void setDateReint(int dateReint) {
        this.dateReint = dateReint;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public Date getDateValide() {
        return dateValide;
    }

    public void setDateValide(Date dateValide) {
        this.dateValide = dateValide;
    }

    public String getValide() {
        return valide;
    }

    public void setValide(String valide) {
        this.valide = valide;
    }

    public String getAnnule() {
        return annule;
    }

    public void setAnnule(String annule) {
        this.annule = annule;
    }
    
}

