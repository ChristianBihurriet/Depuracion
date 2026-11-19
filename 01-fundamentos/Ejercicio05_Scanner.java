import java.util.Scanner;

public class Ejercicio05_Scanner {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Nombre: ");
        String nombre = teclado.nextLine();
        System.out.print("Edad: ");
        int edad = teclado.nextInt();
        int edadSiguiente = edad + 1;

        System.out.println(nombre + ", el próximo año tendrás " + edadSiguiente + " años.");
        teclado.close();
    }
}

