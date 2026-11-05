import java.util.Scanner;

public class PerezCarlos_T05_12 {

    // Recordar eliminar y cambiar
    static final int LONG = 10;

    static void imprimirArray(double[] array) {
        for (int i = 0; i < LONG; i++) {
            System.out.printf("Empleado %d: %.2f€\n", (i + 1), array[i]);
        }
    }

    public static void main(String[] args) {
        //final int LONG = 10;
        // Creamos variable para Scanner
        Scanner  input = new Scanner(System.in);

        double num, numUsr, irpf, bruto;
        int opcion;
        boolean datos, salir;

        double[] empleadosBruto = new double[LONG];
        double[] empleadosNeto = new double[LONG];

        datos = false;
        salir = false;
        do {

            System.out.printf(
            "=========================================\n" +
            "1.- Introduccir sueldos (10 empleados)\n" +
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
                        System.out.println("Introducce el salario de los empleados [500 - 5000]");
                        for (int i = 0; i < LONG; i++) {
                            
                            do {
                                System.out.printf("Empleado %d: ", (i + 1));
                                numUsr = input.nextInt();
                                if (!(numUsr >= 500 && numUsr <= 5000)) System.out.println("Pon un sueldo valido");
                            } while (!(numUsr >= 500 && numUsr <= 5000));
                            empleadosBruto[i] = numUsr;
                        }
                        datos = true;
                        break;
                    // Opcion para calcular el sueldo neto
                    case 2:
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
                        System.out.println("Sueldo bruto de los empleados:");
                        imprimirArray(empleadosBruto);
                        System.out.println("Sueldo neto de los empleados:");
                        imprimirArray(empleadosNeto);
                        break;
                    // Opcion para modificar el sueldo bruto de un solo empleado
                    case 3:
                        System.out.println("Que empleado quieres cambiarle el sueldo bruto?");
                        numUsr = input.nextInt();
                        break;
                    // Opcion para subir el sueldo de todos los empleados un porcentaje
                    case 4:
                        break;
                    // Opcion para salir
                    case 5:
                        salir = true;
                        break;
                }
            }
        } while (!salir);
    }
}
