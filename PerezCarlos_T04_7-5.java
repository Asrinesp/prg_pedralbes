import java.util.Scanner;

public class PerezCarlos_T04_7_5 {
    public static void main(String[] args) {
        // Creamos variable para el Scanner
       Scanner  input = new Scanner(System.in);
       // Variable del numero del usuario
       int n = 0;
        
        do {
            // Menu
            System.out.printf(
            "1.- Opcion A\n" +
            "2.- Opcion B\n" +
            "3.- Opcion C\n" +
            "4.- Salir\n"
            );

            // Peticion al usuario
            n = input.nextInt();
            // Cadenas de ifs para saber la respuesta del usuario
            if (n == 1) {System.out.printf("Opcion A");}
            else if (n == 2) {System.out.printf("Opcion B");}
            else if (n == 3) {System.out.printf("Opcion C");}
            else if (n == 4) {System.out.printf("Adios");}
            // Else si el usuario no ingresa un numero correcto
            else {System.out.printf("Introduce un numero valido");}
        // Condicion para salir del bucle
        } while (n != 4);
    }
}