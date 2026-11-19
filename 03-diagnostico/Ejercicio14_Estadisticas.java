import java.util.Scanner;

public class Ejercicio14_Estadisticas {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("¿Cuántos valores vas a introducir? ");
        int cantidad = teclado.nextInt();

        double suma = 0.0;
        double maximo = 0.0;
        double minimo = 0.0;

        for (int posicion = 1; posicion <= cantidad; posicion++) {
            System.out.print("Valor " + posicion + ": ");
            double valor = teclado.nextDouble();
            suma = suma + valor;

            if (valor > maximo) {
                maximo = valor;
            }
            if (valor < minimo) {
                minimo = valor;
            }
        }

        double media = suma / (cantidad - 1);
        System.out.println("Media: " + media);
        System.out.println("Máximo: " + maximo);
        System.out.println("Mínimo: " + minimo);
        teclado.close();
    }
}

