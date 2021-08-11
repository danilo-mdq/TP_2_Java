package classes;

import java.util.Arrays;

public class Libro {
    //1. Es necesario modelar el objeto de tipo Libro con las siguientes caracteristicas, titulo,
    //precio, stock y Autor, este último posee las características de nombre, apellido,
    //email y genero ( ‘M’ o ‘F’ ). Para este ejercicio vamos a asumir que un libro tiene un
    //único autor.

    private String titulo;
    private double precio;
    private int stock;

    private Autor autorcito;
    private Autor[] autores;

    //boton derecho...generate...y elegir que contructor.

    public Libro(){

    }

    public Libro(String titulo, double precio, int stock, Autor autorcito) {
        this.titulo = titulo;
        this.precio = precio;
        this.stock = stock;
        this.autorcito = autorcito;
    }

    public Libro(String titulo, double precio, int stock, Autor[] autores) {
        this.titulo = titulo;
        this.precio = precio;
        this.stock = stock;
        this.autores = autores;
    }

    public void setTitulo(String titulo){
        this.titulo=titulo;
    }
    public String getTitulo(){
        return this.titulo;
    }

    public void setPrecio(double precio){
        this.precio=precio;
    }
    public double getPrecio(){
        return this.precio;
    }

    public void setStock(int stock){
        this.stock=stock;
    }
    public int getStock(){
        return this.stock;
    }

    public Autor getAutorcito() {
        return autorcito;
    }

    public void setAutorcito(Autor autorcito) {
        this.autorcito = autorcito;
    }


    @Override
    public String toString() {  ///escribir toString y elegir q mostrar
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", precio=" + precio +
                ", stock=" + stock +
                ", autorcito=" + autorcito +
                '}';
    }

    //g. Agregue un método a la clase Libro que posibilite imprimir en pantalla el
    //siguiente mensaje:
    //“El libro, {título} de {nombre del autor}. Se vende a {precio} pesos.”

    public String mensaje(){
        return "El libro " + titulo + " de " + autorcito.getNombre() + ".Se vende a " + precio + " pesos.";
    }



    public String mensajeAutores(){
        return "El libro " + titulo + " de " + Arrays.toString(autores) + ".Se vende a " + precio + " pesos.";
    }

}
