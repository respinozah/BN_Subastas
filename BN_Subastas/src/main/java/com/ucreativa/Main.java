package com.ucreativa;

import gui.frmLogin;

/**
 * Esta es la clase que actua como punto de entrada al sistema.
 * 
 * @author Gabriel Ruiz
 * @author Raul Espinoza
 * @author Francisco Cambronero
 */
public class Main {
 
    public static void main(String[] args){
        repo.Repo.UsersRepo.cargarUsuarios();
        repo.Repo.BienRepo.cargarPropiedades();
        repo.Repo.BienRepo.cargarVehiculos();
        repo.Repo.SubastaRepo.cargarSubastasPropiedades();
        repo.Repo.SubastaRepo.cargarSubastasVehiculos();
        
        frmLogin login = new frmLogin();
        login.show();
    }
}
