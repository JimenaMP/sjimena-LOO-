/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuestionario;

/**
 *
 * @author T-102
 */
public class Opcion {
    private String titulo;
    private boolean correcta; 

    //Constructor para que funcione el constructor de cada respuesta en la clase Generador...
    //Este va a inicializar los valores de los atributos
    public Opcion(String titulo, boolean correcta) {
        this.titulo = titulo;
        this.correcta = correcta;
    }
    
    

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public boolean isCorrecta() {
        return correcta;
    }

    public void setCorrecta(boolean correcta) {
        this.correcta = correcta;
    }
    
    
}
