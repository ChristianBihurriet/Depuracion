import java.util.Scanner;

public class Ejercicio12_Cajero {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double saldo = 500.0;
        int opcion;

        do {
            System.out.println("\n1. Consultar saldo");
            System.out.println("2. Ingresar dinero");
            System.out.println("3. Retirar dinero");
            System.out.println("0. Salir");
            System.out.print("Opción: ");
            opcion = teclado.nextInt();

            if (opcion == 1) {
                System.out.println("Saldo: " + saldo + " euros");
            } else if (opcion == 2) {
                System.out.print("Cantidad a ingresar: ");
                double cantidad = teclado.nextDouble();
                saldo = saldo - cantidad;
                System.out.println("Ingreso realizado");
            } else if (opcion == 3) {
                System.out.print("Cantidad a retirar: ");
                double cantidad = teclado.nextDouble();
                if (cantidad < saldo) {
                    saldo = saldo - cantidad;
                    System.out.println("Retirada realizada");
                } else {
                    System.out.println("Saldo insuficiente");
                }
            } else if (opcion != 0) {
                System.out.println("Opción no válida");
            }
        } while (opcion != 0);

        System.out.println("Operación finalizada. Saldo: " + saldo + " euros");
        teclado.close();
    }
}

