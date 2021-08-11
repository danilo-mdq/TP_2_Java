package classes;

import java.util.UUID;

public class ItemVenta {
    private String id;
    private String nombre;
    private String descripcion;
    private double precioXUnidad;

    public ItemVenta(){

    }

    public ItemVenta(String nombre, String descripcion, double precioXUnidad) {
        this.id = UUID.randomUUID().toString().substring(0,8);
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precioXUnidad = precioXUnidad;
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecioXUnidad() {
        return precioXUnidad;
    }

    public void setPrecioXUnidad(double precioXUnidad) {
        this.precioXUnidad = precioXUnidad;
    }

    @Override
    public String toString() {
        return "ItemVenta{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", precioXUnidad=" + precioXUnidad +
                '}';
    }
}
