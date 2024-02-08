package integ1;

public class Main {
    public static void main(String[] args) {
        SerieDeA2 serie2ej = new SerieDeA2(1,2,1);
        SerieDeA2 serie2ej2 = new SerieDeA2(1,3,2);

        System.out.println(serie2ej.siguienteEnSerie());
        System.out.println(serie2ej.siguienteEnSerie());
        System.out.println(serie2ej.siguienteEnSerie());
        serie2ej.setSerieProg(2);
        System.out.println(serie2ej.siguienteEnSerie());
        System.out.println(serie2ej.siguienteEnSerie());
        System.out.println(serie2ej.siguienteEnSerie());

        System.out.println(serie2ej2.siguienteEnSerie());
        System.out.println(serie2ej2.siguienteEnSerie());
        System.out.println(serie2ej2.siguienteEnSerie());
        serie2ej2.setSerieProg(2);
        System.out.println(serie2ej2.siguienteEnSerie());
        System.out.println(serie2ej2.siguienteEnSerie());
        System.out.println(serie2ej2.siguienteEnSerie());
    }
}
