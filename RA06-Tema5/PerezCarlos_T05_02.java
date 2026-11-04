import java.util.Scanner;
import java.util.Random;

public class PerezCarlos_T05_02 {
    public static void main(String[] args) {
        // Creamos variable de Scanner
        Scanner  input = new Scanner(System.in);
        // Creamos variable para Random
        Random rand = new Random();

        // Creamos el array con 10 huecos
        int[] vector = new int[10];

        // Iniciamos las variables que usaremos
        int i;
        int numUser;

        // El indice lo empezamos de 0
        i = 0;
        // Bucle para asignar numeros randoms al array
        while (i < vector.length) {
            vector[i] = rand.nextInt(10) + 1;
            i++;
        }

        // Bucle para preguntarle el numero al usuario y que este dentro de un criterio
        do {
            System.out.println("Que numero deseas buscar en el vector? [1 - 10]");
            numUser = input.nextInt();
        } while (numUser < 1 || numUser > 10);

        // El indice lo empezamos de 0
        i = 0;
        // Bucle para buscar el numero del usuario en nuestro array
        while (i < vector.length) {
            if (numUser == vector[i]) {
                System.out.println("Su numero si se encuentra en el vector");
                break;
            }
            i++;
        }

        // El indice lo empezamos de 0
        i = 0;
        // Bucle para mostrar todo el array
        while (i < vector.length) {
            System.out.printf("Numero vector: %d en posicion %d\n", vector[i], (i + 1));
            i++;
        }
    }
}
