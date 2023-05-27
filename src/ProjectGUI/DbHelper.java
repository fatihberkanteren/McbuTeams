package ProjectGUI;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class DbHelper {

    Connection conn = null;

    public static Connection dbAdmin() {
        try {
            Class.forName("org.sqlite.JDBC");
            Connection conn = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Lenovo\\OneDrive\\Belgeler\\NetBeansProjects\\McbuTeams\\databases\\admin.sqlite");
            return conn;
        } catch (SQLException | ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Hata : " + ex);
        }
        return null;
    }
    public static Connection dbEvents() {
        try {
            Class.forName("org.sqlite.JDBC");
            Connection conn = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Lenovo\\OneDrive\\Belgeler\\NetBeansProjects\\McbuTeams\\databases\\events.sqlite");
            return conn;
        } catch (SQLException | ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Hata : " + ex);
        }
        return null;
    }

}
