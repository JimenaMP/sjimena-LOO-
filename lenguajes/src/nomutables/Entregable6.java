/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nomutables;

/**
 *
 * @author jimenameloplaza
 */
public class Entregable6 {
    /*en este ejemplo hare un arreglo para
    mostrar las calificaciones de los alumnos de
    la materia de lenguajes.
    */
    public static void main(String[] args) {
        int []calif=new int[8];
    calif[0]=8;
    calif[1]=9;
    calif[2]=10;
    calif[3]=9;
    calif[4]=8;
    calif[5]=10;
    calif[6]=10; 
    calif[7]=7; 
    System.out.println("En la lista del profe Campos estas fueron las evaluaciones finales:");
    for (int i=0;i<calif.length;i++)
    {
        System.out.println("Final: " +calif[i]);
    }
    }
}
    
    
    
    


