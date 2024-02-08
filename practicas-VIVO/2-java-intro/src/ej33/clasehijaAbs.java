package ej33;

import ej2.Inscripcion;

import java.util.ArrayList;
import java.util.Arrays;

public class clasehijaAbs extends clasepadreAbs{
    int nombre;
    int numero;

    //private ArrayList<String> amigos;


    public clasehijaAbs(int nombre, int numero) {
        super(nombre, numero);
        amigos.add("Fabian");
    }
}
