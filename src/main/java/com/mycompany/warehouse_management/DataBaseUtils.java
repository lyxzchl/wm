/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.warehouse_management;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author lyeschl
 */
public class DataBaseUtils {
    private static final String DB_URL = "jdbc:mariadb://localhost:3306/spare_parts_warehouse";
    private static final String DB_USER = "lyeschl";
    private static final String DB_PASSWORD = "lyessou1213";

    public static int authenticateUser(String username, String password) throws SQLException {
    String query = "SELECT password, active, failed_attempts FROM users WHERE username = ?";
    try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
         PreparedStatement stmt = conn.prepareStatement(query)) {
        stmt.setString(1, username);
        ResultSet rs = stmt.executeQuery();
        if (rs.next()) {
            boolean isActive = rs.getBoolean("active");
            int failedAttempts = rs.getInt("failed_attempts");
            if (!isActive) {
                // Account is not active, return 2
                return 2;
            }
            if (failedAttempts >= 5) {
                // Account is locked, set it to inactive and return 3
                updateFailedAttempts(conn, username, true);
                return 3;
            }
            String hashedPassword = rs.getString("password");
            boolean isAuthenticated = PasswordUtils.verifyPassword(password, hashedPassword);
            if (!isAuthenticated) {
                // Increment the failed attempts count and return 1
                updateFailedAttempts(conn, username, false);
                return 1;
            }
            // Authentication successful, return 0
            return 0;
        }
        // Username not found, return -1
        return -1;
    }
}
    private static void updateFailedAttempts(Connection conn, String username, boolean lockAccount) throws SQLException {
    String query = "UPDATE users SET failed_attempts = ?, active = ? WHERE username = ?";
    try (PreparedStatement stmt = conn.prepareStatement(query)) {
        if (lockAccount) {
            stmt.setInt(1, 5);
            stmt.setBoolean(2, false);
        } else {
            int currentFailedAttempts = getCurrentFailedAttempts(conn, username);
            stmt.setInt(1, currentFailedAttempts + 1);
            stmt.setBoolean(2, true);
        }
        stmt.setString(3, username);
        stmt.executeUpdate();
    }
}

private static int getCurrentFailedAttempts(Connection conn, String username) throws SQLException {
    String query = "SELECT failed_attempts FROM users WHERE username = ?";
    try (PreparedStatement stmt = conn.prepareStatement(query)) {
        stmt.setString(1, username);
        ResultSet rs = stmt.executeQuery();
        if (rs.next()) {
            return rs.getInt("failed_attempts");
        }
        return 0;
    }
}

    public static boolean isAccountActive(String username) throws SQLException {
    String query = "SELECT active FROM users WHERE username = ?";
    try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
        PreparedStatement stmt = conn.prepareStatement(query)) {
        stmt.setString(1, username);
        ResultSet rs = stmt.executeQuery();
        if (rs.next()) {
            return rs.getBoolean("active");
        }
        return false;
    }
}

    public static void populateArticleTable(JTable table, String searchColumn, String searchValue) {
        try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
             PreparedStatement stmt = conn.prepareStatement("SELECT * FROM Article WHERE " + searchColumn + " LIKE ?")) {

            stmt.setString(1, "%" + searchValue + "%");
            ResultSet rs = stmt.executeQuery();

            // Get the metadata of the result set
            ResultSetMetaData metaData = rs.getMetaData();
            int columnCount = metaData.getColumnCount();

            // Create a default table model to store the data
            DefaultTableModel model = new DefaultTableModel();

            // Add column names
            for (int i = 1; i <= columnCount; i++) {
                model.addColumn(metaData.getColumnName(i));
            }

            // Add data rows
            while (rs.next()) {
                Object[] row = new Object[columnCount];
                for (int i = 1; i <= columnCount; i++) {
                    row[i - 1] = rs.getObject(i);
                }
                model.addRow(row);
            }

            // Set the table model
            table.setModel(model);
        } catch (SQLException ex) {
   
            ex.printStackTrace(); // Add this line to print the stack trace of any SQL exceptions
        }
}
    public static void populateArticleTable(JTable table, String searchValue) {
    try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
         PreparedStatement stmt = conn.prepareStatement("SELECT * FROM Article WHERE " +
                 "code_art LIKE ? OR " +
                 "desig_art LIKE ? OR " +
                 "code_class LIKE ? OR " +
                 "unite_mes LIKE ? OR " +
                 "casier LIKE ? OR " +
                 "rayon LIKE ? OR " +
                 "observation LIKE ?")) {

        stmt.setString(1, "%" + searchValue + "%");
        stmt.setString(2, "%" + searchValue + "%");
        stmt.setString(3, "%" + searchValue + "%");
        stmt.setString(4, "%" + searchValue + "%");
        stmt.setString(5, "%" + searchValue + "%");
        stmt.setString(6, "%" + searchValue + "%");
        stmt.setString(7, "%" + searchValue + "%");

        ResultSet rs = stmt.executeQuery();

        // Get the metadata of the result set
        ResultSetMetaData metaData = rs.getMetaData();
        int columnCount = metaData.getColumnCount();

        // Create a default table model to store the data
        DefaultTableModel model = new DefaultTableModel();

        // Add column names
        for (int i = 1; i <= columnCount; i++) {
            model.addColumn(metaData.getColumnName(i));
        }

        // Add data rows
        while (rs.next()) {
            Object[] row = new Object[columnCount];
            for (int i = 1; i <= columnCount; i++) {
                row[i - 1] = rs.getObject(i);
            }
            model.addRow(row);
        }

        // Set the table model
        table.setModel(model);
    } catch (SQLException ex) {
        ex.printStackTrace();
    }
}


    public static int countArticles() throws SQLException {
        int count = 0;
        try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
        PreparedStatement stmt = conn.prepareStatement("SELECT COUNT(*) FROM Article");
        ResultSet rs = stmt.executeQuery()) {

            if (rs.next()) {
                count = rs.getInt(1);
            }
        }
        return count;
    }
public static Article getArticleById(String code_art) {
    Article article = new Article();;
    try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
         PreparedStatement stmt = conn.prepareStatement("SELECT * FROM Article WHERE code_art = ?")) {
        stmt.setString(1, code_art);
        ResultSet rs = stmt.executeQuery();
        if (rs.next()) {
            
            article.setCodeArt(rs.getString("code_art"));
            article.setDesigArt(rs.getString("desig_art"));
            article.setCodeClass(rs.getString("code_class"));
            article.setUniteMes(rs.getString("unite_mes"));
            article.setQteSt(rs.getDouble("qte_st"));
            article.setCasier(rs.getString("casier"));
            article.setStockMini(rs.getDouble("stock_mini"));
            article.setStockMax(rs.getDouble("stock_max"));
            article.setStockSecu(rs.getDouble("stock_secu"));
            article.setValeur(rs.getDouble("valeur"));
            article.setMort(rs.getBoolean("mort"));
            article.setObservation(rs.getString("observation"));
            article.setRayon(rs.getString("rayon"));
            article.setDormant(rs.getBoolean("dormant"));
            article.setActif(rs.getBoolean("actif"));
        }
    } catch (SQLException ex) {
        ex.printStackTrace();
    }
    return article;
}
public static List<Article> getAllArticles() throws SQLException {
    List<Article> articles = new ArrayList<>();
    try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
         PreparedStatement stmt = conn.prepareStatement("SELECT * FROM Article");
         ResultSet rs = stmt.executeQuery()) {
        while (rs.next()) {
            Article article = new Article();
            article.setCodeArt(rs.getString("code_art"));
            article.setDesigArt(rs.getString("desig_art"));
            article.setCodeClass(rs.getString("code_class"));
            article.setUniteMes(rs.getString("unite_mes"));
            article.setQteSt(rs.getDouble("qte_st"));
            article.setCasier(rs.getString("casier"));
            article.setStockMini(rs.getDouble("stock_mini"));
            article.setStockMax(rs.getDouble("stock_max"));
            article.setStockSecu(rs.getDouble("stock_secu"));
            article.setValeur(rs.getDouble("valeur"));
            article.setMort(rs.getBoolean("mort"));
            article.setObservation(rs.getString("observation"));
            article.setRayon(rs.getString("rayon"));
            article.setDormant(rs.getBoolean("dormant"));
            article.setActif(rs.getBoolean("actif"));
            articles.add(article);
        }
    }
    return articles;
}
public static void insertArticle(Article article) throws SQLException {
    try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
         PreparedStatement stmt = conn.prepareStatement(
             "INSERT INTO Article (code_art, desig_art, code_class, unite_mes, qte_st, casier, stock_mini, stock_max, stock_secu, valeur, mort, observation, rayon, dormant, actif) " +
             "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)")) {
        stmt.setString(1, article.getCodeArt());
        stmt.setString(2, article.getDesigArt());
        stmt.setString(3, article.getCodeClass());
        stmt.setString(4, article.getUniteMes());
        stmt.setDouble(5, article.getQteSt());
        stmt.setString(6, article.getCasier());
        stmt.setDouble(7, article.getStockMini());
        stmt.setDouble(8, article.getStockMax());
        stmt.setDouble(9, article.getStockSecu());
        stmt.setDouble(10, article.getValeur());
        stmt.setBoolean(11, article.isMort());
        stmt.setString(12, article.getObservation());
        stmt.setString(13, article.getRayon());
        stmt.setBoolean(14, article.isDormant());
        stmt.setBoolean(15, article.isActif());
        stmt.executeUpdate();
    } catch (SQLException ex) {
        throw ex;
    }
}

public static void updateArticle(Article article) throws SQLException {
    try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
         PreparedStatement stmt = conn.prepareStatement(
             "UPDATE Article " +
             "SET desig_art = ?, code_class = ?, unite_mes = ?, qte_st = ?, casier = ?, stock_mini = ?, stock_max = ?, stock_secu = ?, valeur = ?, mort = ?, observation = ?, rayon = ?, dormant = ?, actif = ? " +
             "WHERE code_art = ?")) {
        stmt.setString(1, article.getDesigArt());
        stmt.setString(2, article.getCodeClass());
        stmt.setString(3, article.getUniteMes());
        stmt.setDouble(4, article.getQteSt());
        stmt.setString(5, article.getCasier());
        stmt.setDouble(6, article.getStockMini());
        stmt.setDouble(7, article.getStockMax());
        stmt.setDouble(8, article.getStockSecu());
        stmt.setDouble(9, article.getValeur());
        stmt.setBoolean(10, article.isMort());
        stmt.setString(11, article.getObservation());
        stmt.setString(12, article.getRayon());
        stmt.setBoolean(13, article.isDormant());
        stmt.setBoolean(14, article.isActif());
        stmt.setString(15, article.getCodeArt());
        stmt.executeUpdate();
    } catch (SQLException ex) {
        throw ex;
    }
}

// Logic for Exit Sheet
public static List<Exit> getAllExits() throws SQLException {
    List<Exit> exits = new ArrayList<>();

    try (Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
         PreparedStatement statement = connection.prepareStatement("SELECT * FROM `Exit`")) {
        ResultSet resultSet = statement.executeQuery();

        while (resultSet.next()) {
            Exit exit = new Exit();
            exit.setNumSort(resultSet.getString("num_sort"));
            exit.setNumOT(resultSet.getString("num_OT"));
            exit.setCodeAnal(resultSet.getString("code_anal"));
            exit.setCodeMag(resultSet.getString("code_mag"));
            exit.setCodeUnit(resultSet.getString("code_unit"));
            exit.setDateSort(resultSet.getDate("date_sort"));
            exit.setTotal(resultSet.getInt("total"));
            exit.setDateValide(resultSet.getDate("date_valide"));
            exit.setValide(resultSet.getString("valide"));
            exit.setAnnule(resultSet.getString("annule"));
            exits.add(exit);
        }
    } catch (SQLException ex) {
        throw ex;
    }

    return exits;
}
// Logic for Return Sheet
public static List<Return> getAllReturns() throws SQLException {
    List<Return> returns = new ArrayList<>();

    try (Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
         PreparedStatement statement = connection.prepareStatement("SELECT * FROM `Return`")) {
        ResultSet resultSet = statement.executeQuery();

        while (resultSet.next()) {
            Return returnObj = new Return();
            returnObj.setNumBrs(resultSet.getString("num_brs"));
            returnObj.setCodeMag(resultSet.getString("code_mag"));
            returnObj.setDateReint(resultSet.getInt("date_reint"));
            returnObj.setTotal(resultSet.getInt("total"));
            returnObj.setDateValide(resultSet.getDate("date_valide"));
            returnObj.setValide(resultSet.getString("valide"));
            returnObj.setAnnule(resultSet.getString("annule"));
            returns.add(returnObj);
        }
    } catch (SQLException ex) {
        throw ex;
    }

    return returns;
}

}

