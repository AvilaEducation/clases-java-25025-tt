package techlab.proyecto;

import java.util.Scanner;

public class EjemploSwitch {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("""
              Menu principal:
                1) Agregar producto
                2) Listar productos
                3) Buscar/Actualizar producto
                4) Eliminar producto
                5) Crear un pedido
                6) Listar pedidos
                7) Salir
              
              Elija una opción:
              """);
        int opcionUsuario = entrada.nextInt();

        switch (opcionUsuario){
            case 1:
                System.out.println("Agregar producto...");
                break;
            case 2:
                System.out.println("Listar productos...");
                break;
            case 3:
                System.out.println("Listar productos...");
                break;
            case 4:
                System.out.println("Agregar producto...");
                break;
            case 5:
                System.out.println("Listar productos...");
                break;
            case 6:
                System.out.println("Listar productos...");
                break;
            case 7:
                System.out.println("Gracias por usar la app!");
                break;
            default:
                System.out.println("Opcion incorrecta");
        }

//        if (opcionUsuario == 1){
//            System.out.println("Agregar producto...");
//        } else if (opcionUsuario == 7) {
//            System.out.println("Gracias por usar la app!");
//        }else {
//            System.out.println("Opcion incorrecta");
//        }
    }
}
