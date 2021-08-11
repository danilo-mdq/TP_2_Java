package classes;

import java.util.Locale;
import java.util.UUID;

public class CuentaBanco {
    private String id;
    private ClienteBanco cliente;
    private double balance;

    private HistBalance historial;

    public CuentaBanco() {

    }

    public CuentaBanco(ClienteBanco cliente, double balance) {
        this.id = UUID.randomUUID().toString().substring(0, 5);
        this.cliente = cliente;
        this.balance = balance;
    }

    public CuentaBanco(ClienteBanco cliente, double balance, HistBalance historial) {
        this.id = UUID.randomUUID().toString().substring(0,5);
        this.cliente = cliente;
        this.balance = balance;
        this.historial = historial;
    }

    public String getId() {
        return id;
    }


    public ClienteBanco getCliente() {
        return cliente;
    }

    public void setCliente(ClienteBanco cliente) {
        this.cliente = cliente;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void depositar(double deposito) {
        this.balance += deposito;
    }

    public HistBalance getHistorial() {
        return historial;
    }

    public void setHistorial(HistBalance historial) {
        this.historial = historial;
    }

    public void extraer(double extraccion) {
        if ((this.balance - extraccion) >= -2000)
            this.balance -= extraccion;
        else {
            System.out.println("No hay saldo suficiente pobre");
        }
    }



}
