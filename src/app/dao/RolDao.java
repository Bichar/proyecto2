/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.dao;

import app.model.Rol;
import com.mycompany.proyecto.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jvazq
 */
public class RolDao {
    public List<Rol> buscaRoles( ){ 
        Conexion conexion = new Conexion();
     Connection  con = conexion.getConexion();
      List<Rol> roles= new ArrayList<>();
     
         Statement st;
        try {
            st = con.createStatement();
            
            ResultSet rs = st.executeQuery("SELECT * FROM dbparadigmas.rol");
            System.out.println("Conexión establecida.");
            while(rs.next()){
              Rol RolObj = new Rol();
              RolObj.setRolId(rs.getInt("rol_id"));
              RolObj.setNombreRol(rs.getString("nombrerol"));
              RolObj.setOcupacion(rs.getString("ocupacion"));
              RolObj.setDiasdescanso(rs.getString("diasdescanso"));
              RolObj.setColorident(rs.getString("colorident"));
              RolObj.setArea(rs.getString("area"));
               roles.add(RolObj);
            }
            st.close();
            con.close();
            
            } catch (SQLException ex) {
            Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null, ex);
         }
        return roles;
    }
    public int insertaRegistro( String nombreRol, String Ocupacion, String Diasdescanso, String Colorident, String Area){
        Conexion conexion = new Conexion();
        Connection  con = conexion.getConexion();
     
     int resultado=0;
          
        try {
            PreparedStatement ps= con.prepareStatement("INSERT INTO `dbparadigmas`.`rol`\n" +
                                                        "(`nombrerol`,`ocupacion`,`diasdescanso`,`colorident`,`area`) " +
                                                        "VALUES ( ?,?,?,?,?)");
           
             ps.setString(1,nombreRol);
             ps.setString(2,Ocupacion);
             ps.setString(3,Diasdescanso);
             ps.setString(4,Colorident);
             ps.setString(5,Area);
                         ps.executeUpdate();
             ps.close();
             con.close();
             
            } catch (SQLException ex) {
            Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null, ex);
         }
        return resultado;
    }
    
    
    public int updateRegistro( String nombreRol, String Ocupacion, String Diasdescanso, String Colorident, String Area,Integer rolId){
        Conexion conexion = new Conexion();
        Connection  con = conexion.getConexion();
     
     
     int resultado=0;
          
        try {
            PreparedStatement ps= con.prepareStatement("UPDATE `dbparadigmas`.`rol`\n" +
                        "SET " +
                         "`nombrerol` = ? , " +
                         "`ocupacion` = ? , " +
                         "`diasdescanso` = ? , " +
                         "`colorident` = ? , " +
                         "`area` = ?  " +
                        "WHERE `rol_id` = ?");
           
             ps.setString(1,nombreRol);
             ps.setString(2,Ocupacion);
             ps.setString(3,Diasdescanso);
             ps.setString(4,Colorident);
             ps.setString(5,Area);
             ps.setInt(6,rolId);
            
             
            resultado =  ps.executeUpdate();
              ps.close();
              con.close();
            
             
            } catch (SQLException ex) {
            Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null, ex);
         }
        return resultado;
    }
    
    public int deletRegistro(Integer rolId){
        Conexion conexion = new Conexion();
     Connection  con = conexion.getConexion();
     
     
     int resultado=0;
          
        try {
            PreparedStatement ps= con.prepareStatement("DELETE FROM `dbparadigmas`.`rol` \n" +
                "WHERE `rol_id` = ? ");
           
            ps.setInt(1,rolId);
              
            resultado =  ps.executeUpdate();
              ps.close();
              con.close();
            
             
            } catch (SQLException ex) {
            Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null, ex);
         }
        return resultado;
    }
    
}
