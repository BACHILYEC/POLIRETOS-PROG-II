package SerieCaracteres.ciclos;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Tool {

    private static Scanner scanner = new Scanner(System.in);

    public static int leerEnteroPositivo(String mensaje) {
        int numero = -1;
        while (numero <= 0) {
            System.out.print(mensaje);
            try {
                numero = scanner.nextInt();
                if (numero <= 0) {
                    System.out.println("Error: ingrese un numero mayor que 0.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: debe ingresar un numero entero.");
                scanner.next(); // Limpia el buffer
            }
        }
        return numero;
    }

    public static String leerCadena(String mensaje) {
        System.out.print(mensaje);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine().trim();
    }
}