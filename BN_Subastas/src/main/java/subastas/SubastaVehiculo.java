package subastas;

import bienes.Vehiculo;
import repo.Repo.SubastaRepo;
import java.util.ArrayList;
import java.util.List;

/**
 * Esta es la clase que implementa las subastas de vehiculos.
 * 
 * @author Gabriel Ruiz
 * @author Raul Espinoza
 * @author Francisco Cambronero
 */
public class SubastaVehiculo implements ISubasta{
    
    private Vehiculo bienSubastado;
    public static List<Puja> listaDePujas;
    
    public SubastaVehiculo(Vehiculo bienSubastado){
        this.bienSubastado = bienSubastado;
        listaDePujas = new ArrayList<>();
    }
    
    public void subastar(){
        SubastaRepo.getSubastasVehiculos().add(this);
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
