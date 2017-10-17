/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nomutables;

/**
 *
 * @author T-102
 */
public class Arreglos1 {
    public static void main(String[] args) {
        //Vamos a generar un arreglo simple
        int x[]={12,-4,7};
        //Los elementos del arreglo x se separan con comas.
        //LOS INDICES SIEMPRE EMPIEZAN EN CERO.
        System.out.println("El tamaño es "+x.length);
        //x= nombre del arreglo . (invocar) length (propiedad)
        
        //Para acceder a un elemento hacemos los siguiente:
        System.out.println("En el indice 0 esta " +x[0]);
        //x=[Numero del indice] Lo que esta almacenado ahi.
        int []y={2,4,5}; //Otra forma de declarar arreglos.
        int []z=new int[3]; //El tamaño del arreglo es de 3 elementos
        //Indicando valores al arreglo z[]
        z[0]=-12;
        z[1]=5;
        z[2]=4;
        
       //Vamos a iterar al arreglo Z, usando un ciclo FOR.
       for (int i=0;i<z.length;i++)//for tradicional
       {
           System.out.println(z[i]);
       }
       
       //Ciclo FOR mejorado :)
       for (int valor:z) //indice:arreglo
           //Se lee de derecha a izquierda.
       {
           System.out.println("Mejorado "+valor); 
            //Solo se escribe la variable del arreglo
       }
        String mensaje="hola como estas";
           byte []w= mensaje.getBytes(); //Serializacion
           //Metodo getBytes es metodo de todos los strings de java
           //lo convierte en un arreglo de bytes
           /*Genera tantos elementos como haya en la cadena
           CASTING: de string a byte
           */
           System.out.println("Tamaño "+w.length);
           /*Con la propiedad de length, aparece el tamaño de lo que
           escribimos en el arreglo W (15 ESPACIOS)
           */
           String codificado=""; //Caracter vacio => ""
           for (byte b:w)
           {
               System.out.println("El byte es: "+b);
               /*Muestra el valor interpretado de
               cada caracter
               */
               codificado=codificado+b;
               
           }
           System.out.println("El mensaje codificado es");
           System.out.println(codificado);
           
    }
    
    
    
    
    
}
