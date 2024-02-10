package integ1;

public class SerieDeA2 extends Prototipo{
    int serieDe;
    int valorInicial;

    public SerieDeA2(int serieProg, int serieDe, int valorInicial) {
        super(serieProg);
        this.serieDe = serieDe;
        this.valorInicial = valorInicial;
    }

    @Override
    int siguienteEnSerie() {
        int res = serieProg;
        serieProg += serieDe;
        return res;
    }

    @Override
    void resetSerieProg() {
        System.out.println("Serie reseteada, valor actual:" + this.serieProg);
        this.serieProg = valorInicial;
    }
}
