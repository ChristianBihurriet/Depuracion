import java.util.Scanner;

public class Ejercicio09_Cadenas {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String claveCorrecta = "Java21";

        System.out.print("Escribe la clave: ");
        String claveIntroducida = teclado.nextLine();

        if (claveIntroducida == claveCorrecta) {
            System.out.println("Acceso permitido");
        } else {
            System.out.println("Acceso denegado");
        }

        System.out.println("La clave tiene " + claveIntroducida.length() + " caracteres.");
        System.out.println("Último carácter: " + claveIntroducida.charAt(claveIntroducida.length()));
        teclado.close();
    }
}

