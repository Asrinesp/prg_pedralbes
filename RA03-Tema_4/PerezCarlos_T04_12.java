import java.util.Scanner;

public class PerezCarlos_T04_12 {
    public static void main(String[] args) {
        // Creamos variable para el Scanner
        Scanner  input = new Scanner(System.in);
        // Variables del numero del usuario
        int numUser;
        int i;
        double res;

        i = 0;
        res = 0;
        do {
            // Pedimos al usuario que ingrese un numero y lo guardamos en una variable
            System.out.println("Ingresa un numero: ");
            numUser = input.nextInt();
            // Comprobamos que el numero este entre el 0 y el 10
            if (numUser >= 0 && numUser <= 10) {
                // Si esta entre esos dos numeros lo sumamos y conteamos para luego hacer la media
                res = res + numUser;
                i++;
            // Imprimimos cualquier numero que no sea negativo y no cumpla la anterior condicion
            } else if (numUser > -1) {
                System.out.printf("%d\n", numUser);
            }

        } while (numUser >= 0);
        // Calculo de la media y la imprimimos
        res = res / i;
        System.out.printf("Mediana de los numeros ingresados entre 1 y 10: %.2f\n", res);
    }
}
