public class PerezCarlos_T05_05 {
    public static void main(String[] args) {
        // Constante de longitud
        final int LONG = 100;

        // Creamos el array con LONG
        int[] vector = new int[LONG];
        
        // Bucle que añade un 0 en los numeros par y un 1 en los impar
        for (int i = 0; i < LONG; i++) {
            vector[i] = i % 2;
        }

        // Mostramos el array
        System.out.print("Numeros del vector: ");
        for (int i = 0; i < LONG; i++) {
            System.out.printf(i != LONG - 1 ? "%d " : "%d\n", vector[i]);
        }
    }
}
