/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ucreativa;

/**
 *
 * @author Raul Espinoza
 */
public class Main {
 
    public static void main(String[] args){
        Repo.UsersRepo.cargarUsuarios();
        
        frmLogin login = new frmLogin();
        login.show();
        
        
    }
}
