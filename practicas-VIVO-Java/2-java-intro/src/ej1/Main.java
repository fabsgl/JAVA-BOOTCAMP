package ej1;

public class Main {
    public static void main(String[] args) {
        String[] ciudades = {"londres", "madrid", "nueva york", "buenos aires", "asuncion"};
        int[][] temps = {{-2,33}, {-33,32}, {-8,227}, {4,37}, {-16,42}};
        int iMenor = -1; int iMayor = -1;
        int tempMenor = 999;
        int tempMayor = -999;

        for(int i = 0; i < ciudades.length; i++){
            if (temps[i][0] < tempMenor){
                tempMenor = temps[i][0];
                iMenor = i;
            }
            if (temps[i][1] > tempMayor){
                tempMayor = temps[i][1];
                iMayor = i;
            }
        }

        System.out.println("La ciudad de menor temperatura es: " + ciudades[iMenor] + " con una temp mín de " + temps[iMenor][0]);
        System.out.println("La ciudad de mayor temperatura es: " + ciudades[iMayor] + " con una temp máx de " + temps[iMayor][1]);
    }
}
