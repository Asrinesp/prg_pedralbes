import java.util.Scanner;

public class PerezCarlos_T04_7_5 {
    public static void main(String[] args) {

       Scanner  input = new Scanner(System.in);
       int n = 0;
        
        do {
            System.out.printf(
            "1.- Opcion A\n" +
            "2.- Opcion B\n" +
            "3.- Opcion C\n" +
            "4.- Salir\n"
            );

            n = input.nextInt();
            if (n == 1) {System.out.printf("Opcion A");}
            else if (n == 2) {System.out.printf("Opcion B");}
            else if (n == 3) {System.out.printf("Opcion C");}
            else if (n == 4) {System.out.printf("Adios");}
            else {System.out.printf("Introduce un numero valido");}
        } while (n != 4);
    }
}