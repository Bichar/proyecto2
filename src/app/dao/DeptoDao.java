/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.dao;

import app.model.Deptos;
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
public class DeptoDao {
    
    public List<Deptos> buscaDeptos( ){ 
        Conexion conexion = new Conexion();
     Connection  con = conexion.getConexion();
      List<Deptos> deptos= new ArrayList<>();
     
         Statement st;
        try {
            st = con.createStatement();
            
            ResultSet rs = st.executeQuery("SELECT * FROM dbparadigmas.departamento");
            System.out.println("Conexión establecida.");
            while(rs.next()){
              Deptos DeptoObj = new Deptos();
              DeptoObj.setIdDepto(rs.getInt("id_depto"));
              DeptoObj.setNombreDepto(rs.getString("nombreDepto"));
               deptos.add(DeptoObj);
            }
            st.close();
            con.close();
            
            } catch (SQLException ex) {
            Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null, ex);
         }
        return deptos;
    }
    public int insertaRegistro( String nombreDepto){
        Conexion conexion = new Conexion();
        Connection  con = conexion.getConexion();
     
     int resultado=0;
          
        try {
            PreparedStatement ps= con.prepareStatement("INSERT INTO `dbparadigmas`.`departamento`\n" +
                                                        "(`nombreDepto`) " +
                                                        "VALUES ( ?)");
           
             ps.setString(1,nombreDepto);
                         ps.executeUpdate();
             ps.close();
             con.close();
             
            } catch (SQLException ex) {
            Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null, ex);
         }
        return resultado;
    }
    
    
    public int updateRegistro( String nombreDepto,Integer idDepto){
        Conexion conexion = new Conexion();
        Connection  con = conexion.getConexion();
     
     
     int resultado=0;
          
        try {
            PreparedStatement ps= con.prepareStatement("UPDATE `dbparadigmas`.`departamento`\n" +
                        "SET " +
                         "`nombreDepto` = ?  " +
                        "WHERE `id_depto` = ?");
           
             ps.setString(1,nombreDepto);
             ps.setInt(2,idDepto);
            
             
            resultado =  ps.executeUpdate();
              ps.close();
              con.close();
            
             
            } catch (SQLException ex) {
            Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null, ex);
         }
        return resultado;
    }
    
    public int deletRegistro(Integer idDepto){
        Conexion conexion = new Conexion();
     Connection  con = conexion.getConexion();
     
     
     int resultado=0;
          
        try {
            PreparedStatement ps= con.prepareStatement("DELETE FROM `dbparadigmas`.`departamento` \n" +
                "WHERE `id_depto` = ? ");
           
            ps.setInt(1,idDepto);
              
            resultado =  ps.executeUpdate();
              ps.close();
              con.close();
            
             
            } catch (SQLException ex) {
            Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null, ex);
         }
        return resultado;
    }
    
}
