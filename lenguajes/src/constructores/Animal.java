/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructores;

/**
 *
 * @author T-102
 */
public class Animal {
    private String nombre;
    private int edad;
    private boolean muerde; 
    
    //ENCAPSULADO:
    public boolean isMuerde() { //IS: solo es SI o NO
        return muerde;
    }

    public void setMuerde(boolean muerde) {
        this.muerde = muerde;
    }
    
    //ESTE ES EL CONSTRUCTOR DE DEFECTO.
    //debe ser publico y se llama igual que la clase
    public Animal (){ //Animal() es lo que aoarece despues del NEW.
        //Este se usa para correr la clase ProbarConstructores
        System.out.println(" Estoy en el cuerpo del costructor");
        //Esto se mostrara al ejecutar la clase ProbarConstructores
        edad=5;
        //Automaticamente se pondra 5 en vez de 0.
        nombre="jdjds";
        //escribe esto en vez de null.
        
    }
    
    //OTRO CONSTRUCTOR (2)
    public Animal (int edad){
        this.edad=edad;
        //lo mismo que el metodo SET
        //el constructor tambien asiga valores
        
    }
    
    
//ENCAPSULADO:
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
}