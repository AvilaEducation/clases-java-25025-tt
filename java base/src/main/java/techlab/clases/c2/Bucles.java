package techlab.clases.c2;

import java.util.Scanner;

public class Bucles {

    public static void main(String[] args) {
        /*Scanner entrada = new Scanner(System.in);
        int precioProducto = 500;
        int cantidad;
        int saldo = 5000;

        // bucle con repeticiones indefinidas
        while (saldo > 0){
            System.out.println("Saldo actual: " + saldo);
            // comprar cosas
            System.out.println("Cantidad a comprar: ");
            cantidad = entrada.nextInt();

            saldo = saldo - (precioProducto * cantidad);
        }

        System.out.println("mensaje final, fuera del bucle");
        */

        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el numero del que quiere ver la tabla: ");
        int numeroTabla = entrada.nextInt();

        // TODO: tarea: que el usuario puede ingresar cual es el rango de la tabla
        System.out.println("BUCLE FOR");
        for (int i = 1; i <= 10; i+=2){
            System.out.println(numeroTabla + " X " + i + " = " + (numeroTabla * i));
        }

        System.out.println("BUCLE WHILE");
        int j = 1;
        while (j <= 10){
            System.out.println(numeroTabla + " X " + j + " = " + (numeroTabla * j));

            j = j + 2; // j++ // j += 1
        }
    }
}
