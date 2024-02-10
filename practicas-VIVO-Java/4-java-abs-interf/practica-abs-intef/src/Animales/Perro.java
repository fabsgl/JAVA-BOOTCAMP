package Animales;

public class Perro extends Animal implements Carnivoro{
    @Override
    public void hacerSonido() {
        System.out.println("GUAU");    }

    @Override
    public void comerCarne() {
        System.out.println("El perro está comiendo carne");
    }
}
