/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

/**
 *
 * @author HP
 */
import java.sql.*;
public class delete_service {
    public static boolean delete_user(String email){
        try {
             Connection cn = reposisitory.ConnectionDB.getConnectiondb();
             Statement st = cn.createStatement();
             st.executeUpdate("delete from user_table where email = '"+email+"'");
             return true;
        } catch (SQLException e) {
        }
        return false;
    }
}
