/*
 * 
 */
package subastas;


import bienes.Bien;
import java.util.List;

/**
 * Esta es la interfase que especifica la estructura de subastas.
 * 
 * @author Gabriel Ruiz
 * @author Raul Espinoza
 * @author Francisco Cambronero
 */
public interface ISubasta {
    public static Bien bienSubastado = null;
    public static List<Puja> listaDePujas = null;
    
    public void recibirPuja(Puja puja);
    
}