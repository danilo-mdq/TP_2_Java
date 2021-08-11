package classes;

public class HistBalance {
    private double balance;
    private ClienteBanco cliente;

    public HistBalance(){

    }

    public HistBalance(double balance, ClienteBanco cliente) {
        this.balance = balance;
        this.cliente = cliente;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public ClienteBanco getCliente() {
        return cliente;
    }

    public void setCliente(ClienteBanco cliente) {
        this.cliente = cliente;
    }

    public void extracciones(double monto){
        if((this.balance-monto)>0){
            this.balance-=monto;
            System.out.println("El" + this.cliente + "retiro" + monto);
        }
        else{
            System.out.println("No posee dinero suficiente");
        }
    }

    public void depositos(double monto){
        this.balance+=monto;
        System.out.println("El" + this.cliente + "deposito" + monto);
    }
}




