import java.util.Random;

public class PerezCarlos_T05_06 {
    public static void main(String[] args) {
        // Constante de longitud
        final int LONG = 6;
        // Creamos variable para Random
        Random rand = new Random();

        // Creamos el array con LONG
        int[] vector = new int[LONG];

        // Bucle para asignar numeros randoms al array
        for (int i = 0; i < LONG; i++) {
            vector[i] = rand.nextInt(49) + 1;
        }
        
        // Mostramos todos los numeros del array
        System.out.print("Numeros del vector: ");
        for (int i = 0; i < LONG; i++) {
            System.out.printf(i != LONG - 1 ? "%d " : "%d\n", vector[i]);
        }
    }
}
