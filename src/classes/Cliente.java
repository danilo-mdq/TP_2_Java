package classes;

import java.util.UUID;

public class Cliente {
    private String id;
    private String nombre;
    private String email;
    private double descuento;

    public Cliente() {

    }

    public Cliente(String nombre, String email, double descuento) {
        this.id = UUID.randomUUID().toString().substring(0, 8);
        this.nombre = nombre;
        this.email = email;
        this.descuento = descuento;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", email='" + email + '\'' +
                ", descuento=" + descuento +
                '}';
    }
}
