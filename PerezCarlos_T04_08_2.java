import java.util.Scanner;

public class PerezCarlos_T04_7_5 {
    public static void main(String[] args) {
        // Creamos variable para el Scanner
        Scanner  input = new Scanner(System.in);
        // Variable del numero del usuario
        int numUser;
        int i = 0;
        int res = 1;

        System.out.println("Ingresa un numero:");
        numUser = input.nextInt();
        do {
            i++;
            res = res * i;
        } while(i < numUser);

        System.out.printf("Resultado: %d", res);
    }
}