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
public class Direccion {
    private String calle;
    private String colonia;
    private long CP;
    private String municipio;
    
    public Direccion (){
        
    }
    
    public Direccion (String calle, String colonia, String municipio, long CP){
        this.CP=CP;
        this.calle=calle;
        this.colonia=colonia;
        this.municipio=municipio;
        
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getColonia() {
        return colonia;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    public long getCP() {
        return CP;
    }

    public void setCP(long CP) {
        this.CP = CP;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }
}
