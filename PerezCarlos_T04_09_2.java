import java.util.Scanner;

public class PerezCarlos_T04_09_2 {
    public static void main(String[] args) {
        // Creamos variable para el Scanner
        Scanner  input = new Scanner(System.in);
        // Variable del numero del usuario
        int numUser;
        int res = 0;
        int i = 1;

        System.out.println("Ingresa un numero:");
        numUser = input.nextInt();
        do {
            res = res + i;
            i = i + 2;
        }
        while(i < numUser);

        System.out.printf("Resultado: %d", res);
    }
}