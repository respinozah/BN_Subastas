package subastas;

import bienes.Propiedad;
import repo.Repo.SubastaRepo;
import java.util.ArrayList;
import java.util.List;

/**
 * Esta es la clase que implementa las subastas de propiedades.
 * 
 * @author Gabriel Ruiz
 * @author Raul Espinoza
 * @author Francisco Cambronero
 */
public class SubastaPropiedad implements ISubasta{
    
    private Propiedad bienSubastado;
    public List<Puja> listaDePujas;
    
    public SubastaPropiedad(Propiedad bienSubastado){
        this.bienSubastado = bienSubastado;
        listaDePujas = new ArrayList<>();
    }
    
    public void subastar(){
        SubastaRepo.getSubastasPropiedades().add(this);
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
