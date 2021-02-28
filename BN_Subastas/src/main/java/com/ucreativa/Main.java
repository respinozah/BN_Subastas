package com.ucreativa;

/**
 * Esta es la clase que actua como punto de entrada al sistema.
 * 
 * @author Gabriel Ruiz
 * @author Raul Espinoza
 * @author Francisco Cambronero
 */
public class Main {
 
    public static void main(String[] args){
        Repo.UsersRepo.cargarUsuarios();
        Repo.BienRepo.cargarPropiedades();
        Repo.BienRepo.cargarVehiculos();
        Repo.SubastaRepo.cargarSubastasPropiedades();
        Repo.SubastaRepo.cargarSubastasVehiculos();
        
        frmLogin login = new frmLogin();
        login.show();
    }
}
