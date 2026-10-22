import java.util.Scanner;

public class PerezCarlos_T04_05_2 {
    public static void main(String[] args) {
        // Creamos variable para el Scanner
        Scanner  input = new Scanner(System.in);
        // Variables del numero del usuario
        int numUser;
        int res;
        int i;

        res = 0;
        numUser = 0;
        i = 0;
        System.out.println("Ingresa numeros (se parara al ingresar un negativo): ");
        do {
        res = res + numUser;
        // Pedimos al usuario que ingrese un numero y lo guardamos en una variable
        numUser = input.nextInt();
        if (numUser >= 0) {
            // Conteo de los numeros ingresados
           i++;
        }
        // Bucle infinito hasta que el usuario ponga un numero negativo
        } while (numUser >= 0);
        // Printamos la suma de todos los numeros
        System.out.printf("Cantidad de numeros positivos ingresados: %d\n", i);
        System.out.printf("Suma de todos los numeros ingresados: %d", res);
    }
}
