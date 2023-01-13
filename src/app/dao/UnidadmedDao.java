/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.dao;

import app.model.Unidaddemedida;
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
public class UnidadmedDao {
    
     public List<Unidaddemedida> buscaUnidades( ){ 
        Conexion conexion = new Conexion();
     Connection  con = conexion.getConexion();
      List<Unidaddemedida> unidades= new ArrayList<>();
     
         Statement st;
        try {
            st = con.createStatement();
            
            ResultSet rs = st.executeQuery("SELECT * FROM dbparadigmas.unidaddemedida ");
            System.out.println("Conexión establecida.");
            while(rs.next()){
              Unidaddemedida UnidaddemedidaObj = new Unidaddemedida();
              UnidaddemedidaObj.setIdUm(rs.getInt("id_um"));
              UnidaddemedidaObj.setTipoDeMedida(rs.getString("tipo de medida"));
               unidades.add(UnidaddemedidaObj);
            }
            st.close();
            con.close();
            
            } catch (SQLException ex) {
            Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null, ex);
         }
        return unidades;
    }
    public int insertaRegistro( String TipodeMedida){
        Conexion conexion = new Conexion();
        Connection  con = conexion.getConexion();
     
     int resultado=0;
          
        try {
            PreparedStatement ps= con.prepareStatement("INSERT INTO `dbparadigmas`.`unidaddemedida`\n" +
                                                        "(`tipo de medida`) " +
                                                        "VALUES ( ?)");
           
             ps.setString(1,TipodeMedida);
                         ps.executeUpdate();
             ps.close();
             con.close();
             
            } catch (SQLException ex) {
            Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null, ex);
         }
        return resultado;
    }
    
    
    public int updateRegistro( String TipodeMedida,Integer idUm){
        Conexion conexion = new Conexion();
        Connection  con = conexion.getConexion();
     
     
     int resultado=0;
          
        try {
            PreparedStatement ps= con.prepareStatement("UPDATE `dbparadigmas`.`unidaddemedida`\n" +
                        "SET " +
                         "`tipo de medida` = ?  " +
                        "WHERE `id_um` = ?");
           
             ps.setString(1,TipodeMedida);
             ps.setInt(2,idUm);
            
             
            resultado =  ps.executeUpdate();
              ps.close();
              con.close();
            
             
            } catch (SQLException ex) {
            Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null, ex);
         }
        return resultado;
    }
    
    public int deletRegistro(Integer idUm){
        Conexion conexion = new Conexion();
     Connection  con = conexion.getConexion();
     
     
     int resultado=0;
          
        try {
            PreparedStatement ps= con.prepareStatement("DELETE FROM `dbparadigmas`.`unidaddemedida` \n" +
                "WHERE `id_um` = ? ");
           
            ps.setInt(1,idUm);
              
            resultado =  ps.executeUpdate();
              ps.close();
              con.close();
            
             
            } catch (SQLException ex) {
            Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null, ex);
         }
        return resultado;
    }
}
