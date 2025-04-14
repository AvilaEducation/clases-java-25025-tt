package techlab.practicas.p2;

import java.util.Scanner;

public class EjercicioClase2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int precioArroz = 2000;
        System.out.println("🍚 Te damos la bienvenida a la tienda de arroz 🍚");
        System.out.println("Ingrese su nombre: ");
        String nombreUsuario = entrada.nextLine();
        System.out.println("Cada kilo de arroz cuesta: " + precioArroz);
        System.out.println("Cuantos kilos desea comprar?: ");
        int cantidadArroz = entrada.nextInt();
        int total = precioArroz * cantidadArroz;
        System.out.println(nombreUsuario + ", el coste total seria: " + total);
    }
}
