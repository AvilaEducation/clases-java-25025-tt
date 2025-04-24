package techlab.practicas.p3;

public class EJFormatoTextoGeneral {
    public static void main(String[] args) {
        // Dada una cadena " té CHAi ", formateala para que quede "Té Chai".
        // * pasar a minuscula // -> " té chai "
        // * sacar los espacios // -> "té chai"
        // * primer letra de cada palabra en mayuscula -> "Té Chai"
        String textoOriginal = " té CHAi ALÑKJSDLKASJ CAMpeon  ";
        String textoMinuscula = textoOriginal.toLowerCase();
        String textoSinEspacios = textoMinuscula.trim();
        // dividimos en palabras el texto
        String[] palabras = textoSinEspacios.split(" ");
        String resultado = "";

        for (int i = 0; i < palabras.length; i++) {
            String palabra = palabras[i];

            resultado += palabra.toUpperCase().charAt(0) + palabra.substring(1) + " ";
        }

        System.out.println(resultado);
        System.out.println("Longitud palabra: " + resultado.length());
        System.out.println("Primer letra: " + resultado.charAt(0));
        // contains: devuelve un true o false segun si contiene el texto que le pasamos
        System.out.println("contiene chai?: " + resultado.contains("Campeon"));
    }
}
