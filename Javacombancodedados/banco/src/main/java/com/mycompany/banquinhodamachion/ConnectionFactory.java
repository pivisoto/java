/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.banquinhodamachion;

import java.sql.Connection;
import java.sql.DriverManager;
public class ConnectionFactory {
    private String usuario = "root";
    private String senha = "mysqlimt";
    private String host = "localhost";
    private String porta = "3306";
    private String bd = "db_pessoa";
    public Connection obtemConexao (){
        try{
            Connection c = DriverManager.getConnection("jdbc:mysql://" + host + ":" + porta + "/" + bd, usuario,senha);
            return c;
        }   catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
 }