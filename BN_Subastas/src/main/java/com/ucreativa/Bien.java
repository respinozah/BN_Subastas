/*
 *
 */
package com.ucreativa;

/**
 *
 * @author Raul Espinoza
 */
public abstract class Bien {
    private String id;
    private double precio;

    public Bien(String id, double precio) {
        this.id = id;
        this.precio = precio;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    @Override
    public String toString(){
        return "Bien: Este es el Bien " + id + "que tiene un precio de " + precio + ".";
    }
}
