import java.util.Scanner;

public class Ejercicio07_ClasificacionNotas {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Nota (0-10): ");
        double nota = teclado.nextDouble();
        String clasificacion;

        if (nota >= 5) {
            clasificacion = "Aprobado";
        } else if (nota >= 7) {
            clasificacion = "Notable";
        } else if (nota >= 9) {
            clasificacion = "Sobresaliente";
        } else {
            clasificacion = "Suspenso";
        }

        System.out.println("Clasificación: " + clasificacion);
        teclado.close();
    }
}

