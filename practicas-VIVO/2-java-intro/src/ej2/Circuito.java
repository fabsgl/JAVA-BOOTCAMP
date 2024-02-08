package ej2;

import java.util.ArrayList;

public abstract class Circuito {
    protected int largo;
    protected int precioMenores;
    protected int precioAdulto;
    protected int costoActual;

    ArrayList<Inscripcion> inscriptos;

    //GETTERS
    public int getLargo(){
        return this.largo;
    }
    public int getPrecioMenores(){
        return this.precioMenores;
    }

    public int getPrecioAdulto(){
        return precioAdulto;
    }

    public int getCostoActual() {
        return costoActual;
    }

    //OTROS MÉT.
    public void imprimirInsc(){
        for (Inscripcion insc :
                inscriptos) {
            System.out.println("Datos: " + insc.getParticipante().getNombre() + " - N° insc: " + insc.getNumInsc());
        }
    };

    public void agregarInsc(Inscripcion inscripcion) {
        inscriptos.add(inscripcion);
        costoActual+=inscripcion.getPrecioApagar();
    }

    void quitarPart(Participante participante){
        for (Inscripcion insc : inscriptos) {
            if (insc.getParticipante().getDni() == participante.getDni()){
                costoActual -= insc.getPrecioApagar();
                inscriptos.remove(insc);
                System.out.println("\n");
                System.out.println("Participante eliminado: " + participante);
            }
        }
    }
}
