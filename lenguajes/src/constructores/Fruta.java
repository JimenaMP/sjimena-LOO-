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
public class Fruta {
    private String nombre;
    private float costo;
    
    //METODO: tiene VOID 
    public void Fruta (){
        //puede ir con mauscula o minuscula
    }
    
    
    //ENCAPSULADO:
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getCosto() {
        return costo;
    }

    public void setCosto(float costo) {
        this.costo = costo;
    }
    
}
