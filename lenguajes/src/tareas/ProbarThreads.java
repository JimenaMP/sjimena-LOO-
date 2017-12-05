/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareas;

/**
 *
 * @author T-102
 */
public class ProbarThreads {
    public static void main(String[] args){
        //Thread crreado
        Primero p=new Primero();
        Primero1 s=new Primero1();
        
        //Thread en estado de ejecuion (runnable)
        p.start();
        s.start();
    }
    
}
