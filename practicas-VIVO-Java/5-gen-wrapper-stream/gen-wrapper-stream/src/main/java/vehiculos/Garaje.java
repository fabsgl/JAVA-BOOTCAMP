package vehiculos;

import java.util.List;
import java.util.Comparator;

public class Garaje {
    private int id;
    private List<Vehiculo> vehiculos;

    //Constructor
    public Garaje(int id, List<Vehiculo> vehiculos) {
        this.id = id;
        this.vehiculos = vehiculos;
    }

    //Setters y getters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(List<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }

    //Métodos
    public List<Vehiculo> ordernarVehiculosPrecio(){
        return this.vehiculos.stream()
                .sorted(Comparator.comparing(Vehiculo::getCosto))
                .toList();
    }
    public List<Vehiculo> ordernarVehiculosMarcaPrecio(){
        return this.vehiculos.stream()
                .sorted(Comparator.comparing(Vehiculo::getCosto))
                .sorted(Comparator.comparing(Vehiculo::getMarca))
                .toList();
    }

    public List<Vehiculo> ordernarVehiculosMenor1000(){
        return this.vehiculos.stream()
                .filter(vehiculo -> vehiculo.getCosto() < 1000)
                .toList();
    }

    public List<Vehiculo> ordernarVehiculosMayorIgual1000(){
        return this.vehiculos.stream()
                .filter(vehiculo -> vehiculo.getCosto() >= 1000)
                .toList();
    }

    public double promedioTotal(){
        return this.vehiculos.stream()
                .mapToInt(vehiculo -> (int) vehiculo.getCosto())
                .average()
                .orElse(0);
    }
}
