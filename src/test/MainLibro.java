package test;

import classes.Autor;
import classes.Libro;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicStampedReference;

public class MainLibro {
    public static void main(String[] args) {
        //a. Inicialice un objeto de tipo Autor, “Joshua”, “Bloch”, “joshua@email.com”, ’M’.

        Autor joshua = new Autor("Joshua", "Bloch", "joshua@gmail.com",'m');

        //b. Imprima por pantalla al autor previamente instanciado.

        System.out.println(joshua.toString());

        //c. Inicialice el libro “Effective Java” del Autor “Joshua Bloch” que cuesta 450
        //pesos con una cantidad de 150 copias.

        Libro java = new Libro("Effective Java",150,450,joshua);

        //d. Imprima por pantalla el libro instanciado.

        System.out.println((java.toString()));

        //e. Modifique el precio del libro “Effective Java” a 500 pesos y aumente la
        //cantidad en 50 copias.

        java.setPrecio(500);
        java.getPrecio();

        java.setStock(java.getStock() + 50);
        java.getStock();

        System.out.println(java.toString());

        //f. Imprima por pantalla los atributos del Autor Joshua, accediendo desde el
        //Libro “Effective Java”.

        System.out.println(java.getAutorcito());

        //g. Agregue un método a la clase Libro que posibilite imprimir en pantalla el
        //siguiente mensaje:
        //“El libro, {título} de {nombre del autor}. Se vende a {precio} pesos.”

        System.out.println(java.mensaje());

        //h. Modificar la clase Libro, para que acepte más de 1 Autor. Y realizar los
        //cambios necesarios en el método del punto g, para imprimir un nuevo
        //mensaje que liste los autores que contribuyeron a ese libro.

        Autor danilo = new Autor("Danilo","Suarez","danilomdq@gmail.com",'m');

        Autor[] autores = new Autor[]{danilo,joshua};

        Libro java2 = new Libro("Aventuras", 600,300,autores);

        System.out.println(java2.mensajeAutores());
    }
}
