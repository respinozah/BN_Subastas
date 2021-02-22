/*
 *
 */
package com.ucreativa;

import java.util.List;

/**
 *
 * @author Raul Espinoza
 */
public class Usuario {
    private String id;
    private String nombre;
    private String primerApellido;
    private String segundoApellido;
    private String tipoIdentificacion;
    private String identificacion;
    private String telefono;
    private String email;
    private String provincia;
    private String canton;
    private String distrito;
    private String contrasenna;
    private boolean isInversionista;
    private boolean suscripcionBoletin;
    private boolean acuerdosAceptados;
    private List<String> listaSeguimiento;

    public Usuario(String id, String nombre, String primerApellido, String segundoApellido, String tipoIdentificacion, String identificacion, String telefono, String email, String provincia, String canton, String distrito, String contrasenna, boolean isInversionista, boolean suscripcionBoletin, boolean acuerdosAceptados) {
        this.id = id;
        this.nombre = nombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.tipoIdentificacion = tipoIdentificacion;
        this.identificacion = identificacion;
        this.telefono = telefono;
        this.email = email;
        this.provincia = provincia;
        this.canton = canton;
        this.distrito = distrito;
        this.contrasenna = contrasenna;
        this.isInversionista = isInversionista;
        this.suscripcionBoletin = suscripcionBoletin;
        this.acuerdosAceptados = acuerdosAceptados;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    public String getTipoIdentificacion() {
        return tipoIdentificacion;
    }

    public void setTipoIdentificacion(String tipoIdentificacion) {
        this.tipoIdentificacion = tipoIdentificacion;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getCanton() {
        return canton;
    }

    public void setCanton(String canton) {
        this.canton = canton;
    }

    public String getDistrito() {
        return distrito;
    }

    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }

    public String getContrasenna() {
        return contrasenna;
    }

    public void setContrasenna(String contrasenna) {
        this.contrasenna = contrasenna;
    }

    public boolean isIsInversionista() {
        return isInversionista;
    }

    public void setIsInversionista(boolean isInversionista) {
        this.isInversionista = isInversionista;
    }

    public boolean isSuscripcionBoletin() {
        return suscripcionBoletin;
    }

    public void setSuscripcionBoletin(boolean suscripcionBoletin) {
        this.suscripcionBoletin = suscripcionBoletin;
    }

    public boolean isAcuerdosAceptados() {
        return acuerdosAceptados;
    }

    public void setAcuerdosAceptados(boolean acuerdosAceptados) {
        this.acuerdosAceptados = acuerdosAceptados;
    }

    
}
