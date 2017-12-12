/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciofinal;

/**
 *
 * @author T-102
 */
public class Direccion {
    private long CP;
    private String calle;
    private String municipio;
    
    public Direccion()
    {
        
    }
    
    public Direccion (long CP, String calle, String municipio)
    {
         this.CP = CP;
         this.calle = calle;
         this.municipio = municipio;
    }

    public long getCP() {
        return CP;
    }

    public void setCP(long CP) {
        this.CP = CP;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }
    
}
