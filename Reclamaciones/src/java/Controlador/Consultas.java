/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import com.mysql.jdbc.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author CEREBRO
 */
public class Consultas extends Conexion{
    
    public boolean autenticacion (String usuario, String contraseña){
        PreparedStatement pst = null;
        ResultSet rs = null;
        
                    
        try (
             String Consulta = "select * from usuarios where usuario = ? and pass = ?");
      pst = getConexion().prepareStatement(Consulta);
        pst.setString(1, usuario);
        pst.setString(2, contraseña);
           rs = pst.executeQuery();
           
           if (rs.absolute(1)){
               return true;
               
           }
           
           catch (Exception e) {
                System.err.println("Error" + e);
                   }finally{
                     try{
                         if(getConexion()!= null) getConexion(), close();
                         if (pst != null) pst.close();
                           } catch (Exception e) {
                           }
                           }
                                     
        return false;
    }



   public static void main(String[] args) {
       Consultas co = new Consultas (),
       System.out.println(co.autenticacion(null, null))
       
   }
   

}
