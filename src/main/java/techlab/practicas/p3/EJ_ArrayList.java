package techlab.practicas.p3;

import java.util.ArrayList;

public class EJ_ArrayList {
    public static void main(String[] args) {
        ArrayList<String> productos = new ArrayList<>();

        // Agregamos elementos
        productos.add(" té CHAi ");
        productos.add(" AGUA de mESA ");
        productos.add(" AcEiTe DE oliVA ");
        productos.add(" A BORRAR ");

        // Quitamos elementos
        productos.remove(" A BORRAR ");

        // Busqueda simple
        if (productos.contains(" té CHAi ")){
            System.out.println("Existe el producto: Te chai");
        }


        ArrayList<String> productosCapitalizados = new ArrayList<>();
        // Capitalizar todos los elementos de la lista de productos
        for (int i = 0; i < productos.size(); i++) {
            // get: obtenemos un elemento de la lista usando un indice
            String producto = productos.get(i);
            // codigo para capitalizar
            String textoMinuscula = producto.toLowerCase();
            String textoSinEspacios = textoMinuscula.trim();
            // dividimos en palabras el texto
            String[] palabras = textoSinEspacios.split(" ");
            String resultado = "";

            for (int j = 0; j < palabras.length; j++) {
                String palabra = palabras[j];

                resultado += palabra.toUpperCase().charAt(0) + palabra.substring(1) + " ";
            }

            productosCapitalizados.add(resultado);
        }

        System.out.println(productosCapitalizados);
    }
}
