package techlab.clases.c2;

import java.util.Scanner;

public class EntradaSalida {
    public static void main(String[] args) {
        // ENTRADA DE DATOS
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese su nobre de usuario: ");
        // nextLine siempre genera un String
        String nombre = entrada.nextLine();

        System.out.println("Nombre de usuario: " + nombre);

        System.out.println("Ingrese una edad: ");
        int edad = entrada.nextInt();
        entrada.nextLine(); // "guarda" el [enter] del nextInt()

        System.out.println("Ingrese una descripcion: ");
        String descripcion = entrada.nextLine();

        System.out.println("Edad: " + edad);
        //System.out.println("Edad2: " + edad2);
        System.out.println("Descripcion: " + descripcion);
        // marco[enter]
        // nextInt se queda con(20) y esto queda en buffer/memoria ([enter])
        // linea dos de carga de datos[enter]
    }
}
