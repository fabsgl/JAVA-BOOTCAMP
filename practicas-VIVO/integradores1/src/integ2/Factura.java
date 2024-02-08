package integ2;

import java.util.ArrayList;

public class Factura {
    Cliente cliente;
    ArrayList<Item> items;
    int totalCompra;

    public Factura(Cliente cliente, ArrayList<Item> items) {
        this.cliente = cliente;
        this.items = items;
        calcularTotal(items);
    }

    private void calcularTotal(ArrayList<Item> items){
        int res = 0;
        for (Item i : items) {
            res += i.getCantComprada()*i.getPrecioUnit();
        }
        totalCompra = res;
    }
}
