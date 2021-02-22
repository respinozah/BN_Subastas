/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ucreativa;
import java.util.Random;
/**
 *
 * @author espiraul
 */
public class Puja {
    private String usuario;
    private String bienSubastado;
    private boolean acuerdosFirmados;
    private boolean asistenciaColaborador;
    private int codigoPuja;
    private boolean sennialTratoDepositada;
    private double montoSennialTrato;

    public Puja(String usuario, String bienSubastado, boolean acuerdosFirmados, boolean asistenciaColaborador, boolean sennialTratoDepositada, double montoSennialTrato) {
        this.usuario = usuario;
        this.bienSubastado = bienSubastado;
        this.acuerdosFirmados = acuerdosFirmados;
        this.asistenciaColaborador = asistenciaColaborador;
        this.sennialTratoDepositada = sennialTratoDepositada;
        this.montoSennialTrato = montoSennialTrato;
        this.codigoPuja = new Random().nextInt();
    }
    
    @Override
    public String toString(){
        return "Puja: Esta es la puja del usuario " + usuario + " por el bien " + bienSubastado + " con el codigo " + codigoPuja + " con una sennial de trato de " + montoSennialTrato + ".";
    }
    
    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getBienSubastado() {
        return bienSubastado;
    }

    public void setBienSubastado(String bienSubastado) {
        this.bienSubastado = bienSubastado;
    }

    public boolean isAcuerdosFirmados() {
        return acuerdosFirmados;
    }

    public void setAcuerdosFirmados(boolean acuerdosFirmados) {
        this.acuerdosFirmados = acuerdosFirmados;
    }

    public boolean isAsistenciaColaborador() {
        return asistenciaColaborador;
    }

    public void setAsistenciaColaborador(boolean asistenciaColaborador) {
        this.asistenciaColaborador = asistenciaColaborador;
    }

    public int getCodigoPuja() {
        return codigoPuja;
    }

    public void setCodigoPuja(int codigoPuja) {
        this.codigoPuja = codigoPuja;
    }

    public boolean isSennialTratoDepositada() {
        return sennialTratoDepositada;
    }

    public void setSennialTratoDepositada(boolean sennialTratoDepositada) {
        this.sennialTratoDepositada = sennialTratoDepositada;
    }

    public double getMontoSennialTrato() {
        return montoSennialTrato;
    }

    public void setMontoSennialTrato(double montoSennialTrato) {
        this.montoSennialTrato = montoSennialTrato;
    }
    
    
}
