import java.util.Random;
import java.util.Scanner;

public class PerezCarlos_T05_11 {
    public static void main(String[] args) {
        // Constante de longitud
        final int LONG = 6;
        // Creamos variable para Random
        Random rand = new Random();
        // Creamos variable para Scanner
        Scanner  input = new Scanner(System.in);
        
        // Inicializamos los dos array
        int[] vectorRand = new int[LONG];
        int[] vectorUsr = new int[LONG];

        // Variables que necesitaremos
        int numRand, numUser;
        int coinciden;
        boolean estar;
        // Bucle para asignar numeros randoms al array
        for (int i = 0; i < LONG; i++) {
            // Bucle constante hasta que se ponga un numero que no esta dentro del array
            do {
                numRand = rand.nextInt(49) + 1;
                estar = false;
                // Recorremos el array con los numeros ingresados para comprobar que no se repitan
                for (int j = 0; j < i; j++) {
                    if (vectorRand[j] == numRand) {
                        // Si se repite cambia estar a true y el bucle se vuelve a hacer
                        estar = true;
                    }
                }
            } while (estar);
            // Ingresamos el numero si salimos del bucle en la posicion i
            vectorRand[i] = numRand;
        }

        // Bucle para asignar numeros del usuario al array
        for (int i = 0; i < LONG; i++) {
            // Bucle constante hasta que se ponga un numero que no esta dentro del array
            do {
                System.out.println("Ingresa un numero entre [1 - 49]");
                numUser = input.nextInt();
                estar = false;
                // Recorremos el array con los numeros ingresados para comprobar que no se repitan
                for (int j = 0; j < i; j++) {
                    if (vectorUsr[j] == numUser) {
                        // Mensaje de error
                        System.out.println("Has ingresado un numero repetido, ingresa un numero distinto");
                        // Si se repite cambia estar a true y el bucle se vuelve a hacer
                        estar = true;
                    }
                }
                // Compobamos que el numero del usuario esta en los valores validos
                if (numUser < 1 || numUser > 49) {
                    // Mensaje de error
                    System.out.println("Ingresa un numero valido");
                    // Cambiamos a true para volver a pedir el numero
                    estar = true;
                }
            } while (estar);
            // Ingresamos el numero si salimos del bucle en la posicion i
            vectorUsr[i] = numUser;
        }
        
        // Contador para saber cuantos numeros coinciden
        coinciden = 0;
        // for para comrpobar que numeros coinciden entre los dos array
        for (int i = 0; i < LONG; i++) {
            // segundo for para recorrer el otro array
            for(int j = 0; j < LONG; j++) {
                // if para printar mensaje en el caso de que un numero coincida
                if (vectorRand[i] == vectorUsr[j]) {
                    System.out.printf("El numero %d coincide\n", vectorRand[i]);
                    coinciden++;
                }
            }
        }
        // Printamos el total de numeros que coinciden
        System.out.printf("En total coinciden %d numeros\n", coinciden);

        // Mostramos todos los numeros del array random
        System.out.print("Numeros del vector random: ");
        for (int i = 0; i < LONG; i++) {
            System.out.printf(i != LONG - 1 ? "%d " : "%d\n", vectorRand[i]);
        }
        // Mostramos todos los numeros del array user
        System.out.print("Numeros del vector del usuario: ");
        for (int i = 0; i < LONG; i++) {
            System.out.printf(i != LONG - 1 ? "%d " : "%d\n", vectorUsr[i]);
        }
    }
}
