public class Ejercicio01_Variables {
    public static void main(String[] args) {
        int puntos = 10;
        int bonus = 5;
        int penalizacion = 3;

        puntos = puntos + bonus;
        puntos = puntos * 2;
        puntos = puntos - penalizacion;

        System.out.println("Puntuación final: " + puntos);
    }
}

