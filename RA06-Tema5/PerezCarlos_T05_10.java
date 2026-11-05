import java.util.Scanner;

public class PerezCarlos_T05_10 {
    public static void main(String[] args) {
        // Constante de longitud
        final int LONG = 50;
        // Creamos variable de Scanner
        Scanner  input = new Scanner(System.in);

        // Creamos el array con LONG
        long[] vector = new long[LONG];

        // Inicializamos variable necesarias
        long numUser;
        long n;
        n = 0;
        // Bucle para asignar numeros randoms al array
        for (int i = 0; i < LONG; i++) {
            if (i > 1) {
                n = vector[i - 1] + vector[i - 2];
            } else {
                n = 1;
            }
            vector[i] = n;
        }
        
        // Preguntamos al usuario por un numero
        System.out.println("Ingresa un numero para comprobar si esta entre los 50 primeros numeros de Fibonacci");
        numUser = input.nextLong();
        // Recorremos el array
        for (int i = 0; i < LONG; i++) {
            // Si el numero del usuario se encuentra en el array imprimimos mensaje y cerramos el bucle
            if (numUser == vector[i]) {
                System.out.println("Su numero si se encuentra en la secuencia Fibonacci");
                break;
            }
        }

        /*
        // Mostramos todos los numeros del array
        System.out.print("Numeros del vector: ");
        for (int i = 0; i < LONG; i++) {
            System.out.printf(i != LONG - 1 ? "%d " : "%d\n", vector[i]);
        }
        */
    }
}
