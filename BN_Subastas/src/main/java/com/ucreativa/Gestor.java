package com.ucreativa;

import usuarios.Usuario;
import bienes.Vehiculo;
import bienes.Propiedad;
import subastas.Puja;
import subastas.SubastaPropiedad;
import subastas.SubastaVehiculo;
import repo.Repo.UsersRepo;
import repo.Repo.BienRepo;
import repo.Repo.SubastaRepo;


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

    public boolean login(String email, String contrasenna) {
        
        Usuario usuario;
        boolean result = false;
        
        for(int i = 0; i < UsersRepo.getUsuarios().size(); i++){
            usuario = UsersRepo.getUsuarios().get(i);
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

    public String[] getSubastasVehiculos(String anniop){
        String[] resultados = new String[BienRepo.getVehiculos().size()];
        int annio = Integer.parseInt(anniop);
        int encontrados = 0;
                
        for(int i = 0; i < BienRepo.getVehiculos().size(); i++){
            SubastaVehiculo subasta = SubastaRepo.getSubastasVehiculos().get(i);
            if(subasta.getBienSubastado().getAnnio() == annio){
                resultados[encontrados] = subasta.toString();
                encontrados++;
            }
        }
        return resultados;
    }
    
    public String getDescripcionPropiedadPorID(String id){
        String description = "";
        for(int i = 0; i < BienRepo.getPropiedades().size(); i++){
            if(BienRepo.getPropiedades().get(i).getId().equals(id)){
                description = BienRepo.getPropiedades().get(i).toString();
                break;
            }
        }
        for(int i = 0; i < BienRepo.getVehiculos().size(); i++){
            if(BienRepo.getVehiculos().get(i).getId().equals(id)){
                description = BienRepo.getVehiculos().get(i).toString();
                break;
            }
        }
        return description;
    }
    
    public String getIDPorDescripcion(String toString){
        return toString.substring(toString.length()-4, toString.length());
    }

    public void registrarPuja(String usuarioId, String propiedadID, boolean acuerdosFirmados, boolean asistenciaColaborador, boolean sennialTratoDepositada, Double montoSennialTrato) {
        Puja puja = new Puja(usuarioId, propiedadID, acuerdosFirmados, asistenciaColaborador,  sennialTratoDepositada, montoSennialTrato);
        
        puja.registrarPuja();
    }

    public String[] getPropiedades() {
        String[] resultados = new String[BienRepo.getPropiedades().size()];      
        for(int i = 0; i < BienRepo.getPropiedades().size(); i++){
            resultados[i] = BienRepo.getPropiedades().get(i).toString();
        }
        return resultados;
    }
    public String[] getVehiculos() {
        String[] resultados = new String[BienRepo.getVehiculos().size()];      
        for(int i = 0; i < BienRepo.getVehiculos().size(); i++){
            resultados[i] = BienRepo.getVehiculos().get(i).toString();
        }
        return resultados;
    }

    public void registrarPropiedad(String provincia, String canton, String distrito, String tipoVenta, double tamannio, boolean estaEnCosta, boolean aceptaOfertas, boolean destacado, String estado, double precio, double descuento) {
        int contador = BienRepo.getPropiedades().size();
        contador++;
        Propiedad propiedad = new Propiedad(provincia, canton, distrito, descuento, tipoVenta, tamannio, estaEnCosta, true, aceptaOfertas, destacado, estado, ("PRP"+contador), precio);
        propiedad.registrar();
        SubastaPropiedad nuevaSubasta = new SubastaPropiedad(propiedad);
        nuevaSubasta.subastar();
    }

    public void registrarVehiculo(int annio, String tipoVenta, String estado, Double precio) {
        int contador = BienRepo.getVehiculos().size();
        contador++;
        Vehiculo vehiculo = new Vehiculo(annio, tipoVenta, estado, ("VCL"+contador), precio);
        vehiculo.registrar();
        SubastaVehiculo nuevaSubasta = new SubastaVehiculo(vehiculo);
        nuevaSubasta.subastar();
    }
}
