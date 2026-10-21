import java.util.Scanner;

public class PerezCarlos_T04_7_5 {
    public static void main(String[] args) {
        // Creamos variable para el Scanner
        Scanner  input = new Scanner(System.in);
        // Variable del numero del usuario
        int numUser;
        int res = 1;
        int i = 0;

        System.out.println("Ingresa un numero:");
        numUser = input.nextInt();
        while(i < numUser) {
            i++;
            res = res * i;
        }

        System.out.printf("Resultado: %d", res);
    }
}