import java.util.Random;
import java.util.Scanner;

public class PerezCarlos_15_monedes {
    public static void main(String[] args) {
        // Creamos variable de Scanner
        Scanner  input = new Scanner(System.in);
        // Creamos variable para numero aleatorio
        Random rand = new Random();

        // Boolean pasa saber quien ha sido el ultimo en jugar
        boolean turnoUser;

        // Variables de numeros
        int monedas;
        int numUser;
        int numBot;

        // Valores por defecto
        numUser = 0;
        numBot = 0;
        monedas = 15;
        turnoUser = true;

        // Mensaje de explicacion
        System.out.println("Juego de las monedas: hay 15 monedas y jugaras contra la maquina. "
        + "Cada turno debes retirar entre 1 y 3 monedas. Pierde quien retire la ultima.");
        // while infinito hasta que se retiren todas las monedas
        while (monedas > 0) {
            // Mensaje de monedas restantes
            System.out.printf("Monedas restantes: %d\n", monedas);
            // Bucle para que el usuario ingrese un numero valido
            do {
                System.out.println("Ingresa numero de monedas a retirar [1 - 3]");
                numUser = input.nextInt();
            } while (!(numUser > 0 && numUser < 4 && numUser <= monedas));

            // Notificacion de las monedas retiradas
            System.out.printf("Has retirado %d\n", numUser);
            monedas = monedas - numUser;
            turnoUser = true;

            // Comprobamos que las monedas no esten ya en 0
            if (monedas > 0) {
                // Bucle para que la maquina ingrese un numero valido de monedas
                do {
                    numBot = rand.nextInt(3) + 1;
                } while (!(numBot > 0 && numBot < 4 && numBot <= monedas));
                monedas = monedas - numBot;
                turnoUser = false;
                // Notificaion de las monedas retiradas
                System.out.printf("la maquina retira %d monedas\n", numBot);
            }
        }
        // Mensaje de quien es el ganador
        System.out.println(turnoUser ? "Ha ganado la maquina" : "Enhorabuena, has ganado");
    }
}
