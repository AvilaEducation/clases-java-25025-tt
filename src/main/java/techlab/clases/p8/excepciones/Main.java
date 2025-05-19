package techlab.clases.p8.excepciones;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try{
            funcionPrincipal();
        } catch (InputMismatchException e){
            e.printStackTrace();
            System.out.println("INPUT MALO");
            System.out.println(e.getMessage());
        } catch (NoEncontradoException e){
            System.out.println("NO ENCONTRADO");
        }catch (Exception e){
            e.printStackTrace();
            System.out.println(e.getMessage());
        }

        // QUIERO QUE SIEMPRE SE MUESTRE ESTE MENSAJE FINAL
        System.out.println("MENSAJE FINAL!!");
    }

    public static void funcionPrincipal() throws NoEncontradoException {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresa un numero que sea positivo, par y menor que 100");
        int numero = entrada.nextInt();
        int[] array = new int[3];
        ArrayList<String> lista = new ArrayList<>();

//        System.out.println(lista.get(5)); // IndexOutOfBoundsException
//        System.out.println(array[5]); // Error! ArrayIndexOutOfBoundsException

        if (numero < 1){
            throw new NoEncontradoException("Tenes que cargar numeros positivos");
        } else if (numero % 2 == 1) {
            throw new NotFoundException("Tenes que cargar numeros que sean pares");
        } else if (numero > 100) {
            throw new RuntimeException("Tenes que cargar numeros que sean menores a 100");
        }
    }
}
