package techlab.practicas.p2;

import java.util.Scanner;

public class EjercicioCursoIdioma {
    /**
     * En un colegio existe la posibilidad de elegir, en la materia "lengua extranjera",
     * entre las siguientes opciones: [I]nglés, [F]rancés, y [A]lemán. Se ingresa,
     * para cada alumno, la lengua elegida. La computadora muestra el porcentaje de
     * alumnos que eligió cada lengua
     * DATO: pueden suponer que se van a inscribir 10 estudiantes
     * */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int estudiantesIngles = 0, estudiantesFrances = 0, estudiantesAleman = 0;

        int opcionLengua;
        int cantidadEstudiantes = 3;
        int estudianteActual = 1;
        while (estudianteActual <= cantidadEstudiantes){
            System.out.println("""
                    Ingrese una opcion para anotarse:
                    1 - Ingles
                    2 - Frances
                    3 - Alemania
                    """);
            opcionLengua = entrada.nextInt();
            if (opcionLengua == 1){
                estudiantesIngles++;
            } else if (opcionLengua == 2) {
                estudiantesFrances++;
            }else if (opcionLengua == 3){
                estudiantesAleman++;
            }

            if (opcionLengua >= 1 && opcionLengua <= 3){
                estudianteActual++;
            } else {
                System.out.println("Opcion incorrecta, intente de nuevo");
            }
        }

        double porcentajeIngles =  ((double) estudiantesIngles / cantidadEstudiantes) * 100;
        double porcentajeFrances =  ((double) estudiantesFrances / cantidadEstudiantes) * 100;
        double porcentajeAleman =  ((double) estudiantesAleman / cantidadEstudiantes) * 100;

        System.out.printf("""
                Porcentajes de estudiantes anotados a cada lengua:
                Ingles: %.0f %%
                Frances: %.2f %%
                Aleman: %.2f %%
                %n""", porcentajeIngles, porcentajeFrances, porcentajeAleman);
    }

    static void update(int estudiantes){
        estudiantes++;
    }
}
