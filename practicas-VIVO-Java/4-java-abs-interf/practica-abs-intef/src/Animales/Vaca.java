package Animales;

public class Vaca extends Animal implements Herviboro {
    @Override
    public void hacerSonido() {
        System.out.println("MUUU");
    }

    @Override
    public void comerHierba() {
        System.out.println("La vaca está comiendo hierva");
    }
}
