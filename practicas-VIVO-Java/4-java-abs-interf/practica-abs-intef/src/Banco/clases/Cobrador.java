package Banco.clases;

import Banco.interfaces.ConsultaSaldo;
import Banco.interfaces.RetiroEfectivo;

public class Cobrador implements RetiroEfectivo, ConsultaSaldo {



    @Override
    public void transaccionOk(String tipoTransacc) {
        System.out.println("TRANSACCION OK");
    }

    @Override
    public void transaccionNoOk(String tipoTransacc) {
        System.out.println("TRANSACCION NO-OK");
    }

    @Override
    public void consultarSaldo() {
        System.out.println("Realizando consulta de saldo");
    }

    @Override
    public void retirarEfectivo(int cantDinero) {
        System.out.println("Retirando " + cantDinero + "pesos");
    }
}
