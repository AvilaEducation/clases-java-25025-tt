package techlab.practicas.p3;

public class EjercicioFormatoTexto {
    public static void main(String[] args) {
        // TODO: esto funciona solo para " té CHAi "
        // Dada una cadena " té CHAi ", formateala para que quede "Té Chai".
        // " té CHAi " -> "Té Chai"
        // * pasar a minuscula // -> " té chai "
        // * sacar los espacios // -> "té chai"
        // * primer letra de cada palabra en mayuscula -> "Té Chai"
        String textoOriginal = " té CHAi ";
        String resultado = textoOriginal.toLowerCase();
        resultado = resultado.trim();
        // esto funciona para una palabra
        resultado = resultado.toUpperCase().charAt(0) + resultado.substring(1);
        int indiceC = resultado.indexOf("c");
                    // "Té "                          // "C"                                                  //hai"
        resultado = resultado.substring(0, indiceC) + resultado.substring(indiceC).toUpperCase().charAt(0) + resultado.substring(indiceC + 1);

        System.out.println(resultado);
    }
}
