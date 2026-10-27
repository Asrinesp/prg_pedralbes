package bucles;
import java.util.Scanner;
import java.util.Random;

public class PerezCarlos_aprende_a_restar_2 {
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
        int aciertos;
        long inicio;
        long fin;
        double segundos;

        // Inicio del temporizador
        inicio = System.currentTimeMillis();

        aciertos = 0;
        i = 5;
        do {
            // Bucle para que el primer numero siempre sea mayor al segundo
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
            // Guardamos el resultado de la resta
            resResta = num1 - num2;

            // Preguntamos al usuario la respuesta de la resta
            System.out.printf("Ingresa el resultado de esta resta: %d - %d\n", num1, num2);
            numUser = input.nextInt();

            // En el caso de que falle
            if (numUser == resResta) {
                // Le decimos los intentos restantes
                System.out.println("Has acertado");
                // Sumamos uno al contador de aciertos
                aciertos++;
            } else {
                System.out.println("Has fallado");
            }
            i--;
        // Bucle que para cuando i llega a 0
        } while(i > 0);

        // Final del contador
        fin = System.currentTimeMillis();
        // Operacion para saber los segundos transcurridos
        segundos = (fin - inicio) / 1000.0;

        // Resultado final
        System.out.printf("Enhorabuena has acertado %d y has fallado %d\n", aciertos, (5 - aciertos));
        
        System.out.printf("Has tardado: %.2f segundos\n", segundos);
    }
}
