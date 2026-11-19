import java.util.Scanner;

public class Ejercicio10_ValidacionEntrada {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int edad;

        do {
            System.out.print("Edad (0-120): ");
            edad = teclado.nextInt();
            if (edad < 0 && edad > 120) {
                System.out.println("Valor no válido. Inténtalo de nuevo.");
            }
        } while (edad < 0 && edad > 120);

        System.out.println("Edad aceptada: " + edad);
        teclado.close();
    }
}

