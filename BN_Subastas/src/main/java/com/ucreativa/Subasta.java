/*
 * 
 */
package com.ucreativa;


import java.util.List;

/**
 * Esta es la interfase que especifica la estructura de subastas.
 * 
 * @author Gabriel Ruiz
 * @author Raul Espinoza
 * @author Francisco Cambronero
 */
public interface Subasta {
    public static Bien bienSubastado = null;
    public static List<Puja> listaDePujas = null;
    
    public void recibirPuja(Puja puja);
    
}