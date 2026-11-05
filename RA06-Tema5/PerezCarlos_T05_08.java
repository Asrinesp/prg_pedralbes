import java.util.Random;

public class PerezCarlos_T05_08 {
    public static void main(String[] args) {
        // Constante de longitud
        final int LONG = 10;
        // Creamos variable para Random
        Random rand = new Random();

        // Creamos el array con LONG
        int[] vector = new int[LONG];

        // Variables de numeros que usaremos
        int numRand;
        int anterior;
        int max, min;

        // Iniciamos anterior en 0;
        anterior = 0;
        for (int i = 0; i < LONG; i++) {
            // Hacemos un max restando las posiciones restantes para que el numero no pueda llegar al maximo
            max = 10000 - (LONG - 1 - i);
            // Guardamos el numero anterior + 1 para marcar el minimo
            min = anterior + 1;
            /*El calculo que hay aqui dentro es basicamente restar el maximo por el minimo
            lo cual da el resultado de los numeros posibles en el rango maximo
            luego a ese numero le sumamos el minimo para que asi sea siempre mayor al anterior numero */
            numRand = rand.nextInt((max - min) + 1) + min;
            // Guardames el numero para luego hacer el minimo
            anterior = numRand;
            // Ingresamos el numero al array
            vector[i] = numRand;
        }
        
        // Mostramos todos los numeros del array
        System.out.print("Numeros del vector: ");
        for (int i = 0; i < LONG; i++) {
            System.out.printf(i != LONG - 1 ? "%d " : "%d\n", vector[i]);
        }
    }
}
