package persona;

public class Persona {
    private String nombre;
    private int edad;
    private String dni;
    private double peso;
    private double altura;

    public Persona(){}

    public Persona(String nombre, int edad, String dni){
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
    }

    public Persona(String nombre, int edad, String dni, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
        this.peso = peso;
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    //******MÉTODOS******
    public int calcularIMC(){
        double IMC = peso/Math.pow(altura,2);
        if (IMC < 20){
            System.out.println("La persona se encuentra en bajo peso");
            return -1;
        } else if (IMC <= 25){
            System.out.println("La persona se encuentra en un peso saludable");
            return 0;
        } else if (IMC>25){
            System.out.println("La persona se encuentra con sobrepeso");
            return 1;
        } else {
            //no me lo piden pero llega hasta acá si se usan los otros constructores.
            System.out.println("ERROR POR CONSTRUCTOR");
            return 1;
        }
    }

    public boolean esMayor(){
        if (edad>=18){
            System.out.println("Es mayor de edad");
            return true;
        } else {
            System.out.println("Es menor de edad");
            return false;
        }
    }

    @Override
    public String toString() {
        return "Datos de la persona" +
                "nombre:'" + nombre + '\'' +
                ", edad:" + edad +
                ", dni:'" + dni + '\'' +
                ", peso:" + peso +
                ", altura:" + altura +
                '\n';
    }
}

