/*
 * 
 */
package com.ucreativa;

import java.util.List;

/**
 *
 * @author Raul Espinoza
 */
public class Subasta {
    private Bien bienSubastado;
    private List<Puja> listaDePujas;

    public Subasta(Bien bienSubastado) {
        this.bienSubastado = bienSubastado;
    }
    
    public void recibirPuja(String usuario, boolean acuerdosFirmados, boolean asistenciaColaborador, boolean sennialTratoDepositada, double montoSennialTrato){
        Puja puja = new Puja(usuario, bienSubastado.getId(), acuerdosFirmados, asistenciaColaborador, sennialTratoDepositada, montoSennialTrato);
        listaDePujas.add(puja);
    }
    
    @Override
    public String toString(){
        return "Subasta: Esta es la subasta del bien " + bienSubastado.getId() + ".";
    }
}
