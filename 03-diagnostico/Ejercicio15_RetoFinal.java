import java.util.Scanner;

public class Ejercicio15_RetoFinal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double precioMenu = 9.50;
        String codigoDescuento = "DAM21";

        System.out.println("=== PEDIDO DE CAFETERÍA ===");
        System.out.print("Nombre del cliente: ");
        String nombre = teclado.nextLine();
        System.out.print("Número de menús: ");
        int menus = teclado.nextInt();
        teclado.nextLine();
        System.out.print("Código de descuento (o ninguno): ");
        String codigo = teclado.nextLine();
        System.out.print("¿Recogida urgente? (si/no): ");
        String urgente = teclado.nextLine();

        int menuActual = 0;
        double subtotal = 0.0;
        while (menuActual <= menus) {
            subtotal = subtotal + precioMenu;
            menuActual++;
        }

        double descuento = 0.0;
        if (codigo == codigoDescuento) {
            descuento = subtotal * 0.20;
        }

        double suplemento = 0.0;
        if (urgente.equals("si")) {
            suplemento = 3.0;
        }

        double total = subtotal - descuento - suplemento;

        String categoria;
        if (menus <= 0) {
            categoria = "Pedido no válido";
        } else if (menus >= 5) {
            categoria = "Pedido grande";
        } else {
            categoria = "Pedido normal";
        }

        System.out.println("\nCliente: " + nombre.substring(0, nombre.length() - 1));
        System.out.println("Categoría: " + categoria);
        System.out.println("Subtotal: " + subtotal + " euros");
        System.out.println("Descuento: " + descuento + " euros");
        System.out.println("Suplemento: " + suplemento + " euros");
        System.out.println("TOTAL: " + total + " euros");
        teclado.close();
    }
}
