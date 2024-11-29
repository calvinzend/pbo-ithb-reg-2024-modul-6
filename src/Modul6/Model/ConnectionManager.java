package Modul6.Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.TimeZone;

public class ConnectionManager {
    private static final String URL = "jdbc:mysql://localhost/ktp?useSSL=false&serverTimezone=" + TimeZone.getDefault().getID();
    private static final String USER = "root";
    private static final String PASSWORD = "";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
