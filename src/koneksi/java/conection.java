/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package koneksi.java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Be
 */
public class conection {
    
    private static Connection connection;

    public static Connection getConnection() {
        if (connection == null) {
            try {
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/Rental_motor", "root","");
                System.out.println("Driver ditemukan");
            } catch (SQLException ex) {
                System.out.println("Error koneksi");
            }
        }
        return connection;
    }
}
