package ej2;

//public class Inscripcion <T extends Circuito>{
public class Inscripcion{
    private static int numInscGlobal = 0;

    private int numInsc;
    private Circuito circuito;
    private Participante participante;
    private int precioApagar;

    public Inscripcion(Circuito circuitoArg, Participante participante) {
        numInscGlobal++;
        this.numInsc = numInscGlobal;
        this.circuito = circuitoArg;
        this.participante = participante;
        this.precioApagar = calcularPrecio(circuitoArg, participante.getEdad());
        circuitoArg.agregarInsc(this);
        System.out.println("Participante " + participante.getNombre() + ", n° inscripción: " + numInsc +
                ", edad: " + participante.getEdad() + " años, abona $" + precioApagar + " pesos.");
    }

    public int getNumInsc() {
        return numInsc;
    }

    int calcularPrecio(Circuito circuito, int edad){
        int largo = circuito.getLargo();
        if (largo==2){
            if (edad<18){
                return circuito.getPrecioMenores();
            }else return circuito.getPrecioAdulto();
        }else if(largo==5){
            if (edad<18){
                return circuito.getPrecioMenores();
            }else return circuito.getPrecioAdulto();
        }else{
            if (edad>18){
                return circuito.getPrecioAdulto();
            }else{
                throw new RuntimeException("/*** No se permite menores de 18 en este circuito ***/");
            }
        }
    }

    @Override
    public String toString() {
        return "Inscripcion{" +
                "numInsc=" + numInsc +
                //", circuito=" + circuito +  ----> da error al imprimirlo, será porque está puesta "Circuito" como clase?
                ", participante=" + participante +
                ", precioApagar=" + precioApagar +
                '}';
    }

    public static int getNumInscGlobal() {
        return numInscGlobal;
    }

    public Circuito getCircuito() {
        return circuito;
    }

    public Participante getParticipante() {
        return participante;
    }

    public int getPrecioApagar() {
        return precioApagar;
    }
}
