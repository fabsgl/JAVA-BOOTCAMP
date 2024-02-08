package ej2;

public class Main {
    public static void main(String[] args) {
        Chico circuito1 = new Chico();
        Mediano circuito2 = new Mediano();
        Avanzado circuito3 = new Avanzado();

        System.out.println("\n");
        System.out.println("********** CREANDO PARTICIPANTES **********");
        Participante participante1 = new Participante(1234, "Fabian", "Gomez", 23, 11515151, 22222, 0);
        Participante participante2 = new Participante(1234, "Marisa", "A", 17, 11515151, 22222, 0);
        Participante participante3 = new Participante(1234, "Maria", "B", 30, 11515151, 22222, 0);
        Participante participante4 = new Participante(1234, "Jose", "C", 16, 11515151, 22222, 0);
        Participante participante5 = new Participante(1234, "Julia", "D", 23, 11515151, 22222, 0);
        //Participante participante6 = new Participante(1234, "Valentina", "E", 13, 11515151, 22222, 0);
        Participante participante6 = new Participante(1234, "Valentina", "E", 24, 11515151, 22222, 0);
        System.out.println(participante1);
        System.out.println("\n");

        System.out.println("********** INSCRIBIENDO PARTICIPANTES **********");
        Inscripcion inscripcion1 = new Inscripcion(circuito1, participante1);
        System.out.println("Total recaudado en Circuito1: " + circuito1.getCostoActual());
        Inscripcion inscripcion2 = new Inscripcion(circuito1, participante2);
        System.out.println("Total recaudado en Circuito1: " + circuito1.getCostoActual());
        Inscripcion inscripcion3 = new Inscripcion(circuito2, participante3);
        System.out.println("Total recaudado en Circuito2: " + circuito2.getCostoActual());
        Inscripcion inscripcion4 = new Inscripcion(circuito2, participante4);
        System.out.println("Total recaudado en Circuito2: " + circuito2.getCostoActual());
        Inscripcion inscripcion5 = new Inscripcion(circuito3, participante5);
        System.out.println("Total recaudado en Circuito3: " + circuito3.getCostoActual());
        //Inscripcion inscripcion6 = new Inscripcion(circuito3, participante6);
        Inscripcion inscripcion6 = new Inscripcion(circuito3, participante6);
        System.out.println("Total recaudado en Circuito3: " + circuito3.getCostoActual());
        System.out.println("\n");

        System.out.println("********** IMPRIMIENTO INSCRIPCIONES DE CIRCUITO1 **********");
        circuito1.imprimirInsc();
        System.out.println("\n");

        System.out.println("********** DESINSCRIBO PARTICIPANTES **********");
        //Desinscribir a un participante (buscarlo en inscripciones y eliminarlo, también de la lista de la categoria)

        System.out.println("Total recaudado en Circuito1: " + circuito1.getCostoActual());
        circuito1.quitarPart(participante1);
        System.out.println("Total recaudado en Circuito1: " + circuito1.getCostoActual());
        circuito1.imprimirInsc();
        System.out.println("\n");

        System.out.println("********** CALCULANDO TOTAL RECAUDADO **********");
        //Calcular monto total por categoria y en total (esto lo hago con las inscripciones con un for)
        System.out.println("Total entre los 3 circuitos es: " + (circuito1.getCostoActual() + circuito2.getCostoActual() + circuito3.getCostoActual()));
    }
}
