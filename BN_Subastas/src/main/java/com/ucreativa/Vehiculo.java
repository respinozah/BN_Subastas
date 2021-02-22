/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ucreativa;

/**
 *
 * @author Raul Espinoza
 */
public class Vehiculo extends Bien{
    
    private int annio;
    private String estado;

    public Vehiculo(int annio, String estado, String id, double precio) {
        super(id, precio);
        this.annio = annio;
        this.estado = estado;
    }

    public boolean registrar(){
        try{
            //Guardar vehiculo
            return true;
        }
        catch(Exception e){
            return false;
        }
    }
    
    public int getAnnio() {
        return annio;
    }

    public void setAnnio(int annio) {
        this.annio = annio;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    @Override
    public String toString(){
        return "Vehiculo: Este es el vehiculo " + super.getId() + ", annio " + annio + ". Su estado es " + estado + ".";
    }
}
