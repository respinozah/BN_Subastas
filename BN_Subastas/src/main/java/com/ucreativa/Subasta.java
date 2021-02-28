/*
 * 
 */
package com.ucreativa;


import java.util.List;

/**
 *
 * @author Raul Espinoza
 */
public interface Subasta {
    public static Bien bienSubastado = null;
    public static List<Puja> listaDePujas = null;
    
    public void recibirPuja(Puja puja);
    
}