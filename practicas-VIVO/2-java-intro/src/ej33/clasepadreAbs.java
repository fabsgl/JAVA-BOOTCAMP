package ej33;

import ej2.Inscripcion;
import ej2.Participante;

import java.util.ArrayList;

public abstract class clasepadreAbs {
    private int nombre;
    private int numero;

    protected ArrayList<String> amigos;


    public clasepadreAbs(int nombre, int numero) {
        this.nombre = nombre;
        this.numero = numero;
        this.amigos = new ArrayList<String>();
    }

    int getNombre() {
        return nombre;
    }

    int getNumero() {
        return numero;
    }

    void calcularAlgo(){
        System.out.println(this.getClass());    //imprime que es clase hija
        System.out.println(amigos);             //pero no me imprime los amigos, el método se hereda de padreAbs
        for (String amigo: amigos) {
            System.out.println(amigo);
        }
    }
}
