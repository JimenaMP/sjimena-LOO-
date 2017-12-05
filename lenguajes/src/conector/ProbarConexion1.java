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
import java.util.ArrayList;
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
          //Mapeo. traductorrrr
          ResultSet rs=st.executeQuery("select*from tablita");
          
          //Aqui viene la traduccion:::
          //Array List det para que guarde los datos en cadda ciclo del while
          //generico a t
          ArrayList<Tablita> registros=new ArrayList<>();
          while(rs.next()){
              //El contador es el N E X T..
              //El numero de filas que barre depende del select de arriba (Select*from...)
              //Objeto con constructor de defecto:
              Tablita t=new Tablita();
              //sr (ResultSet)
              t.setId(rs.getInt(1)); //Columna 1; es el ID en la clase tabla
              t.setNombre(rs.getString(2));//Columna 2; es el nombre
              //En cada cilco agrega un nuevo objeto t....
              registros.add(t);
          }
          
          //iterar todos los objetos con un ciclo for
          for(Tablita t:registros){
              System.out.println("id "+t.getId()+ " nombre "+t.getNombre());
          }
          //cerrar statement para cerrar la conexion
          st.close();
       
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
