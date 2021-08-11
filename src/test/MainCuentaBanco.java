package test;

import classes.ClienteBanco;
import classes.CuentaBanco;
import classes.HistBalance;
import com.sun.nio.sctp.HandlerResult;

public class MainCuentaBanco {
    public static void main(String[] args) {
        //Punto a:
        ClienteBanco danilo = new ClienteBanco("Danilo", "M");

        System.out.println(danilo);

        //Punto b:

        CuentaBanco cuenta1 = new CuentaBanco(danilo, 10000);

        //Punto c:
        cuenta1.depositar(45000);
        System.out.println(cuenta1.getBalance());

        cuenta1.extraer(20000);
        cuenta1.extraer(100000);
        System.out.println(cuenta1.getBalance());

        //Punto e:

        ClienteBanco andrea = new ClienteBanco("Andrea","F");

        HistBalance deposito = new HistBalance(5000,andrea);
        HistBalance extraccion = new HistBalance(2000,andrea);

        HistBalance[] andreaCli = new HistBalance[]{deposito,extraccion};

        CuentaBanco cuenta2 = new CuentaBanco(andrea,10000);






    }

}
