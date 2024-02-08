package ej2;

import java.util.ArrayList;

public class Chico extends Circuito {

    public Chico() {
        this.largo = 2;
        this.precioMenores = 1300;
        this.precioAdulto = 1500;
        this.inscriptos = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Mediano{" +
                "largo=" + largo +
                ", precioMenores=" + precioMenores +
                ", precioAdulto=" + precioAdulto +
                ", inscriptos=" + inscriptos +
                '}';
    }
}
