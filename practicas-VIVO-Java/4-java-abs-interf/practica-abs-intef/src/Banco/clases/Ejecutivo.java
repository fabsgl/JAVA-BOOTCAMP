package Banco.clases;

import Banco.interfaces.ConsultaSaldo;
import Banco.interfaces.Deposito;
import Banco.interfaces.RetiroEfectivo;
import Banco.interfaces.Transferencia;

public class Ejecutivo implements Deposito, Transferencia {
    @Override
    public void transaccionOk(String tipoTransacc) {
        System.out.println("TRANSACCION OK");
    }

    @Override
    public void transaccionNoOk(String tipoTransacc) {
        System.out.println("TRANSACCION NO-OK");
    }

    @Override
    public void hacerDeposito(int cantDinero) {
        System.out.println("Haciendo deposito de " + cantDinero + " pesos");
    }

    @Override
    public void hacerTransferencia(int cantDinero) {
        System.out.println("Retirando " + cantDinero + " pesos");
    }
}
