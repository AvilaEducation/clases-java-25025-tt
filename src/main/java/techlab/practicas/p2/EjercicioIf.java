package techlab.practicas.p2;

import java.util.Scanner;

public class EjercicioIf {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese la cantidad a comprar: ");
        int cantidad =  entrada.nextInt();

        if (cantidad > 100){
            System.out.println("Por comprar tantas unidades tenes un descuento especial");
        }else{
            System.out.println("Gracias por su compra");
        }
    }
}
