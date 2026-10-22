import java.util.Scanner;

public class PerezCarlos_T04_04_2 {
    public static void main(String[] args) {
        // Creamos variable para el Scanner
        Scanner  input = new Scanner(System.in);
        // Variables del numero del usuario
        int numUser;
        int res;

        res = 0;
        numUser = 0;
        System.out.println("Ingresa numeros (se parara al ingresar un negativo): ");
        do {
        res = res + numUser;
        // Pedimos al usuario que ingrese un numero y lo guardamos en una variable
        numUser = input.nextInt();
        // Bucle infinito hasta que el usuario ponga un numero negativo
        } while (numUser >= 0);
        // Printamos la suma de todos los numeros
        System.out.printf("Suma de todos los numeros ingresados: %d", res);
    }
}
