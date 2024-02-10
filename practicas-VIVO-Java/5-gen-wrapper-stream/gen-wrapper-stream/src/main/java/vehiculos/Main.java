package vehiculos;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Vehiculo> listaVehiculos = new ArrayList<>();
        listaVehiculos.add(new Vehiculo("Ford", "Fiesta",1000));
        listaVehiculos.add(new Vehiculo("Fiat", "Torino",1250));
        listaVehiculos.add(new Vehiculo("Toyota", "Corola",1200));
        listaVehiculos.add(new Vehiculo("Ford", "Fiesta",1000));
        listaVehiculos.add(new Vehiculo("Renault", "Logan",950));
        listaVehiculos.add(new Vehiculo("Fiat", "Uno",500));
        listaVehiculos.add(new Vehiculo("Chevrolet", "Spin",2500));
        listaVehiculos.add(new Vehiculo("Ford", "Focus",1200));
        listaVehiculos.add(new Vehiculo("Toyota", "Fortuner",3000));
        listaVehiculos.add(new Vehiculo("Ford", "Explorer",2500));
        listaVehiculos.add(new Vehiculo("Fiat", "Cronos",1000));
        listaVehiculos.add(new Vehiculo("Chevrolet", "Aveo",1250));

        //System.out.println(listaVehiculos);
        Garaje garaje = new Garaje(1,listaVehiculos);

        System.out.println("Vehículos ordennados por costo");
        System.out.println(garaje.ordernarVehiculosPrecio());
        garaje.getVehiculos().stream()
                .sorted(Comparator.comparing(Vehiculo::getCosto))
                .forEach(System.out::println);

        System.out.println("\n" + "Vehículos ordenados primero por costo  y luego por marca");
        System.out.println(garaje.ordernarVehiculosMarcaPrecio());
        garaje.getVehiculos().stream()
                .sorted(Comparator.comparing(Vehiculo::getCosto))
                .sorted(Comparator.comparing(Vehiculo::getMarca))
                //.sorted((x,y) -> x.getMarca().compareToIgnoreCase(y.getMarca()))
                .forEach(System.out::println);
                //.toList();

        System.out.println("\n" + "Vehículos con costo menor a 1000");
        System.out.println(garaje.ordernarVehiculosMenor1000());
        garaje.getVehiculos().stream()
                .filter( v -> v.getCosto() < 1000)
                .forEach(System.out::println);

        System.out.println("\n" + "Vehículos con costo mayor a 1000");

        System.out.println(garaje.ordernarVehiculosMayorIgual1000());
        garaje.getVehiculos().stream()
                .filter( v -> v.getCosto() >= 1000)
                .forEach(System.out::println);

        System.out.println("\n" + "Promedio del costo de todos los vehículos");
        System.out.println(garaje.promedioTotal());
        System.out.println(garaje.getVehiculos().stream()
                .mapToDouble(Vehiculo::getCosto)
                .average());

    }
}
