/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.dao;

import app.model.Usuario;
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
public class UserDao {
    
    public Usuario buscaUsuario(String usuario, String password){ 
        Conexion conexion = new Conexion();
     Connection  con = conexion.getConexion();
     Usuario usuarioObj = new Usuario();
     
         Statement st;
        try {
            st = con.createStatement();
            
            ResultSet rs = st.executeQuery("SELECT * FROM dbparadigmas.usuarios where usuario = '"+usuario+"' and Contrasena ='"+ password+"'");
            System.out.println("Conexión establecida.");
            while(rs.next()){
              usuarioObj.setApellidoMa(rs.getString("apellidoMa"));
              usuarioObj.setApellidoPa(rs.getString("apellidoPa"));
              usuarioObj.setIdUsuario(rs.getInt("id_usuario"));
              usuarioObj.setNombre(rs.getString("nombre"));
              usuarioObj.setRolId(rs.getInt("rol_id"));
              usuarioObj.setUsuario(rs.getString("usuario"));
              
            }
            st.close();
            con.close();
            
            } catch (SQLException ex) {
            Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null, ex);
         }
        return usuarioObj;
    }
     public List<Usuario> buscaUsuarios( ){ 
        Conexion conexion = new Conexion();
     Connection  con = conexion.getConexion();
      List<Usuario> usuarios= new ArrayList<>();
     
         Statement st;
        try {
            st = con.createStatement();
            
            ResultSet rs = st.executeQuery("SELECT * FROM dbparadigmas.usuarios ");
            System.out.println("Conexión establecida.");
            while(rs.next()){
              Usuario usuarioObj = new Usuario();
              usuarioObj.setApellidoMa(rs.getString("apellidoMa"));
              usuarioObj.setApellidoPa(rs.getString("apellidoPa"));
              usuarioObj.setIdUsuario(rs.getInt("id_usuario"));
              usuarioObj.setNombre(rs.getString("nombre"));
              usuarioObj.setContrasena(rs.getString("contrasena"));
              usuarioObj.setRolId(rs.getInt("rol_id"));
              usuarioObj.setUsuario(rs.getString("usuario"));
               usuarios.add(usuarioObj);
            }
            st.close();
            con.close();
            
            } catch (SQLException ex) {
            Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null, ex);
         }
        return usuarios;
    }
    public int insertaRegistro( String apellidoMa, String apellidoPa, String nombre, Integer rolId, String usuario,String password) throws java.sql.SQLIntegrityConstraintViolationException{
        Conexion conexion = new Conexion();
        Connection  con = conexion.getConexion();
     
     int resultado=0;
          
        try {
            PreparedStatement ps= con.prepareStatement("INSERT INTO `dbparadigmas`.`usuarios`\n" +
                                                        "(`Nombre`, `ApellidoPa`,`ApellidoMa`,`Contrasena`,`rol_id`,`usuario`) " +
                                                        "VALUES ( ?,?,?,?,?,?)");
           
             ps.setString(1,nombre);
             ps.setString(2, apellidoPa);
             ps.setString(3,apellidoMa );
             ps.setString(4, password);
             ps.setInt(5,rolId);
             ps.setString(6,usuario);
             
             ps.executeUpdate();
             ps.close();
             con.close();
             
            }catch(java.sql.SQLIntegrityConstraintViolationException v){
                throw v;
            } catch (SQLException ex) {
                    Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        return resultado;
    }
    
    
    public int updateRegistro( String apellidoMa, String apellidoPa, String nombre, Integer rolId, String usuario,String password,Integer idUsuario){
        Conexion conexion = new Conexion();
        Connection  con = conexion.getConexion();
     
     
     int resultado=0;
          
        try {
            PreparedStatement ps= con.prepareStatement("UPDATE `dbparadigmas`.`usuarios`\n" +
                        "SET " +
                         "`Nombre` = ? , " +
                        "`ApellidoPa` = ?," +
                        "`ApellidoMa` = ?, " +
                        "`Contrasena` = ?, " +
                        "`rol_id` = ?, " +
                        "`usuario` = ? " +
                        "WHERE `id_usuario` = ?");
           
             ps.setString(1,nombre);
             ps.setString(2, apellidoPa);
             ps.setString(3,apellidoMa );
             ps.setString(4, password);
             ps.setInt(5,rolId);
             ps.setString(6,usuario);
             ps.setInt(7,idUsuario);
            
             
            resultado =  ps.executeUpdate();
              ps.close();
              con.close();
            
             
            } catch (SQLException ex) {
            Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null, ex);
         }
        return resultado;
    }
    
    public int deletRegistro(Integer idUsuario){
        Conexion conexion = new Conexion();
     Connection  con = conexion.getConexion();
     
     
     int resultado=0;
          
        try {
            PreparedStatement ps= con.prepareStatement("DELETE FROM `dbparadigmas`.`usuarios` \n" +
                "WHERE `id_usuario` = ? ");
           
            ps.setInt(1,idUsuario);
              
            resultado =  ps.executeUpdate();
              ps.close();
              con.close();
            
             
            } catch (SQLException ex) {
            Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null, ex);
         }
        return resultado;
    }
}
