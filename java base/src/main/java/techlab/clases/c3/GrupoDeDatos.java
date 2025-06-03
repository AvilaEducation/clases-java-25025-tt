package techlab.clases.c3;

public class GrupoDeDatos {
    public static void main(String[] args) {
        String textoEjemplo = "mensaje en FORMATO String 123";
        int indiceBusqueda = textoEjemplo.indexOf("a");
        System.out.println(indiceBusqueda);

        System.out.println(textoEjemplo.toLowerCase());

        // modificar la primer letra de la palabra
        // Si es una sola palabra
        String nombre = "marco";
        String apellido = "avila";
        // nombre.toUpperCase().charAt(0):
        //  * transforma el nombre a mayusculas -> MARCO
        //  * y de eso se obtiene el primer caracter -> M
        // nombre.substring(1):
        //  * genera un nuevo string desde el indice que se le pasa -> arco
        // si usamos el '+' con Strings estamos contatenando
        nombre = nombre.toUpperCase().charAt(0) + nombre.substring(1);
        apellido = apellido.toUpperCase().charAt(0) + apellido.substring(1);
        String nombreCompleto = nombre + " " + apellido;
        // nombreCompleto.length() -> cantidad caracteres de un string
        System.out.println(nombreCompleto);

        String[] palabras = nombreCompleto.split("/"); // -> ["Marco", "Avila"]

        String url = "https://gamma.app/docs/Clase03-b3ctilf3i3y799m?mode=present#card-9gpn0h9um2txj3p";
        String[] partesUrl = url.split("/"); // -> ["https:", "", "gamma.app"...]
        int indiceFinal = partesUrl.length - 1;
        String primerElemento = partesUrl[0];
        String segundoElemento = partesUrl[1];
        String recursoFinalUrl = partesUrl[indiceFinal];
        System.out.println(recursoFinalUrl);

    }
}
