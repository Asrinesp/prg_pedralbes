import java.util.Scanner;

public class PerezCarlos_T04_11 {
    public static  void main(String[] args) {
        // Creamos variable para el Scanner
        Scanner  input = new Scanner(System.in);
        // Variables del numero del usuario
        int num1User;
        int num2User;
        int i;
        int res;

         // Pedimos al usuario que ingrese un numero y lo guardamos en una variable
        System.out.println("Ingresa un numero:");
        num1User = input.nextInt();
         // Pedimos al usuario que ingrese un numero para ser el exponente y lo guardamos en una variable
        System.out.println("Ingresa el exponente:");
        num2User = input.nextInt();

        res = 1;
        i = 0;
        while(i < num2User) {
            res = res * num1User;
            i++;
        }
        System.out.printf("Resultado: %d\n", res);
    }
}

