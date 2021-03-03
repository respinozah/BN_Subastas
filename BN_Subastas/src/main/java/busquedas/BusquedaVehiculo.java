package busquedas;

import bienes.Bien;
import bienes.Vehiculo;
import java.util.ArrayList;
import java.util.List;
import repo.Repo;
import subastas.SubastaVehiculo;

/**
 * Esta es la clase que implementa las busquedas de vehiculos.
 * 
 * @author Gabriel Ruiz
 * @author Raul Espinoza
 * @author Francisco Cambronero
 */
public class BusquedaVehiculo extends Busqueda{
        
    @Override
    public List<Bien> Buscar(){
        return null;
    }
    
    public String[] Buscar(String anniop){
        String[] resultados = new String[Repo.BienRepo.getVehiculos().size()];
        int annio = Integer.parseInt(anniop);
        int encontrados = 0;
                
        for(int i = 0; i < Repo.BienRepo.getVehiculos().size(); i++){
            SubastaVehiculo subasta = Repo.SubastaRepo.getSubastasVehiculos().get(i);
            if(subasta.getBienSubastado().getAnnio() == annio){
                resultados[encontrados] = subasta.toString();
                encontrados++;
            }
        }
        return resultados;
    }
}
