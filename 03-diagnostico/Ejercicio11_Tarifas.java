import java.util.Scanner;

public class Ejercicio11_Tarifas {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Edad: ");
        int edad = teclado.nextInt();
        teclado.nextLine();
        System.out.print("¿Es estudiante? (si/no): ");
        String estudiante = teclado.nextLine();

        double precio = 12.0;
        if (edad < 12) {
            precio = 6.0;
        } else if (edad > 65) {
            precio = 7.0;
        }

        if (estudiante == "si") {
            precio = precio - 2.0;
        }

        System.out.println("Precio final: " + precio + " euros");
        teclado.close();
    }
}

