package techlab.practicas.p2;

import java.util.Scanner;

public class EjercicioPromedio {
    /*
    * Se ingresan notas numéricas de 0 a 10.
    * El proceso de carga finaliza cuando se detecta un número fuera de rango (negativo o mayor que 10).
    * La computadora muestra el promedio de las notas
    * */
    public static void main(String[] args) {
        // promedio = suma numeros / cantidad numeros sumados
        Scanner terminal = new Scanner(System.in);
        float sumaNumeros = 0;
        float numerosSumados = 0;

        System.out.println("Ingrese una nota valida, un numero entre 0 y 10: ");
        float nota = terminal.nextFloat();
        // hay que escribir una comparacion para saber si la nota esta entre 0 y 10
        while (nota >= 0 && nota <= 10){
            sumaNumeros = sumaNumeros + nota;
            numerosSumados = numerosSumados + 1;

            System.out.println("Ingrese una nota valida, un numero entre 0 y 10: ");
            nota = terminal.nextFloat();
        }

        float promedio;

        if (numerosSumados > 0){
            promedio = sumaNumeros / numerosSumados;
            System.out.println("El promedio de las notas es: " + promedio);
        }else {
            System.out.println("No se puede calcular un promedio si no hay notas validas");
        }

    }
}
