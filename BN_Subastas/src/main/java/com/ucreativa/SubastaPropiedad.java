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
public class SubastaPropiedad implements Subasta{
    
    private Propiedad bienSubastado;
    public List<Puja> listaDePujas;
    
    public SubastaPropiedad(Propiedad bienSubastado){
        this.bienSubastado = bienSubastado;
        listaDePujas = new ArrayList<>();
    }
    
    public void recibirPuja(Puja puja){
        listaDePujas.add(puja);
    }
    
    public Propiedad getBienSubastado() {
        return bienSubastado;
    }

    public void setBienSubastado(Propiedad bienSubastado) {
        this.bienSubastado = bienSubastado;
    }

    public List<Puja> getListaDePujas() {
        return listaDePujas;
    }

    public void setListaDePujas(List<Puja> listaDePujas) {
        listaDePujas = listaDePujas;
    }

    @Override
    public String toString(){
        return "Subasta: Esta es la subasta del bien " + bienSubastado.getId() + ". Hay " + listaDePujas.size() + " pujas para " + bienSubastado.toString();
    }
}
