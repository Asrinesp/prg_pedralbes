import java.util.Scanner;

public class PerezCarlos_T04_07_2 {
    public static void main(String[] args) {
        // Creamos variable para el Scanner
        Scanner  input = new Scanner(System.in);
        // Variables del numero del usuario
        int numUser;
        int i;

        // Pedimos al usuario que ingrese un numero y lo guardamos en una variable
        System.out.println("Ingresa un numero:");
        numUser = input.nextInt();

        i = numUser;
        do {
            // Mostramos los numero seguidos de una coma, menos el ultimo que va sin coma
            System.out.printf(i != 1 ? "%d, " : "%d\n", i );
            i--;
        } while (i > 0);
    }
}
