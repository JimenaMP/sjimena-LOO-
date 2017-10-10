/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuadratica;

/**
 *
 * @author T-107
 * CLASE MODELO
 */
public class Valores {
    private float a; //Todos los atributos deben ser privados
    private float b;
    private float c;
    
    /*Primero obtenemos el determiante*/
    float determinante (){
        //lo de adentro de la raiz
        float det= (float)(Math.pow(b, 2)-4*a*c);
        //(float) por que pow tiene valores por defecto de double
        //entonces, hacemos casting: poniendole el (float) antes de
        //toda la funcion.
        return det; 
    }
    //Declarar un metodo publico
    public String raiz1 (){
        //primero, invocamos el determiante
        float det=determinante(); //se asigna al determinante de arriba
        String sol="raiz 1"; //la solucion la evuelve como string
        if (det<0){
            sol="Raiz imaginaria";
        }else {
            float r1= (float)(-b+ Math.sqrt(det) )/(2*a); 
            //tambien aplicamos casting pata Math, con (float)
            sol="Raiz 1: "+r1; //texto + valor agregado
        }
        return sol;
        
       //Uno para R1 y otro para R2 
    }
     public String raiz2 (){
        //primero, invocamos el determiante
        float det=determinante(); //se asigna al determinante de arriba
        String sol="raiz 2"; //la solucion la evuelve como string
        if (det<0){
            sol="Raiz imaginaria";
        }else {
            float r2= (float)(-b- Math.sqrt(det) )/(2*a); 
            //tambien aplicamos casting pata Math, con (float)
            sol="Raiz 2: "+r2; //texto + valor agregado
        }
        return sol;
        
    }

//SET y GET son siempre publicos
    public float getA() {
        return a;
    }

    public void setA(float a) {
        this.a = a;
    }

    public float getB() {
        return b;
    }

    public void setB(float b) {
        this.b = b;
    }

    public float getC() {
        return c;
    }

    public void setC(float c) {
        this.c = c;
    }
    
    
}
