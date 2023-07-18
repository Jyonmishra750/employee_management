/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

/**
 *
 * @author HP
 */
import com.mysql.cj.conf.PropertyKey;
import java.sql.*;
public class view_service {
    public static ResultSet getData(){
        try {
            Connection cn = reposisitory.ConnectionDB.getConnectiondb();
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery("select * from user_table");
            return rs;
        } catch (SQLException se) {
            se.printStackTrace();
        }
        return null;
    }
}
