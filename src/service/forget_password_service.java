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
public class forget_password_service {
    public static boolean forget_password(String email,String password){
        try {
            Connection cn = reposisitory.ConnectionDB.getConnectiondb();
            Statement st = cn.createStatement();
            st.executeUpdate("update user_table set password = '"+password+"' where email='"+email+"'");
            return true;
        } catch (SQLException e) {
        }
        return false;
    }
}
