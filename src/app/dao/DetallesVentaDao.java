/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.dao;

;
import app.model.Detalleventa;
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
 * @author 
 */
public class DetallesVentaDao {
    
  
     public List<Detalleventa> buscaVentas( ){ 
        Conexion conexion = new Conexion();
     Connection  con = conexion.getConexion();
      List<Detalleventa> ventas= new ArrayList<>();
     
         Statement st;
        try {
            st = con.createStatement();
            
            ResultSet rs = st.executeQuery("SELECT * FROM dbparadigmas.detallesventa ");
            System.out.println("Conexión establecida.");
            while(rs.next()){
              Detalleventa detalleventaObj = new Detalleventa();
              detalleventaObj.setDetalleId(rs.getInt("detalle_id"));
              detalleventaObj.setCostoTotal(rs.getInt("Costototal"));
              detalleventaObj.setCantidadProducto(rs.getInt("CantidadPrducto"));
              detalleventaObj.setVentaId(rs.getInt("venta_id"));
              detalleventaObj.setIdProducto(rs.getInt("id_producto"));
              detalleventaObj.setFechaventa(rs.getString("fechaventa"));
              detalleventaObj.setNombrevende(rs.getString("nombrevende"));
               ventas.add(detalleventaObj);
            }
            st.close();
            con.close();
            
            } catch (SQLException ex) {
            Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null, ex);
         }
        return ventas;
    }
    public int insertaRegistro( Integer Costototal, Integer CantidadProducto, Integer VentaId, Integer IdProducto, String Fechaventa, String Nombrevende){
        Conexion conexion = new Conexion();
        Connection  con = conexion.getConexion();
     
     int resultado=0;
          
        try {
            PreparedStatement ps= con.prepareStatement("INSERT INTO `dbparadigmas`.`detallesventa`\n" +
                                                        "(`Costototal`,`CantidadPrducto`,`venta_id`,`id_producto`,`fechaventa`,`nombrevende`) " +
                                                        "VALUES ( ?,?,?,?,?,?)");
           
             ps.setInt(1,Costototal);
             ps.setInt(2,CantidadProducto);
             ps.setInt(3,VentaId);
             ps.setInt(4,IdProducto);
             ps.setString(5, Fechaventa);
             ps.setString(6, Nombrevende);
             ps.executeUpdate();
             ps.close();
             con.close();
             
            } catch (SQLException ex) {
            Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null, ex);
         }
        return resultado;
    }
    
    public int updateRegistro( Integer Costototal, Integer cantidadproducto, Integer ventaid, Integer idproducto, Integer detalleid, String Fechaventa, String Nombrevende){
        Conexion conexion = new Conexion();
        Connection  con = conexion.getConexion();
     
     
     int resultado=0;
          
        try {
            PreparedStatement ps= con.prepareStatement("UPDATE `dbparadigmas`.`detallesventa`\n" +
                        "SET " +
                        "`Costototal` = ?," +
                        "`CantidadPrducto` = ?, " +
                        "`venta_id` = ?, " +
                        "`id_producto` = ?, " +
                        "`fechaventa` = ?, " +
                        "`nombrevende` = ? " +
                        "WHERE `detalle_id` = ?");
           
             ps.setInt(1,Costototal);
             ps.setInt(2,cantidadproducto);
             ps.setInt(3,ventaid);
             ps.setInt(4,idproducto);
             ps.setString(5, Fechaventa);
             ps.setString(6, Nombrevende);
             ps.setInt(7,detalleid);
             
 
            
             
            resultado =  ps.executeUpdate();
              ps.close();
              con.close();
            
             
            } catch (SQLException ex) {
            Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null, ex);
         }
        return resultado;
    }
    
    public int deletRegistro(Integer Detalleid){
        Conexion conexion = new Conexion();
     Connection  con = conexion.getConexion();
     
     
     int resultado=0;
          
        try {
            PreparedStatement ps= con.prepareStatement("DELETE FROM `dbparadigmas`.`detallesventa` \n" +
                "WHERE `detalle_id` = ? ");
           
            ps.setInt(1,Detalleid);
              
            resultado =  ps.executeUpdate();
              ps.close();
              con.close();
            
             
            } catch (SQLException ex) {
            Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null, ex);
         }
        return resultado;
    }
    
}
