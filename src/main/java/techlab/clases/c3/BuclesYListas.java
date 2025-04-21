package techlab.clases.c3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class BuclesYListas {
    public static void main(String[] args) {
        String nombre = "talento tech";
        String[] letrasArray = {"t", "a", "l", "e", "n", "t", "o"};
        ArrayList<String> letras = new ArrayList<>(); // []
        // tranformaciones para que los datos sean compatibles
        letras.addAll(Arrays.stream(letrasArray).collect(Collectors.toList()));

        letras.add(" ");
        letras.add("t");
        letras.add("e");
        // bucle para String
        /*for (int i = 0; i < nombre.length(); i++) {
            char caracter = nombre.charAt(i);
            System.out.println(caracter);
        }*/

        // bucle para array
        /*for (int i = 0; i < letrasArray.length; i++) {
            String caracter = letrasArray[i];
            System.out.println(caracter);
        }*/

        // bucle para arrayList
        System.out.println(letras);
        for (int i = 0; i < letras.size(); i++) {
            String letra = letras.get(i);
            // operaciones por elemento
            System.out.println(letra);
        }
    }
}
