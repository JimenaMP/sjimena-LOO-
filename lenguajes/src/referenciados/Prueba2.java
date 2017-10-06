/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package referenciados;

import abstraccion.Usuario;

/**
 *
 * @author T-102
 */
public class Prueba2 {
    public static void main(String[] args) {
        //Todos los referenciados pertenecen a una lase
        //Se necesita uno o mas primitivos para definirlos
        String nombre="Jimena"; //String es la clase, el nombre tiene mas de 1 char
        String otro=new String ("Ludoviko");
        /*Usuario u=new Usuario(); marca error por que la clase Usuario esta
        en otro paquete, hay que pedirla prestada al paquete donde esta (abstraccion)
        */
        Usuario u=new Usuario(); 
        u.setAltura (1.68f);
        u.setPeso (71); 
        //Para definir peso, necesitamos de altura y peso, como en abstraccion
    }
}
