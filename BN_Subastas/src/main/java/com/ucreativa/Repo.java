/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ucreativa;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Raul Espinoza
 */
public class Repo {
    
    static class UsersRepo{
        
        static Gestor gestor = new Gestor();
        static List<Usuario> usuarios = new ArrayList<>();
        
        static void cargarUsuarios(){
            usuarios.clear();
            usuarios.add(new Usuario("001", "Juan", "Perez", "Pereira", "Cedula", "1 1122 3344", "2212 3345", "jperez@mail.com", "Heredia", "Belen", "San Antonio", "123456", true, true, true));
            usuarios.add(new Usuario("admin-01", "admin", "Sharon", "Garcia", "Cedula", "3 2244 3355", "2245 3322", "admin@subastasmail.com", "San Jose", "San Jose", "La Uruca", "123456", true, true, true));
        }
    }
    
    static class BienRepo{
        
        static List<Propiedad> propiedades = new ArrayList<>();
        static List<Vehiculo> vehiculos = new ArrayList<>();
        
        static void cargarPropiedades(){
            propiedades.clear();
            propiedades.add(new Propiedad("San Jose", "Tibas", "San Juan", 10.0, "Vivienda", 150.0, true, true, true, true, "Disponible", "PRP1", 8500000.0));
            propiedades.add(new Propiedad("Alajuela", "Central", "Alajuela", 5.0, "Vivienda", 300.0, true, true, true, true, "Disponible", "PRP2", 12650000.0));
            propiedades.add(new Propiedad("Alajuela", "San Carlos", "La Fortuna", 0.0, "Finca", 4000.0, true, true, true, true, "Disponible", "PRP3", 143830000.0));
        }
        
        static void cargarVehiculos(){
            vehiculos.clear();
            vehiculos.add(new Vehiculo(2000, "Subasta", "Disponible", "VCL1", 6000000.0));
            vehiculos.add(new Vehiculo(2005, "Subasta", "Disponible", "VCL2", 8320000.0));
            vehiculos.add(new Vehiculo(2021, "Subasta", "Disponible", "VCL3", 15100000.0));
        }
    }
    
    static class SubastaRepo{
        
        static List<SubastaPropiedad> subastasPropiedades = new ArrayList<>();
        static List<SubastaVehiculo> subastasVehiculos = new ArrayList<>();
        
        static void cargarSubastasPropiedades(){
            for(int i = 0; i < Repo.BienRepo.propiedades.size(); i++){
                subastasPropiedades.add(new SubastaPropiedad((Propiedad)Repo.BienRepo.propiedades.get(i)));
            }
        }
        
        static void cargarSubastasVehiculos(){
            for(int i = 0; i < Repo.BienRepo.vehiculos.size(); i++){
                subastasVehiculos.add(new SubastaVehiculo(Repo.BienRepo.vehiculos.get(i)));
            }
        }
    }
}
