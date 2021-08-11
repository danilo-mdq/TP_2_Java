package classes;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.UUID;

public class Factura {
    private String id;
    private double costoTotal;
    private LocalDateTime fecha;
    private Cliente cliente;
    private ItemVenta[] itemVentas;


    public Factura(){

    }

    public Factura(Cliente cliente, ItemVenta[] items) {
        this.id = UUID.randomUUID().toString().substring(0,8);
        this.fecha = LocalDateTime.now();
        this.cliente = cliente;
        this.itemVentas = items;
        this.costoTotal = sumaItems();
    }

    public String getId() {
        return id;
    }

    public double getCostoTotal() {
        return costoTotal;
    }

    public void setCostoTotal(double costoTotal) {
        this.costoTotal = costoTotal;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ItemVenta[] getItemVentas() {
        return itemVentas;
    }

    public void setItemVentas(ItemVenta[] itemVentas) {
        this.itemVentas = itemVentas;
    }

    @Override
    public String toString() {
        return "Factura{" +
                "id='" + id + '\'' +
                ", costoTotal=" + costoTotal +
                ", fecha=" + fecha +
                ", cliente=" + cliente +
                ", itemVentas=" + Arrays.toString(itemVentas) +
                '}';
    }

    public double sumaItems(){
        double montoTotal=0;

        for(var aux:this.itemVentas) {
            montoTotal+=aux.getPrecioXUnidad();
        }
        return montoTotal;
    }

    public double aplicaDescuento(){

        if(cliente.getDescuento()>0){
           return costoTotal-(costoTotal*(cliente.getDescuento()/100));
        }
        return 0;
    }
}
