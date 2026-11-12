import java.util.Scanner;

public class PerezCarlos_T05_13 {
    public static void main(String[] args) {
        final int LONG = 15;
        // Creamos variable para Scanner
        Scanner  input = new Scanner(System.in);

        int opcion, numUsr, aux, count, moda;
        int rachaAct, rachaMax;
        boolean datos, salir, ordenado;

        int[] edades = new int[LONG];
        //double[] empleadosNeto = new double[LONG];

        ordenado = false;
        datos = false;
        salir = false;
        do {

            System.out.printf(
            "=========================================\n" +
            "1.- Introduccir edades ("+ LONG + " personas)\n" +
            "2.- Edad media\n" +
            "3.- Calcular moda (edad mas frecuente)\n" +
            "4.- Calcular mediana\n" +
            "5.- Salir\n" +
            "=========================================\n" +
            "\n" +
            "-----------------------------------------\n" +
            "Introduce una opcion [1 - 5]\n" +
            "-----------------------------------------\n"
            );

            opcion = input.nextInt();
            if (opcion > 1 && opcion < 4 && !datos) {
                System.out.println("Debes introduccir las edades con la opcion 1");
            } else {
                switch (opcion) {
                    // Opcion para introducir las edades *
                    case 1:
                        // Pedimos al usuario que ingrese el salario de los 10 empleados, poniendo que minimo tiene que ser 500 y maximo 5000
                        System.out.println("Introducce las edades de las personas");
                        for (int i = 0; i < LONG; i++) {
                            do {
                                numUsr = input.nextInt();
                                if (numUsr < 0) {
                                    System.out.println("No puedes ingresar edades negativas");
                                }
                            } while (numUsr < 0);
                            edades[i] = numUsr;
                        }
                        // Boolean que permite entrar a las otras opciones, ya que sin las edades ingresadas no se pueden hacer los calculos
                        datos = true;
                        break;
                    // Opcion para calcular la edad media
                    case 2:
                        aux = 0;
                        for (int i = 0; i < LONG; i++) {
                            aux += edades[i];
                        }
                        System.out.printf("media de edad: %d\n", (aux / LONG));
                    break;
                    // Opcion para calcular la moda
                    case 3:
                        // Opcion array de 150 elementos
                        int contadores[] = new int[150];
                        for (int i = 0; i < LONG; i++) {
                            contadores[edades[i]]++;
                        }

                        moda = 0;
                        for (int i = 0; i < LONG; i++) {
                            if (contadores[i] > contadores[moda]) {
                                moda = i;
                            }
                        }
                        System.out.printf("La moda es: %d, se repite %d veces\n", moda, contadores[moda]);
                        // Opcion ordenar array
                        count = 1;
                        // Ordenamos el array
                        while (!(ordenado)) {
                            ordenado = true;
                            for (int i = 0; i < LONG - count; i++) {
                                if (edades[i] > edades[i + 1]) {
                                    aux = edades[i];
                                    edades[i] = edades[i + 1];
                                    edades[i + 1] = aux;
                                    ordenado = true;
                                }
                            }
                            count++;
                        }
                        rachaAct = 0;
                        rachaMax = 0;
                        for (int i = 0; i < LONG; i++) {
                            
                        }

                        break;
                    // Opcion para mostrar la mediana
                    case 4:
                        count = 1;
                        while (!(ordenado)) {
                            ordenado = true;
                            for (int i = 0; i < LONG - count; i++) {
                                if (edades[i] > edades[i + 1]) {
                                    aux = edades[i];
                                    edades[i] = edades[i + 1];
                                    edades[i + 1] = aux;
                                    ordenado = true;
                                }
                            }
                            count++;
                        }

                        if (!(LONG%2 == 0)) {
                            System.out.printf("La edad mediana es: %d", edades[LONG/2]);
                        } else {
                            System.out.printf("La edad mediana es: %d", ((edades[(LONG/2) - 1] + edades[LONG/2]) / 2));
                        }
                        break;
                    // Opcion para salir
                    case 5:
                        // Cambiamos boolean salir a true para terminar el bucle del menu
                        salir = true;
                        break;
                    // Opcion por defecto en caso de numero invalido
                    default:
                        System.out.println("Opcion no valida");
                        break;
                }
            }
        } while (!salir);
    }
}