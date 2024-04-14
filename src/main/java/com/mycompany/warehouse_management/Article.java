/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.warehouse_management;

/**
 *
 * @author lyeschl
 */
public class Article {
    private String codeArt;
    private String desigArt;
    private String codeClass;
    private String uniteMes;
    private double qteSt;
    private String casier;
    private double stockMini;
    private double stockMax;
    private double stockSecu;
    private double valeur;
    private boolean mort;
    private String observation;
    private String rayon;
    private boolean dormant;
    private boolean actif;
    private int temporary_to_exit;
    private int temporary_to_return;

    public Article() {
    }

    
    public Article(String codeArt, String desigArt, String codeClass, String uniteMes, double qteSt, String casier, double stockMini, double stockMax, double stockSecu, double valeur, boolean mort, String observation, String rayon, boolean dormant, boolean actif) {
        this.codeArt = codeArt;
        this.desigArt = desigArt;
        this.codeClass = codeClass;
        this.uniteMes = uniteMes;
        this.qteSt = qteSt;
        this.casier = casier;
        this.stockMini = stockMini;
        this.stockMax = stockMax;
        this.stockSecu = stockSecu;
        this.valeur = valeur;
        this.mort = mort;
        this.observation = observation;
        this.rayon = rayon;
        this.dormant = dormant;
        this.actif = actif;
    }

    public void setTemporary_to_exit(int temporary_to_exit) {
        this.temporary_to_exit = temporary_to_exit;
    }

    public int getTemporary_to_exit() {
        return temporary_to_exit;
    }

    public int getTemporary_to_return() {
        return temporary_to_return;
    }

    public void setTemporary_to_return(int temporary_to_return) {
        this.temporary_to_return = temporary_to_return;
    }
    
    
    public String getCodeArt() {
        return codeArt;
    }

    public void setCodeArt(String codeArt) {
        this.codeArt = codeArt;
    }

    public String getDesigArt() {
        return desigArt;
    }

    public void setDesigArt(String desigArt) {
        this.desigArt = desigArt;
    }

    public String getCodeClass() {
        return codeClass;
    }

    public void setCodeClass(String codeClass) {
        this.codeClass = codeClass;
    }

    public String getUniteMes() {
        return uniteMes;
    }

    public void setUniteMes(String uniteMes) {
        this.uniteMes = uniteMes;
    }

    public double getQteSt() {
        return qteSt;
    }

    public void setQteSt(double qteSt) {
        this.qteSt = qteSt;
    }

    public String getCasier() {
        return casier;
    }

    public void setCasier(String casier) {
        this.casier = casier;
    }

    public double getStockMini() {
        return stockMini;
    }

    public void setStockMini(double stockMini) {
        this.stockMini = stockMini;
    }

    public double getStockMax() {
        return stockMax;
    }

    public void setStockMax(double stockMax) {
        this.stockMax = stockMax;
    }

    public double getStockSecu() {
        return stockSecu;
    }

    public void setStockSecu(double stockSecu) {
        this.stockSecu = stockSecu;
    }

    public double getValeur() {
        return valeur;
    }

    public void setValeur(double valeur) {
        this.valeur = valeur;
    }

    public boolean isMort() {
        return mort;
    }

    public void setMort(boolean mort) {
        this.mort = mort;
    }

    public String getObservation() {
        return observation;
    }

    public void setObservation(String observation) {
        this.observation = observation;
    }

    public String getRayon() {
        return rayon;
    }

    public void setRayon(String rayon) {
        this.rayon = rayon;
    }

    public boolean isDormant() {
        return dormant;
    }

    public void setDormant(boolean dormant) {
        this.dormant = dormant;
    }

    public boolean isActif() {
        return actif;
    }

    public void setActif(boolean actif) {
        this.actif = actif;
    }
}

