package Animales;

public class Main {

    public static void main(String[] args) {

        Perro perro = new Perro();
        Gato gato = new Gato();
        Vaca vaca = new Vaca();

        // Invocación de métodos
        perro.hacerSonido();
        perro.comerCarne();

        gato.hacerSonido();
        gato.comerCarne();

        vaca.hacerSonido();
        vaca.comerHierba();

        comerAnimal(vaca);
    }

    public static void comerAnimal(Animal animal) {
        if (animal instanceof Carnivoro) {
            ((Carnivoro) animal).comerCarne();
        } else if (animal instanceof Herviboro) {
            ((Herviboro) animal).comerHierba();
        } else {
            System.out.println("No se puede determinar el tipo de alimentación del animal.");
        }
    }
}
