/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author CEREBRO
 */
public class Consultas extends Conexion {

    private Object getConexion;
    
    public boolean autenticacion (String usuario, String contraseña) {
            PreparedStatement pst = null;
            ResultSet rs = null;
            
            try {
                String consulta = "select * from usuarios where usuario = ? and pass = ?";
                pst = getConexion().prepareStatement(consulta);
                pst.setString(1, usuario);
                pst.setString(2, contraseña);
                rs = pst.executeQuery();
                
                
                if (rs.absolute(1)){
                    return true;
                } 
                
            } catch (SQLException e) {
              System.err.println("Error" +e);
            }finally{
                try { 
                if(getConexion() != null) getConexion().close();
                if (pst != null) pst.close();
                if (rs != null) rs.close();
                } catch (SQLException e) {
                    System.err.println("Error" +e);
                }
            }
        return false;
    }
       public boolean registrar(String usuario, String nombre, String apellido, String pass){
           PreparedStatement pst = null;
           
           try{
               String consulta = "insert into usuarios (usuario, nombre, apellido,pass values(?,?,?,?)";
               pst = getConexion().prepareStatement(consulta);
               pst.setString(1, usuario);
               pst.setString(2, nombre);
               pst.setString(3, apellido);
               pst.setString(4, pass);
               
               if (pst.executeUpdate()== 1){
                   return true;
                   
               }
               
               
           }catch(SQLException ex) {
               System.err.println("Error" + ex);
           }finally{
               try {
                     if(getConexion() != null)getConexion().close();
                     if(pst != null) pst.close();
           }catch (SQLException e) {
                System.err.println("Error" + e);
           }
           
           }
           return false;
                  
           
       }
        
        public static void main(String[] args) {
            Consultas co =  new Consultas();
            System.out.println(co.registrar("marti","luis","martinez","7777"));
        }
        
        
    }
    
    

