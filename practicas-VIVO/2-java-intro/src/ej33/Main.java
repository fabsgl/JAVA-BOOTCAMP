package ej33;

public class Main {
    public static void main(String[] args) {
        clasehijaAbs ejemplo1 = new clasehijaAbs(123, 321);
        int nom = ejemplo1.getNombre();
        int num = ejemplo1.getNumero();
        System.out.println(nom);
        System.out.println(num);

        clasehija ejemploNormal = new clasehija(123,321);
        int nomNormal = ejemploNormal.getNombre();
        int numNormal = ejemploNormal.getNumero();
        System.out.println(nomNormal);
        System.out.println(numNormal);

        ejemplo1.calcularAlgo();
    }
}
