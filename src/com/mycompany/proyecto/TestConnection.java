/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto;

import app.dao.UserDao;
import app.model.Usuario;

/**
 *
 * @author jvazq
 */
public class TestConnection {
    
    public static void main(String [] args){
    
    
    UserDao userDao= new UserDao();
    
     Usuario usuario= userDao.buscaUsuario("rchavez", "12345");
    
     System.out.println(usuario.getApellidoMa());
    
    }
    
}
