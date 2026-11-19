import java.util.Scanner;

public class Ejercicio13_EntradasCine {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double precioEntrada = 8.0;

        System.out.print("Número de entradas: ");
        int entradas = teclado.nextInt();
        teclado.nextLine();
        System.out.print("Día de la semana: ");
        String dia = teclado.nextLine();
        System.out.print("¿Tiene tarjeta del cine? (si/no): ");
        String tarjeta = teclado.nextLine();

        double subtotal = entradas + precioEntrada;
        double descuento = 0.0;

        if (dia.equals("miercoles")) {
            descuento = subtotal * 0.25;
        }
        if (tarjeta.equals("si")) {
            descuento = subtotal * 0.10;
        }

        double total = subtotal - descuento;
        System.out.println("Subtotal: " + subtotal + " euros");
        System.out.println("Descuento: " + descuento + " euros");
        System.out.println("Total: " + total + " euros");
        teclado.close();
    }
}

