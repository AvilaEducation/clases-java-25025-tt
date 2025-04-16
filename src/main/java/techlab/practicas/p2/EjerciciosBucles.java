package techlab.practicas.p2;

import java.util.Scanner;

public class EjerciciosBucles {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese que numero desea contar: ");
        int tope = entrada.nextInt();
        boolean contarAdelante = tope > 0;

        // BUCLE FOR - arreglo para tener en cuenta los negativos
        System.out.println("CONTANDO CON EL FOR");
        if (contarAdelante){
            for (int i = 1; i <= tope; i++){
                System.out.println("Contando: " + i);
            }
        }else{
            for (int i = 1; tope <= i; i--){
                System.out.println("Contando: " + i);
            }
        }

        // BUCLE WHILE
        System.out.println("CONTANDO CON EL WHILE");
        int j = 1;
        while (j <= tope){
            System.out.println("Contando: " + j);

            j += 1;
        }
    }
}
