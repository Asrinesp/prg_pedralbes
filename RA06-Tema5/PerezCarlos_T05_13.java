import java.util.Scanner;

public class PerezCarlos_T05_13 {
    public static void main(String[] args) {
        final int LONG = 15;
        // Creamos variable para Scanner
        Scanner  input = new Scanner(System.in);

        // Declaramos variables
        int opcion, numUsr, aux, count, moda;
        int rachaAct, rachaMax;
        boolean datos, salir, ordenado;

        int[] edades = new int[LONG];

        // Inicializamos variables booleanas
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

            // Pedimos al usuario que ingrese la opcion deseada
            opcion = input.nextInt();

            // Comprobamos que la opcion sea valida y que se hayan introducido los datos antes de hacer los calculos
            if (opcion > 1 && opcion < 5 && !datos) {
                System.out.println("Debes introduccir las edades con la opcion 1");
            } else {
                // Switch para las opciones del menu
                switch (opcion) {
                    // Opcion para introducir las edades *
                    case 1:
                        // Pedimos al usuario que ingrese el salario de los 10 empleados, poniendo que minimo tiene que ser 500 y maximo 5000
                        System.out.println("Introducce las edades de las personas");
                        // Bucle para pedir las edades de las personas en LONG, comprobando que no sean negativas ni mayores a 150
                        for (int i = 0; i < LONG; i++) {
                            do {
                                numUsr = input.nextInt();
                                // Ifs para comprobar que las edades no sean negativas ni mayores a 150 y mostramos mensaje de error
                                if (numUsr < 0) {
                                    System.out.println("No puedes ingresar edades negativas");
                                }
                                if (numUsr > 150) {
                                    System.out.println("No puedes ingresar edades mayores a 150");
                                }
                            } while (numUsr < 0 || numUsr > 150);
                            edades[i] = numUsr;
                        }
                        // Boolean que permite entrar a las otras opciones, ya que sin las edades ingresadas no se pueden hacer los calculos
                        datos = true;

                        // Reiniciamos el ordenado a false por si se decide cambiar las edades
                        ordenado = false;
                        break;
                    // Opcion para calcular la edad media
                    case 2:
                        // Variable aux para almacenar la suma de las edades y luego dividirla entre el numero de personas
                        aux = 0;
                        // Bucle para sumar todas las edades
                        for (int i = 0; i < LONG; i++) {
                            aux += edades[i];
                        }
                        // Mostramos la media de edad
                        System.out.printf("media de edad: %d\n", (aux / LONG));
                    break;
                    // Opcion para calcular la moda
                    case 3:
                        // Opcion array de 150 elementos
                        // Creamos un array de 150 elementos
                        int contadores[] = new int[150];
                        // Bucle para recorrer el array de edades y contar cuantas veces se repite cada edad
                        for (int i = 0; i < LONG; i++) {
                            contadores[edades[i]]++;
                        }
                        // Bucle para recorrer el array de contadores y ver cual es la edad que mas se repite
                        moda = 0;
                        for (int i = 0; i < 150; i++) {
                            if (contadores[i] > contadores[moda]) {
                                moda = i;
                            }
                        }
                        // Mostramos la moda y cuantas veces se repite
                        System.out.printf("La moda es: %d, se repite %d veces\n", moda, contadores[moda]);
                        
                        // Opcion ordenar array
                        count = 1;

                        // Ordenamos el array antes comprobando que no este ordenado, si no lo esta, lo ordenamos con un bucle while y un bucle for
                        while (!(ordenado)) {
                            ordenado = true;
                            // Bucle for para recorrer el array y comparar los elementos adyacentes, si el elemento actual es mayor que el siguiente, los intercambiamos y cambiamos el boolean ordenado a false
                            for (int i = 0; i < LONG - count; i++) {
                                if (edades[i] > edades[i + 1]) {
                                    aux = edades[i];
                                    edades[i] = edades[i + 1];
                                    edades[i + 1] = aux;
                                    ordenado = false;
                                }
                            }
                            // Incrementamos count para que el bucle for recorra menos elementos en cada iteracion, ya que los ultimos elementos ya estan ordenados
                            count++;
                        }

                        // Ahora for para recorrer las edades y ver cual es la moda
                        // Inicializamos las variables rachaAct y rachaMax a 1, ya que la primera edad siempre se repite al menos una vez
                        rachaAct = 1;
                        rachaMax = 1;
                        moda = edades[0];
                        // Bucle for para recorrer las edades y ver cual es la moda
                        for (int i = 1; i < LONG; i++) {
                            // Comprobamos que la edad actual es igual a la anterios, si es asi, incrementamos el rachaAct si no reiniciamos la racha
                            if (edades[i] == edades[i - 1]) {
                                rachaAct++;
                            } else {
                                rachaAct = 1;
                            }
                            // Comprobamos la racha actual es mayor que la rachaMax, si es asi, actualizamos la rachaMax y la moda
                            if (rachaAct > rachaMax) {
                                rachaMax = rachaAct;
                                moda = edades[i];
                            }
                        }
                        // Mostramos la moda y cuantas veces se repite
                        System.out.printf("La moda es: %d, se repite %d veces\n", moda, rachaMax);
                        break;
                    // Opcion para mostrar la mediana
                    case 4:
                        // Comprobamos si el array esta ordenado, en el caso de que no, hacemos como el case anterior y lo ordenamos
                        count = 1;
                        while (!(ordenado)) {
                            ordenado = true;
                            for (int i = 0; i < LONG - count; i++) {
                                if (edades[i] > edades[i + 1]) {
                                    aux = edades[i];
                                    edades[i] = edades[i + 1];
                                    edades[i + 1] = aux;
                                    ordenado = false;
                                }
                            }
                            count++;
                        }

                        // Comprobamos si el numero de elementos es par o impar, si es impar, la mediana es el elemento central, si es par, la mediana es la media de los dos elementos centrales
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
                        // Mostramos mensaje de error si el usuario introduce un numero invalido
                        System.out.println("Opcion no valida");
                        break;
                }
            }
        } while (!salir);
    }
}