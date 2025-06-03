package techlab.practicas.p7exceptions;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        int opcion = entrada.nextInt();

        try {
            menu(opcion);
        } catch (ProductNotFoundException e){
            e.printStackTrace();
            System.out.println(e.getImage());
            System.out.println("titulo: " + e.getTitulo());
            System.out.println("description: " + e.getMessage());
        } catch (MusicNotFoundException e){
            e.printStackTrace();
            System.out.println("DECIDISTE MANDAR UNA EXCEPTION");
        } catch (Exception e){
            e.printStackTrace();
            System.out.println("No sabemos que paso, pero hubo un error");
        }
    }

    public static void menu(int opcion) throws MusicNotFoundException {
        if (opcion == 1){
            System.out.println("RUNTIME");
            throw new ProductNotFoundException("error de tal cosa");
        }else if (opcion == 2){
            System.out.println("EXCEPTION");
            throw new MusicNotFoundException("error esperado");
        }else {
            System.out.println("opcion incorrecta");
        }
    }
}
