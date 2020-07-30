/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


/**
 *
 * @author CEREBRO
 */
//estos son los atributos//
public class Conexion {
    private String USERNAME = "root";
    private String PASSWORD = "1234";
    private String HOST = "localhost";
    private String PORT = "3307";
    private String DATABASE = "loginjsp";
    private String CLASSNAME = "com.mysql,jdbc.Driver";
    private String URL = "jdbc:mysql://"+ HOST+":"+"/"+DATABASE;
    private Connection con;
    //este es el constructor//
    
    public Conexion () throws SQLException{
        try {
            Class.forName(CLASSNAME);
            con = DriverManager.getConnection(URL, USERNAME, PASSWORD);    
        } catch(ClassNotFoundException e){
             System.err.println("ERROR "+e);
        } catch(SQLException e) {          
               System.err.println("Error "+e);     
    }
//este es el metodo//
    } 
public Connection getConexion(){
    return con;
}

public static void main(String[] args){
    Conexion con = new Conexion();
    
    
            
}


}


