package integ1;

abstract class Prototipo<T extends Number>{
    protected int serieProg;

    public Prototipo(int serieProg) {
        this.serieProg = serieProg;
    }

    abstract int siguienteEnSerie();

    abstract void resetSerieProg();

    public void setSerieProg(int serieProg) {
        this.serieProg = serieProg;
    }
}
