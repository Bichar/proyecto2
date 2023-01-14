
package com.mycompany.proyecto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 *
 */
public class Conexion {
  

    public Connection getConexion(){
         try{   
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://4.tcp.ngrok.io:11583/dbparadigmas","newuser","adminadmin2022");
            return conn;
        
        }catch(ClassNotFoundException clex){
            System.out.print(clex);
    }   catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
      return null;
    }
}
