public class PerezCarlos_T05_09 {
    public static void main(String[] args) {
        // Constante de longitud
        final int LONG = 50;

        // Creamos el array con LONG
        long[] vector = new long[LONG];

        // Variable para guardar el numero y hacerlo mas entendible
        long n;
        n = 0;
        // Bucle para asignar los numeros de fibonacci
        for (int i = 0; i < LONG; i++) {
            // Comprobamos que no estamos en las dos primeras posiciones ya que esos no hace falta sumarlos
            if (i > 1) {
                n = vector[i - 1] + vector[i - 2];
            } else {
                n = 1;
            }
            vector[i] = n;
        }
        
        // Mostramos todos los numeros del array
        System.out.print("Numeros del vector: ");
        for (int i = LONG - 1; i >= 0; i--) {
            System.out.printf(i != 0 ? "%d " : "%d\n", vector[i]);
        }
    }
}
