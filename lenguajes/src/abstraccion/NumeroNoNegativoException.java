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
public class NumeroNoNegativoException extends Exception{
    //Constructor:
    public NumeroNoNegativoException (){
        //invocar al constructor del papa ->Exception<-
        super ("Metiste un numero negatvo!!! :O");
    }
}
