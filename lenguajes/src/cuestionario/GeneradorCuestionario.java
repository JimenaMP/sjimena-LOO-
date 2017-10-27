/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuestionario;

import java.util.ArrayList;
//import java.util.* Importa todo lo del paquete
/**
 *
 * @author T-102
 */
public class GeneradorCuestionario {
    
    //metodo sin argumentos. PARENTESIS VACIOS.
    //     TIPO DE RETORNO
    public ArrayList<Pregunta> generar () {
        //Primero generar el arreglo que contendra las pregutas.
        
        
        //ARREGLO DE PREGUNTAS
        ArrayList<Pregunta> preguntas=new ArrayList<Pregunta> ();
        //Primero, generar todas las opciones de la primer pregunta
        
        //primero la clase: Opcion
        Opcion op11=new Opcion("Moscu", false);
        Opcion op21=new Opcion("Kiev", false);
        Opcion op31= new Opcion("Helsinki", true);
        Opcion op41= new Opcion ("Turin", false);
        //True=correcta
        //False=incorrecta
        
        
        //Generar las preguntas:
        
        //ARREGLO DE OPCIONES
        ArrayList<Opcion>opciones1=new ArrayList<>();
        //opciones1 = opciones de la preguta 1
        //metodo add, para el arreglo opciones de arriba
        
        opciones1.add(op11);
        opciones1.add(op21);
        opciones1.add(op31);
        opciones1.add(op41);
        
        //Pregunta 1:
        Pregunta p1=new Pregunta ("Capital de Finlandia", opciones1);
        //"TITULO" , nombre de arreglo de las opciones de la pregunta 1
        
        //Agregar la pregunta al arreglo de preguntas con metodo add
        preguntas.add(p1);
        return null;
        
        
    }
}
