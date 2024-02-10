package Animales;

public class Gato extends Animal implements Carnivoro{
    @Override
    public void hacerSonido() {
        System.out.println("MIAU");
    }

    @Override
    public void comerCarne() {
        System.out.println("El gato está comiendo carne");
    }
}
