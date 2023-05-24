/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atm;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Alex-PC
 */
public class DatabaseManager {

    static Connection con = null;

    public static Connection getInstance(){
       if(con == null){
        initConn();
       }
       return con;
    }
    
    private static void initConn(){
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/atmdb", "root", "Atwa6494");
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
   
    
    
}
