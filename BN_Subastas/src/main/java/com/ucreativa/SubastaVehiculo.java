/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ucreativa;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Raul Espinoza
 */
public class SubastaVehiculo implements Subasta{
    
    private Vehiculo bienSubastado;
    public static List<Puja> listaDePujas;
    
    public SubastaVehiculo(Vehiculo bienSubastado){
        this.bienSubastado = bienSubastado;
        listaDePujas = new ArrayList<>();
    }
    
    public void recibirPuja(Puja puja){
        listaDePujas.add(puja);
    }

    public Vehiculo getBienSubastado() {
        return bienSubastado;
    }

    public void setBienSubastado(Vehiculo bienSubastado) {
        this.bienSubastado = bienSubastado;
    }

    public static List<Puja> getListaDePujas() {
        return listaDePujas;
    }

    public static void setListaDePujas(List<Puja> listaDePujas) {
        SubastaVehiculo.listaDePujas = listaDePujas;
    }
    
    @Override
    public String toString(){
        return "Subasta: Esta es la subasta del bien " + bienSubastado.getId() + ". Hay " + listaDePujas.size() + " pujas para " + bienSubastado.toString();
    }
}
