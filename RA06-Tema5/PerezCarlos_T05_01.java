import java.util.Scanner;

public class PerezCarlos_T05_01 {
    public static void main(String[] args) {
        // Creamos variable para el Scanner
        Scanner  input = new Scanner(System.in);

        // Creamos el array de 10 huecos
        int[] vector = new int[10];

        // Hacemos un for para recorrer el array
        for (int i = 0; i < vector.length; i++) {
            // Bucle para comprobar que el numero del usuario esta dentro del campo que pedimos
            do {
                System.out.println("Introduce un valor entre [0 - 20]");
                // Ponemos el numero del usuario en la posicion del vector donde nos encontramos
                vector[i] = input.nextInt();
            } while (vector[i] < 0 || vector[i] > 20);
        }

        // Enseamos todo el array con sus posiciones
        for (int i = 0; i < vector.length; i++) {
            System.out.printf("Numero vector: %d en posicion %d\n", vector[i], (i + 1));
        }
    }
}
