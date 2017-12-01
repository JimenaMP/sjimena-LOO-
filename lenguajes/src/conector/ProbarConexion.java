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
 public class ProbarConexion {
     public static void main(String[] args) {
         //declarar la conexion (variable con). Inicializarla null (valor de defecto)
         
         //fuera del try para que se vea en los demas bloques de codigo
        Connection con=null;
         try{
     con=Conexion.conectarse("root", "");
          System.out.println("Te conectaste!!");
          //Aqui vienen queries de mysql
          
          //Con la conexion que se llama con.
          //vamos a generar una sentencia, la cual es una CLASE
          //Statement st=con.createStatement();
          
          //Generamos la tabla:
          //st.execute("create table tablita(id integer primary key, nombre varchar(40))");
             //System.out.println("Tabla generada con exito");
             
             //Caso 1: Insert
             PreparedStatement st=con.prepareStatement("insert into tablita values(?,?");
             
             st.setInt(1, 1);
             st.setString (2, "Jimena");
             st.execute(); //Para ejecutar el statement
            
             
             st.close();
             System.out.println("Registro onsertado");
             
             // PreparedStatement st=con.prepareStatement("update tablita set nombre=? whereid=?);
              //tambien se cierran las sentencias.
             //al igual que las condiciones
             st.close(); //metodo close
             System.out.println("tabla cerrada con exito.");
       
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
