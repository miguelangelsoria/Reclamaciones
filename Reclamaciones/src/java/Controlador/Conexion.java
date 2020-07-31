
package Controlador;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;






//estos son los atributos//
public class Conexion {
    private String USERNAME = "root";
    private String PASSWORD = "1Mvalera";
    private String HOST = "localhost";
    private String PORT = "3307";
    private String DATABASE = "";
    private String CLASSNAME = "com.mysql.jdbc.Driver";
    private String URL = "jdbc:mysql://"+ HOST+":"+"/"+DATABASE;
    private Connection con;
    //este es el constructor//
    
    public Conexion () {
        try {
            Class.forName(CLASSNAME);
            con = DriverManager.getConnection(URL,USERNAME,PASSWORD);
        } catch(ClassNotFoundException e) {
            System.err.println("ERROR " +e);
        } catch (SQLException e) {
            System.err.println("Error "+e);
                    
                    }
        }
          public Connection getConexion (){
             return con ;
             
          }
          
       public static void main(String[] args){
            Conexion con = new Conexion();
            
       
}

}
