package Banco;

import Banco.clases.Basic;
import Banco.clases.Cobrador;
import Banco.clases.Ejecutivo;
import Banco.interfaces.Transaccion;


public class Main {
    public static void main(String[] args) {

        System.out.println("-----BANCO INTERFACES DEL PAÍS-----");
        Ejecutivo ejec = new Ejecutivo();
        ejec.hacerDeposito(20);
        ejec.hacerTransferencia(20);
        ejec.transaccionNoOk("Depósito");
        ejec.transaccionOk("Transferencia");


    }
}
