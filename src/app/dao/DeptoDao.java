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
              DeptoObj.setPasillo(rs.getInt("pasillo"));
              DeptoObj.setProveedores(rs.getString("proveedores"));
              DeptoObj.setProdmas(rs.getString("prodmas"));
              DeptoObj.setUltifecha(rs.getString("ultifecha"));
              DeptoObj.setProdesca(rs.getString("prodesca"));
              DeptoObj.setProdexis(rs.getString("prodexis"));
               deptos.add(DeptoObj);
            }
            st.close();
            con.close();
            
            } catch (SQLException ex) {
            Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null, ex);
         }
        return deptos;
    }
    public int insertaRegistro( String nombreDepto, Integer Pasillo, String Proveedores, String Prodmas, String Ultifecha, String Prodesca, String Prodexis){
        Conexion conexion = new Conexion();
        Connection  con = conexion.getConexion();
     
     int resultado=0;
          
        try {
            PreparedStatement ps= con.prepareStatement("INSERT INTO `dbparadigmas`.`departamento`\n" +
                                                        "(`nombreDepto`,`pasillo`,`proveedores`,`prodmas`,`ultifecha`,`prodesca`,`prodexis`) " +
                                                        "VALUES ( ?,?,?,?,?,?,?)");
           
             ps.setString(1,nombreDepto);
             ps.setInt(2,Pasillo);
             ps.setString(3,Proveedores);
             ps.setString(4,Prodmas);
             ps.setString(5,Ultifecha);
             ps.setString(6,Prodesca);
             ps.setString(7,Prodexis);
                         ps.executeUpdate();
             ps.close();
             con.close();
             
            } catch (SQLException ex) {
            Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null, ex);
         }
        return resultado;
    }
    
    
    public int updateRegistro( String nombreDepto,Integer Pasillo, String Proveedores, String Prodmas, String Ultifecha, String Prodesca, String Prodexis,Integer idDepto){
        Conexion conexion = new Conexion();
        Connection  con = conexion.getConexion();
     
     
     int resultado=0;
          
        try {
            PreparedStatement ps= con.prepareStatement("UPDATE `dbparadigmas`.`departamento`\n" +
                        "SET " +
                         "`nombreDepto` = ?,  " +
                         "`pasillo` = ?,  " +
                        "`proveedores` = ?, " +
                        "`prodmas` = ?,  " +
                        "`ultifecha` = ?, " +
                        "`prodesca` = ?, " +
                        "`prodexis` = ?  " +
                        "WHERE `id_depto` = ?");
           
             ps.setString(1,nombreDepto);
             ps.setInt(2,Pasillo);
             ps.setString(3,Proveedores);
             ps.setString(4,Prodmas);
             ps.setString(5,Ultifecha);
             ps.setString(6,Prodesca);
             ps.setString(7,Prodexis);
             ps.setInt(8,idDepto);
            
             
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
