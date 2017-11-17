/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstraccion;

/**
 *
 * @author T-102
 */
public class Validaciones {
    //metodo.                                  //lo que va a validar
    public static void validarNumeroNoNegativo (float numero) throws  NumeroNoNegativoException{
        
        //validacion:
        if (numero<0) throw new NumeroNoNegativoException();
        //Si el numero es menor a cero. Lanzate 
        //Lanza un objeto (new) de la mimsa excepcion.
        //el if no lleva parentesis por que es solo la logica
    }
}
