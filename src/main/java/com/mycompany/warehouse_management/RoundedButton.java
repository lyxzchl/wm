///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//package com.mycompany.warehouse.manager;
//
///**
// *
// * @author lyeschl
// */
//import java.awt.*;
//import javax.swing.*;
//
//public class RoundedButton extends JButton {
//
//    public RoundedButton(String text) {
//        super(text);
//        setContentAreaFilled(false);
//        setFocusPainted(false); // Remove focus border
//    }
//
//    @Override
//    protected void paintComponent(Graphics g) {
//        if (!isOpaque() && getBackground().getAlpha() < 255) {
//            g.setColor(getBackground());
//            g.fillRect(0, 0, getWidth(), getHeight());
//        }
//        super.paintComponent(g);
//    }
//
//    @Override
//    protected void paintBorder(Graphics g) {
//        g.setColor(getForeground());
//        ((Graphics2D) g).setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
//        g.drawRoundRect(0, 0, getWidth() - 1, getHeight() - 1, 20, 20); // Adjust radius as needed
//    }
//}
