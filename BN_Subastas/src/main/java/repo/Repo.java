package repo;

import com.ucreativa.Gestor;
import bienes.Propiedad;
import subastas.SubastaPropiedad;
import subastas.SubastaVehiculo;
import usuarios.Usuario;
import bienes.Vehiculo;
import java.util.ArrayList;
import java.util.List;

/**
 * Esta es la clase que actua como repositorio para los valores que van a instanciar los objetos en ejecucion.
 * 
 * @author Gabriel Ruiz
 * @author Raul Espinoza
 * @author Francisco Cambronero
 */
public class Repo {
    
    public static class GestorRepo{
        private static Gestor gestor = new Gestor();

        public static Gestor getGestor() {
            return gestor;
        }

        public static void setGestor(Gestor gestor) {
            GestorRepo.gestor = gestor;
        }
    }
    
    public static class UsersRepo{
        private static List<Usuario> usuarios = new ArrayList<>();
        
        public static void cargarUsuarios(){
            usuarios.clear();
            usuarios.add(new Usuario("001", "Juan", "Perez", "Pereira", "Cedula", "1 1122 3344", "2212 3345", "jperez@mail.com", "Heredia", "Belen", "San Antonio", "123456", true, true, true));
            usuarios.add(new Usuario("admin-01", "admin", "Sharon", "Garcia", "Cedula", "3 2244 3355", "2245 3322", "admin@subastasmail.com", "San Jose", "San Jose", "La Uruca", "123456", true, true, true));
        }

        public static List<Usuario> getUsuarios() {
            return usuarios;
        }

        public static void setUsuarios(List<Usuario> usuarios) {
            UsersRepo.usuarios = usuarios;
        }
    }
    
    public static class BienRepo{
        
        private static List<Propiedad> propiedades = new ArrayList<>();
        private static List<Vehiculo> vehiculos = new ArrayList<>();
        
        public static void cargarPropiedades(){
            propiedades.clear();
            propiedades.add(new Propiedad("San Jose", "Tibas", "San Juan", 10.0, "Vivienda", 150.0, true, true, true, true, "Disponible", "PRP1", 8500000.0));
            propiedades.add(new Propiedad("Alajuela", "Central", "Alajuela", 5.0, "Vivienda", 300.0, true, true, true, true, "Disponible", "PRP2", 12650000.0));
            propiedades.add(new Propiedad("Alajuela", "San Carlos", "La Fortuna", 0.0, "Finca", 4000.0, true, true, true, true, "Disponible", "PRP3", 143830000.0));
        }
        
        public static void cargarVehiculos(){
            vehiculos.clear();
            vehiculos.add(new Vehiculo(2000, "Subasta", "Disponible", "VCL1", 6000000.0));
            vehiculos.add(new Vehiculo(2005, "Subasta", "Disponible", "VCL2", 8320000.0));
            vehiculos.add(new Vehiculo(2021, "Subasta", "Disponible", "VCL3", 15100000.0));
        }

        public static List<Propiedad> getPropiedades() {
            return propiedades;
        }

        public static void setPropiedades(List<Propiedad> propiedades) {
            BienRepo.propiedades = propiedades;
        }

        public static List<Vehiculo> getVehiculos() {
            return vehiculos;
        }

        public static void setVehiculos(List<Vehiculo> vehiculos) {
            BienRepo.vehiculos = vehiculos;
        }
    }
    
    public static class SubastaRepo{
        
        private static List<SubastaPropiedad> subastasPropiedades = new ArrayList<>();
        private static List<SubastaVehiculo> subastasVehiculos = new ArrayList<>();
        
        public static void cargarSubastasPropiedades(){
            for(int i = 0; i < Repo.BienRepo.propiedades.size(); i++){
                subastasPropiedades.add(new SubastaPropiedad((Propiedad)Repo.BienRepo.propiedades.get(i)));
            }
        }
        
        public static void cargarSubastasVehiculos(){
            for(int i = 0; i < Repo.BienRepo.vehiculos.size(); i++){
                subastasVehiculos.add(new SubastaVehiculo(Repo.BienRepo.vehiculos.get(i)));
            }
        }

        public static List<SubastaPropiedad> getSubastasPropiedades() {
            return subastasPropiedades;
        }

        public static void setSubastasPropiedades(List<SubastaPropiedad> subastasPropiedades) {
            SubastaRepo.subastasPropiedades = subastasPropiedades;
        }

        public static List<SubastaVehiculo> getSubastasVehiculos() {
            return subastasVehiculos;
        }

        public static void setSubastasVehiculos(List<SubastaVehiculo> subastasVehiculos) {
            SubastaRepo.subastasVehiculos = subastasVehiculos;
        }
        
        
    }
}
