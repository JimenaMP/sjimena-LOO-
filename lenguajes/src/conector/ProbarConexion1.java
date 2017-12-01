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
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
 public class ProbarConexion1 {
     public static void main(String[] args) {
         //declarar la conexion (variable con). Inicializarla null (valor de defecto)
         
         //fuera del try para que se vea en los demas bloques de codigo
        Connection con=null;
         try{
     con=Conexion.conectarse("root", "");
          System.out.println("Te conectaste!!");
          //Aqui vienen queries de mysql
          //Caso2: select
          //paso 1, generar una consulta (query)
          Statement st= con.createStatement();
          ResultSet rs=st.executeQuery("select*from tablita");
          
          
       
         }catch(ClassNotFoundException e){
             System.out.println("NO se cargo bien el driver </3");
        
         }catch(SQLException e){
                                                       //este metodo ya lo trae la clase
             System.out.println("Un error de sql."+e.getMessage());
         }//La conexion debe cerrarse aunque no se lance la excepcion.
           //para eso sirve el finally.
         finally{
            try {
                //cierre base de datos
                if (con!=null) con.close();
                //los if de 1 solo renglon no llevan llaves.
                System.out.println("Ya se cerro todo :DD");
            } catch (SQLException ex) {
                //Logger.getLogger(ProbarConexion.class.getName()).log(Level.SEVERE, null, ex);
            }
         }
         
    }
 }
