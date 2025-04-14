package techlab.clases.c2;

public class EstructurasDeControlCondicional {

    public static void main(String[] args) {
        // Condicionales IF
        String rol = "invitado";

        // el if puede estar solo
        if (rol == "admin"){
            System.out.println("puedes ingresar a cualquier parte del sistema");
        }

        if (rol == "admin"){
            System.out.println("puedes ingresar a cualquier parte del sistema");
        } else {
            System.out.println("Tienes que esperar a que te asigen un rol");
        }

        if (rol == "admin"){
            System.out.println("puedes ingresar a cualquier parte del sistema");
        } else if (rol == "invitado") {
            System.out.println("Solo puede acceder a la app en forma de visitante");
        } else {
            System.out.println("Tienes que esperar a que te asigen un rol");
        }

        System.out.println("el final del programa");
    }
}
