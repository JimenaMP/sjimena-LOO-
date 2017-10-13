/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructores;

import javax.swing.JFrame;

/**
 *
 * @author T-102
 */
public class PruebaConstructores {
    public static void main(String[] args) {
        //AQUI PROBAREMOS EL CONTRUCTOR POR DEFECTO
        //DE LA CLASE ANIMAL.
        
        //Crear objeto de la clase animal
        Animal algo=new Animal (); 
        //REFERENCIA = CONSTRUCTOR. algo es el nombre del objeto
        // tambien es constructor: int x=3;
        int x=2; //variable local
        //No se puede imprimir hasta que le de un valor.
        //algo.setEdad(5);
        //System.out.println(x); No se puede imprimir hasta que le de un valor.
        System.out.println (algo.getEdad()); //0
        System.out.println (algo.getNombre());//null
        System.out.println(algo.isMuerde()); //false
       
        Animal otro=new Animal (8); //otro constructor
        /*Recibe el valor del segundo constructor de la clase Animal
        que es: UN ENTERO.*/
        otro.setEdad(10); //Nuevo valor, se imprime el 10 por que es lo ULTIMO que lee
        System.out.println(otro.getEdad());
        
        /*Vamos a usar un constructor de una clase que no hemos
        hecho nosotos. No la hemos diseñado:
        */
        JFrame ventana=new JFrame ("hola mundo"); //necesita import java.xswingJFrame
                                  //NOMBRE DE LA VENTANA
                ventana.setSize (300,300); //tamaño en pixeles
                ventana.setVisible (true); //true SI SE VE
                
                /*El contsructor de defecto no pone nobre a las ventanas
                
                Muchos constructore dan versatilidad a las clases
                
                Pueden comportarse de diferentes formas
                */
        
    }
}

