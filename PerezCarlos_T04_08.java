import java.util.Scanner;

public class PerezCarlos_T04_08 {
    public static void main(String[] args) {
        // Creamos variable para el Scanner
        Scanner  input = new Scanner(System.in);
        // Variable del numero del usuario
        int numUser;
        int res = 1;
        int i = 0;

        // Pedimos al usuario que ingrese un numero y lo guardamos en una variable
        System.out.println("Ingresa un numero:");
        numUser = input.nextInt();
        // Bucle que suma la multiplicacion del numero hasta que llegue el indice (i) al mismo
        while(i < numUser) {
            i++;
            res = res * i;
        }

        System.out.printf("Resultado: %d", res);
    }
}