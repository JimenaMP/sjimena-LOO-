/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareas;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author T-102
 */
public class Primero1 extends Thread{
    
    public void run(){
        
        //Aqui pones la accion de tu Thread
        System.out.println("Soy el Primero 1 y otra thread");
        try {
            Thread.sleep(1000); //dura 1 segundo y sale, al despertar hace lo mismo
        } catch (InterruptedException ex) {
            Logger.getLogger(Primero1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
