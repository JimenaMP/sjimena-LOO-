/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author T-102
 */
public class GeneradorUsuarios {
    
    public static void main(String[] args) {
        //Generar 5 usuarios:
        
        
        Usuario u1=new Usuario ();
        u1.setEdad (23);
        u1.setEmail("holahola@hola.com");
        u1.setNombre ("Jimena");
        
        Usuario u2=new Usuario ();
        u2.setEdad (20);
        u2.setEmail("holahola2@hola.com");
        u2.setNombre ("Luis");
        
        Usuario u3=new Usuario ();
        u3.setEdad (23);
        u3.setEmail("holahola3@hola.com");
        u3.setNombre ("Paco");
        
        Usuario u4=new Usuario ();
        u4.setEdad (23);
        u4.setEmail("holahola4@hola.com");
        u4.setNombre ("Pedro");
        
        Usuario u5=new Usuario ();
        u5.setEdad (23);
        u5.setEmail("holahola5@hola.com");
        u5.setNombre ("Juan");
        
        //Generaremos un arreglo mutable:
        
        ArrayList<Usuario> usuarios=new ArrayList<Usuario> ();
                 //TIPO DE ARREGLO               TIPO DE ARREGLO
        //metoo add viene del ArrayList
        usuarios.add(u1);
        usuarios.add(u2);
        usuarios.add(u3);
        usuarios.add(u4);
        usuarios.add(u5);
        
        //Iterarlo para ver los nombres:
        
        for (Usuario u: usuarios)
            //for mejorado
            //IZQUIERDA EL TIPO DE ARREGLO 
        {
            System.out.println("Nombre: " +u.getNombre());
        }
        
    }
}
