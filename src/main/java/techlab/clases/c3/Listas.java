package techlab.clases.c3;

import java.util.ArrayList;
import java.util.Arrays;

public class Listas {
    public static void main(String[] args) {
        // Litas en Java
        // String
        String nombre = "talento tech";
        nombre.charAt(0); // -> t
        nombre.charAt(1); // -> a
        nombre.charAt(2); // -> l
        int ultimoIndice = nombre.length() - 1;
        nombre.charAt(ultimoIndice); // -> h
        // Array
        String[] letrasArray = {"t", "a", "l", "e", "n", "t", "o"};
        String letra1 = letrasArray[0]; // -> t
        String letra2 = letrasArray[1]; // -> a
        String letra3 = letrasArray[2]; // -> l
        int ultimoIndiceArray = letrasArray.length - 1;
        String ultimaLetra = letrasArray[ultimoIndiceArray]; // -> o
        // ArrayList
        ArrayList<String> letras = new ArrayList<>(); // []
        // tranformaciones para que los datos sean compatibles
        letras.addAll(Arrays.stream(letrasArray).toList());

        letras.get(0); // -> t
        letras.get(1); // -> a
        letras.get(2); // -> l
        int ultimoIndiceList = letras.size() - 1;
        letras.get(ultimoIndiceList);

        letras.add(" ");
        letras.add("t");
        letras.add("e");

        System.out.println(letras);
    }
}
