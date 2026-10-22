package bucles;
import java.util.Scanner;
import java.util.Random;

public class PerezCarlos_aprende_a_restar_1 {
    public static void main(String[] args) {
        // Creamos variable de Scanner
        Scanner  input = new Scanner(System.in);
        Random rand = new Random();
        int numUser;
        int num1;
        int num2;
        int resResta;
        int temp;
        int i;
        int j;
        long inicio;
        long fin;
        double segundos;

        // Bucle para que siempre sean un numero distinto
        do {
            num1 = rand.nextInt(10) + 1;
            num2 = rand.nextInt(10) + 1;

            // Cambiamos el orden de los numeros en el caso de que el segundo numero sea mayor
            if (num1 < num2) {
                temp = num1;
                num1 = num2;
                num2 = temp;
            }
        // Bucle infinito hasta que sean numeros distintos
        } while (num1 == num2);

        i = 5;
        // Guardamos el resultado de la resta
        resResta = num1 - num2;

        // Inicio del temporizador
        inicio = System.currentTimeMillis();

        do {
            i--;
            // Preguntamos al usuario la respuesta de la resta
            System.out.printf("Ingresa el resultado de esta resta: %d - %d\n", num1, num2);
            numUser = input.nextInt();

            // En el caso de que falle
            if (numUser != resResta) {
                // Le decimos los intentos restantes
                    System.out.printf("Has fallado, intentos restantes: %d\n", i);
                    j = 0;
                    while(j < 5) {
                        // Imprimimos corazones segun los intentos restantes para hacerlo mas grafico
                        System.out.print(j < i ? "<3 " : "</3 ");
                        j++;
                    }
                    System.out.println();
            }
        // Comprobamos que el numero del usuario no sea la respuesta y que queden intentos restantes
        } while(numUser != resResta && i != 0);

        // Final del contador
        fin = System.currentTimeMillis();
        // Operacion para saber los segundos transcurridos
        segundos = (fin - inicio) / 1000.0;

        // Resultado final
        if (numUser == resResta) {
            System.out.println("Enhorabuena has acertado");
        } else {
            System.out.printf("Te has quedado sin intentos, la respuesta era %d\n", resResta);
        }
        System.out.printf("Has tardado: %.2f segundos\n", segundos);
    }
}
