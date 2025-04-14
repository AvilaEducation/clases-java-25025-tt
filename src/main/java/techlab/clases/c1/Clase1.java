package techlab.clases.c1;

import java.util.Scanner;

public class Clase1 {
    public static void main(String[] args) {
        // TIPO DE DATOS
        // numeros enteros
        int edad = 12;
        long edadTierra = 1983745L;
        long edadPersona = 20;

        // numeros con decimales
        float dinero = 123.3f;
        double masDinero = 123.45;

        // texto
        String nombre = "marco";
        char arroba = '@';

        // booleanos
        boolean tieneDinero = true;
        boolean hayDescuento = false;
        boolean esNavidad = true;

        boolean esMayor;

        // reasignacion de variable
        edad = 25;

        // ENTRADA DE DATOS
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese el nombre de usuario: ");
        String linea1 = entrada.nextLine();

        int numero = entrada.nextInt();

        // linea 1[ENTER]
        // 20[ENTER]
        // linea 2
        entrada.nextLine();
        String linea2 = entrada.nextLine();

        System.out.println("SALIDA DE DATOS");
        System.out.println("1: " + linea1);
        System.out.println("2: " + numero);
        //System.out.println("3: " + asd);
        System.out.println("4: " + linea2);

    }
}
