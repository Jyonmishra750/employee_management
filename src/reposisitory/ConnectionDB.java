/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reposisitory;

/**
 *
 * @author HP
 */
import java.sql.*;
public class ConnectionDB {
    private static String driver ="com.mysql.cj.jdbc.Driver";
    private static String url ="jdbc:mysql://localhost:3306/employeedb";
    private static String username ="root";
    private static String password="root";
    public static Connection getConnectiondb(){
        Connection cn = null;
        try {
            Class.forName(driver);
            cn= DriverManager.getConnection(url, username, password);
            System.out.println("Connected.");
        } catch (ClassNotFoundException ce) {
            ce.printStackTrace();
        } catch(SQLException se){
            se.printStackTrace();
        } finally{
            return cn;
        }
    }
    public static void main(String[] args) {
        getConnectiondb();
    }
}
