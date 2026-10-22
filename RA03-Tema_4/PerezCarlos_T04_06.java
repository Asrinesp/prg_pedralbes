import java.util.Scanner;

public class PerezCarlos_T04_06 {
    public static void main(String[] args) {
        // Creamos variable para el Scanner
        Scanner  input = new Scanner(System.in);
        // Variables del numero del usuario
        int numUser;
        int i;

        // Pedimos al usuario que ingrese un numero y lo guardamos en una variable
        System.out.println("Ingresa un numero:");
        numUser = input.nextInt();

        i = 1;
        while (i <= numUser) {
            // Mostramos los numero seguidos de una coma, menos el ultimo que va sin coma
            System.out.printf(i != numUser ? "%d, " : "%d\n", i );
            i++;
        }
    }
}
