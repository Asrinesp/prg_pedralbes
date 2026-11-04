import java.util.Random;

public class PerezCarlos_T05_07 {
    public static void main(String[] args) {
        // Constante de longitud
        final int LONG = 15;
        // Creamos variable para Random
        Random rand = new Random();

        // Creamos el array con LONG
        int[] vector = new int[LONG];

        // Variables que necesitaremos
        int numRand;
        boolean estar;
        // Bucle para asignar numeros randoms al array
        for (int i = 0; i < LONG; i++) {
            // Bucle constante hasta que se ponga un numero que no esta dentro del array
            do {
                numRand = rand.nextInt(49) + 1;
                estar = false;
                // Recorremos el array con los numeros ingresados para comprobar que no se repitan
                for (int j = 0; j < i; j++) {
                    if (vector[j] == numRand) {
                        // Si se repite cambia estar a true y el bucle se vuelve a hacer
                        estar = true;
                    }
                }
            } while (estar);
            // Ingresamos el numero si salimos del bucle en la posicion i
            vector[i] = numRand;
        }
        
        // Mostramos todos los numeros del array
        System.out.print("Numeros del vector: ");
        for (int i = 0; i < LONG; i++) {
            System.out.printf(i != LONG - 1 ? "%d " : "%d\n", vector[i]);
        }
    }
}
