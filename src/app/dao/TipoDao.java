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
              TipoObj.setDureza(rs.getString("dureza"));
              TipoObj.setFlexibilidad(rs.getString("flexibilidad"));
              TipoObj.setConducalor(rs.getString("conducalor"));
              TipoObj.setResistenciafrio(rs.getString("resistenciafrio"));
              TipoObj.setConduelect(rs.getString("conduelect"));
              TipoObj.setResistenciaexte(rs.getString("resistenciaexte"));
               tipos.add(TipoObj);
            }
            st.close();
            con.close();
            
            } catch (SQLException ex) {
            Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null, ex);
         }
        return tipos;
    }
    public int insertaRegistro( String nombreT,String Dureza, String Flexibilidad, String Conducalor,String Resistenciafrio, String conduelect, String Resistenciaexte){
        Conexion conexion = new Conexion();
        Connection  con = conexion.getConexion();
     
     int resultado=0;
          
        try {
            PreparedStatement ps= con.prepareStatement("INSERT INTO `dbparadigmas`.`tipo`\n" +
                                                        "(`nombreT`,`dureza`,`flexibilidad`,`conducalor`,`resistenciafrio`,`conduelect`,`resistenciaexte`) " +
                                                        "VALUES ( ?,?,?,?,?,?,?)");
           
             ps.setString(1,nombreT);
             ps.setString(2,Dureza);
             ps.setString(3,Flexibilidad);
             ps.setString(4,Conducalor);
             ps.setString(5,Resistenciafrio);
             ps.setString(6,conduelect);
             ps.setString(7,Resistenciaexte);
                         ps.executeUpdate();
             ps.close();
             con.close();
             
            } catch (SQLException ex) {
            Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null, ex);
         }
        return resultado;
    }
    
    
    public int updateRegistro( String nombreT,String Dureza, String Flexibilidad, String Conducalor,String Resistenciafrio, String conduelect, String Resistenciaexte,Integer idTipo){
        Conexion conexion = new Conexion();
        Connection  con = conexion.getConexion();
     
     
     int resultado=0;
          
        try {
            PreparedStatement ps= con.prepareStatement("UPDATE `dbparadigmas`.`tipo`\n" +
                        "SET " +
                         "`nombreT` = ? , " +
                    "`dureza` = ? , " +
                    "`flexibilidad` = ? , " +
                    "`conducalor` = ? , " +
                    "`resistenciafrio` = ? , " +
                    "`conduelect` = ? , " +
                    "`resistenciaexte` = ?  " +
                        "WHERE `id_tipo` = ?");
           
             ps.setString(1,nombreT);
             ps.setString(2,Dureza);
             ps.setString(3,Flexibilidad);
             ps.setString(4,Conducalor);
             ps.setString(5,Resistenciafrio);
             ps.setString(6,conduelect);
             ps.setString(7,Resistenciaexte);
             ps.setInt(8,idTipo);
            
             
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
