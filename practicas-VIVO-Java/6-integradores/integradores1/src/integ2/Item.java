package integ2;

public class Item {
    private String nombre;
    private int codigo;
    private int cantComprada;
    private int precioUnit;

    public Item(String nombre, int codigo, int cantComprada, int precioUnit) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.cantComprada = cantComprada;
        this.precioUnit = precioUnit;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public int getCantComprada() {
        return cantComprada;
    }

    public int getPrecioUnit() {
        return precioUnit;
    }
}
