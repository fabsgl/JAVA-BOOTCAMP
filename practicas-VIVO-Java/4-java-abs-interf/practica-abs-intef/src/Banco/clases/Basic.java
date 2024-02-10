package Banco.clases;

import Banco.interfaces.ConsultaSaldo;
import Banco.interfaces.PagoServicio;
import Banco.interfaces.RetiroEfectivo;

import java.sql.SQLOutput;

public class Basic implements ConsultaSaldo, PagoServicio, RetiroEfectivo{
    @Override
    public void consultarSaldo() {
        System.out.println("Realizando consulta de saldo");
    }

    @Override
    public void transaccionOk(String tipoTransacc) {
        System.out.println("TRANSACCION OK");
    }

    @Override
    public void transaccionNoOk(String tipoTransacc) {
        System.out.println("TRANSACCION NO-OK");
    }

    @Override
    public void pagarServicio(String tipoServicio) {
        System.out.println("Realizando pago de servicio " + tipoServicio);
    }

    @Override
    public void retirarEfectivo(int cantDinero) {
        System.out.println("Realizando retiro de efectivo " + cantDinero + "pesos");
    }
}
