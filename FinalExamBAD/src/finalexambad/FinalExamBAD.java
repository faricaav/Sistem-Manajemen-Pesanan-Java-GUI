/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package finalexambad;

/**
 *
 * @author faric
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FinalExamBAD {

    private static Connection con;

    public static Connection getKoneksi() {
        if (con == null) {
            try {
                String url = "jdbc:mysql://localhost:3306/bad_binus";
                String user = "root";
                String pass = "";
                con = DriverManager.getConnection(url, user, pass);
            } catch (SQLException e) {
                Logger.getLogger(FinalExamBAD.class.getName()).log(Level.SEVERE, null, e);
            }
        }
        return con;
    }

    public static Connection getConnection() {
        return getKoneksi();
    }
    
}
