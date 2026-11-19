public class PerezCarlos_T05_vectors {
    public static void main(String[] args) {


        // tercera bombolla
        while (!(ordenado)) {
            ordenado = true;
            // Bucle for para recorrer el array y comparar los elementos adyacentes, si el elemento actual es mayor que el siguiente, los intercambiamos y cambiamos el boolean ordenado a false
            for (int i = 0; i < longitud - count; i++) {
                if (edades[i] > edades[i + 1]) {
                    aux = edades[i];
                    edades[i] = edades[i + 1];
                    edades[i + 1] = aux;
                    ordenado = false;
                }
            }
            // Incrementamos count para que el bucle for recorra menos elementos en cada iteracion, ya que los ultimos elementos ya estan ordenados
            count++;
        }
    }
}