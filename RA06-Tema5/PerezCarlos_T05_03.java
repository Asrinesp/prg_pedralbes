import java.util.Scanner;
import java.util.Random;

public class PerezCarlos_T05_03 {
    public static void main(String[] args) {
        // Creamos variable de Scanner
        Scanner  input = new Scanner(System.in);
        // Creamos variable para Random
        Random rand = new Random();

        // Creamos el array con 10 huecos
        int[] vector = new int[10];

        // Iniciamos las variables que usaremos
        int numUser;

        // Bucle para asignar numeros randoms al array
        for (int i = 0; i < vector.length; i++) {
            vector[i] = rand.nextInt(10) + 1;
        }

        // Bucle para preguntarle el numero al usuario y que este dentro de un criterio
        do {
            System.out.println("Que numero deseas buscar en el vector? [1 - 10]");
            numUser = input.nextInt();
        } while (numUser < 1 || numUser > 10);

        // Bucle para mostrar los numeros mas grandes que el introducido por el usuario
        System.out.printf("Numeros mas grandes que %d: ", numUser);
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] > numUser) {
                System.out.printf("%d, ", vector[i]);
            }
        }
        System.out.print("\n");
        // Bucle para mostrar los numeros mas pequeños que el introducido por el usuario
        System.out.printf("Numeros mas pequeños que %d: ", numUser);
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] < numUser) {
                System.out.printf("%d, ", vector[i]);
            }
        }
        System.out.print("\n");
        // Bucle para mostrar los numeros iguales que el introducido por el usuario
        System.out.printf("Numeros iguales que %d: ", numUser);
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] == numUser) {
                System.out.printf("%d, ", vector[i]);
            }
        }
        System.out.print("\n");
        // Enseñamos todo el array con sus posiciones
        /*
        for (int i = 0; i < vector.length; i++) {
            System.out.printf("Numero vector: %d en posicion %d\n", vector[i], (i));
        }
        */
    }
}
