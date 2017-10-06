/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wrapper;

/**
 *
 * @author T-102
 */
public class Prueba3 {
    public static void main(String[] args) {
        //Primer ejemplo
        String algo="43";
        int otro;
        //otro=algo; ERROR
        /*algo es un referenciado con formato de numero
        aqui se utilizan las clases wrapper*/
        otro=Integer.parseInt(algo);
        
        String malo="4.5";
        float x=Float.parseFloat(malo); //declaro y asigno en el mismo renglon
        
    }
    
}
