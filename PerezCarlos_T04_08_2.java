import java.util.Scanner;

public class PerezCarlos_T04_08_2 {
    public static void main(String[] args) {
        // Creamos variable para el Scanner
        Scanner  input = new Scanner(System.in);
        // Variable del numero del usuario
        int numUser;
        int i = 0;
        int res = 1;

        // Pedimos al usuario que ingrese un numero y lo guardamos en una variable
        System.out.println("Ingresa un numero:");
        numUser = input.nextInt();
        // Bucle que suma la multiplicacion del numero hasta que llegue el indice (i) al mismo
        do {
            i++;
            res = res * i;
        } while(i < numUser);

        System.out.printf("Resultado: %d", res);
    }
}