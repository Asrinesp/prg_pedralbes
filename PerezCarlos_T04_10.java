import java.util.Scanner;

public class PerezCarlos_T04_10 {
    public static void main(String[] args) {
        // Creamos variable para el Scanner
        Scanner  input = new Scanner(System.in);
        // Variable del numero del usuario
        int numUser;
        int num2User;
        int sum = 0;
        double res = 0;
        int i = 0;

        System.out.println("Ingresa un numero:");
        numUser = input.nextInt();
        while(i < numUser) {
            num2User = input.nextInt();
            sum = sum + num2User;
            i++;
        }
        res = sum / numUser;
        System.out.printf("Resultado: %.2f", res);
    }
}