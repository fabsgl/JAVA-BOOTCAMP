package ej2;

import java.util.ArrayList;

public class Mediano extends  Circuito{

    public Mediano() {
        this.largo = 5;
        this.precioMenores = 2000;
        this.precioAdulto = 2300;
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
