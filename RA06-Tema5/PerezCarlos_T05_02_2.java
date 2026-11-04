import java.util.Scanner;
import java.util.Random;

public class PerezCarlos_T05_02_2 {
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

        // Bucle para buscar el numero del usuario en nuestro array
        for (int i = 0; i < vector.length; i++) {
            if (numUser == vector[i]) {
                System.out.println("Su numero si se encuentra en el vector");
                break;
            }
        }

        // Bucle para mostrar todo el array
        for (int i = 0; i < vector.length; i++) {
            System.out.printf("Numero vector: %d en posicion %d\n", vector[i], (i + 1));
        }
    }
}
