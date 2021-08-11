package test;

import classes.Cliente;
import classes.Factura;
import classes.ItemVenta;

public class MainLocal {
    public static void main(String[] args) {
        //Punto b:
        Cliente danilo = new Cliente("Danilo", "danilomdq@hotmail.com", 15);

        System.out.println(danilo);

        //Punto c:
        ItemVenta arroz = new ItemVenta("Arroz", "parrillero", 55);
        ItemVenta papa = new ItemVenta("Papa negra", "La mejor papa", 70);
        ItemVenta fideos = new ItemVenta("Fideo", "Fideos Spaguetti", 34);

        ItemVenta[] carrito = new ItemVenta[]{arroz, papa, fideos};


        Factura factura1 = new Factura(danilo, carrito);

        System.out.println(factura1);


    }
}
