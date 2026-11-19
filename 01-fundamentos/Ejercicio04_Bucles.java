public class Ejercicio04_Bucles {
    public static void main(String[] args) {
        int acumulador = 0;

        for (int contador = 1; contador <= 5; contador++) {
            acumulador = acumulador + contador;
            System.out.println("Iteración " + contador + ": " + acumulador);
        }

        System.out.println("Suma final: " + acumulador);
    }
}

