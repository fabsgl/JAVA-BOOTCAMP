package persona;

public class Main {
    public static void main(String[] args) {
        Persona persona1 = new Persona();
        Persona persona2 = new Persona("Fabian",12,"202020");
        Persona persona3 = new Persona("Damian", 23, "101010", 1.7, 73.2);

        //Persona persona4 = new Persona("Fabian",12); //Da error porque no existe un constructor para este caso.
        persona1.calcularIMC();
        persona2.calcularIMC();
        persona3.calcularIMC();

        System.out.println(persona1);
        System.out.println(persona2);
        System.out.println(persona3);
        persona3.calcularIMC();
        persona3.esMayor();
    }
}
