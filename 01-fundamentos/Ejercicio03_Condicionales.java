public class Ejercicio03_Condicionales {
    public static void main(String[] args) {
        int temperatura = 27;
        String consejo;

        if (temperatura < 10) {
            consejo = "Abrígate mucho";
        } else if (temperatura < 20) {
            consejo = "Lleva una chaqueta";
        } else if (temperatura < 30) {
            consejo = "Temperatura agradable";
        } else {
            consejo = "Hace mucho calor";
        }

        System.out.println(consejo);
    }
}

