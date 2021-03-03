package busquedas;

import bienes.Bien;
import java.util.ArrayList;
import java.util.List;

/**
 * Esta es la clase padre abstracta que define la estructura de busquedas del sistema de subastas.
 * 
 * @author Gabriel Ruiz
 * @author Raul Espinoza
 * @author Francisco Cambronero
 */
public abstract class Busqueda {
        
    public abstract List<Bien> Buscar();  

    public Busqueda(){
        
    }
}