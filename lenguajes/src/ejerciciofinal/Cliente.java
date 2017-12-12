/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciofinal;

/**
 *
 * @author T-102
 */
public class Cliente {
    private int Id;
    private String nombre;
    private int edad;
    private Direccion direccion;
    
    public Cliente(){
        
    }
        
    public Cliente (int Id, String nombre, int edad, Direccion direccion)
    {
        this.Id = Id;
        this.nombre = nombre;
        this.edad = edad;
        this.direccion = direccion;
        
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

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

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }
}
