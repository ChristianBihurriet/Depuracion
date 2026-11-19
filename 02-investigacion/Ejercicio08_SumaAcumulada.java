import java.util.Scanner;

public class Ejercicio08_SumaAcumulada {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Número final: ");
        int limite = teclado.nextInt();
        int suma = 0;

        for (int numero = 1; numero < limite; numero++) {
            suma = suma + numero;
        }

        System.out.println("Suma desde 1 hasta " + limite + ": " + suma);
        teclado.close();
    }
}

