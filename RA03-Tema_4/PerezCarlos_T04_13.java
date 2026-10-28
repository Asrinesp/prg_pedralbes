import java.util.Scanner;

public class PerezCarlos_T04_13 {
    public static void main(String[] args) {
        // Creamos variable para el Scanner
        Scanner  input = new Scanner(System.in);
        // opcion que introducira el usuario para el menu
        int opcion;
    
        // numeros que introduccira el usuario
        int num1, num2, num3;

        // Para guardar los resultados de los calculos
        double perimetro, semiperimetro, area;

        // Booleans para poder saber lo que se ha hecho
        boolean triangulo, salir;

        // triangulo en false para saber que no se ha hecho aun
        triangulo = false;

        // Valores por defectos de los numeros para evitar errores
        num1 = 0;
        num2 = 0;
        num3 = 0;

        // boolean para el bucle
        salir = false;
        do {
            // Menu
            System.out.printf(
                "1.- Introducir longitudes\n" +
                "2.- Comprobar si es rectangulo\n" +
                "3.- Clasificar segun los lados\n" +
                "4.- Calcular perimetro y area\n" +
                "5.- Salir\n"
            );
            // opcion del usuario
            opcion = input.nextInt();

            // Switch de las opciones del menu
            switch (opcion) {
                // Opcion que le pedimos 3 numeros al usuario para el triangulo
                case 1:
                    do {
                        System.out.println("Ingresa 3 lados de un triangulo");
                        num1 = input.nextInt();
                        num2 = input.nextInt();
                        num3 = input.nextInt();
                    // bucle no termina hasta que el triangulo no este bien
                    } while (num1 <= 0 || num2 <= 0 || num3 <= 0 || num1 >= num2 + num3 || num2 >= num1 + num3 || num3 >= num1 + num2);
                    // Indicamos que ya existe un triangulo
                    triangulo = true;
                    break;
                // Opcion para saber si tenemos un rectangulo
                case 2:
                    // comprobamos que tenemos un triangulo hecho
                    if (!triangulo) {
                        System.out.println("Primero debes ingresar un triangulo con la opcion 1");
                    // Distintos else if con la formula para saber la hipotenusa y si es o no un rectangulo
                    } else if ((Math.pow(num1, 2) == (Math.pow(num2, 2) + Math.pow(num3, 2)))) {
                        System.out.printf("Es rectangulo\n");
                        System.out.printf("Hipotenusa: %d\n", num1);
                        System.out.printf("Catetos: %d y %d\n", num2, num3);
                    } else if ((Math.pow(num2, 2) == (Math.pow(num1, 2) + Math.pow(num3, 2)))) {
                        System.out.printf("Es rectangulo\n");
                        System.out.printf("Hipotenusa: %d\n", num2);
                        System.out.printf("Catetos: %d y %d\n", num1, num3);
                    } else if ((Math.pow(num3, 2) == (Math.pow(num1, 2) + Math.pow(num2, 2)))) {
                        System.out.printf("Es rectangulo\n");
                        System.out.printf("Hipotenusa: %d\n", num3);
                        System.out.printf("Catetos: %d y %d\n", num1, num2);
                    } else {
                        System.out.println("No es rectangulo");
                    }
                    break;
                // Opcion para saber que tipo de triangulo tenemos
                case 3:
                    // comprobamos que tenemos un triangulo hecho
                    if (!triangulo) {
                        System.out.println("Primero debes ingresar un triangulo con la opcion 1");
                    // Distintos if para saber que tipo de triangulo tenemos
                    } else if (num1 == num2 && num1 == num3 && num2 == num3) {
                        System.out.println("Es un triangulo equilatero");
                    } else if (num1 == num2 || num1 == num3 || num2 == num3) {
                        System.out.println("Es un triangulo isosceles");
                    } else {
                        System.out.println("Es un triangulo escaleno");
                    }
                    break;
                // Opcion para saber el perimetro y el area de nuestro triangulo
                case 4:
                    // comprobamos que tenemos un triangulo hecho
                    if (!triangulo) {
                        System.out.println("Primero debes ingresar un triangulo con la opcion 1");
                    // Si tenemos triangulo se procede a hacer los calculos para saber el perimetro y el area
                    } else {
                        perimetro = num1 + num2 + num3;
                        semiperimetro = (perimetro) / 2;
                        area = Math.sqrt(semiperimetro * (semiperimetro - num1) * (semiperimetro - num2) * (semiperimetro - num3));
                        System.out.printf(
                            "Perimetro: %.2f\n" +
                            "Area: %.2f\n",
                            perimetro, area
                        );
                    }
                    break;
                // Opcion de salida
                case 5:
                    // Mensaje de salida y cambiamos el boolean para terminar el bucle
                    System.out.println("ADIOS!!");
                    salir = true;
                    break;
                // Opcion si no indica un numero correto
                default:
                    System.out.println("Ingresa un numero valido");
                    break;
            }

        } while(!salir);
    }
}