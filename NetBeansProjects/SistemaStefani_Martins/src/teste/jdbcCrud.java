/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teste;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author u10392310120
 */
public class jdbcCrud {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url, user, password;
            url= "jdbc:mysql://10.7.0.51:33062/db_marcos_vilhanueva";
            user= "marcos_vilhanueva";
            password= "marcos_vilhanueva";
            Connection cnt;
            cnt=DriverManager.getConnection(url,user,password);
            //Statement stm = cnt.createStatement();
           // String sql = "insert into " 
                 //   + "mpv_usuarios(mpv_idusuarios, mpv_nome, mpv_apelido, mpv_cpf)"
                 //   + "values(107, 'stefani', 'mpv', '12457894516')";
           // stm.executeUpdate(sql);
           
                  // String sql = "insert into"
                        //   + "mpv_usuarios(mpv_idusuarios, mpv_nome, mpv_apelido, mpv_cpf) "
                         //  + "value (?,?,?,?)";
                   //      String sql = "update mpv_usuarios " 
                     //           + " set mpv_nome=?, mpv_apelido=?, mpv_cpf=?"
                       //         + " where mpv_idusuarios= ?";
            String sql = "delete from mpv_usuarios where mpv_idusuarios= ?";
            PreparedStatement pst = cnt.prepareStatement(sql);
            pst.setInt(1, 507);
//            pst.setString(2, "Stefani Larrea");
//            pst.setString(3, "mpv");
//            pst.setString(4, "12489567312");
            pst.executeUpdate();
                 
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(jdbcCrud.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(jdbcCrud.class.getName()).log(Level.SEVERE, null, ex);
        }
           System.out.println("Conectou");
    }
}
