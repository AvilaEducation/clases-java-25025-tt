package techlab.practicas.p4;

import java.util.ArrayList;
import java.util.Arrays;

public class Funciones {
    public static void main(String[] args) {
        ArrayList<String> productos = new ArrayList<>();
        productos.addAll(Arrays.asList(" té CHAi ", " AGUA de mESA ", " AcEiTe DE oliVA "));
        // " AGUA de mESA " ---capitalizeSobreCarga---> "Agua De Mesa"
        // " AGUA-de-mESA " ---capitalizeSobreCarga, "-"---> "texto lindo: Agua De Mesa"

        ArrayList<String> productosCapitalizados = new ArrayList<>();
        // Capitalizar todos los elementos de la lista de productos
        for (int i = 0; i < productos.size(); i++) {
            // get: obtenemos un elemento de la lista usando un indice
            String producto = productos.get(i);

            String resultado = capitalize(producto);
            productosCapitalizados.add(resultado);
        }

        System.out.println(productosCapitalizados);
    }


    // creamos un metodo para separar la logica que se encarga de capitalizar un texto
    // de esta forma podemos reutilizar la logica donde queramos
    public static String capitalize(String text){
        String textoMinuscula = text.toLowerCase();
        String textoSinEspacios = textoMinuscula.trim();
        // dividimos en palabras el texto
        String[] palabras = textoSinEspacios.split(" ");
        String resultado = "";

        for (int i = 0; i < palabras.length; i++) {
            String palabra = palabras[i];

            resultado += palabra.toUpperCase().charAt(0) + palabra.substring(1) + " ";
        }

        return resultado;
    }

    /* SOBRE CARGA DE METODOS */
    // podemos escribir dos o mas metodos con el mismo nombre siempre que la cantidad y/o tipo de parametros se distinta

    // este metodo es igual que <capitalize>
    public static String capitalizeSobreCarga(String text){
        return capitalizeSobreCarga(text, " ");
    }

    // este metodo es mas flexible ya que nos permite elegir de que forma estan separadas las palabras
    public static String capitalizeSobreCarga(String text, String separador){
        String textoMinuscula = text.toLowerCase();
        String textoSinEspacios = textoMinuscula.trim();
        // dividimos en palabras el texto
        String[] palabras = textoSinEspacios.split(separador);
        String resultado = "";

        for (int i = 0; i < palabras.length; i++) {
            String palabra = palabras[i];

            resultado += palabra.toUpperCase().charAt(0) + palabra.substring(1) + separador;
        }

        return resultado;
    }
}
