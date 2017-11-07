/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio;

/**
 *
 * @author T-102
 */
public class ProbarClientes {
    public static void main(String[] args) {
       GeneradorClientes g=new GeneradorClientes();
       for(Cliente c:g.generarClientes())
       {
           System.out.println("Cliente: "+c.getNombre()+c.getEmail()+c.getEdad());
           System.out.println("Direccion: "+c.getDireccion().getCalle()+c.getDireccion().getColonia()+c.getDireccion().getMunicipio()+c.getDireccion().getCP());
       
        
    }
    }
}

