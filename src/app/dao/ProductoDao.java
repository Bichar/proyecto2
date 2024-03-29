/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.dao;

import app.model.Producto;
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
 * 
 */
public class ProductoDao {
    
   
     public List<Producto> buscaProducto( ){ 
        Conexion conexion = new Conexion();
     Connection  con = conexion.getConexion();
        List<Producto> productos= new ArrayList<>();
     
         Statement st;
        try {
            st = con.createStatement();
            
            ResultSet rs = st.executeQuery("SELECT * FROM dbparadigmas.producto ");
            System.out.println("Conexión establecida.");
            while(rs.next()){
              Producto productoObj  = new Producto();
              
              productoObj.setCve(rs.getString("cve"));
              productoObj.setNombre(rs.getString("nombre"));
              productoObj.setPrecio(rs.getFloat("precio"));
              productoObj.setCantidad(rs.getInt("cantidad"));
              productoObj.setArea(rs.getString("area"));
              productoObj.setTipo(rs.getString("tipo"));
              productoObj.setUnidaMedida(rs.getString("unidadMedida"));
              productoObj.setIdProducto(rs.getInt("idproducto"));
              productoObj.setClave(rs.getString("cve"));
              productoObj.setDescripcion(rs.getString("descripcion"));
              productos.add(productoObj);
              
            }
            st.close();
            con.close();
            
            } catch (SQLException ex) {
            Logger.getLogger(ProductoDao.class.getName()).log(Level.SEVERE, null, ex);
         }
        return productos;
    }
    public int insertaRegistro( String nombre, Float precio, Integer cantidad, String area, String tipo, String unidadMedida, String clave, String descripcion){
        Conexion conexion = new Conexion();
        Connection  con = conexion.getConexion();
     
     int resultado=0;
          
        try {
            PreparedStatement ps= con.prepareStatement("INSERT INTO `dbparadigmas`.`producto`\n" +
                                                        "(`nombre`, `precio`,`cantidad`,`area`,`tipo`,`unidadMedida`,`cve`,`descripcion`) " +
                                                        "VALUES ( ?,?,?,?,?,?,?,?)");
           
             ps.setString(1,nombre);
             ps.setFloat(2,precio);
             ps.setInt(3,cantidad );
             ps.setString(4,area);
             ps.setString(5,tipo);
             ps.setString(6,unidadMedida);
             ps.setString(7,clave);
             ps.setString(8,descripcion);
             
             ps.executeUpdate();
             ps.close();
             con.close();
             
            } catch (SQLException ex) {
            Logger.getLogger(ProductoDao.class.getName()).log(Level.SEVERE, null, ex);
         }
        return resultado;
    }
    
    
    public int updateRegistro( String nombre, Float precio, Integer cantidad, String area, String tipo, String unidadMedida, String clave, String descripcion, Integer idproducto){
        Conexion conexion = new Conexion();
        Connection  con = conexion.getConexion();
     
     
     int resultado=0;
          
        try {
            PreparedStatement ps= con.prepareStatement("UPDATE `dbparadigmas`.`producto`\n" +
                        "SET " +
                         "`nombre` = ? , " +
                        "`precio` = ?," +
                        "`cantidad` = ?, " +
                        "`area` = ? , " +
                        "`tipo` = ? , " +
                        "`unidadMedida` = ?,  " +
                        "`cve` = ? , " +
                        "`descripcion` = ?  " +
                        "WHERE `idproducto` = ?");
           
            ps.setString(1,nombre);
             ps.setFloat(2,precio);
             ps.setInt(3,cantidad );
             ps.setString(4,area);
             ps.setString(5,tipo);
             ps.setString(6,unidadMedida);
             ps.setString(7,clave);
             ps.setString(8,descripcion);
             ps.setInt(9,idproducto);
            
             
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
            PreparedStatement ps= con.prepareStatement("DELETE FROM `dbparadigmas`.`producto` \n" +
                "WHERE `idproducto` = ? ");
           
            ps.setInt(1,idproducto);
              
            resultado =  ps.executeUpdate();
              ps.close();
              con.close();
            
             
            } catch (SQLException ex) {
            Logger.getLogger(ProductoDao.class.getName()).log(Level.SEVERE, null, ex);
         }
        return resultado;
    }
    
    
     public List<Producto> buscaProducto( String clave, String nombre, String tipo, String area){ 
        Conexion conexion = new Conexion();
        Connection  con = conexion.getConexion();
        List<Producto> productos= new ArrayList<>();
     
         Statement st;
        try {
            st = con.createStatement();
           
            String query="SELECT * FROM dbparadigmas.producto where 1=1 ";
            
            
            if( clave != null &&  !clave.trim().isEmpty()){
                query += " and  cve like '%"+ clave +"%'";
            }
            
            if(nombre != null &&!nombre.trim().isEmpty()){
                query += " and  nombre like '%"+ nombre +"%'";
            }
            
            if(tipo != null &&!tipo.trim().isEmpty()){
                query += " and  tipo like '%"+ tipo +"%'";
            }
            
            if(area != null && !area.trim().isEmpty()){
                query += " and  area like '%"+ area +"%'";
            }
 
            
            System.out.println("query: "+query);
            
            ResultSet rs = st.executeQuery(query);
            
            while(rs.next()){
              Producto productoObj  = new Producto();
              productoObj.setCve(rs.getString("cve"));
              productoObj.setDescripcion(rs.getString("descripcion"));
              productoObj.setNombre(rs.getString("nombre"));
              productoObj.setPrecio(rs.getFloat("precio"));
              productoObj.setCantidad(rs.getInt("cantidad"));
              productoObj.setArea(rs.getString("area"));
              productoObj.setTipo(rs.getString("tipo"));
              productoObj.setUnidaMedida(rs.getString("unidadMedida"));
              productoObj.setIdProducto(rs.getInt("idproducto"));
              productos.add(productoObj);
              
            }
            st.close();
            con.close();
            
            } catch (SQLException ex) {
            Logger.getLogger(ProductoDao.class.getName()).log(Level.SEVERE, null, ex);
         }
        return productos;
    }
}
