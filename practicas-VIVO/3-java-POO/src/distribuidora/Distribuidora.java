package distribuidora;

import java.util.ArrayList;
import java.util.Arrays;

public class Distribuidora {
    public static void main(String[] args) {
        Perecedero per1 = new Perecedero("Leche", 10, 3);
        NoPerecedero noper1 = new NoPerecedero("Remera", 10, "Ropa");
        Perecedero per2 = new Perecedero("Yogurt", 10, 1);
        NoPerecedero noper2 = new NoPerecedero("Lampara", 10, "Accesorio");
        Perecedero per3 = new Perecedero("Queso", 10, 2);


        ArrayList<Producto> prods = new ArrayList<>(Arrays.asList(per1, noper1,per2,noper2,per3));
        double total = 0;
        for (Producto p :
                prods) {
            double precioFinalProd = p.calcular(1);
            System.out.printf("Sumo:" + precioFinalProd);
            total += precioFinalProd;
        }
        System.out.printf("El total es " + total + " pesos");

    }
}
