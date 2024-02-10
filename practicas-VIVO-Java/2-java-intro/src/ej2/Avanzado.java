package ej2;

import java.util.ArrayList;

public class Avanzado extends Circuito{

    public Avanzado() {
        this.largo = 10;
        this.precioAdulto = 2800;
        this.inscriptos = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Avanzado{" +
                "largo=" + largo +
                ", precio=" + precioAdulto +
                ", inscriptos=" + inscriptos +
                '}';
    }
}
