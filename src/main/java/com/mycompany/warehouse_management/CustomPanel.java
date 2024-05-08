/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.warehouse_management;
//import java.awt.Color;
//import java.awt.Font;
//import java.awt.GradientPaint;
//import java.awt.Graphics;
//import java.awt.Graphics2D;
//import java.awt.RenderingHints;
//import java.awt.geom.Ellipse2D;
//import java.awt.geom.Rectangle2D;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.SQLException;
//
//public class CustomPanel extends JPanel {
//
//    private Connection connection;
//
//    public CustomPanel() {
//        try {
//            connection = DriverManager.getConnection(DataBaseUtils.DB_URL, DataBaseUtils.DB_USER, DataBaseUtils.DB_PASSWORD);
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }
//
////    @Override
//    protected void paintComponent(Graphics g) {
//        paintComponent(g);
//
//        Graphics2D g2d = (Graphics2D) g;
//
//        // Set the rendering hints for better quality
//        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
//        g2d.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
//
//        // Draw a custom background
//        int width = getWidth();
//        int height = getHeight();
//
//        // Create a gradient background with blue and orange colors
//        GradientPaint gradient = new GradientPaint(0, 0, new Color(0x003366), width / 2, height, new Color(0x996633));
//        g2d.setPaint(gradient);
//        g2d.fillRect(0, 0, width, height);
//
//        // Retrieve data from the database
//        int totalArticles = DataBaseUtils.getTotalArticles(connection);
//        int activeArticles = DataBaseUtils.getActiveArticles(connection);
//        int dormantArticles = DataBaseUtils.getDormantArticles(connection);
//        int deadArticles = totalArticles - activeArticles - dormantArticles;
//
//        // Calculate the percentages
//        double activePercentage = (double) activeArticles / totalArticles * 100;
//        double dormantPercentage = (double) dormantArticles / totalArticles * 100;
//        double deadPercentage = (double) deadArticles / totalArticles * 100;
//
//        // Calculate the center point of the panel
//        int centerX = width / 2;
//        int centerY = height / 2;
//
//        // Draw the percentage circles
//        int circleSize = 100;
//        int circleX = centerX - circleSize / 2;
//        int circleY = centerY - circleSize / 2;
//
//        // Active articles circle
//        g2d.setColor(new Color(0x00CC00)); // Green color for active articles
//        g2d.fill(new Ellipse2D.Double(circleX, circleY, circleSize, circleSize));
//        g2d.setColor(Color.WHITE);
//        g2d.drawString(String.format("%.2f%%", activePercentage), circleX + circleSize / 4, circleY + circleSize / 2);
//
//        // Dormant articles circle
//        circleX += circleSize + 20;
//        g2d.setColor(new Color(0xFF6666)); // Red color for dormant articles
//        g2d.fill(new Ellipse2D.Double(circleX, circleY, circleSize, circleSize));
//        g2d.setColor(Color.WHITE);
//        g2d.drawString(String.format("%.2f%%", dormantPercentage), circleX + circleSize / 4, circleY + circleSize / 2);
//
//        // Dead articles circle
//        circleX += circleSize + 20;
//        g2d.setColor(new Color(0x808080)); // Gray color for dead articles
//        g2d.fill(new Ellipse2D.Double(circleX, circleY, circleSize, circleSize));
//        g2d.setColor(Color.WHITE);
//        g2d.drawString(String.format("%.2f%%", deadPercentage), circleX + circleSize / 4, circleY + circleSize / 2);
//    }
//}



