package ej2;

public class Participante {
    private static int numParticipante = 0;
    private int dni;
    private String nombre;
    private String apellido;
    private int edad;
    private int celular;
    private int numEmerg;
    private int grupoSang;

    public Participante(int dni, String nombre, String apellido, int edad, int celular, int numEmerg, int grupoSang) {
        numParticipante++;
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.celular = celular;
        this.numEmerg = numEmerg;
        this.grupoSang = grupoSang;
    }

    @Override
    public String toString() {
        return "Participante{" +
                "numParticipante=" + numParticipante +
                ", dni=" + dni +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                ", celular=" + celular +
                ", numEmerg=" + numEmerg +
                ", grupoSang=" + grupoSang +
                '}';
    }

    public int getEdad() {
        return edad;
    }

    public static int getNumParticipante() {
        return numParticipante;
    }

    public int getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getCelular() {
        return celular;
    }

    public int getNumEmerg() {
        return numEmerg;
    }

    public int getGrupoSang() {
        return grupoSang;
    }
}
