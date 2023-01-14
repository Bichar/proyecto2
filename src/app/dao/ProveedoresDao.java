/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.dao;

import app.model.Proveedor;
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
public class ProveedoresDao {
    
    public List<Proveedor> buscaProveedor( ){ 
        Conexion conexion = new Conexion();
     Connection  con = conexion.getConexion();
        List<Proveedor> proveedores= new ArrayList<>();
     
         Statement st;
        try {
            st = con.createStatement();
            
            ResultSet rs = st.executeQuery("SELECT * FROM dbparadigmas.proveedores ");
            System.out.println("Conexión establecida.");
            while(rs.next()){
              Proveedor proveedorObj  = new Proveedor();
              proveedorObj.setNombre(rs.getString("nombre"));
              proveedorObj.setIdproveedor(rs.getInt("idproveedor"));
              proveedorObj.setOrigen(rs.getString("origen"));
              proveedorObj.setProductos(rs.getString("productos"));
              proveedorObj.setTipomerca(rs.getString("tipomerca"));
              proveedorObj.setNumerotel(rs.getInt("numero"));
              proveedorObj.setDiasentrega(rs.getString("diasentrega"));
              proveedorObj.setNumeroalma(rs.getInt("numeroalma"));
              proveedores.add(proveedorObj);
              
            }
            st.close();
            con.close();
            
            } catch (SQLException ex) {
            Logger.getLogger(ProductoDao.class.getName()).log(Level.SEVERE, null, ex);
         }
        return proveedores;
    }
    public int insertaRegistro( String nombre, String Origen, String Productos, String Tipomerca, Integer Numerotel, String Diasentrega, Integer Numeroalma){
        Conexion conexion = new Conexion();
        Connection  con = conexion.getConexion();
     
     int resultado=0;
          
        try {
            PreparedStatement ps= con.prepareStatement("INSERT INTO `dbparadigmas`.`proveedores`\n" +
                                                        "(`nombre`, `origen`,`productos`,`tipomerca`,`numerotel`,`diasentrega`,`numeroalma`) " +
                                                        "VALUES ( ?,?,?,?,?,?,?)");
           
             ps.setString(1,nombre);
             ps.setString(2,Origen);
             ps.setString(3,Productos );
             ps.setString(4,Tipomerca);
             ps.setInt(5,Numerotel);
             ps.setString(6,Diasentrega);
             ps.setInt(7,Numeroalma);
             
             ps.executeUpdate();
             ps.close();
             con.close();
             
            } catch (SQLException ex) {
            Logger.getLogger(ProductoDao.class.getName()).log(Level.SEVERE, null, ex);
         }
        return resultado;
    }
    
    
    public int updateRegistro( String nombre, String Origen, String Productos, String Tipomerca, Integer Numerotel, String Diasentrega, Integer Numeroalma, Integer Idproveedor){
        Conexion conexion = new Conexion();
        Connection  con = conexion.getConexion();
     
     
     int resultado=0;
          
        try {
            PreparedStatement ps= con.prepareStatement("UPDATE `dbparadigmas`.`proveedores`\n" +
                        "SET " +
                         "`nombre` = ? , " +
                        "`origen` = ?," +
                        "`productos` = ?, " +
                        "`tipomerca` = ? , " +
                        "`numerotel` = ? , " +
                        "`diasentrega` = ? , " +
                        "`numeroalma` = ?  " +
                        "WHERE `idproveedor` = ?");
           
           ps.setString(1,nombre);
             ps.setString(2,Origen);
             ps.setString(3,Productos );
             ps.setString(4,Tipomerca);
             ps.setInt(5,Numerotel);
             ps.setString(6,Diasentrega);
             ps.setInt(7,Numeroalma);
             ps.setInt(8,Idproveedor);
            
             
            resultado =  ps.executeUpdate();
              ps.close();
              con.close();
            
             
            } catch (SQLException ex) {
            Logger.getLogger(ProductoDao.class.getName()).log(Level.SEVERE, null, ex);
         }
        return resultado;
    }
    
    public int deletRegistro(Integer idproducto){
        Conexion conexion = new Conexion();
     Connection  con = conexion.getConexion();
     
     
     int resultado=0;
          
        try {
            PreparedStatement ps= con.prepareStatement("DELETE FROM `dbparadigmas`.`proveedores` \n" +
                "WHERE `idproveedor` = ? ");
           
            ps.setInt(1,idproducto);
              
            resultado =  ps.executeUpdate();
              ps.close();
              con.close();
            
             
            } catch (SQLException ex) {
            Logger.getLogger(ProductoDao.class.getName()).log(Level.SEVERE, null, ex);
         }
        return resultado;
    }
    
}
