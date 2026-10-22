import java.util.Scanner;

public class PerezCarlos_T04_05 {
    public static void main(String[] args) {
        // Creamos variable para el Scanner
        Scanner  input = new Scanner(System.in);
        // Variables del numero del usuario
        int numUser;
        int res;
        int i;

        // Pedimos al usuario que ingrese un numero y lo guardamos en una variable
        System.out.println("Ingresa numeros (se parara al ingresar un negativo): ");
        numUser = input.nextInt();
        res = 0;
        i = 0;
        // Bucle infinito hasta que el usuario ponga un numero negativo
        while (numUser >= 0) {
            res = res + numUser;
            numUser = input.nextInt();
            // Conteo de los numeros ingresados
            i++;
        }
        // Printamos la suma de todos los numeros
        System.out.printf("Cantidad de numeros positivos ingresados: %d\n", i);
        System.out.printf("Suma de todos los numeros ingresados: %d\n", res);
        
    }
}
