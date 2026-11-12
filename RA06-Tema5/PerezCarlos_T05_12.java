import java.util.Scanner;

public class PerezCarlos_T05_12 {
    public static void main(String[] args) {
        final int LONG = 10;
        // Creamos variable para Scanner
        Scanner  input = new Scanner(System.in);

        double num, numUsrDbl, irpf, bruto;
        int opcion, numUsrInt;
        boolean datos, salir;

        double[] empleadosBruto = new double[LONG];
        double[] empleadosNeto = new double[LONG];

        datos = false;
        salir = false;
        do {

            System.out.printf(
            "=========================================\n" +
            "1.- Introduccir sueldos ("+ LONG + " empleados)\n" +
            "2.- Calcular sueldo neto\n" +
            "3.- Modificar sueldo bruto de un empleado\n" +
            "4.- Subir sueldo (porcentaje)\n" +
            "5.- Salir\n" +
            "=========================================\n" +
            "\n" +
            "-----------------------------------------\n" +
            "Introduce una opcion [1 - 5]\n" +
            "-----------------------------------------\n"
            );

            opcion = input.nextInt();
            if (opcion > 1 && opcion < 5 && !datos) {
                System.out.println("Debes introduccir los sueldos con la opcion 1");
            } else {
                switch (opcion) {
                    // Opcion para introduccie el sueldo de los 10 trabajadores *
                    case 1:
                        // Pedimos al usuario que ingrese el salario de los 10 empleados, poniendo que minimo tiene que ser 500 y maximo 5000
                        System.out.println("Introducce el salario de los empleados [500 - 5000]");
                        for (int i = 0; i < LONG; i++) {
                            do {
                                // Pedimos el sueldo al usuario
                                System.out.printf("Empleado %d: ", (i + 1));
                                numUsrDbl = input.nextDouble();
                                // Comprobacion del que el numero ingresado es valido
                                if (!(numUsrDbl >= 500 && numUsrDbl <= 5000))
                                    System.out.println("Pon un sueldo valido");
                            } while (!(numUsrDbl >= 500 && numUsrDbl <= 5000));
                            // Ponemos el sueldo al empleado
                            empleadosBruto[i] = numUsrDbl;
                        }
                        // Boolean que permite entrar a las otras opciones, ya que sin el sueldo ingresado de los empleados no se podria hacer lo demas
                        datos = true;
                        break;
                    // Opcion para calcular el sueldo neto
                    case 2:
                        // For para calcular el sueldo neto de los empleados
                        for (int i = 0; i < LONG; i++) {
                            // Guardamos el bruto en una variable por comodidad
                            bruto = empleadosBruto[i];
                            // ifs para saber la cantidad de sueldo bruto para asi saber que IRPF calcular
                            if (bruto <= 700) {
                                irpf = 8;
                            } else if (bruto <= 1100) {
                                irpf = 11;
                            } else if (bruto <= 1500) {
                                irpf = 13;
                            } else if (bruto <= 2100) {
                                irpf = 17;
                            } else if (bruto <= 3000) {
                                irpf = 20;
                            } else {
                                irpf = 25;
                            }
                            // Calculo de porcentajes para el sueldo neto, calculamos el IRPF y el 6% de la Seguridad Social
                            num = bruto - ((bruto * 6) / 100) - ((bruto * irpf) / 100);
                            // Vamos añadiendo el resultado al array de sueldo netos
                            empleadosNeto[i] = num;
                        }
                        // Imprimimos los dos array
                        System.out.println("Sueldo bruto de los empleados:");
                        for (int i = 0; i < LONG; i++) {
                            System.out.printf("Empleado %d: %.2f€\n", (i + 1), empleadosBruto[i]);
                        }
                        System.out.println("Sueldo neto de los empleados:");
                        for (int i = 0; i < LONG; i++) {
                            System.out.printf("Empleado %d: %.2f€\n", (i + 1), empleadosNeto[i]);
                        }
                        break;
                    // Opcion para modificar el sueldo bruto de un solo empleado
                    case 3:
                        System.out.println("Que empleado quieres cambiarle el sueldo bruto?");
                        // Primer do while para comprobar que el  numero ingresado por el usuario esta entre los empleados disponibles
                        do {
                            numUsrInt = input.nextInt();
                            // Si el numero es correcto le imprimimos el salario actual y le preguntamos a cual quiere ponerle ahora
                            if (numUsrInt > 0 && numUsrInt <= LONG) {
                                System.out.println(empleadosBruto[numUsrInt - 1]);
                                System.out.println("Que valor quieres ponerle ahora?");
                                // Comprobacion constante hasta que el numero ingresado por el usuario este dentro de los limites [500 - 5000]
                                do {
                                    numUsrDbl = input.nextDouble();
                                    if (!(numUsrDbl >= 500 && numUsrDbl <= 5000))
                                        System.out.println("Pon un sueldo valido");
                                } while (!(numUsrDbl >= 500 && numUsrDbl <= 5000));
                                // Cambiamos el bruto de ese usuario por el nuevo
                                empleadosBruto[numUsrInt - 1] = numUsrDbl;
                            } else
                                System.out.println("Introduce un numero valido");
                        } while(!(numUsrInt > 0 && numUsrInt <= LONG));
                        
                        // Calculamos de nuevo el sueldo neto del usuario cambiado
                        bruto = empleadosBruto[numUsrInt - 1];
                        if (bruto <= 700) {
                            irpf = 8;
                        } else if (bruto <= 1100) {
                            irpf = 11;
                        } else if (bruto <= 1500) {
                            irpf = 13;
                        } else if (bruto <= 2100) {
                            irpf = 17;
                        } else if (bruto <= 3000) {
                            irpf = 20;
                        } else {
                            irpf = 25;
                        }
                        num = bruto - ((bruto * 6) / 100) - ((bruto * irpf) / 100);
                        empleadosNeto[numUsrInt - 1] = num;

                        // Imprimimos el nuevo sueldo bruto y neto del empleado que hemos cambiado
                        System.out.printf("Sueldo bruto: %.2f€\nSueldo neto: %.2f€\n", empleadosBruto[numUsrInt - 1], empleadosNeto[numUsrInt - 1]);

                        break;
                    // Opcion para subir el sueldo de todos los empleados un porcentaje
                    case 4:
                        System.out.println("¿Cuanto porcentaje deseas subir los sueldos?");
                        
                        // do while para comprobar que el numero ingresado por el usuario no sea negativo
                        do {
                            numUsrDbl = input.nextDouble();  
                            if (numUsrDbl < 0) {
                                System.out.println("Introduce un numero positivo");
                            }  
                        } while (numUsrDbl < 0);

                        // Le sumamos el porcentaje indicado por el usuario a los empleados
                        for (int i = 0; i < LONG; i++) {
                            empleadosBruto[i] = empleadosBruto[i] + ((empleadosBruto[i] * numUsrDbl) / 100);
                        }

                        // Volvemos a calcular el sueldo neto una vez cambiado los brutos de todos
                        for (int i = 0; i < LONG; i++) {
                            bruto = empleadosBruto[i];
                            if (bruto <= 700) {
                                irpf = 8;
                            } else if (bruto <= 1100) {
                                irpf = 11;
                            } else if (bruto <= 1500) {
                                irpf = 13;
                            } else if (bruto <= 2100) {
                                irpf = 17;
                            } else if (bruto <= 3000) {
                                irpf = 20;
                            } else {
                                irpf = 25;
                            }
                            num = bruto - ((bruto * 6) / 100) - ((bruto * irpf) / 100);
                            empleadosNeto[i] = num;
                        }
                        // Imprimimos los nuevos sueldos, tanto los brutos como los netos
                        System.out.println("Sueldo bruto de los empleados:");
                        for (int i = 0; i < LONG; i++) {
                            System.out.printf("Empleado %d: %.2f€\n", (i + 1), empleadosBruto[i]);
                        }
                        System.out.println("Sueldo neto de los empleados:");
                        for (int i = 0; i < LONG; i++) {
                            System.out.printf("Empleado %d: %.2f€\n", (i + 1), empleadosNeto[i]);
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