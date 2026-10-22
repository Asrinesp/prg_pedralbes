import java.util.Scanner;

public class PerezCarlos_T04_10 {
    public static void main(String[] args) {
        // Creamos variable para el Scanner
        Scanner  input = new Scanner(System.in);
        // Variable del numero del usuario
        int numUser;
        int num2User;
        double sum = 0;
        double res = 0;
        int i = 0;

        // Pedimos al usuario que ingrese un numero y lo guardamos en una variable
        System.out.println("Ingresa el numero de valores que meteras:");
        numUser = input.nextInt();
        // Le pedimos al usuario que ingrese x numeros que ha dicho
        while(i < numUser) {
            System.out.printf("%d/%d Ingresa un numero: ", (i + 1), numUser);
            num2User = input.nextInt();
            // Sumamos el numero ingresado al anterior para tener la suma total de los valores introducidos
            sum = sum + num2User;
            i++;
        }
        // Calculo para hacer la media
        res = sum / numUser;
        System.out.printf("Media: %.2f", res);
    }
}