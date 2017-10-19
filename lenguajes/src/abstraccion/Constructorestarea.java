/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstraccion;

/**
 *
 * @author jimenameloplaza
 */
import java.awt.Frame;
public class Constructorestarea {
    public static void main(String[] args) {
        //Probando los constructores de la clase Usuario.
        Usuario x=new Usuario ();
        System.out.println("Mostrando los valores por defecto de peso y altura: ");
        //Estos valores ya estan inicializados en la clase Usuario
        System.out.println(x.getPeso());
        System.out.println(x.getAltura());
         
        //Regla 3: Puede haber mas de 1 constructor en 1 clase.
        /*
        Ningun constructor de esta clase lleva el mismo nombre y
        para ejecutarse, primero me muestra en la parte de abajo lo anterior
        y despues muestra la ventana.
        */
        Frame nuevo=new Frame ();
        nuevo.setTitle("Este tambien es un constructor");
        nuevo.setSize (200, 200);
        nuevo.setVisible (true);
    }
    
    
}
