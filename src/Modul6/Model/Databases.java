package Modul6.Model;

import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.TimeZone;

public class Databases {

    public Connection con;
    private String KTP = "com.mysql.cj.jdbc.Driver";
    private String url = "jdbc:mysql://localhost/ktp?useSSL=false&serverTimezone=" + TimeZone.getDefault().getID(); 
    private String username = "root";
    private String password = "";

    private Connection logOn() {
        try {
            Class.forName(KTP);
            con = DriverManager.getConnection(url, username, password);
            System.out.println("hehe");
        } catch (Exception ex) {
            // handle any errors
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getLocalizedMessage());
            JOptionPane.showMessageDialog(null, "Error Ocurred when login" + ex);
        }
        return con;
    }

    private void logOff() {
        try {
            con.close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error Ocurred when login" + ex);
        }
    }

    public void connect() {
        try {
            con = logOn();
        } catch (Exception ex) {
            System.out.println("Error occured when connecting to database");
        }
    }

    public void disconnect() {
        try {
            logOff();
        } catch (Exception ex) {
            System.out.println("Error occured when connecting to database");
        }
    }
} 