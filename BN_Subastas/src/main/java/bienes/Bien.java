package bienes;

/**
 * Esta es la clase abstracta que define la estructura de bienes del sistema de subastas.
 * 
 * @author Gabriel Ruiz
 * @author Raul Espinoza
 * @author Francisco Cambronero
 */
public abstract class Bien {
    private String id;
    private double precio;

    public Bien(){
    }
    
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
