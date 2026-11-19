public class Ejercicio02_Operaciones {
    public static void main(String[] args) {
        double precio = 80.0;
        int unidades = 3;
        double subtotal = precio * unidades;
        double descuento = subtotal * 0.10;
        double base = subtotal - descuento;
        double impuesto = base * 0.07;
        double total = base + impuesto;

        System.out.println("Subtotal: " + subtotal + " euros");
        System.out.println("Total: " + total + " euros");
    }
}

