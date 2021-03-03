package busquedas;

import bienes.Bien;
import java.util.ArrayList;
import java.util.List;
import repo.Repo.BienRepo;
import repo.Repo.SubastaRepo;
import subastas.SubastaPropiedad;

/**
 * Esta es la clase que implementa las busquedas de propiedades.
 * 
 * @author Gabriel Ruiz
 * @author Raul Espinoza
 * @author Francisco Cambronero
 */
public class BusquedaPropiedad extends Busqueda{
    
    @Override
    public List<Bien> Buscar(){
        return null;
    }    
    
    public String[] Buscar(String provincia){
        String[] resultados = new String[SubastaRepo.getSubastasPropiedades().size()];
        int encontrados = 0;
                
        for(int i = 0; i < SubastaRepo.getSubastasPropiedades().size(); i++){
            SubastaPropiedad subasta = SubastaRepo.getSubastasPropiedades().get(i);
            if(subasta.getBienSubastado().getProvincia().equals(provincia)){
                resultados[encontrados] = subasta.toString();
                encontrados++;
            }
        }
        return resultados;
    }
}
