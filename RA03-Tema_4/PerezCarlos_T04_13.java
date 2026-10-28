import java.util.Scanner;

public class PerezCarlos_T04_13 {
    public static void main(String[] args) {
        // Creamos variable para el Scanner
        Scanner  input = new Scanner(System.in);
        // opcion que introducira el usuario para el menu
        int opcion;
    
        // numeros que introduccira el usuario
        int num1, num2, num3;

        double perimetro, semiperimetro, area;

        boolean triangulo, salir;

        triangulo = false;
        num1 = 0;
        num2 = 0;
        num3 = 0;

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
            opcion = input.nextInt();

            switch (opcion) {
                case 1:
                    do {
                        System.out.println("Ingresa 3 lados de un triangulo");
                        num1 = input.nextInt();
                        num2 = input.nextInt();
                        num3 = input.nextInt();
                    } while (num1 <= 0 || num2 <= 0 || num3 <= 0 || num1 >= num2 + num3 || num2 >= num1 + num3 || num3 >= num1 + num2);
                    triangulo = true;
                    break;
                case 2:
                    if (!triangulo) {
                        System.out.println("Primero debes ingresar un triangulo con la opcion 1");
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
                case 3:
                    if (!triangulo) {
                        System.out.println("Primero debes ingresar un triangulo con la opcion 1");
                    } else if (num1 == num2 && num1 == num3 && num2 == num3) {
                        System.out.println("Es un triangulo equilatero");
                    } else if (num1 == num2 || num1 == num3 || num2 == num3) {
                        System.out.println("Es un triangulo isosceles");
                    } else {
                        System.out.println("Es un triangulo escaleno");
                    }
                    break;
                case 4:
                    if (!triangulo) {
                        System.out.println("Primero debes ingresar un triangulo con la opcion 1");
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
                case 5:
                    System.out.println("ADIOS!!");
                    salir = true;
                    break;
                default:
                    System.out.println("Ingresa un numero valido");
                    break;
            }

        } while(!salir);
    }
}