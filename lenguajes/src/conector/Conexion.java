/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conector;

/**
 *
 * @author T-102
 */
 //Este paquete es de java no es del driver de mysql
import java.sql.*;
 public class Conexion {
     
     public static Connection conectarse(String login, String password) 
             throws SQLException, ClassNotFoundException{
         //Primero escribimos la url del servidor de mysql
         String url="jdbc:mysql://localhost:3306/mysql";
         //Ahora hacemos el cargado con codigo del driver
         //Cargamos el driver de mysql para que sela que nos conectaremos
         // a mysql 
         
         //ESTE ES EL DRIVERRRRR
         Class.forName("com.mysql.jdbc.Driver");
                     //esta es la clase que da la conexion.              
     Connection con=   DriverManager.getConnection(url, login, password);
                                     //en wamp server:  root    ""
         
      return con;
        
         
     }
 }
