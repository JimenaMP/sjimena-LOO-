/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

/**
 *
 * @author T-102
 */
public class Prueba1 {
    public static void main(String[] args) {
        //Probaremos los tipos de datos integrales
        byte b =2;
        short s=2;
        int i=2;
        long l=2;
        
        //Alguna de las siguientes lineas van a marcar error
        
        //b=s; short no cabe en byte
        b=(byte)s; //Casting forzado, ya cabe short en byte
        
        s=b;
        
        i=s;
        
        l=s;
        
        //s=l; long no cabe en short
        s=(short)l; //casting forado
        
        //b=i; int no cabe en byte
        b=(byte)i; //casting forzado
        
        //Algo chistoso con los flotantes
        //float f=2.0; es un double y double es el de defecto, double no cabe en float
        //float f=(float)2.0 //casting forzado o float f=2.0f
        float f=2.0f; //F o f
                
        double d=2.0;
        
        //booleanos
        boolean b1=true;
        boolean b2=false;
        
        //caracter
        char algo='h';
        char otro=' ';
        
    }
}
