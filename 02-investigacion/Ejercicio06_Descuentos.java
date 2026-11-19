import java.util.Scanner;

public class Ejercicio06_Descuentos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Cantidad de artículos: ");
        int cantidad = teclado.nextInt();
        System.out.print("Precio por artículo: ");
        double precio = teclado.nextDouble();

        double subtotal = cantidad * precio;
        double descuento = 0.0;

        if (cantidad > 10) {
            descuento = subtotal * 0.15;
        } else if (cantidad >= 5) {
            descuento = subtotal * 0.05;
        }

        double total = subtotal - descuento;
        System.out.println("Total: " + total + " euros");
        teclado.close();
    }
}

