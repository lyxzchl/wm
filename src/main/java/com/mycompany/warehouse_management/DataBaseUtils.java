/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.warehouse_management;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author lyeschl
 */
public class DataBaseUtils {
    private static final Properties CONFIG = new Properties();

    static {
        try (InputStream inputStream = new FileInputStream("/run/media/lyeschl/ssd/main/wmdb.propreties")) {
            CONFIG.load(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static final String DB_URL = CONFIG.getProperty("db.url");
    public static final String DB_USER = CONFIG.getProperty("db.user");
    public static final String DB_PASSWORD = CONFIG.getProperty("db.password");


    public static String getDB_URL() {
        return DB_URL;
    }

    public static String getDB_USER() {
        return DB_USER;
    }

    public static String getDB_PASSWORD() {
        return DB_PASSWORD;
    }
    
    public static int authenticateUser(String username, String password) throws SQLException {
    String query = "SELECT password, active, failed_attempts, role FROM users WHERE BINARY username = ?";
    try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
         PreparedStatement stmt = conn.prepareStatement(query)) {
        stmt.setString(1, username);
        ResultSet rs = stmt.executeQuery();
        if (rs.next()) {
            boolean isActive = rs.getBoolean("active");
            int failedAttempts = rs.getInt("failed_attempts");
            String role = rs.getString("role");
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
            // Authentication successful, return the user's role
            return 0;
        }
        // Username not found, return -1
        return -1;
    }
}
    public static String getUserRole(String username) throws SQLException {
    String query = "SELECT role FROM users WHERE BINARY username = ?";
    try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
         PreparedStatement stmt = conn.prepareStatement(query)) {
        stmt.setString(1, username);
        ResultSet rs = stmt.executeQuery();
        if (rs.next()) {
            return rs.getString("role");
        }
        // Username not found, return null
        return null;
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
    public static void populateArticleTableWithoutSearch(JTable table) {
    try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
         PreparedStatement stmt = conn.prepareStatement("SELECT * FROM Article")) {

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
    public static void populateMoveTable(JTable table) {
    try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
         PreparedStatement stmt = conn.prepareStatement("SELECT * FROM Move")) {

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
// ExitTicket -> Next Button
private static ResultSet exitResultSet = null;
    private static int exitCurrentRow = 0;

    public static void displayNextExit(JFrame frame, JTextField ticketCodeTextField, JTextField warehousecodeTextField,
                                      JTextField costcenterTextField, JFormattedTextField exitDateFormattedTextField,
                                      JToggleButton validToggleButton, JToggleButton cancelToggleButton,
                                      JTable exit_ArticlesTable) {
        try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
             Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
             ResultSet rs = stmt.executeQuery("SELECT * FROM `Exit` ORDER BY num_sort")) {
            if (exitResultSet == null) {
                exitResultSet = rs;
            }

            if (exitResultSet.next()) {
                String numSort = exitResultSet.getString("num_sort");
                String numOT = exitResultSet.getString("num_OT");
                String codeMag = exitResultSet.getString("code_mag");
                String codeAnal = exitResultSet.getString("code_anal");
                Date dateSortSql = exitResultSet.getDate("date_sort");
                String valide = exitResultSet.getString("valide");
                String annule = exitResultSet.getString("annule");

                SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
                String dateSort = sdf.format(dateSortSql);

                ticketCodeTextField.setText(numOT);
                warehousecodeTextField.setText(codeMag);
                costcenterTextField.setText(codeAnal);
                exitDateFormattedTextField.setText(dateSort);
                validToggleButton.setSelected("Yes".equals(valide));
                cancelToggleButton.setSelected("Yes".equals(annule));

                // Fetch and display the Article_Exit tuples
                displayArticleExits(frame, exit_ArticlesTable, numSort);
            } else {
                JOptionPane.showMessageDialog(frame, "No more exits to display.", "Information", JOptionPane.INFORMATION_MESSAGE);
                exitResultSet = null;
                exitCurrentRow = 0;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(frame, "Error fetching exit data.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void displayArticleExits(JFrame frame, JTable exit_ArticlesTable, String numSort) {
        try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
             PreparedStatement stmt = conn.prepareStatement("SELECT * FROM Article_Exit WHERE num_sort = ?")) {
            stmt.setString(1, numSort);
            ResultSet rs = stmt.executeQuery();

            // Clear the existing data in the exit_ArticlesTable
            ((DefaultTableModel) exit_ArticlesTable.getModel()).setRowCount(0);

            while (rs.next()) {
                String codeArt = rs.getString("code_art");
                int qteSort = rs.getInt("qte_sort");
                int prixUnit = rs.getInt("prix_unit");
                int montantS = rs.getInt("montant_S");
                int pumpAnc = rs.getInt("pump_anc");
                int qteStockAnc = rs.getInt("qte_stk_anc");
                int pumpNouv = rs.getInt("pump_nouv");
                int qteStockNouv = rs.getInt("qte_stk_nouv");
                Date dateSortSql = rs.getDate("date_sort");
                String heureSort = rs.getString("heure_sort");
                int qteSortRest = rs.getInt("qte_sort_rest");
                int qteDem = rs.getInt("qte_dem");

                SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
                String dateSort = sdf.format(dateSortSql);

                Object[] row = {numSort,codeArt, qteSort, prixUnit, montantS, pumpAnc, qteStockAnc, pumpNouv, qteStockNouv, dateSort, heureSort, qteSortRest, qteDem};
                ((DefaultTableModel) exit_ArticlesTable.getModel()).addRow(row);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(frame, "Error fetching article exit data.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
// ReturnTicket -> Next Button
    private static ResultSet returnResultSet = null;
    private static int returnCurrentRow = 0;

    public static void displayNextReturn(JFrame frame, JTextField ticketCodeTextField, JTextField warehousecodeTextField,
                                         JFormattedTextField exitDateFormattedTextField, JToggleButton validToggleButton,
                                         JToggleButton cancelToggleButton, JTable return_ArticlesTable) {
        try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
             Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
             ResultSet rs = stmt.executeQuery("SELECT * FROM `Return` ORDER BY num_brs")) {
            if (returnResultSet == null) {
                returnResultSet = rs;
            }

            if (returnResultSet.next()) {
                String numBRS = returnResultSet.getString("num_brs");
                String codeMag = returnResultSet.getString("code_mag");
                Date dateReintSql = returnResultSet.getDate("date_reint");
                String valide = returnResultSet.getString("valide");
                String annule = returnResultSet.getString("annule");

                SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
                String dateReint = sdf.format(dateReintSql);

                ticketCodeTextField.setText(numBRS);
                warehousecodeTextField.setText(codeMag);
                exitDateFormattedTextField.setText(dateReint);
                validToggleButton.setSelected("Yes".equals(valide));
                cancelToggleButton.setSelected("Yes".equals(annule));

                // Fetch and display the Article_Return tuples
                displayArticleReturns(frame, return_ArticlesTable, numBRS);
            } else {
                JOptionPane.showMessageDialog(frame, "No more returns to display.", "Information", JOptionPane.INFORMATION_MESSAGE);
                returnResultSet = null;
                returnCurrentRow = 0;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(frame, "Error fetching return data.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void displayArticleReturns(JFrame frame, JTable return_ArticlesTable, String numBRS) {
        try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
             PreparedStatement stmt = conn.prepareStatement("SELECT * FROM Article_Return WHERE num_brs = ?")) {
            stmt.setString(1, numBRS);
            ResultSet rs = stmt.executeQuery();

            // Clear the existing data in the return_ArticlesTable
            ((DefaultTableModel) return_ArticlesTable.getModel()).setRowCount(0);

            while (rs.next()) {
                String codeArt = rs.getString("code_art");
                int qteReint = rs.getInt("qte_reint");
                int prixUnit = rs.getInt("prix_unit");
                int montRe = rs.getInt("mont_re");
                String numSort = rs.getString("num_sort");
                int pumpAnc = rs.getInt("pump_anc");
                int qteStockAnc = rs.getInt("qte_stk_anc");
                int qteStockNouv = rs.getInt("qte_stk_nouv");
                int pumpNouv = rs.getInt("pump_nouv");
                Date dateReintSql = rs.getDate("date_reint");
                String heureReint = rs.getString("heure_reint");

                SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
                String dateReint = sdf.format(dateReintSql);

                Object[] row = {numBRS,codeArt, qteReint, prixUnit, montRe, numSort, pumpAnc, qteStockAnc, qteStockNouv, pumpNouv, dateReint, heureReint};
                ((DefaultTableModel) return_ArticlesTable.getModel()).addRow(row);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(frame, "Error fetching article return data.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
//    in DataBaseUtils , ExitTicket -> Add Button
    public static String createExitTuple(String numOT, String codeMag, String codeAnal, String exitDate, String validDate, String valide, String annule, List<ArticleExit> exitArticles) {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
            java.util.Date exitDateObj = sdf.parse(exitDate);
            java.sql.Date dateSortSql = new java.sql.Date(exitDateObj.getTime());

            java.util.Date validDateObj = sdf.parse(validDate);
            java.sql.Date dateValideSql = new java.sql.Date(validDateObj.getTime());

            String numSort = generateNumSort();
            int total = 0;
            for (ArticleExit article : exitArticles) {
                total += article.getQteSort();
            }
            try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
                 PreparedStatement stmt = conn.prepareStatement("INSERT INTO `Exit` (num_sort, num_OT, code_anal, code_mag, date_sort, date_valide, valide, annule) VALUES (?, ?, ?, ?, ?, ?, ?, ?)")) {
                stmt.setString(1, numSort);
                stmt.setString(2, numOT);
                stmt.setString(3, codeAnal);
                stmt.setString(4, codeMag);
                stmt.setDate(5, dateSortSql);
                stmt.setDate(6, dateValideSql);
                stmt.setString(7, valide);
                stmt.setString(8, annule);
                stmt.executeUpdate();
            } catch (SQLException e) {
                e.printStackTrace();
                return null;
            }
            return numSort;
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void createArticleExitTuples(String exitDate, String numSort, java.util.List<ArticleExit> exitArticles) {
    try {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        java.util.Date date = sdf.parse(exitDate);
        java.sql.Date dateSortSql = new java.sql.Date(date.getTime());

        try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
             PreparedStatement stmt = conn.prepareStatement("INSERT INTO Article_Exit (num_sort, code_art, qte_sort, prix_unit, montant_S, pump_anc, qte_stk_anc, pump_nouv, qte_stk_nouv, date_sort, heure_sort, qte_sort_rest, qte_dem) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
             PreparedStatement updateStmt = conn.prepareStatement("UPDATE Article SET qte_st = ? WHERE code_art = ?")) {
            for (ArticleExit article : exitArticles) {
                // Retrieve the stock_secu and stock_min values for the article
                int stockSecu = getStockSecu(conn, article.getCodeArt());
                int stockMin = getStockMin(conn, article.getCodeArt());

                int oldQteSt = (int) article.getQteStockAnc();
                int newQteSt = oldQteSt - article.getQteSort();

                if (newQteSt < stockSecu) {
                    // Display a warning message if the exit makes the qte_st drop below stock_secu
                    JOptionPane.showMessageDialog(null, "Warning: The exit for article " + article.getCodeArt() + " will make the quantity in stock drop below the security stock level.", "Warning", JOptionPane.WARNING_MESSAGE);
                }
                if (newQteSt < stockMin) {
                    // Display an error message and don't proceed with the exit if the qte_st drops below stock_min
                    JOptionPane.showMessageDialog(null, "Error: The exit for article " + article.getCodeArt() + " will make the quantity in stock drop below the minimum stock level. The exit cannot be processed.", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
//                System.out.println(stockSecu);
                stmt.setString(1, numSort);
                stmt.setString(2, article.getCodeArt());
                stmt.setInt(3, article.getQteSort());
                stmt.setInt(4, article.getPrixUnit());
                stmt.setInt(5, article.getMontantS());
                stmt.setInt(6, article.getPumpAnc());
                stmt.setInt(7, oldQteSt);
                stmt.setInt(8, article.getPumpNouv());
                stmt.setInt(9, newQteSt);
                stmt.setDate(10, dateSortSql);
                stmt.setString(11, article.getHeureSort());
                stmt.setInt(12, newQteSt);
                stmt.setInt(13, article.getQteDem());
                stmt.executeUpdate();

                // Update the qte_st in the Article table
                updateStmt.setInt(1, newQteSt);
                updateStmt.setString(2, article.getCodeArt());
                updateStmt.executeUpdate();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    } catch (ParseException e) {
        e.printStackTrace();
    }
}


private static int getStockSecu(Connection conn, String codeArt) {
    try (PreparedStatement stmt = conn.prepareStatement("SELECT stock_secu FROM Article WHERE code_art = ?")) {
        stmt.setString(1, codeArt);
        try (ResultSet rs = stmt.executeQuery()) {
            if (rs.next()) {
                return rs.getInt("stock_secu");
            }
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return 0;
}

private static int getStockMin(Connection conn, String codeArt) {
    try (PreparedStatement stmt = conn.prepareStatement("SELECT stock_mini FROM Article WHERE code_art = ?")) {
        stmt.setString(1, codeArt);
        try (ResultSet rs = stmt.executeQuery()) {
            if (rs.next()) {
                return rs.getInt("stock_mini");
            }
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return 0;
}




    private static String generateNumSort() {
        // Implement a logic to generate a unique number for the sort
        return "SORT-" + System.currentTimeMillis();
    }
//    Stats for Dashboard
    public static int getTotalArticles() {
    int totalArticles = 0;
    try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
         PreparedStatement stmt = conn.prepareStatement("SELECT COUNT(*) FROM Article")) {
        ResultSet rs = stmt.executeQuery();
        if (rs.next()) {
            totalArticles = rs.getInt(1);
        }
    } catch (SQLException ex) {
        ex.printStackTrace();
    }
    return totalArticles;
}

public static int getTotalExits() {
    int totalExits = 0;
    try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
         PreparedStatement stmt = conn.prepareStatement("SELECT COUNT(*) FROM `Exit`")) {
        ResultSet rs = stmt.executeQuery();
        if (rs.next()) {
            totalExits = rs.getInt(1);
        }
    } catch (SQLException ex) {
        ex.printStackTrace();
    }
    return totalExits;
}

public static int getTotalReturns() {
    int totalReturns = 0;
    try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
         PreparedStatement stmt = conn.prepareStatement("SELECT COUNT(*) FROM `Return`")) {
        ResultSet rs = stmt.executeQuery();
        if (rs.next()) {
            totalReturns = rs.getInt(1);
        }
    } catch (SQLException ex) {
        ex.printStackTrace();
    }
    return totalReturns;
}
    public static int getTotalUsers() {
    int totalUsers = 0;
    try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
         PreparedStatement stmt = conn.prepareStatement("SELECT COUNT(*) FROM users")) {
        ResultSet rs = stmt.executeQuery();
        if (rs.next()) {
            totalUsers = rs.getInt(1);
        }
    } catch (SQLException ex) {
        ex.printStackTrace();
    }
    return totalUsers;
}
//    Reactivate Accounts
    public static User getUserByUsername(String username) {
        User user = null;

        try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
             PreparedStatement stmt = conn.prepareStatement("SELECT * FROM users WHERE username = ?")) {
            stmt.setString(1, username);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    user = new User();
                    user.setId(rs.getInt("id"));
                    user.setUsername(rs.getString("username"));
                    user.setPassword(rs.getString("password"));
                    user.setActive(rs.getBoolean("is_active"));
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return user;
    }
    public static void saveReactivationRequest(AccountReactivationRequest request) {
        try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
             PreparedStatement stmt = conn.prepareStatement("INSERT INTO account_reactivation_requests (user_id, request_date, status, admin_notes) VALUES (?, ?, ?, ?)")) {
            stmt.setInt(1, request.getUserId());
            stmt.setTimestamp(2, new Timestamp(request.getRequestDate().getTime()));
            stmt.setString(3, request.getStatus());
            stmt.setString(4, request.getAdminNotes());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

