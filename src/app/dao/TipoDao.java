/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.dao;

import app.model.Tipos;
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
public class TipoDao {
    
    public List<Tipos> buscaTipos( ){ 
        Conexion conexion = new Conexion();
     Connection  con = conexion.getConexion();
      List<Tipos> tipos= new ArrayList<>();
     
         Statement st;
        try {
            st = con.createStatement();
            
            ResultSet rs = st.executeQuery("SELECT * FROM dbparadigmas.tipo");
            System.out.println("Conexión establecida.");
            while(rs.next()){
              Tipos TipoObj = new Tipos();
              TipoObj.setIdTipo(rs.getInt("id_tipo"));
              TipoObj.setNombreT(rs.getString("nombreT"));
               tipos.add(TipoObj);
            }
            st.close();
            con.close();
            
            } catch (SQLException ex) {
            Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null, ex);
         }
        return tipos;
    }
    public int insertaRegistro( String nombreT){
        Conexion conexion = new Conexion();
        Connection  con = conexion.getConexion();
     
     int resultado=0;
          
        try {
            PreparedStatement ps= con.prepareStatement("INSERT INTO `dbparadigmas`.`tipo`\n" +
                                                        "(`nombreT`) " +
                                                        "VALUES ( ?)");
           
             ps.setString(1,nombreT);
                         ps.executeUpdate();
             ps.close();
             con.close();
             
            } catch (SQLException ex) {
            Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null, ex);
         }
        return resultado;
    }
    
    
    public int updateRegistro( String nombreT,Integer idTipo){
        Conexion conexion = new Conexion();
        Connection  con = conexion.getConexion();
     
     
     int resultado=0;
          
        try {
            PreparedStatement ps= con.prepareStatement("UPDATE `dbparadigmas`.`tipo`\n" +
                        "SET " +
                         "`nombreT` = ?  " +
                        "WHERE `id_tipo` = ?");
           
             ps.setString(1,nombreT);
             ps.setInt(2,idTipo);
            
             
            resultado =  ps.executeUpdate();
              ps.close();
              con.close();
            
             
            } catch (SQLException ex) {
            Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null, ex);
         }
        return resultado;
    }
    
    public int deletRegistro(Integer idTipo){
        Conexion conexion = new Conexion();
     Connection  con = conexion.getConexion();
     
     
     int resultado=0;
          
        try {
            PreparedStatement ps= con.prepareStatement("DELETE FROM `dbparadigmas`.`tipo` \n" +
                "WHERE `id_tipo` = ? ");
           
            ps.setInt(1,idTipo);
              
            resultado =  ps.executeUpdate();
              ps.close();
              con.close();
            
             
            } catch (SQLException ex) {
            Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null, ex);
         }
        return resultado;
    }
    
}
