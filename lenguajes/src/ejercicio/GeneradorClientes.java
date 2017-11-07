/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio;

import java.util.ArrayList;

/**
 *
 * @author T-102
 */
public class GeneradorClientes {
    
    public ArrayList<Cliente> generarClientes (){
        ArrayList<Cliente> clientes=new ArrayList<Cliente> ();
        Direccion d1=new Direccion ("Vicente Guerrero mz 42 Lt 30-B", "Las americas", "Ecatepec", 55076);
        Direccion d2=new Direccion ("Plazuela 1 Miravalle 28", "Plazas de Aragon", "Nezahualcoyotl", 57139);
        Direccion d3=new Direccion ("Roberto Fierro num. 42", "Aviacion Civil", "Venustiano Carranza", 55070);
        
        Cliente c1=new Cliente ("Jimena", 20,"jimenarnbww@gmail.com", d1);
        Cliente c2=new Cliente ("Bruno", 18, "alternativo7023@hotmail.com", d2);
        Cliente c3=new Cliente ("Mama", 42, "emaildemimama@gmail.com", d3);
        
        
        return clientes;
    
}
    
}
