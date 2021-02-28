/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ucreativa;

import static com.ucreativa.Repo.BienRepo.propiedades;
import static com.ucreativa.Repo.BienRepo.vehiculos;

/**
 *
 * @author espiraul
 */
public class Gestor {
    
    private Usuario usuarioAuthenticado = new Usuario();
    
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

    boolean esAdmin() {
        return usuarioAuthenticado.esAdmin();
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
}
