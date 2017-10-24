/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuestionario;

import java.util.ArrayList;

/**
 *
 * @author T-102
 */
public class Pregunta {
    private String titulo;
    private ArrayList<Opcion> Opciones;

    public Pregunta(String titulo, ArrayList<Opcion> Opciones) {
        this.titulo = titulo;
        this.Opciones = Opciones;
    }
    
    

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public ArrayList<Opcion> getOpciones() {
        return Opciones;
    }

    public void setOpciones(ArrayList<Opcion> Opciones) {
        this.Opciones = Opciones;
    }
    
    
}
