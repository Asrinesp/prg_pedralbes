import java.util.Random;

public class PerezCarlos_T05_04 {
    public static void main(String[] args) {
        // Constante de longitud
        final int LONG = 10;
        // Creamos variable para Random
        Random rand = new Random();

        // Creamos el array con 10 huecos
        int[] vector = new int[LONG];

        int suma;

        // Bucle para asignar numeros randoms al array
        for (int i = 0; i < LONG; i++) {
            vector[i] = rand.nextInt(10) + 1;
        }
        
        // for para comprobar las posiciones multiples de 3 y sumar el numero
        suma = 0;
        for (int i = 0; i < LONG; i++) {
            if(i % 3 == 0) {
                suma += vector[i];
            }
        }

        // Mostramos todos los numeros del array
        System.out.print("Numeros del vector: ");
        for (int i = 0; i < LONG; i++) {
            System.out.printf(i != LONG - 1 ? "%d " : "%d\n", vector[i]);
        }
        // Mostramos la suma
        System.out.printf("La suma de los numeros en posicion multiple de 3 es: %d\n", suma);
    }
}
