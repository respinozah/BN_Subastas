package bienes;

import repo.Repo.BienRepo;

/**
 * Esta es la clase que define un vehiculo (un bien mueble) en el sistema de subastas.
 * 
 * @author Gabriel Ruiz
 * @author Raul Espinoza
 * @author Francisco Cambronero
 */
public class Vehiculo extends Bien{
    
    private int annio;
    private String tipoVenta;
    private String estado;

    public Vehiculo(int annio, String tipoVenta, String estado, String id, double precio) {
        super(id, precio);
        this.tipoVenta = tipoVenta;
        this.annio = annio;
        this.estado = estado;
    }

    public boolean registrar(){
        try{
            BienRepo.getVehiculos().add(this);
            return true;
        }
        catch(Exception e){
            return false;
        }
    }
    
    public int getAnnio() {
        return annio;
    }

    public void setAnnio(int annio) {
        this.annio = annio;
    }

    public String getTipoVenta() {
        return tipoVenta;
    }

    public void setTipoVenta(String tipoVenta) {
        this.tipoVenta = tipoVenta;
    }
   
    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    @Override
    public String toString(){
        return "Vehiculo: Este es el vehiculo " + super.getId() + ", annio " + annio + ". El tipo de venta es " + tipoVenta + " y su estado es " + estado + "." + getId();
    }
}
