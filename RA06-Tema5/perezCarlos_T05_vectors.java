import java.util.Random;

public class PerezCarlos_T05_vectors {
    public static void main(String[] args) {

        final int LONG = 100;

        int[] array = new int[LONG];

        int count, aux, suma, turno;

        long inicio, finalT;

        boolean ordenado;

        inicio = System.currentTimeMillis();
        suma = 0;
        // bombolla version 0
        for (int i = 0; i < 100; i++) {
            count = 0;
            for (int j = 0; j < LONG; j++) {
                array[j] = new Random().nextInt(100) + 1;
            }
            for (int j = 0; j < LONG-1; j++) {
                for (int k = 0; k < LONG-1; k++) {
                    count++;
                    if (array[k] > array[k+1]) {
                        aux = array[k];
                        array[k] = array[k+1];
                        array[k+1] = aux;
                    }
                }
            }
            suma += count;
        }
        finalT = System.currentTimeMillis();
        System.out.printf("Tiempo de ejecucion del metodo bombolla version 0: %d milisegundos\n", (finalT - inicio));
        System.out.println("La media de iteraciones del metodo bombolla version 0 es: " + (suma/100));

        // bombolla version 1
        inicio = System.currentTimeMillis();
        suma = 0;
        for (int i = 0; i < 100; i++) {
            count = 0;
            for (int j = 0; j < LONG; j++) {
                array[j] = new Random().nextInt(100) + 1;
            }
            for (int j = 1; j < LONG; j++) {
                for (int k = 0; k < LONG-j; k++) {
                    count++;
                    if (array[k] > array[k+1]) {
                        aux = array[k];
                        array[k] = array[k+1];
                        array[k+1] = aux;
                    }
                }
            }
            suma += count;
        }
        finalT = System.currentTimeMillis();
        System.out.printf("Tiempo de ejecucion del metodo bombolla version 1: %d milisegundos\n", (finalT - inicio));
        System.out.println("La media de iteraciones del metodo bombolla version 1 es: " + (suma/100));

        // bombolla version 2
        inicio = System.currentTimeMillis();
        suma = 0;
        for (int i = 0; i < 100; i++) {
            count = 0;
            for (int j = 0; j < LONG; j++) {
                array[j] = new Random().nextInt(100) + 1;
            }
            ordenado = false;
            turno = 1;
            while (!(ordenado)) {
                ordenado = true;
                for (int j = 0; j < LONG - turno; j++) {
                    count++;
                    if (array[j] > array[j + 1]) {
                        aux = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = aux;
                        ordenado = false;
                    }
                }
                turno++; 
            }
            suma += count;
        }
        finalT = System.currentTimeMillis();
        System.out.printf("Tiempo de ejecucion del metodo bombolla version 2: %d milisegundos\n", (finalT - inicio));
        System.out.println("La media de iteraciones del metodo bombolla version 2 es: " + (suma/100));
    }
}