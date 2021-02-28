package com.ucreativa;

import static com.ucreativa.Repo.BienRepo.propiedades;
import static com.ucreativa.Repo.BienRepo.vehiculos;

/**
 * Esta es la clase que actua como interfase entre la logica del sistema de subastas y los formularios de la presentacion.
 * 
 * @author Gabriel Ruiz
 * @author Raul Espinoza
 * @author Francisco Cambronero
 */
public class Gestor {
    
    private Usuario usuarioAuthenticado = new Usuario();
    public String propiedadID;
    
    public Gestor() {
        
    }

    boolean login(String email, String contrasenna) {
        
        Usuario usuario;
        boolean result = false;
        
        for(int i = 0; i < Repo.UsersRepo.usuarios.size(); i++){
            usuario = Repo.UsersRepo.usuarios.get(i);
            if(usuario.authenticar(email, contrasenna)){
                usuarioAuthenticado = usuario;
                result = true;
                break;
            }
        }
        return result;
    }

    public boolean esAdmin() {
        return usuarioAuthenticado.esAdmin();
    }

    public String getUsuarioId(){
        return usuarioAuthenticado.getId();
    }
            
    public String getNombreCompletoUsuario() {
        return usuarioAuthenticado.getNombre() + " " + usuarioAuthenticado.getPrimerApellido() + " " + usuarioAuthenticado.getSegundoApellido();
    }
    
    public String[] getSubastasPropiedades(String provincia){
        String[] resultados = new String[Repo.SubastaRepo.subastasPropiedades.size()];
        int encontrados = 0;
                
        for(int i = 0; i < Repo.SubastaRepo.subastasPropiedades.size(); i++){
            SubastaPropiedad subasta = Repo.SubastaRepo.subastasPropiedades.get(i);
            if(subasta.getBienSubastado().getProvincia().equals(provincia)){
                resultados[encontrados] = subasta.toString();
                encontrados++;
            }
        }
        return resultados;
    } 

    public String[] getSubastasVehiculos(String anniop){
        String[] resultados = new String[Repo.BienRepo.vehiculos.size()];
        int annio = Integer.parseInt(anniop);
        int encontrados = 0;
                
        for(int i = 0; i < Repo.SubastaRepo.subastasVehiculos.size(); i++){
            SubastaVehiculo subasta = Repo.SubastaRepo.subastasVehiculos.get(i);
            if(subasta.getBienSubastado().getAnnio() == annio){
                resultados[encontrados] = subasta.toString();
                encontrados++;
            }
        }
        return resultados;
    }
    
    public String getDescripcionPropiedadPorID(String id){
        String description = "";
        for(int i = 0; i < Repo.BienRepo.propiedades.size(); i++){
            if(Repo.BienRepo.propiedades.get(i).getId().equals(id)){
                description = Repo.BienRepo.propiedades.get(i).toString();
                break;
            }
        }
        for(int i = 0; i < Repo.BienRepo.vehiculos.size(); i++){
            if(Repo.BienRepo.vehiculos.get(i).getId().equals(id)){
                description = Repo.BienRepo.vehiculos.get(i).toString();
                break;
            }
        }
        return description;
    }
    
    public String getIDPorDescripcion(String toString){
        return toString.substring(toString.length()-4, toString.length());
    }

    void registrarPuja(String usuarioId, String propiedadID, boolean acuerdosFirmados, boolean asistenciaColaborador, boolean sennialTratoDepositada, Double montoSennialTrato) {
        Puja puja = new Puja(usuarioId, propiedadID, acuerdosFirmados, asistenciaColaborador,  sennialTratoDepositada, montoSennialTrato);
        
        puja.registrarPuja();
    }

    public String[] getPropiedades() {
        String[] resultados = new String[Repo.BienRepo.propiedades.size()];      
        for(int i = 0; i < Repo.BienRepo.propiedades.size(); i++){
            resultados[i] = Repo.BienRepo.propiedades.get(i).toString();
        }
        return resultados;
    }
    public String[] getVehiculos() {
        String[] resultados = new String[Repo.BienRepo.vehiculos.size()];      
        for(int i = 0; i < Repo.BienRepo.vehiculos.size(); i++){
            resultados[i] = Repo.BienRepo.vehiculos.get(i).toString();
        }
        return resultados;
    }

    public void registrarPropiedad(String provincia, String canton, String distrito, String tipoVenta, double tamannio, boolean estaEnCosta, boolean aceptaOfertas, boolean destacado, String estado, double precio, double descuento) {
        int contador = Repo.BienRepo.propiedades.size();
        contador++;
        Propiedad propiedad = new Propiedad(provincia, canton, distrito, descuento, tipoVenta, tamannio, estaEnCosta, true, aceptaOfertas, destacado, estado, ("PRP"+contador), precio);
        propiedad.registrar();
        SubastaPropiedad nuevaSubasta = new SubastaPropiedad(propiedad);
        nuevaSubasta.subastar();
    }

    void registrarVehiculo(int annio, String tipoVenta, String estado, Double precio) {
        int contador = Repo.BienRepo.vehiculos.size();
        contador++;
        Vehiculo vehiculo = new Vehiculo(annio, tipoVenta, estado, ("VCL"+contador), precio);
        vehiculo.registrar();
        SubastaVehiculo nuevaSubasta = new SubastaVehiculo(vehiculo);
        nuevaSubasta.subastar();
    }
}
